package com.vkefu.util.client;

import com.corundumstudio.socketio.SocketIOClient;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multiset;

import java.util.List;
import java.util.Set;

public class NettyIMClient implements NettyClient {
    private ArrayListMultimap<String, SocketIOClient> imClientsMap = ArrayListMultimap.create();

    public Set<String> getAllImClients(){
        Set<String> keys = imClientsMap.keySet();
        return keys;
    }

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
