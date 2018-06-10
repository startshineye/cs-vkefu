package com.vkefu.webim.web.dao.agentuser;

import com.vkefu.webim.web.beans.agentuser.Agentuser;

public interface AgentuserDAO {
    int deleteByPrimaryKey(String agentuserId);

    int insert(Agentuser record);

    int insertSelective(Agentuser record);

    Agentuser selectByPrimaryKey(String agentuserId);

    int updateByPrimaryKeySelective(Agentuser record);

    int updateByPrimaryKey(Agentuser record);
}