package web.study.util;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.core.util.QuickWriter;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.xml.PrettyPrintWriter;
import com.thoughtworks.xstream.io.xml.XppDriver;

import web.study.model.wechat.ArticleResMessage;
import web.study.model.wechat.NewsMessage;
import web.study.model.wechat.TextResMessage;
import web.study.model.wechat.TextWeChatMessage;

/**
 * 消息处理公共类
 * @author dell
 *
 */
public class MessageUtil {

	 // 请求消息类型：文本
    public static final String REQ_MESSAGE_TYPE_TEXT = "text";
    // 请求消息类型：图片
    public static final String REQ_MESSAGE_TYPE_IMAGE = "image";
    // 请求消息类型：语音
    public static final String REQ_MESSAGE_TYPE_VOICE = "voice";
    // 请求消息类型：视频
    public static final String REQ_MESSAGE_TYPE_VIDEO = "video";
    // 请求消息类型：小视频
    public static final String REQ_MESSAGE_TYPE_SHORTVIDEO = "shortvideo";
    // 请求消息类型：地理位置
    public static final String REQ_MESSAGE_TYPE_LOCATION = "location";
    // 请求消息类型：链接
    public static final String REQ_MESSAGE_TYPE_LINK = "link";

    // 请求消息类型：事件推送
    public static final String REQ_MESSAGE_TYPE_EVENT = "event";

    // 事件类型：subscribe(订阅)
    public static final String EVENT_TYPE_SUBSCRIBE = "subscribe";
    // 事件类型：unsubscribe(取消订阅)
    public static final String EVENT_TYPE_UNSUBSCRIBE = "unsubscribe";
    // 事件类型：scan(用户已关注时的扫描带参数二维码)
    public static final String EVENT_TYPE_SCAN = "scan";
    // 事件类型：LOCATION(上报地理位置)
    public static final String EVENT_TYPE_LOCATION = "LOCATION";
    // 事件类型：CLICK(自定义菜单)
    public static final String EVENT_TYPE_CLICK = "CLICK";

    // 响应消息类型：文本
    public static final String RESP_MESSAGE_TYPE_TEXT = "text";
    // 响应消息类型：图片
    public static final String RESP_MESSAGE_TYPE_IMAGE = "image";
    // 响应消息类型：语音
    public static final String RESP_MESSAGE_TYPE_VOICE = "voice";
    // 响应消息类型：视频
    public static final String RESP_MESSAGE_TYPE_VIDEO = "video";
    // 响应消息类型：音乐
    public static final String RESP_MESSAGE_TYPE_MUSIC = "music";
    // 响应消息类型：图文
    public static final String RESP_MESSAGE_TYPE_NEWS = "news";
    
    /**
     * 解析从微信传过来的xml数据
     * @param request
     * @return
     * @throws Exception   抛出异常
     */
    public static Map<String ,String> parseXmlWeChat(HttpServletRequest request) throws Exception{
    	Map<String, String> map = new HashMap<String ,String> ();
    	
    	//从request 中取得输入流
    	InputStream inputStream = request.getInputStream();
    	
    	//读取输入流
    	SAXReader reader = new SAXReader();
    	Document document = reader.read(inputStream);
    	//得到跟节点
    	Element  root =document.getRootElement();
    	
    	List<Element> elementList = root.elements() ;
    	
    	for(Element element : elementList){
    		map.put( element.getName() , element.getText());
    	}
    	
    	inputStream.close();
    	inputStream = null ;
    	return map ;
    }
    
    /**
     * 扩展xStream 使其支持CDATA 
     */
    private static XStream xStream = new XStream(new XppDriver(){

    	public HierarchicalStreamWriter createWriter(Writer out) {
    		
    		return new PrettyPrintWriter(out){
    			//对所有的xml节点的转换都增加CDATA标记
    			boolean cdata = true ;
    			
    			public void startNode(String name ,Class clazz){
    				super.startNode(name, clazz);
    			}
    			
    			protected void writeText(QuickWriter writer, String text) {
    				if(cdata){
    					writer.write("<![cdata[");
    					writer.write(text);
    					writer.write("]]>");
    				}else{
    					writer.write(text);
    				}
    			}
    		};
    		
    	}
    	
    });
    
    /**
     * 将文本消息转化为xml
     * @param textWeChatMessage
     * @return
     */
    public static String messageToXml(TextResMessage resTest){
    	xStream.alias("xml", resTest.getClass());
    	return xStream.toXML(resTest);
    }
    
    /**
     * 根据传过来的类型转为对应的 数据类型 T 包含类型为
     *  文本消息 
     * @param text  回复的消息类型 ：1. 文本消息 2. 图片消息 3.语音消息 4.视频消息  5.因为消息 
     * @return
     */
    public static <T> String messageToXml( T text){
    	xStream.alias("xml", text.getClass());
    	return xStream.toXML(text);
    }
    
    /**
     * 将图文消息对象转为xml
     * @param textWeChatMessage
     * @return
     */
    public static String messageToXml(NewsMessage newsMessage){
    	xStream.alias("xml", newsMessage.getClass());
    	xStream.alias("item", new ArticleResMessage().getClass());
    	return xStream.toXML(newsMessage);
    }
    
}
