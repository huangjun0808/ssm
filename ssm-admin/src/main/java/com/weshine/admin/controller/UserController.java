package com.weshine.admin.controller;

import com.weshine.admin.common.Response;
import com.weshine.model.Member;
import com.weshine.model.User;
import com.weshine.service.MemberService;
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

    @Autowired
    private MemberService memberService;

    @ResponseBody
    @RequestMapping(value = "view",method = RequestMethod.GET)
    public Response getUser(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String id = request.getParameter("id");
        Member member = memberService.selectByPrimaryKey(Integer.valueOf(id));
        return success(member);
    }

    @ResponseBody
    @RequestMapping(value = "insert", method = RequestMethod.GET)
    public Response insertUser(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Member member = new Member();
        member.setAddTime(DateUtil.getTimeStamp());
        member.setUpdateTime(DateUtil.getTimeStamp());
        member.setNickname("起风了");
        member.setUsername("huangjun");
        member.setMobile("18651039625");
        member.setEmail("");
        member.setSex(0);
        memberService.insertSelective(member);
        return success(member.getId());
    }

    @RequestMapping({"index"})
    public ModelAndView index(HttpServletRequest request, HttpServletResponse response){
        Member member = memberService.selectByPrimaryKey(7);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("user/index");
        mv.addObject("id",333);
        mv.addObject("user",member);
        return mv;
    }

    @ResponseBody
    @RequestMapping({"list"})
    public Response list(HttpServletRequest request, HttpServletResponse response){
        List<Member> list = memberService.selectAll();
        return success(list);
    }
}
