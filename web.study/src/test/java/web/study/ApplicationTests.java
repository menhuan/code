package web.study;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import web.study.util.RestRequestClient;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

	@Test
	public void contextLoads() {
		String url = " https://api.weixin.qq.com/cgi-bin/menu/create?access_token='123123'";
		
		RestRequestClient  rest = new RestRequestClient();
		rest.restSubmitBean(url, "123");
		
	}

}
