package com.vkefu.util.client;

import com.corundumstudio.socketio.SocketIOClient;

import java.util.List;

/**
 * created by yxm 20180610 20:37:21
 */
public class NettyClients {
     private static NettyClients clients = new NettyClients();

     private NettyIMClient imClients = new NettyIMClient();

     private NettyAgentClient agentClients = new NettyAgentClient();

     public static NettyClients getInstance(){
         return clients;
     }
    public void putIMEventClient(String id , SocketIOClient userClient){
        imClients.putClient(id, userClient);
    }
    public void removeIMEventClient(String id , String sessionid){
        imClients.removeClient(id, sessionid);
    }
    public void sendIMEventMessage(String id , String event , Object data){
        List<SocketIOClient> userClients = imClients.getClients(id) ;
        for(SocketIOClient userClient : userClients){
            userClient.sendEvent(event, data);
        }
    }

    public void putAgentEventClient(String id , SocketIOClient agentClient){
        agentClients.putClient(id, agentClient);
    }
    public void removeAgentEventClient(String id , String sessionid){
        agentClients.removeClient(id, sessionid);
    }
    public void sendAgentEventMessage(String id , String event , Object data){
        List<SocketIOClient> agents = agentClients.getClients(id) ;
        for(SocketIOClient agentClient : agents){
            agentClient.sendEvent(event, data);
        }
    }
}
