
import java.io.IOException;
import java.net.URI;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.google.gson.Gson;


public class GetData {
    static String URL = "https://www.alphavantage.co/query?";
	
    static URI targetUrl = UriComponentsBuilder.fromUriString(URL)
    	    .queryParam("function", "TIME_SERIES_INTRADAY")
    	    .queryParam("symbol", "MSFT")
    	    .queryParam("interval", "5min")
    	    .queryParam("outputsize","full")
    	    .queryParam("apikey","demo")
    	    .build()
    	    .encode()
    	    .toUri();
    
    
	public static void main(String[] args) throws IOException, ParseException{
        HttpHeaders headers = new HttpHeaders();
        
        headers.setContentType(MediaType.APPLICATION_JSON);
        
        RestTemplate restTemplate = new RestTemplate();

        HttpEntity<Object> entity = new HttpEntity<Object>(headers);
        
        ResponseEntity<Object> response = restTemplate.exchange(targetUrl, HttpMethod.GET, entity, Object.class);
        Object obj = response.getBody();
        
        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        String json = ow.writeValueAsString(obj);
        
        
        Gson gson = new Gson();
        Registro registro = gson.fromJson(json, Registro.class);
        System.out.println(registro.getMetadata().getInformation());
    }
}
