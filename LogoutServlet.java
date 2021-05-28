import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogoutServlet extends HttpServlet{
    protected void doGet(HttpServletRequest req,HttpServletResponse res)
            throws ServletException,IOException{
        res.setContentType("text/html");
        PrintWriter out=res.getWriter();
        
        req.getRequestDispatcher("link.html").include(req,res);
        Cookie ck=new Cookie("name","");
        ck.setMaxAge(0);
        res.addCookie(ck);
        
        out.print("YOu are Successfully Logged out!");
    }
    
}
