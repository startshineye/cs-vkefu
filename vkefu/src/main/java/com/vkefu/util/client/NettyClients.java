package com.vkefu.util.client;

import com.corundumstudio.socketio.SocketIOClient;
import com.google.common.collect.Multiset;

import java.util.List;
import java.util.Set;

/**
 * created by yxm 20180610 20:37:21
 */
public class NettyClients {
     private static NettyClients clients = new NettyClients();

     private NettyIMClient imClients = new NettyIMClient();

     private NettyAgentClient agentClients = new NettyAgentClient();

     private NettyEntIMClient entIMClients = new NettyEntIMClient();

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

    public  Set<String> getIMEventOnlineUser(){
        Set<String> allImClients1 = imClients.getAllImClients();
        return allImClients1;
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

    public void putEntIMEventClient(String id , SocketIOClient userClient){
        entIMClients.putClient(id,userClient);
    }

    public void removeEntIMEventClient(String id , String sessionid){
        entIMClients.removeClient(id, sessionid);
    }

    public void sendEntIMEventMessage(String id , String event , Object data){
        List<SocketIOClient> userClients = entIMClients.getClients(id) ;
        for(SocketIOClient userClient : userClients){
            userClient.sendEvent(event, data);
        }
    }
}
