package com.test.config;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by ren.xiaobo on 2016/8/18.
 */
@WebServlet(
        value = {"/swagger"},
        name = "swagger"
)
public class SwaggerServlet extends HttpServlet {
    public SwaggerServlet() {
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("swagger/index.html");
    }
}
