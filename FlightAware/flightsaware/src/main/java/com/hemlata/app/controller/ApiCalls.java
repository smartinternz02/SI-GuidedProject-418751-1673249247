package com.hemlata.app.controller;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class ApiCalls {
	
	//API Call to get leagues of the different games
	public String fprices(String p1,String p2,String p3,String d) throws IOException, InterruptedException, ParseException
	{
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("https://skyscanner50.p.rapidapi.com/api/v1/searchFlights?origin=+p2&destination=+p3&date=+d&market=+p1"))
				.header("X-RapidAPI-Key", "ecdb5069f9mshdc8b3fa2c60f423p1d83d4jsn862e9fec4009")
				.header("X-RapidAPI-Host", "skyscanner50.p.rapidapi.com")
				.method("GET", HttpRequest.BodyPublishers.noBody())
				.build();
		HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println(response.body());
		return response.body();
	}
	public String dprices(String ctry,String curr,String p1,String p2,String p3,String d,String d2) throws IOException, InterruptedException, ParseException
	{
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("https://skyscanner50.p.rapidapi.com/api/v1/searchFlights?origin=+p2&destination=+p3&date=+d&returnDate=+d2&currency=curr&countryCode=+ctry&market=+p1"))
				.header("X-RapidAPI-Key", "ecdb5069f9mshdc8b3fa2c60f423p1d83d4jsn862e9fec4009")
				.header("X-RapidAPI-Host", "skyscanner50.p.rapidapi.com")
				.method("GET", HttpRequest.BodyPublishers.noBody())
				.build();
		HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println(response.body());
		return response.body();
	}
	public String rts(String ctry,String curr,String p1,String p2,String p3,String d) throws IOException, InterruptedException, ParseException
	{
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("https://skyscanner50.p.rapidapi.com/api/v1/searchFlights?origin=+p2&destination=+p3&date=+d&currency=+curr&countryCode=+ctry"))
				.header("X-RapidAPI-Key", "ecdb5069f9mshdc8b3fa2c60f423p1d83d4jsn862e9fec4009")
				.header("X-RapidAPI-Host", "skyscanner50.p.rapidapi.com")
				.method("GET", HttpRequest.BodyPublishers.noBody())
				.build();
		HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println(response.body());
		return response.body();
	}
	public String curs(String curr) throws IOException, InterruptedException
	{
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("https://skyscanner50.p.rapidapi.com/api/v1/searchFlights?currency=+curr"))
				.header("X-RapidAPI-Key", "ecdb5069f9mshdc8b3fa2c60f423p1d83d4jsn862e9fec4009")
				.header("X-RapidAPI-Host", "skyscanner50.p.rapidapi.com")
				.method("GET", HttpRequest.BodyPublishers.noBody())
				.build();
		HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println(response.body());
		return response.body();
	}
	public String cntrys() throws IOException, InterruptedException{
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("https://skyscanner50.p.rapidapi.com/api/v1/searchFlights?market=+locale"))
				.header("X-RapidAPI-Key", "ecdb5069f9mshdc8b3fa2c60f423p1d83d4jsn862e9fec4009")
				.header("X-RapidAPI-Host", "skyscanner50.p.rapidapi.com")
				.method("GET", HttpRequest.BodyPublishers.noBody())
				.build();
		HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println(response.body());
		return response.body();
	}
	public String placess(String curr,String code,String cntry,String locale) throws IOException, InterruptedException
	{
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("https://skyscanner50.p.rapidapi.com/api/v1/getFlightDetails?currency=+curr&countryCode=+cntry&market=+locale"))
				.header("X-RapidAPI-Key", "ecdb5069f9mshdc8b3fa2c60f423p1d83d4jsn862e9fec4009")
				.header("X-RapidAPI-Host", "skyscanner50.p.rapidapi.com")
				.method("GET", HttpRequest.BodyPublishers.noBody())
				.build();
		HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println(response.body());
		return response.body();
	}
}