package com.vkefu.webim.web.service.excel.impl;

import com.vkefu.webim.web.beans.excel.Excel;
import com.vkefu.webim.web.dao.excel.ExcelDAO;
import com.vkefu.webim.web.service.excel.IExcelSV;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExcelSVImpl implements IExcelSV {

    @Autowired
    private ExcelDAO excelDAO;

    @Override
    public int save(Excel excel) {
      return  excelDAO.insert(excel);
    }
}
