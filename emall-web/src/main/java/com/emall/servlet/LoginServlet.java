package com.emall.servlet;

import com.emall.mapper.TbUserMapper;
import com.emall.pojo.TbUser;
import com.emall.service.iml.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


/**
 * 过滤器实现登录
 */
@Controller
public class LoginServlet extends HttpServlet {

    @Autowired
    UserServiceImpl userService;
    @Override
    @PostMapping("/loginServlet")
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username=req.getParameter("username");
        String password=req.getParameter("password");

        TbUser tbUser1 = userService.getUserByUsername(username);
        if(tbUser1==null||!password.equals(tbUser1.getPassword())){
            //登录失败
//            System.out.println("NOT found");
            req.getRequestDispatcher("/WEB-INF/jsp/error.jsp").forward(req,resp);
        }else {
            //登录成功
            req.getSession().setAttribute("user",tbUser1);
            req.getRequestDispatcher("index.jsp").forward(req,resp);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }
}
