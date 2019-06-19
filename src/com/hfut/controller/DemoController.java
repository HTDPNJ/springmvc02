package com.hfut.controller;

import com.hfut.pojo.Demo;
import com.hfut.pojo.Demo1;
import com.hfut.pojo.People;
import org.apache.tomcat.util.http.parser.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@Controller
public class DemoController {
    @RequestMapping("demo")
    public String demo(People peo, HttpServletRequest req, HttpSession session){
        System.out.println("执行demo");
        System.out.println(peo);
        req.setAttribute("demo123","测试");
        System.out.println("hahh");
        return "main.jsp";
    }

    @RequestMapping("page")
    public String page(@RequestParam(defaultValue = "2") int pageSize, @RequestParam(defaultValue = "1") int pageNumber){
        System.out.println(pageSize+" "+pageNumber);
        return "main.jsp";
    }

    @RequestMapping("demo2")
    public String demo2(@RequestParam(required = true) String name){
        System.out.println("name是sql查询条件，必须要传递name参数"+name);
        return "main.jsp";
    }

    @RequestMapping("demo5")
    public String demo5(String name, int age, @RequestParam("hover")List<String>hover){
        System.out.println(name+" "+age+" "+hover);
        return "main.jsp";
    }

    @RequestMapping("demo6")
    public String demo6(Demo demo){
        System.out.println(demo);
        return "main.jsp";
    }

    @RequestMapping("demo7")
    public String demo7(Demo1 demo){
        System.out.println(demo);
        return "main.jsp";
    }

    @RequestMapping("demo8")
    public String demo8(String name,int age){
        System.out.println(name+" "+age);
        return "main.jsp";
    }

    @RequestMapping("demo9/{id1}/{name}")
    public String demo9(@PathVariable String name,@PathVariable("id1") int age){
        System.out.println(name+" "+age);
        return "/main.jsp";
    }

    @RequestMapping("demo10")
    public String demo10(){
        System.out.println("重定向");
        return "redirect:/main.jsp";
    }
    @RequestMapping("demo12")
    public void demo12(HttpServletResponse res) throws IOException {
        PrintWriter out=res.getWriter();
        out.print("abc");
        out.flush();
        out.close();
    }
    @RequestMapping(value = "demo13",produces = "text/html;charset=utf-8")
    @ResponseBody
    public People demo13() throws IOException {
        People p=new People();
        p.setAge(12);
        p.setName("张三");
        return p;
    }
}
