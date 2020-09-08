package com.china.trim.controller;

import com.china.trim.bean.Person;
import com.china.trim.dto.Result;
import com.china.trim.exception.TrimException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;


@Controller
@RequestMapping("test")
public class TestController {
     @RequestMapping(value = "test",method = RequestMethod.GET)
     @ResponseBody
     public Result test(HttpServletRequest request) throws TrimException{
          String params= request.getParameter("key");
          if("1".equals(params)){
               throw new TrimException("-9999","错误");
          }
          Person person=new Person();
          person.setAge(11);
          person.setName("张三");
          Result result=new Result("0","返回成功");
          result.setBean(person);
          return result;
     }
}
