package com.weshine.controller;

import com.weshine.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 类@
 *
 * @author huangjun
 * &date 2017/11/25
 */
@Controller
@RequestMapping({"/category"})
public class CategoryController extends BaseController {

    @Autowired
    private CategoryService categoryService;

    private ModelAndView mv = new ModelAndView();

    @RequestMapping(value = {"list",""})
    public ModelAndView list(){

        mv.setViewName("category/index");
        return mv;
    }


}
