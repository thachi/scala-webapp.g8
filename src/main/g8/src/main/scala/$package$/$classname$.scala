package $package$

import java.util.Date
import javax.servlet.http.{HttpServlet, HttpServletRequest, HttpServletResponse}

class $classname$ extends HttpServlet {

  override def doGet(request: HttpServletRequest, response: HttpServletResponse) = {

    val s = response.getOutputStream
    s.print("Hello! " + new Date().toString)
    s.flush()
  }
}
