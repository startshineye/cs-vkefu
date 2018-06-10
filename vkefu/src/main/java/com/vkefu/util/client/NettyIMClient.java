package com.vkefu.util.client;

import com.corundumstudio.socketio.SocketIOClient;
import com.google.common.collect.ArrayListMultimap;

import java.util.List;

public class NettyIMClient implements NettyClient {
    private ArrayListMultimap<String, SocketIOClient> imClientsMap = ArrayListMultimap.create();

    @Override
    public List<SocketIOClient> getClients(String key) {
        return imClientsMap.get(key);  
    }

    @Override
    public void putClient(String key, SocketIOClient client) {
        imClientsMap.put(key,client);
    }

    @Override
    public void removeClient(String key, String id) {
        List<SocketIOClient> clients = this.getClients(key);
        for (SocketIOClient client:clients){
            if(client.getSessionId().toString().equals(id)){
                clients.remove(client);
                break;
            }
        }
        if(clients.size() == 0){
            imClientsMap.removeAll(key);
        }
    }
}
