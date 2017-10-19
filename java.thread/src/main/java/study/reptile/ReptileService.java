package study.reptile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import study.reptile.bean.AbTest;
import study.reptile.bean.BossJobBean;
import study.reptile.bean.BossJobs;
import study.reptile.bean.DetailAriticleBean;
import study.reptile.bean.HotPosts;
import study.reptile.bean.HotPostsBean;
import study.reptile.bean.abTestValue;

/**
 * 爬虫测试
 * @author ASUS
 * 创建时间  2017年10月15日 下午9:45:17
 *
 */
public class ReptileService {
	
	private static final  String  PATTERNSTRING = "http://36kr\\.com/p\\.([0-9]|[a-z])*\\.html";
	
	private static final String PATER_HTML = "http://36kr.com/p/[0-9]+\\.html";
	
	private static final String SCRIT_HTML = "<script.*?</script>";
	
	public static void main(String[] args) {
		String url ="http://36kr.com/";
		
	}
	
	@Test
	public   void test1Test() {
		String url ="http://36kr.com/";
		try {
			URL contentUrl =new URL(url);
			HttpURLConnection    htttp=(HttpURLConnection) contentUrl.openConnection();
			htttp.connect();
			String content=	contentUrl.getContent().toString();
			Pattern pattern = Pattern.compile(PATTERNSTRING);
	        Matcher matcher = pattern.matcher(content);
	        System.out.println(content);
	        String jsSrc = null;
	        System.out.println(matcher.matches());
	        if (matcher.find()){
	            jsSrc = matcher.group(0);
	            System.out.println(jsSrc);
	        } else {
	            throw new RuntimeException("not find javascript url");
	        }
		
		
		} catch (IOException e) {
		}
	}
	
	@Test
	public  void test2() {
		String url ="http://36kr.com/";
		  BufferedReader in = null;    
		  String result = ""; 
	        try {    
	            // 将string转成url对象    
	            URL realUrl = new URL(url);    
	            // 初始化一个链接到那个url的连接    
	            URLConnection connection = realUrl.openConnection();    
	            // 开始实际的连接    
	            connection.connect();    
	            // 初始化 BufferedReader输入流来读取URL的响应    
	            in = new BufferedReader(new InputStreamReader(    
	                    connection.getInputStream(), "UTF-8"));    
	            // 用来临时存储抓取到的每一行的数据    
	            String line;    
	            while ((line = in.readLine()) != null) {    
	                // 遍历抓取到的每一行并将其存储到result里面    
	                result += line;    
	            }    
	            System.out.println(result);
	        } catch (Exception e) {    
	            System.out.println("发送GET请求出现异常！" + e);    
	            e.printStackTrace();    
	        }    
	        // 使用finally来关闭输入流    
	        finally {    
	            try {    
	                if (in != null) {    
	                    in.close();    
	                }    
	            } catch (Exception e2) {    
	                e2.printStackTrace();    
	            }    
	        }  
//	        result =result.replaceAll("\n","");
//	        result = result.replace("&nbsp;", ""); 
	        if(result.contains("^http://36kr.com/p/")) {
	        	System.out.println(true);
	        }//"<script.*?</script>";  http://36kr.com/p/[0-9]+
	        Pattern  pattern = Pattern.compile(PATER_HTML,Pattern.DOTALL);
	        Matcher  matcher = pattern.matcher(result);
	        if(matcher.find()) {
	        	System.out.println(true);
	        	System.out.println(matcher.group(0));
	        }else {
				System.out.println(false);
			}
	     
	        

	}
	@Test
	public  void test3() {
		String url ="http://36kr.com/p/533801.html";
		  BufferedReader in = null;    
		  String result = ""; 
	        try {    
	            // 将string转成url对象    
	            URL realUrl = new URL(url);    
	            // 初始化一个链接到那个url的连接    
	            URLConnection connection = realUrl.openConnection();    
	            // 开始实际的连接    
	            connection.connect();    
	            // 初始化 BufferedReader输入流来读取URL的响应    
	            in = new BufferedReader(new InputStreamReader(    
	                    connection.getInputStream(), "UTF-8"));    
	            // 用来临时存储抓取到的每一行的数据    
	            String line;    
	            while ((line = in.readLine()) != null) {    
	                // 遍历抓取到的每一行并将其存储到result里面    
	                result += line;    
	            }    
	          
	        } catch (Exception e) {    
	            System.out.println("发送GET请求出现异常！" + e);    
	            e.printStackTrace();    
	        }    
	        // 使用finally来关闭输入流    
	        finally {    
	            try {    
	                if (in != null) {    
	                    in.close();    
	                }    
	            } catch (Exception e2) {    
	                e2.printStackTrace();    
	            }    
	        }  

	       //"<script.*?</script>";  http://36kr.com/p/[0-9]+
	        Pattern  pattern = Pattern.compile(SCRIT_HTML,Pattern.DOTALL);
	        Matcher  matcher = pattern.matcher(result);
	        String   value  = null ;
	        while(matcher.find()) {
	        	value = matcher.group(0);
	        	
	        	if(value.contains("<script>var props=")) {
	        		value = value.replaceAll("<script>var props=", "");
	        		value = value.replaceAll("</script>", "");
	        		value = value.replace("},locationnal=", ",locationnal:");
	        		value=value+"}";
	        		
	        		try {
	            		JSONObject  o =JSON.parseObject(value, JSONObject.class);
	            		JSONObject  detailAriticle = o.getJSONObject("detailArticle|post");
	            		JSONArray   abTest = o.getJSONArray("abTest|abtest");
	            		JSONArray   bossJobs = o.getJSONArray("bossJobs|job");
	            		JSONArray   hotPost = o.getJSONArray("hotPostsOf30|hotPost");
	            		
	            		DetailAriticleBean  detailBean =JSON.parseObject(detailAriticle.toString(), DetailAriticleBean.class);
	            		List<abTestValue>  list= JSON.parseArray(abTest.toString(), abTestValue.class) ; 
	            		List<BossJobBean> bossJob = JSON.parseArray(bossJobs.toString(), BossJobBean.class);
	            		List<HotPostsBean> hots = JSON.parseArray(hotPost.toString(), HotPostsBean.class);
	            		
	            		System.out.println(111);
		
					} catch (Exception e) {
						e.printStackTrace();
					}
	        	}
	        	
	        }
	     
	        

	}
	
	
}
