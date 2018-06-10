package com.vkefu.webim.config;

import com.corundumstudio.socketio.AuthorizationListener;
import com.corundumstudio.socketio.Configuration;
import com.corundumstudio.socketio.HandshakeData;
import com.corundumstudio.socketio.SocketIOServer;
import com.corundumstudio.socketio.annotation.SpringAnnotationScanner;
import com.vkefu.core.DataContext;
import com.vkefu.webim.exception.GlobalExceptionListener;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

/**
 * created by yxm 20180610 15:18:21
 */
@org.springframework.context.annotation.Configuration
public class NettyServerConfig {
    @Value("${im.server.host}")
    private String host;

    @Value("${im.server.port}")
    private Integer port;

    private SocketIOServer server ;

    @Bean
    public SocketIOServer socketIOServer(){
        Configuration configuration = new Configuration();
        configuration.setHostname(host);
        configuration.setPort(port);
        configuration.setWorkerThreads(1000);
        configuration.setExceptionListener(new GlobalExceptionListener());
        //该处可以用来进行身份验证
        configuration.setAuthorizationListener(new  AuthorizationListener(){
            public boolean isAuthorized(HandshakeData data){
                //http://localhost:8081?username=test&password=test
                //例如果使用上面的链接进行connect，可以使用如下代码获取用户密码信息，本文不做身份验证
                //String username = data.getSingleUrlParam("username");
                //String password = data.getSingleUrlParam("password");
                return true;
            }
        });
        final SocketIOServer socketIOServer = new SocketIOServer(configuration);
        System.out.println("namespace"+DataContext.NameSpaceEnum.IM.toString());
        socketIOServer.addNamespace(DataContext.NameSpaceEnum.IM.getNamespace());//绑定namespace
        socketIOServer.addNamespace(DataContext.NameSpaceEnum.AGENT.getNamespace());
        System.out.println("NettyServerConfig Configuration host"+host+" port"+port+" socketIOServer"+socketIOServer);
        return socketIOServer;

    }
    @Bean
    public SpringAnnotationScanner springAnnotationScanner(SocketIOServer socketServer) {
        return new SpringAnnotationScanner(socketServer);
    }
}
