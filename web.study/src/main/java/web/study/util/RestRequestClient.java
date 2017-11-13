package web.study.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.LinkedHashMap;
import java.util.Map;


/**
 * Created by ASUS on 2017/8/22.
 */
public class RestRequestClient {


    /**
     * restTemplate request
     *
     * @param url
     * @param sPara
     */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public LinkedHashMap restSubmit(String url, Map<String, String> sPara) {

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.parseMediaType("application/json; charset=utf-8"));
        headers.set("Accept-Charset", "UTF-8");
        HttpEntity entity = new HttpEntity(sPara, headers);
        ResponseEntity response = restTemplate.exchange(url, HttpMethod.POST, entity, Map.class);
        LinkedHashMap responseMap = (LinkedHashMap) response.getBody();
        return responseMap;
    }

    /**
     * 此方法本质同restSubmit,在此处多进行了一次json的转换!
     * restTemplate request
     *
     * @param url
     * @param sPara
     */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public LinkedHashMap restSubmitJson(String url, Map<String, String> sPara) {

        JSONObject jsonMap = JSONObject.parseObject(JSON.toJSONString(sPara));

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.parseMediaType("application/json; charset=utf-8"));
        headers.set("Accept-Charset", "UTF-8");
        HttpEntity entity = new HttpEntity(jsonMap, headers);
        ResponseEntity response = restTemplate.exchange(url, HttpMethod.POST, entity, Map.class);
        LinkedHashMap responseMap = (LinkedHashMap) response.getBody();
        return responseMap;
    }


    /**
     * 此方法本质同restSubmit,传进来的是一个bean在此处多进行了一次的转换!
     * restTemplate request
     *
     * @param url
     * @param obj 一般为bean
     */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public LinkedHashMap restSubmitBean(String url, Object obj) {

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.parseMediaType("application/json; charset=utf-8"));
        headers.set("Accept-Charset", "UTF-8");
        HttpEntity entity = new HttpEntity(JSON.toJSON(obj), headers);
        ResponseEntity response = restTemplate.exchange(url, HttpMethod.POST, entity, Map.class);
        LinkedHashMap responseMap = (LinkedHashMap) response.getBody();
        System.out.println(responseMap);
        return responseMap;
    }
    
    /**
     *  https  post 方法 
     * @param url
     * @param obj
     * @return
     */
    public String restHttpsPost(String url , Object obj){
    	//设置header 
    	HttpHeaders httpHeaders = new HttpHeaders();
    	HttpHeaders headers = new HttpHeaders();
    	headers.setContentType(MediaType.parseMediaType("application/json; charset=utf-8"));
    	headers.set("Accept-Charset", "UTF-8");
    	HttpEntity entity = new HttpEntity(JSON.toJSON(obj), headers);
    	
    	
    	return "";
    }
}
