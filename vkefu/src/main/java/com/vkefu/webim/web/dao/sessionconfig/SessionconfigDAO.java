package com.vkefu.webim.web.dao.sessionconfig;

import com.vkefu.webim.web.beans.sessionconfig.Sessionconfig;

public interface SessionconfigDAO {
    int deleteByPrimaryKey(String sessionconfigId);

    int insert(Sessionconfig record);

    int insertSelective(Sessionconfig record);

    Sessionconfig selectByPrimaryKey(String sessionconfigId);

    int updateByPrimaryKeySelective(Sessionconfig record);

    int updateByPrimaryKeyWithBLOBs(Sessionconfig record);

    int updateByPrimaryKey(Sessionconfig record);
}