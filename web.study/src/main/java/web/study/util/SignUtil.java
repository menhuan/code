package web.study.util;

import java.util.Arrays;

/**
 * 签名校验类
 * @author dell
 */
public class SignUtil {

	

    /** 
     * 验证签名 
     * @param token 微信服务器token，在env.properties文件中配置的和在开发者中心配置的必须一致 
     * @param signature 微信服务器传过来sha1加密的证书签名
     * @param timestamp 时间戳
     * @param nonce 随机数 
     * @return 
     */  
    public static boolean checkSignature(String token,String signature, String timestamp, String nonce) {  
        String[] arr = new String[] { token, timestamp, nonce };  
        // 将token、timestamp、nonce三个参数进行字典序排序  
        Arrays.sort(arr);  
        
        // 将三个参数字符串拼接成一个字符串进行sha1加密  
        String tmpStr = PassUtil.encode(arr[0] + arr[1] + arr[2]);  
        
        // 将sha1加密后的字符串可与signature对比，标识该请求来源于微信  
        return tmpStr != null ? tmpStr.equals(signature.toUpperCase()) : false;  
    }  
    
    
    /**
     * 验证签名
     * @param token 微信上配置的token
     * @param signature  微信服务器传过来的SHA1加密的 证书签名
     * @param timestap  时间戳  微信服务器传输过来的
     * @param nonce  随机数 微信服务器传输过来的
     * @return
     */
    public static boolean checkSign(String token ,String signature,String timestap,String nonce){
    	String[] array = new String[] {token , timestap , nonce };
    	//将token .timestap 、 nonce  三个进行字典排序
    	Arrays.sort(array);
    	
    	StringBuilder content = new StringBuilder();
    	for(int i = 0 ; i< array.length ; i++) {
    		content.append(array[i]);
    	}
    	
    	String tmpStr = PassUtil.encode(content.toString());
    	return tmpStr != null ? tmpStr.equals(signature.toUpperCase()) : false ;
    	 
    }
}
