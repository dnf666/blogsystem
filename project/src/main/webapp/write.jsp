<%--
  Created by IntelliJ IDEA.
  User: demo
  Date: 2017/1/30
  Time: 10:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/createBlog.do?writer=<%=session.getAttribute("userName")%>" method="post" id="leavereply">
        <input id="title" name="title" class="text" type="text" />
        <input id="describe" name="describe" class="text" type="text" />
        <textarea id="context" name="context" rows="8" cols="50"></textarea>
        <input type="submit" value="提交" class="send" />
        <div class="clr"></div>

</form>
</body>
</html>
