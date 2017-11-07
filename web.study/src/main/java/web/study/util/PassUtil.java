package web.study.util;

import java.security.MessageDigest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 密码加密解密公共类
 * @author ASUS
 * 创建时间  2017年10月31日 下午8:21:35
 *
 */
public class PassUtil {
	
	/**
	 * 日志组件
	 */
	private static final Logger logger = LoggerFactory.getLogger(PassUtil.class);

	/**
	 * 加密
	 */
	private static final char[] HEX_DIGITS =  {'0', '1', '2', '3', '4', '5',  
            '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };  
	
	
	
	
	/**
	 * 算法
	 * @author ASUS
	 * 创建时间  2017年10月31日 下午8:26:35
	 * @param bytes
	 * @return
	 */
    private static String getFormattedText(byte[] bytes) {  
        int len = bytes.length;  
        StringBuilder buf = new StringBuilder(len * 2);  
        // 把密文转换成十六进制的字符串形式  
        for (int j = 0; j < len; j++) {  
            buf.append(HEX_DIGITS[(bytes[j] >> 4) & 0x0f]);  
            buf.append(HEX_DIGITS[bytes[j] & 0x0f]);  
        }  
        return buf.toString();  
    }  
    
    /**
     * 解密
     * @author ASUS
     * 创建时间  2017年10月31日 下午8:27:01
     * @param str  需要解密的内容
     * @return
     */
    public static String encode(String str) {  
        if (str == null) {  
            return null;  
        }  
        try {  
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");  
            messageDigest.update(str.getBytes());  
            return getFormattedText(messageDigest.digest());  
        } catch (Exception e) {  
            throw new RuntimeException(e);  
        }  
    }  
    
    /**
     * MD5 加密
     * @param key
     * @return
     */
    public static String MD5encrpy(String key) {
		
		 try {
			 byte[] btInput=key.getBytes();
			 
			 //获得md5摘要算法的MessageDigest 对象
			 MessageDigest  mdInstDigest =MessageDigest.getInstance("MD5");
			 //使用指定的字节更新摘要
			 mdInstDigest.update(btInput);
			 //获得密文
			 byte[] md=mdInstDigest.digest();
			 //把密文转换成十六进制的字符串形式
			 int  j=md.length;
			 char str[]= new char[j*2];
			 int k=0;
			 for(int i=0;i<j;i++) {
				 byte byte0=md[i];
				 str[k++]=HEX_DIGITS[byte0>>>4 & 0xf];
				 str[k++]=HEX_DIGITS[byte0 & 0xf];
			 }
			
			 return new String(str);
			 
		} catch (Exception e) {
			logger.error("md5加密出现错误。。。",e);
			return null;
		}
}
    
}
