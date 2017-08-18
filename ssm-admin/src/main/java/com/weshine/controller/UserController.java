package com.weshine.controller;

import com.weshine.support.bean.common.Page;
import com.weshine.support.bean.common.ResultBean;
import com.weshine.support.bean.query.UserQuery;
import com.weshine.model.User;
import com.weshine.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping({"user"})
public class UserController extends BaseController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping({"view"})
    public ResultBean getUser(HttpServletRequest request, HttpServletResponse response,UserQuery userQuery) throws Exception {
        String id = request.getParameter("id");
        User user = userService.get(Integer.valueOf(id));
//        User user1 = userService.getBy("nick_name","11");
//        UserQuery userQuery = new UserQuery();
        Page<User> list = userService.page(userQuery);
//        userService.softDelete(Integer.valueOf(id));
        return success(list);
    }

    @RequestMapping({"index"})
    public String index(HttpServletRequest request, HttpServletResponse response, Model model){
        User user = userService.get(1);
        model.addAttribute("id",233);
        model.addAttribute("user",user);
        return "user/index";
    }

}
