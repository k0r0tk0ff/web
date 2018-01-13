package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainServlet extends HttpServlet {

    private final static Logger LOG = LoggerFactory.getLogger(MainServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String sentText;
        sentText = req.getParameter("sentText");
        req.setAttribute("sentText", sentText);

        req.getRequestDispatcher("page.jsp").forward(req, resp);
        LOG.info("[servlet] - method doGet has been worked");
        LOG.error("[servlet] - method doGet has been worked");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");
        doGet(req, resp);

        LOG.info("[servlet] - method doPost has been worked");
    }
}
