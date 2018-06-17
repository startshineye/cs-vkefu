package com.vkefu.config;
import com.google.common.collect.Multiset;
import com.vkefu.util.client.NettyClients;
import com.vkefu.webim.web.beans.chatmessage.ChatMessage;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Set;

/**
 * 定时任务
 * @author yxm
 *
 */
@Configuration
@EnableScheduling
public class SchedulingConfig {

   /* @Scheduled(cron = "0/3 * * * * ?") // 每3秒执行一次
    public void schedule(){
        System.out.println("SchedulingConfig method schedule");
        ChatMessage chatMessage = new ChatMessage();
        chatMessage.setMessage("schedule");
        NettyClients.getInstance().sendIMEventMessage("zs1000","message",chatMessage);

        Set<String> imEventOnlineUser = NettyClients.getInstance().getIMEventOnlineUser();
        for (String id:imEventOnlineUser) {
            NettyClients.getInstance().sendIMEventMessage(id,"onlineuser",imEventOnlineUser.toString());
        }
    }*/
}