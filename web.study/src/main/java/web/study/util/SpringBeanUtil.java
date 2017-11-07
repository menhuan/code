package web.study.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Spring 工具类 
 * @author dell
 */
@Component
public class SpringBeanUtil implements ApplicationContextAware {

	private static Logger log = LoggerFactory.getLogger(SpringBeanUtil.class);
	
	private static ApplicationContext ctx ;
	
	/**
	 * 设置bean
	 */
	@Override
	public void setApplicationContext(ApplicationContext app) throws BeansException {
		if( ctx == null){
			ctx = app ;
		}
	}
	
	/**
	 * 根据bean 名称获取bean实例
	 * @param name
	 * @return
	 */
	public static Object getBean(String name ){
		try {
			return ctx.getBean(name);
		} catch (Exception e) {
			log.error("获取bean 实例失败",e);
			return null ;
		}
	}
	
	/**
	 * 根据类型  获取bean实例
	 * @param clazz
	 * @return
	 */
	public static <T>  T getBean (Class<T> clazz){
		try {
			 return ctx.getBean(clazz);
		} catch (Exception e) {
			log.error("获取bean实例　失败",e);
			return null ;
		}
	}
}
