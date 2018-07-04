package com.vkefu.util.server.handler;
import com.corundumstudio.socketio.AckRequest;
import com.corundumstudio.socketio.SocketIOClient;
import com.corundumstudio.socketio.SocketIOServer;
import com.corundumstudio.socketio.annotation.OnConnect;
import com.corundumstudio.socketio.annotation.OnDisconnect;
import com.corundumstudio.socketio.annotation.OnEvent;
import com.vkefu.core.DataContext;
import com.vkefu.util.client.NettyClients;
import com.vkefu.webim.web.beans.chatmessage.ChatMessage;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * created by yxm 2018/06/18 9:49
 */
public class EntIMEventHandler {
    //注入成员变量SocketIOServer
    private SocketIOServer server;

    @Autowired
    public EntIMEventHandler(SocketIOServer server){
        System.out.println("EntIMEventHandler SocketIOServer"+server);
         this.server = server;
    }

    // 建立连接
    @OnConnect
    public void onConnect(SocketIOClient client){
        //client.joinRoom();
        String userId = client.getHandshakeData().getSingleUrlParam("userId");
        String userName = client.getHandshakeData().getSingleUrlParam("userName");
        String sessionId  = client.getHandshakeData().getSingleUrlParam("sessionId");
        String group = "entim";

        //加入群聊
        client.joinRoom(group);

        //放入缓存
        NettyClients.getInstance().putEntIMEventClient(userId,client);
        System.out.println("====EntIMEventHandler===="+userId);

    }
    //消息入口
    @OnEvent(value = "message")
    public void onEvent(SocketIOClient client, AckRequest request, ChatMessage message){
        System.out.println(" 发送消息 ["+message+"]");
        String fromId = message.getFromId();
        String group = "entim";

        client.getNamespace().getRoomOperations(group).sendEvent(DataContext.MessageTypeEnum.MESSAGE.toString(), message);
       // NettyClients.getInstance().sendEntIMEventMessage(fromId, DataContext.MessageTypeEnum.MESSAGE.toString(),message);
    }

    //断开连接
    @OnDisconnect
    public void onDisconnect(SocketIOClient client){
        System.out.println("断开连接 ["+client.getSessionId()+"]");
        String userId = client.getHandshakeData().getSingleUrlParam("userId");
        String userName = client.getHandshakeData().getSingleUrlParam("userName");
        String sessionId  = client.getHandshakeData().getSingleUrlParam("sessionId");
        String group = "entim";

        //加入群聊
        client.leaveRoom(group);
       // NettyClients.getInstance().removeEntIMEventClient(userId,client.getSessionId().toString());
    }

    //消息接收入口，坐席状态更新
    @OnEvent(value = "onlineuser")
    public void onEvent(SocketIOClient client,ChatMessage message)
    {

    }
}
