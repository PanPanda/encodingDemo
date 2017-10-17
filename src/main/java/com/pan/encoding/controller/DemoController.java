package com.pan.encoding.controller;

import com.pan.encoding.pojo.Param;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

@RestController
public class DemoController {

    @RequestMapping(value = "/getMsg",method = RequestMethod.GET,produces = "application/text;charset=UTF-8")
    @ResponseBody
    public String getMsg(@RequestParam("param") String param) throws UnsupportedEncodingException {

        String newParam = URLDecoder.decode(param,"utf-8");
        String handleMsg = "后台处理后数据:";
        String result = handleMsg + newParam;
        return result;
    }

    @RequestMapping(value = "/postMsg",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Map<String, String> postMsg(Param param) throws UnsupportedEncodingException {

        String newParam = param.getParam();
        String handleMsg = "后台处理后数据:";
        String result = handleMsg + newParam;
        Map<String,String> map = new HashMap(16);
        map.put("result",result);
        return map;
    }

}
