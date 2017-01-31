<%--
  Created by IntelliJ IDEA.
  User: demo
  Date: 2017/1/30
  Time: 18:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改</title>
</head>
<body>
<jsp:useBean id="blog" class="model.Blog" scope="request"></jsp:useBean>
<form action="/updateBlog.do?writer=<%=session.getAttribute("userName")%>" method="post" id="leavereply">
    <input id="title" name="title" class="text" type="text" />
    <input id="describe" name=describe" class="text" type="text" />
    <textarea id="context" name="context" rows="8" cols="50"></textarea>
    <input type="submit" value="提交" class="send" />
    <div class="clr"></div>

</form>
</body>
</html>
