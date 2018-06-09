package com.vkefu.webim.web.dao;

import com.vkefu.webim.web.beans.ChatSession;

public interface ChatSessionDAO {
    int deleteByPrimaryKey(String sessionId);

    int insert(ChatSession record);

    int insertSelective(ChatSession record);

    ChatSession selectByPrimaryKey(String sessionId);

    int updateByPrimaryKeySelective(ChatSession record);

    int updateByPrimaryKey(ChatSession record);
}