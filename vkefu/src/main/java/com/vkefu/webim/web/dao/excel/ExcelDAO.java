package com.vkefu.webim.web.dao.excel;


import com.vkefu.webim.web.beans.excel.Excel;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ExcelDAO {
    int deleteByPrimaryKey(String id);

    @Insert("insert into excel (id, phone, custom_id) values (#{id,jdbcType=VARCHAR}, #{phone,jdbcType=VARCHAR}, #{customId,jdbcType=VARCHAR})")
    int insert(Excel record);

    int insertSelective(Excel record);

    Excel selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Excel record);

    int updateByPrimaryKey(Excel record);
}