package com.geekster.api.nationalize;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@SpringBootApplication
public class ApiNationalizeApplication {

	public static void main(String[] args) throws Exception{
		var url="https://api.nationalize.io/?name=nathaniel";
		HttpRequest request=HttpRequest.newBuilder().uri(URI.create(url)).build();
		HttpClient client=HttpClient.newBuilder().build();
		HttpResponse<String> response=client.send(request,HttpResponse.BodyHandlers.ofString());
		System.out.println(response.statusCode());
		System.out.println(response.body());
	}
}


