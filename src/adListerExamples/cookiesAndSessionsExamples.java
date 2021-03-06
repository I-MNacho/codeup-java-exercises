//=========================================== cookies.jsp
//
//<%--
//        Created by IntelliJ IDEA.
//        User: phoenix
//        Date: 10/19/21
//        Time: 1:41 PM
//        To change this template use File | Settings | File Templates.
//        --%>
//<%@ page contentType="text/html;charset=UTF-8" language="java" %>
//<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
//<!DOCTYPE html>
//<html lang="en">
//<head>
//<jsp:include page="partials/head.jsp">
//<jsp:param name="title" value="Cookies" />
//</jsp:include>
//</head>
//<body>
//
//<jsp:include page="partials/navbar.jsp" />
//
//<form method="POST" action="/Cookies">
//<ul>
//<li>
//<label for="name">What is your name?</label>
//<input type="text" name="name" id="name">
//</li>
//<li>
//<label for="favorite">What is your favorite cookie?</label>
//<input type="text" name="favorite" id="favorite">
//</li>
//</ul>
//<button type="submit">Submit</button>
//</form>
//</body>
//</html>
//
//
//
//        =========================================== CookiesServlet.java
//        import javax.servlet.ServletException;
//        import javax.servlet.annotation.WebServlet;
//        import javax.servlet.http.HttpServlet;
//        import javax.servlet.http.HttpServletRequest;
//        import javax.servlet.http.HttpServletResponse;
//        import javax.servlet.http.HttpSession;
//        import java.io.IOException;
//        import java.io.PrintWriter;
//
//@WebServlet("/Cookies")
//public class CookiesServlet extends HttpServlet {
//
//    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        response.sendRedirect("/cookies.jsp");
//    }
//
//    //re-wrote this doPost
////    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
////        String name = request.getParameter("name");
////        String favorite = request.getParameter("favorite");
////
////        //creating the session
////        HttpSession session = request.getSession();
////
////        //setting attributes to their respective name variables by using the id session / the id becomes part of the request object
////        session.setAttribute("name", name);
////        session.setAttribute("favorite", favorite);
////
////        //instead of using requests, we used session id above
//////        request.setAttribute("name", name);
//////        request.setAttribute("favorite", favorite);
////
//////        request.getRequestDispatcher("/WEB-INF/deals.jsp").forward(request, response);
////
////        response.sendRedirect("/Deals");
//
//
//    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//
//        String name = request.getParameter("name");
//        String favorite = request.getParameter("favorite");
//
//        boolean answeredQuestions = (name != null && !name.equals("")) && (favorite != null && !favorite.equals(""));
//
//        if (answeredQuestions) {
//            HttpSession session = request.getSession();
//            session.setAttribute("name", name);
//            session.setAttribute("favorite", favorite);
//
//            response.sendRedirect("/Deals");
//        } else {
//            response.sendRedirect("/Cookies");
//        }
//    }
//}
//
//
//
//=========================================== deals.jsp
//
//
//<%--replaced this code with the bottom code. replacing the double checks on not empty name or favorite --%>
//
//<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
//<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
//<%--<html>--%>
//<%--<head>--%>
//<%--    <jsp:include page="../partials/head.jsp">--%>
//<%--        <jsp:param name="title" value="Deals" />--%>
//<%--    </jsp:include>--%>
//<%--</head>--%>
//<%--<body>--%>
//<%--<jsp:include page="../partials/navbar.jsp" />--%>
//<%--<c:if test="${not empty name}">--%>
//<%--    <h2>Hi, ${name}!--%>
//<%--</c:if>--%>
//<%--    <c:choose>--%>
//<%--    <c:when test="${not empty favorite}">--%>
//<%--        &nbsp;We have some awesome deals on ${favorite} cookies!</h2>--%>
//<%--    </c:when>--%>
//<%--    <c:otherwise>--%>
//<%--        </h2>--%>
//<%--    </c:otherwise>--%>
//<%--</c:choose>--%>
//<%--</body>--%>
//<%--</html>--%>
//
//<%@ page contentType="text/html;charset=UTF-8" language="java" %>
//<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
//<html>
//<head>
//<jsp:include page="../partials/head.jsp">
//<jsp:param name="title" value="Deals" />
//</jsp:include>
//</head>
//<body>
//<jsp:include page="../partials/navbar.jsp" />
//<h2>Hi, ${name}! We have some awesome deals on ${favorite} cookies!</h2>
//
//<c:choose>
//<c:when test="${!approved}">
//<p>But first, answer one question:</p>
//<form method="Post" action="Deals">
//<legend>Cupcake or Muffin?</legend>
//<fieldset>
//<ul>
//<li>
//<label for="cupcake">Cupcake</label>
//<input type="radio" id="cupcake" name="cupcakeOrMuffin" value="cupcake">
//</li>
//<li>
//<label for="muffin">Muffin</label>
//<input type="radio" id="muffin" name="cupcakeOrMuffin" value="muffin">
//</li>
//</ul>
//<button type="submit">Submit</button>
//</fieldset>
//</form>
//</c:when>
//<c:when test="${approved}">
//<h2>Long list of deals:</h2>
//<ol>
//<li>Deal</li>
//<li>Deal</li>
//</ol>
//</c:when>
//</c:choose>
//
//
//
//<%--//replaced this code with above code--%>
//<%--<p>But first, answer one question:</p>--%>
//<%--<form method="post" action="Deals">--%>
//<%--    <legend>Cupcake or Muffin?</legend>--%>
//<%--    <fieldset>--%>
//<%--        <ul>--%>
//<%--            <li>--%>
//<%--                <label for="cupcake">Cupcake</label>--%>
//<%--                <input type="radio" id="cupcake" name="cupcakeOrMuffin" value="cupcake">--%>
//<%--            </li>--%>
//<%--            <li>--%>
//<%--                <label for="muffin">Muffin</label>--%>
//<%--                <input type="radio" id="muffin" name="cupcakeOrMuffin" value="muffin">--%>
//<%--            </li>--%>
//<%--        </ul>--%>
//<%--        <button type="submit">Submit</button>--%>
//<%--    </fieldset>--%>
//<%--</form>--%>
//</body>
//</html>
//
//
//
//
//
//
//        =========================================== DealsServlet.java
//        import javax.servlet.ServletException;
//        import javax.servlet.annotation.WebServlet;
//        import javax.servlet.http.HttpServlet;
//        import javax.servlet.http.HttpServletRequest;
//        import javax.servlet.http.HttpServletResponse;
//        import java.io.IOException;
//
////re-wrote this code to bottom code
////@WebServlet("/Deals")
////public class DealsServlet extends HttpServlet {
////    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
////        request.getRequestDispatcher("/WEB-INF/deals.jsp").forward(request, response);
////    }
////}
//
//
//@WebServlet("/Deals")
//public class DealsServlet extends HttpServlet {
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//
//        String name = (String) request.getSession().getAttribute("name");
//        String favorite = (String) request.getSession().getAttribute("favorite");
//
//        if (name != null && favorite != null) {
//            request.getRequestDispatcher("/WEB-INF/deals.jsp").forward(request, response);
//        } else {
//            response.sendRedirect("/Cookies");
//        }
//    }
//
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//        String cupcakeOrMuffin = request.getParameter("cupcakeOrMuffin");
//        if (cupcakeOrMuffin.equals("muffin")){
//            request.getSession().setAttribute("approved", true);
//            request.getRequestDispatcher("/WEB-INF/deals.jsp").forward(request, response);
//        } else {
//            request.getSession().invalidate();
//            response.sendRedirect("/");
//        }
//    }
//
//}
//
//=========================================== ViewProfileServlet.java
//
//        import javax.servlet.ServletException;
//        import javax.servlet.annotation.WebServlet;
//        import javax.servlet.http.HttpServlet;
//        import javax.servlet.http.HttpServletRequest;
//        import javax.servlet.http.HttpServletResponse;
//        import java.io.IOException;
//
//@WebServlet(name = "ViewProfileServlet", urlPatterns = "/profile")
//public class ViewProfileServlet extends HttpServlet {
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.getRequestDispatcher("/profile.jsp").forward(request, response);
//    }
//}
//
