package com.vkefu.webim;
import com.vkefu.webim.web.service.IMmSV;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.text.SimpleDateFormat;
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationTests {
	private SimpleDateFormat sdf = new SimpleDateFormat("MM.dd.yyyy HH:mm:SS");
	@Autowired
	private IMmSV iMmSV;
}

















