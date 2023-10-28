package com.mx.fintecheando.rest.echo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/v1/api")
public class EchoController {

  @PostMapping("/echo")
  public ResponseEntity<Object> createTutorial(@RequestBody Object cadena) {
    try {
        StringBuilder echoResponse = new StringBuilder();
        echoResponse.append("{\n" +
                            "	\"officeId\": 0,\n" +
                            "	\"clientId\": 0,\n" +
                            "	\"savingsId\": 0,\n" +
                            "	\"resourceId\": 0\n" +
                            "}");
      return new ResponseEntity<>(echoResponse.toString(), HttpStatus.OK);
    } 
    catch (Exception e) {
        StringBuilder echoResponse = new StringBuilder();
        echoResponse.append("{\n" +
                            "	\"officeId\": 0,\n" +
                            "	\"clientId\": 0,\n" +
                            "	\"savingsId\": 0,\n" +
                            "	\"resourceId\": 0\n" +
                            "}");
        return new ResponseEntity<>(echoResponse.toString(), HttpStatus.OK);
    }
  }
}
