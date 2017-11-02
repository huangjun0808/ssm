package com.weshine.admin.controller;

import com.weshine.admin.common.Response;
import com.weshine.model.User;
import com.weshine.service.UserService;
import com.weshine.support.common.Page;
import com.weshine.support.utils.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping({"user"})
public class UserController extends BaseController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "view",method = RequestMethod.GET)
    public Response getUser(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String id = request.getParameter("id");
        User user = userService.selectByPrimaryKey(Integer.valueOf(id));
        List<User> users = userService.selectAll();
        return success(user);
    }

    @ResponseBody
    @RequestMapping(value = "insert", method = RequestMethod.POST)
    public Response insertUser(HttpServletRequest request, HttpServletResponse response) throws Exception {
        User user = new User();
        user.setAddtime(DateUtil.getTimeStamp());
        user.setUpdatetime(DateUtil.getTimeStamp());
        user.setNickname("起风了");
        user.setUsername("huangjun");
        user.setMobile("18651039625");
        user.setEmail("");
        user.setSex(0);
        userService.insertSelective(user);
        return success(user.getId());
    }

    @RequestMapping({"index"})
    public ModelAndView index(HttpServletRequest request, HttpServletResponse response){
        User user = userService.selectByPrimaryKey(7);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("user/index");
        mv.addObject("id",333);
        mv.addObject("user",user);

        return mv;
    }

    @ResponseBody
    @RequestMapping({"list"})
    public Response list(HttpServletRequest request, HttpServletResponse response){
        List<User> list = userService.getPage();
        return success(new Page(list));
    }
}
