package gz.itcast.d_session;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
/**
 * 销毁session对象
 *
 */
public class DeleteSession extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session =  request.getSession(false);
        if(session!=null){
            session.invalidate();//手动销毁
        }
        System.out.println("销毁成功");
    }
}
