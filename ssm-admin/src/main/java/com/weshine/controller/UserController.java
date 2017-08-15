package com.weshine.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.weshine.support.bean.JSONBean;
import com.weshine.support.exception.CustomException;
import com.weshine.model.User;
import com.weshine.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Controller
@RequestMapping({"user"})
public class UserController extends BaseController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping({"view"})
    public JSONBean getUser(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String id = request.getParameter("id");
        User user = userService.getUser(Integer.valueOf(id));
        User user1 = userService.get(Integer.valueOf(id));
        User user3 = userService.getBy("nick_name","11");
        Map user4 = userService.getBy1("nick_name","11");
        if(user == null){
            throw new CustomException("项目不存在");
        }
        return success(user);
    }

    @RequestMapping({"index"})
    public String index(HttpServletRequest request, HttpServletResponse response, Model model){
        User user = userService.getUser(1);
        model.addAttribute("id",233);
        model.addAttribute("user",user);
        ModelAndView modelAndView = null;
        return "user/index";
    }

    @ResponseBody
    @RequestMapping({"add"})
    public JSONBean insert(HttpServletRequest request, HttpServletResponse response){
        User user = new User();
        user.setEnabled(false);
        user.setMobile("18651039625");
        user.setSex(2);
        userService.insert2User(user);
        return success();
    }
}
