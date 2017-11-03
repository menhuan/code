package web.study.util;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.*;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RestFul {
	
	
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
	 
	 
	

}
