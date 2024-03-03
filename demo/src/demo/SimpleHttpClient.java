package demo;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class SimpleHttpClient {
	
	
	private static final HttpClient httpClient = HttpClient.newBuilder()
			 .version(HttpClient.Version.HTTP_2)
			 .connectTimeout(Duration.ofSeconds(10))
			 .build();

	
	    public static void main(String[] args) {
	        //String url = "https://jsonBody.org/get";
	        HttpRequest request = HttpRequest.newBuilder()
	        		.GET()
	                .uri(URI.create("https://dummyjson.com/products/1"))
	                .build();

	        try {
	        	
	            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

	            
	            System.out.println("Status Code: " + response.statusCode());
	            System.out.println();
	          
	            System.out.println("Response Body:\n" + response.body());
	        } catch (Exception e) {
	            e.printStackTrace();
	        
	    }

	    }
	   
	    
}
	    


