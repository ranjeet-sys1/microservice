package com.app.hospital.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

public class ResponseHandler {

   public static ResponseEntity<Object> responseHandler(
           String message,HttpStatus httpStatus, Object responseObject){
       Map<String, Object> map=new HashMap<>();
       map.put("message",message);
       map.put("httpStatus",httpStatus);
       map.put("data",responseObject);
       return new ResponseEntity<>(map,httpStatus);

   }

}
