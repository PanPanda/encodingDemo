package com.pan.encoding.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

@RestController
public class DempController {

    @RequestMapping(value = "/getMsg",method = RequestMethod.GET,produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String getMsg(@RequestParam("param") String param) throws UnsupportedEncodingException {

        String newParam = URLDecoder.decode(param,"utf-8");
        String handleMsg = "后台处理后数据:";
        String result = handleMsg + newParam;
        return result;
    }

    @RequestMapping(value = "/postMsg",method = RequestMethod.POST,produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String postMsg(@RequestParam("param") String param) throws UnsupportedEncodingException {

        String newParam = URLDecoder.decode(param,"utf-8");
        String handleMsg = "后台处理后数据:";
        String result = handleMsg + newParam;
        return result;
    }

}
