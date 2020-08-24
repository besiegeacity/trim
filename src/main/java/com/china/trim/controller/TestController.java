package com.china.trim.controller;

import com.china.trim.dto.Result;
import org.springframework.stereotype.Controller;

@Controller
public class TestController {
     public Result test(){
          return new Result();
     }
}
