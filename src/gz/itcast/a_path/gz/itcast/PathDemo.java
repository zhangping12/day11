package gz.itcast.a_path.gz.itcast;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/**
 * web应用中路径问题
 */
public class PathDemo extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        //目标资源： target.html
        /**
         * 思考： 目标资源是给谁使用的。
         * 		给服务器使用的：   / 表示在当前web应用的根目录（webRoot下）
         * 		给浏览器使用的： /  表示在webapps的根目录下
         */
        /**
         * 1.转发
         */
//        request.getRequestDispatcher("/target.html").forward(request,response);

        /**
         * 2.请求重定向
         */
//        response.sendRedirect(request.getContextPath()+"/target.html");

        /**
         * 3.html页面的超连接href
         */
        response.getWriter().write("<html><body><a href='/target.html'>超链接</a></body></html>");

        /**
         * 4.html页面中的form提交地址
         */
        response.getWriter().write("<html><body><form action='/target.html'><input type='submit'/></form></body></html>");

    }
}
