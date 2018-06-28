package com.vkefu;
import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import com.vkefu.test.TestEntity;
import com.vkefu.webim.web.beans.excel.Excel;
import com.vkefu.webim.web.service.excel.IExcelSV;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationTests {
	private SimpleDateFormat sdf = new SimpleDateFormat("MM.dd.yyyy HH:mm:SS");

	@Autowired
	private IExcelSV excelSV;

	@Test
	public void contents(){
		System.out.println("--qwqwq--");
	}
	@Test
	public void test() {
		try {
			ImportParams params = new ImportParams();
			long startTime = System.currentTimeMillis();
			params.setTitleRows(1);
			long start = new Date().getTime();

			/*List<TestEntity> list = ExcelImportUtil.importExcelBySax(
					new FileInputStream(
							new File(FileUtilTest.getWebRootPath("import/excel.xlsx"))),
					TestEntity.class, params);
			int i=0;
			for (TestEntity test:list) {
				i++;
				System.out.println("--id--"+test.getId()+"--i--"+i);
			}*/
			List<Excel> list = ExcelImportUtil.importExcel(new FileInputStream(
					new File("D://excel1.xlsx")), Excel.class, params);
			long middleTime = System.currentTimeMillis();
			System.out.println("==读取耗费时间=="+(middleTime-startTime));
			for (Excel excel:list) {
				excelSV.save(excel);
			}
			Assert.assertEquals(99018,list.size());
			long endTime = System.currentTimeMillis();
			System.out.println("==耗费时间=="+(endTime-startTime));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

















