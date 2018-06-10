package com.vkefu.webim.web.dao.chatsession;

import com.vkefu.webim.web.beans.chatsession.ChatSession;

public interface ChatSessionDAO {
    int deleteByPrimaryKey(String sessionId);

    int insert(ChatSession record);

    int insertSelective(ChatSession record);

    ChatSession selectByPrimaryKey(String sessionId);

    int updateByPrimaryKeySelective(ChatSession record);

    int updateByPrimaryKey(ChatSession record);
}