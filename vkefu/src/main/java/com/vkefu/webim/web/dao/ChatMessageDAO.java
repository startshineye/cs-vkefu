package com.vkefu.webim.web.dao;

import com.vkefu.webim.web.beans.ChatMessage;

public interface ChatMessageDAO {
    int deleteByPrimaryKey(Long messageId);

    int insert(ChatMessage record);

    int insertSelective(ChatMessage record);

    ChatMessage selectByPrimaryKey(Long messageId);

    int updateByPrimaryKeySelective(ChatMessage record);

    int updateByPrimaryKey(ChatMessage record);
}