package com.vkefu.util.client;

import com.corundumstudio.socketio.SocketIOClient;

import java.util.List;

/**
 * created by yxm 20180610 20:37:21
 */
public interface NettyClient {
    public List<SocketIOClient> getClients(String key);

    public void putClient(String key,SocketIOClient client);

    public void removeClient(String key,String id);
}
