package com.vkefu.webim.web.dao;

import com.vkefu.webim.web.beans.Agentstatus;

public interface AgentstatusDAO {
    int deleteByPrimaryKey(Long messageId);

    int insert(Agentstatus record);

    int insertSelective(Agentstatus record);

    Agentstatus selectByPrimaryKey(Long messageId);

    int updateByPrimaryKeySelective(Agentstatus record);

    int updateByPrimaryKey(Agentstatus record);
}