package web.study.test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

import org.junit.Test;

import web.study.service.MyX509TruetManager;
import web.study.util.RestRequestClient;

/**
 * 测试类
 * @author dell
 *
 */
public class TokenTest {

	
	public static void main(String[] args) throws Exception {
		String tokenUrl = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_c"
				+ "redential&appid=wx61576d34a3193a4d&secret=7fb959d3e5c8749e9e591eae78fe357c" ;
		
		//建立连接
		URL url = new URL(tokenUrl);
		HttpsURLConnection httpUrlConn = (HttpsURLConnection) url.openConnection() ;
		
		//创建SSLContext 对象 并使用我们指定的信任管理器 初始化
		MyX509TruetManager[] tm = { new MyX509TruetManager()} ;
		SSLContext sslContext = SSLContext.getInstance("SSL","SunJSSE");
		sslContext.init(null, tm, new  SecureRandom());
		
		//从上述SSLcontext 对象中得到SSLSocketFactory 对象
		SSLSocketFactory ssf =sslContext.getSocketFactory() ;
		
		httpUrlConn.setSSLSocketFactory(ssf);
		httpUrlConn.setDoInput(true);
		httpUrlConn.setDoOutput(true);
		
		//设置请求方式
		httpUrlConn.setRequestMethod("GET");
		
		InputStream inputStream = httpUrlConn.getInputStream() ;
		InputStreamReader  reader =  new InputStreamReader(inputStream, "utf-8");
		BufferedReader bufferedReader = new BufferedReader(reader) ;
		
		//读取相应内容
		StringBuffer buffer = new StringBuffer() ;
		String str = null ;
		while((str = bufferedReader.readLine()) !=null ){
			buffer.append(str);
		}
		
		bufferedReader.close();
		reader.close();
		inputStream.close();
		httpUrlConn.disconnect();
		System.out.println(buffer);
		
	}
	
	@Test
	public void test(){
		String url = "https://api.weixin.qq.com/cgi-bin/menu/create?access_token='123123'";
		
		RestRequestClient  rest = new RestRequestClient();
		rest.restSubmitBean(url, new HashMap());
	}
}
