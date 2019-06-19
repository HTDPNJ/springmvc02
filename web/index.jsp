<%--
  Created by IntelliJ IDEA.
  User: Oliver
  Date: 2019/6/18
  Time: 21:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
<form action="demo9" method="post">
  <input type="text" name="name">
  <input type="text" name="age">
  <input type="checkbox" name="hover" value="a">
  <input type="checkbox" name="hover" value="b">
  <input type="checkbox" name="hover" value="c">
  <input type="checkbox" name="hover" value="d">
  <input type="submit" value="提交"><br/>

  <input type="text" name="peo.name">
  <input type="text" name="peo.age">
  <input type="submit" value="提交"><br/>

  <input type="text" name="peo[0].name">
  <input type="text" name="peo[0].age">
  <input type="text" name="peo[1].name">
  <input type="text" name="peo[1].age">
  <input type="submit" value="提交"><br/>

  <a href="demo8?age=123&name=abc">跳转</a>
  <a href="demo9/123/abc">跳转</a>
</form>
  </body>
</html>
