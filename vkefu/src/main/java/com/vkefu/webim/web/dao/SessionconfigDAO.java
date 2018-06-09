package com.vkefu.webim.web.dao;

import com.vkefu.webim.web.beans.Sessionconfig;
import com.vkefu.webim.web.beans.SessionconfigWithBLOBs;

public interface SessionconfigDAO {
    int deleteByPrimaryKey(String sessionconfigId);

    int insert(SessionconfigWithBLOBs record);

    int insertSelective(SessionconfigWithBLOBs record);

    SessionconfigWithBLOBs selectByPrimaryKey(String sessionconfigId);

    int updateByPrimaryKeySelective(SessionconfigWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SessionconfigWithBLOBs record);

    int updateByPrimaryKey(Sessionconfig record);
}