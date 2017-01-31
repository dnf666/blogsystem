<%@ page import="model.Blog" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>博客</title>
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
<% if(session.getAttribute("userName")==null)
    request.getRequestDispatcher("regist.html").forward(request,response);
    Blog blog=(Blog) session.getAttribute("aBlog");

%>
<div class="main">

    <div class="header">
        <div class="header_resize">
            <div class="menu_nav">
                <ul>
                    <li><a href="index.jsp">主页</a></li>
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
                    <li class="active"><a href="blogShow.jsp?userName=<%=session.getAttribute("userName")%>">博客</a></li>
                    <li><a href="log.html">注册</a></li>
                </ul>
            </div>
            <div class="logo"><h1><a href="index.jsp">cmit <small>一个学习的地方</small></a></h1></div>
            <div class="clr"></div>
            <a href="#"><img src="images/fbg_img.jpg" width="337" height="204" alt="img" border="0" /></a>
            <div class="headertext">
                <h2>使用前请阅读</h2>
                <p><strong>使用前请登录，如果没有登录请注册</strong></p>
                <p>特别提醒：请文明用语</p>
            </div>
        </div>
    </div>

    <div class="content">
        <div class="content_resize">
            <div class="mainbar">
                <div class="article">
                    <p><a href="/selectBlog.do?title=<%=blog.getTitle()%>"><span><%=blog.getTitle()%></span></a></p><div class="clr"></div>
                    <p>Posted by <a href="/showAllBlogPerson.do"><%=blog.getWriter()%></a>  <span>&nbsp;&bull;&nbsp;</span><p>描述 <%=blog.getDescrible()%></p>
                    <p><%=blog.getContext()%>></p>
                    <%if(session.getAttribute("userName").equals(blog.getWriter()))
                    {
                        %>
                    <p><span><a href="/update.jsp"><strong>编辑</strong></a></span>&nbsp;&nbsp;<a href="/deleteBlog.do?title=<%=blog.getTitle()%>"><strong>删除</strong></a> </p>
                    <%
                    }
                    %>
                </div>

                <div class="article">
                    <h2><span>Leave a</span> Reply</h2><div class="clr"></div>
                    <form action="/insertLeaveMessage.do" method="post" id="leavereply">
                        <ol><li>
                            <label for="userName">userName (required)</label>
                            <input id="userName" name="userName" class="text" type="text"/>
                        </li><li>
                            <label for="phoneNumber">phoneNumber (required)</label>
                            <input id="phoneNumber" name="phoneNumber" class="text" type="text" />
                        </li><li>
                            <label for="qq">qq</label>
                            <input id="qq" name="qq" class="qq" />
                        </li><li>
                            <label for="message">Your Message</label>
                            <textarea id="message" name="message" rows="8" cols="50"></textarea>
                        </li><li>
                            <input type="submit" value="提交" class="send" />
                            <div class="clr"></div>
                        </li></ol>
                    </form>
                </div>
            </div>
            <div class="sidebar">
                <div class="searchform">
                    <form id="formsearch" name="formsearch" method="post" action="">
                        <span><input name="editbox_search" class="editbox_search" id="editbox_search" maxlength="80" value="Search our ste:" type="text" /></span>
                        <input name="button_search" src="images/search_btn.gif" class="button_search" type="image" />
                    </form>
                </div>


            </div>
            <div class="clr"></div>
        </div>
    </div>

</div>
</body>
</html>

