package com.vkefu.util.client;

import com.corundumstudio.socketio.SocketIOClient;
import com.google.common.collect.ArrayListMultimap;

import java.util.List;

public class NettyAgentClient implements NettyClient {
    private ArrayListMultimap<String, SocketIOClient> agentClientsMap = ArrayListMultimap.create();

    @Override
    public List<SocketIOClient> getClients(String key) {
        return agentClientsMap.get(key);
    }

    @Override
    public void putClient(String key, SocketIOClient client) {
        agentClientsMap.put(key,client);
    }

    @Override
    public void removeClient(String key, String id) {
        List<SocketIOClient> clients = getClients(key);
        for (SocketIOClient client:clients){
            if(client.getSessionId().toString().equals(id)){
               clients.remove(client);
            }
        }
        if(clients.size()==0){
            agentClientsMap.removeAll(key);
        }
    }
}
