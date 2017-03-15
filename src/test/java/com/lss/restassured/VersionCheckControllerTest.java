package com.lss.restassured;

import io.restassured.RestAssured;
import org.junit.Before;
import org.junit.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
/**
 * Created by Sean.liu on 2017/3/15.
 */
public class VersionCheckControllerTest {

    @Before
    public void init(){
        //指定 URL 和端口号
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 28080;
    }

    @Test
    public void testVersionCheck(){
        get("/v1/version/check?version=v1").then().body("update",is(true));
    }
}
