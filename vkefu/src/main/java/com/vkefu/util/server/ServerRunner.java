package com.vkefu.util.server;

import com.corundumstudio.socketio.SocketIONamespace;
import com.corundumstudio.socketio.SocketIOServer;
import com.vkefu.core.DataContext;
import com.vkefu.util.server.handler.AgentEventHandler;
import com.vkefu.util.server.handler.WebIMEventHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * Spring Boot 启动加载数据 CommandLineRunner
 * created by yxm 20180610 14:01:21
 */
/*@Component
public class ServerRunner implements CommandLineRunner{
    private final SocketIOServer server;

    @Autowired
    public ServerRunner(SocketIOServer server){
        this.server = server;
    }

    @Override
    public void run(String... strings) throws Exception {
        System.out.println("ServerRunner SocketIOServer"+server);
        server.getNamespace(DataContext.NameSpaceEnum.IM.getNamespace()).addListeners(new WebIMEventHandler(server));
        server.getNamespace(DataContext.NameSpaceEnum.AGENT.getNamespace()).addListeners(new AgentEventHandler(server));
        Collection<SocketIONamespace> allNamespaces = server.getAllNamespaces();
        for (SocketIONamespace socketIONamespace : allNamespaces) {
            System.out.println(" socketIONamespace"+socketIONamespace.getName());
        }
        server.start();
        System.out.println("项目初始化!");
    }
}*/
