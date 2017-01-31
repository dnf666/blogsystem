<%@ page import="java.util.List" %>
<%@ page import="model.Blog" %>
<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>博客主页</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link href="style.css" rel="stylesheet" type="text/css" />
<!-- CuFon: Enables smooth pretty custom font rendering. 100% SEO friendly. To disable, remove this section -->
<script type="text/javascript" src="js/cufon-yui.js"></script>
<script type="text/javascript" src="js/arial.js"></script>
<script type="text/javascript" src="js/cuf_run.js"></script>
<script type="text/javascript" src="js/jquery-1.3.2.min.js"></script>
<script type="text/javascript" src="js/radius.js"></script>
<!-- CuFon ends -->
</head>
<body>
<div class="main">

  <div class="header">
    <div class="header_resize">
      <div class="menu_nav">
        <ul>
          <li class="active"><a href="index.jsp">主页</a></li>
          <%
            if(session.getAttribute("userName")==null)
            {
                %>
          <li><a href="regist.html">登录</a></li>
          <%
            }
            else{
          %>
          <li><a href="/showAllBlogPerson.do?userName=<%=session.getAttribute("userName")%>"><%=session.getAttribute("userName")%></a></li>
          <%
            }
          %>
          <li><a href="write.jsp">写博客</a></li>
          <li><a href="/showAllBlogPerson.do?userName=<%=session.getAttribute("userName")%>">博客</a></li>
          <li><a href="log.html">注册</a></li>
        </ul>
      </div>
      <div class="logo"><h1><a href="index.jsp">emit <small>一个学习的地方</small></a></h1></div>
      <div class="clr"></div>
      <a href="#"><img src="images/fbg_img.jpg" width="337" height="204" alt="img" border="0" /></a>
      <div class="headertext">
        <h2>使用前请阅读</h2>
        <p><strong>使用前请登录，如果没有登录请注册</strong></p>
        <p>特别提醒：请文明用语</p>
      </div>
    </div>
  </div>
<%
  List<Blog> allBlog=(List<Blog>)session.getAttribute("allBlog");
    for(Blog blog:allBlog){
      %>
  <div class="content">
    <div class="content_resize">
      <div class="mainbar">
        <div class="article">
          <p><a href="/selectBlog.do?title=<%=blog.getTitle()%>"><%=blog.getTitle()%></a></p><div class="clr"></div>
          <p class="infopost"><span class="date"><%=new Date()%></span> Posted by <a href="/showAllBlogPerson.do?userName=<%=blog.getWriter()%>"><%=blog.getWriter()%></a> &nbsp;|&nbsp;<%=blog.getDescrible()%></p>
          <p class="spec"></p>
        </div>
      </div>
    </div>
  </div>
    <%
      }
    %>
      <%--<div class="sidebar">--%>
        <%--<div class="searchform">--%>
          <%--<form id="formsearch" name="formsearch" method="post" action="">--%>
            <%--<span><input name="editbox_search" class="editbox_search" id="editbox_search" maxlength="80" value="Search our ste:" type="text" /></span>--%>
            <%--<input name="button_search" src="images/search_btn.gif" class="button_search" type="image" />--%>
          <%--</form>--%>
        <%--</div>--%>
      <%--</div>--%>
</div>
</body>
</html>
