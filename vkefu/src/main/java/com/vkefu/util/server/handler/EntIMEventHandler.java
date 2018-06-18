package com.vkefu.util.server.handler;
import com.corundumstudio.socketio.AckRequest;
import com.corundumstudio.socketio.SocketIOClient;
import com.corundumstudio.socketio.SocketIOServer;
import com.corundumstudio.socketio.annotation.OnConnect;
import com.corundumstudio.socketio.annotation.OnDisconnect;
import com.corundumstudio.socketio.annotation.OnEvent;
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

    }
    //消息入口
    @OnEvent(value = "message")
    public void onEvent(SocketIOClient client, AckRequest request, ChatMessage message){
        System.out.println(" 发送消息 ["+message+"]");
    }
    //断开连接
    @OnDisconnect
    public void onDisconnect(SocketIOClient client){
        System.out.println("断开连接 ["+client.getSessionId()+"]");
    }

    //消息接收入口，坐席状态更新
    @OnEvent(value = "onlineuser")
    public void onEvent(SocketIOClient client,ChatMessage message)
    {

    }
}
