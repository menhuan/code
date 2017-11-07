package web.study.controller.web;

import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.util.SortedMap;
import java.util.TreeMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import web.study.model.wechat.pay.PayWeBean;
import web.study.util.MessageUtil;
import web.study.util.SignUtil;

/**
 * 微信Controller
 * @author dell
 *
 */
@Controller
@RequestMapping("weChat")
public class WeChatController {
	
	/**
	 * 日志文件
	 */
	private static final Logger logger =LoggerFactory.getLogger(WeChatController.class);

	/**
	 * 微信商户号
	 */
	private static final String MCHID = "1487076782";
	
	/**
	 * 微信回调地址
	 */
	private static final String NOTIFYURL = " " ;
	
	/**
	 * 微信交易类型
	 */
	private static final String TRADETYPE = "web" ;
	
	/**
	 * 微信APIKEY
	 */
	private static final String APIKEY = "wx61576d34a3193a4d";
	
	
	/**
	 * 连接微信
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping(value = "connect",method = {RequestMethod.GET,RequestMethod.POST})
	public void connectWeChat(HttpServletRequest request,HttpServletResponse response)throws Exception{
		
		 // 将请求、响应的编码均设置为UTF-8（防止中文乱码）  
        request.setCharacterEncoding("UTF-8");  //微信服务器POST消息时用的是UTF-8编码，在接收时也要用同样的编码，否则中文会乱码；
        response.setCharacterEncoding("UTF-8"); //在响应消息（回复消息给用户）时，也将编码方式设置为UTF-8，原理同上；
    
        boolean isGet = request.getMethod().toLowerCase().equals("get"); 
        PrintWriter out = response.getWriter();
        
        if (isGet) {
        	// 微信加密签名   ,signature结合了开发者填写的token参数和请求中的timestamp参数、nonce参数。
            String signature = request.getParameter("signature");
            String timestamp = request.getParameter("timestamp");// 时间戳  
            String nonce = request.getParameter("nonce");// 随机数  
            
            
            String echostr = request.getParameter("echostr");//随机字符串  
            
            // 通过检验signature对请求进行校验，若校验成功则原样返回echostr，表示接入成功，否则接入失败 
            String  DNBX_TOKEN = "123123";
            if (SignUtil.checkSign(DNBX_TOKEN, signature, timestamp, nonce)) {  
                response.getWriter().write(echostr);  
            } else {  
            }
        }else{
            String respMessage = "异常消息！";
            
            try {
            	//respMessage = wechatService.weixinPost(request);
                out.write(respMessage);
            } catch (Exception e) {
            }
            
        }
	}
	
	
	/**
	 * 统一下单
	 * @return
	 * @throws Exception  
	 */
	@RequestMapping(value = "/uniformorder" ,method = RequestMethod.POST )
	public String  uniformorder(HttpServletRequest request) throws Exception {
		request.setCharacterEncoding("UTF-8");
		
		try {
			//app id 
			String  appid = request.getParameter("appid");
			/**
			 * 用户访问令牌
			 */
			String  accessToken = request.getParameter("accessToken");
			/**
			 * 订单编号
			 */
			String  orderNum = request.getParameter("orderNum");
			/**
			 * 消费金额	
			 */
			String  money = request.getParameter("money");
		
			/**
			 * 消费金额
			 */
			String subject = request.getParameter("subject") ;
			
			if(StringUtils.isEmpty(appid)){
				return "参数：appid 为空";
			}
			
			if(StringUtils.isEmpty(accessToken)){
				return "用户访问令牌为空";
			}
			
			if(StringUtils.isEmpty(money)){
				return "消费金额为空";
			}
			
			if(StringUtils.isEmpty(subject)){
				return "主题为空" ;
			}
			
			if(StringUtils.isEmpty(orderNum)){
				return "订单号为空";
			}
			
			
			SortedMap<String, Object> result =new TreeMap<String ,Object>();
			PayWeBean  bean = new PayWeBean();
			bean.setAppid(appid);
			bean.setMch_id(MCHID);
			bean.setNonce_str("123123");
			bean.setBody(subject);
			bean.setOut_trade_no(orderNum);
			bean.setTotal_fee(Integer.parseInt(BigDecimal.valueOf(Long.valueOf(money))
					.multiply(new BigDecimal(100)).toString()) );
			bean.setSpbill_create_ip("127.0.0.1");
			bean.setNotity_url(NOTIFYURL);  //回调地址
			bean.setTrade_type(TRADETYPE);  //交易类型
			String sign = SignUtil.createMD5Sign(bean);
			bean.setSign(sign);

			String xml = MessageUtil.messageToXml(bean);
			
			// 提交到微信的统一下单接口上
			String content = "" ;
			
//			result.put("appid", appid);
//			result.put("mch_id", MCHID);
//			result.put("nonce_str", 123123);
//			result.put("body", subject);
//			result.put("out_trade_no", orderNum);  //商户订单编号
//			result.put("total_fee", BigDecimal.valueOf(Long.valueOf(money))
//					.multiply(new BigDecimal(100)).toString());
//			result.put("spbill_create_ip", "127.0.0.1");  //消费者ip地址
//			result.put("notify_url", NOTIFYURL);  //回调地址
//			result.put("trade_type", TRADETYPE);
			
			
			
		} catch (Exception e) {
			logger.error("统一下单出现问题" , e);
		}
		
		return  null ;
	}
	
	
}
