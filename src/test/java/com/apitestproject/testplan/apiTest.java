package com.apitestproject.testplan;

import static org.testng.Assert.assertEquals;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import org.testng.annotations.Test;

public class apiTest {
	
	public static Response response;
	
	@Test(description="Test free API online")
	public void test01() {
		response = RestAssured
				.given()
				.header("Content-Type", "application/json")
				.request()
				.get("https://swapi.co/api/people");
		assertEquals(response.getStatusCode(), 201);
		assertEquals(response.path("results[0].name"), "Luke Skywalker");
		System.out.println(response.getStatusCode());
		System.out.println(response.asString());
		System.out.println(response.path("results[0].name"));
	}

	@Test(description="Test free API online")
	public void test02() {
		response = RestAssured
				.given()
				.header("Content-Type", "application/json")
				.request()
				.get("https://swapi.co/api/people");
		assertEquals(response.getStatusCode(), 200);
		assertEquals(response.path("results[0].name"), "Luke Skywalker");
		System.out.println(response.getStatusCode());
		System.out.println(response.asString());
		System.out.println(response.path("results[0].name"));
	}
}
