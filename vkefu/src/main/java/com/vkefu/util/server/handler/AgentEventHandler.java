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
 * created by yxm 20180610 17:56:21
 */
public class AgentEventHandler {
    private final SocketIOServer server;

    @Autowired
    public AgentEventHandler(SocketIOServer server){
        System.out.println("AgentEventHandler SocketIOServer"+server);
        this.server = server;
    }
    // 建立连接
    @OnConnect
    public void onConnect(SocketIOClient client){
        //获取参数

    }
    //消息入口
    @OnEvent(value = "message")
    public void onEvent(SocketIOClient client, AckRequest request, ChatMessage message){
        System.out.println(" 发送消息 ["+message+"]");

    }
    //断开连接
    @OnDisconnect
    public void onDisconnect(SocketIOClient client){

    }
}
