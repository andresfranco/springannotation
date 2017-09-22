/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springannotation.controllers;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
/**
 *
 * @author john
 */
@Controller
public class DefaultController {
    
   @RequestMapping(value = "/", method = RequestMethod.GET)
   public String index(ModelMap map) {
       map.put("msg", "Hello Spring 4 Web MVC!");
       return "index";
   }
   
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
   public String hello(ModelMap map) {
       Map<String, String> countries = new HashMap<>();
       countries.put("name", "demo");
      // countries.put(, value)
       
       map.put("msg", "Andres");
       map.put ("param1","Param1Name");
       return "hello";
   }
    
}