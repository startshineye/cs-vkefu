package com.vkefu.webim.web.dao.chatofflinemessage;

import com.vkefu.webim.web.beans.chatofflinemessage.ChatOfflineMessage;

public interface ChatOfflineMessageDAO {
    int deleteByPrimaryKey(Long messageId);

    int insert(ChatOfflineMessage record);

    int insertSelective(ChatOfflineMessage record);

    ChatOfflineMessage selectByPrimaryKey(Long messageId);

    int updateByPrimaryKeySelective(ChatOfflineMessage record);

    int updateByPrimaryKey(ChatOfflineMessage record);
}