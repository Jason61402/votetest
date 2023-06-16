<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl"%>
<jstl:set var="contextRoot" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>投票頁面</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>

</head>
<body>
<div class="container">

<div class="card text-center">
  <div class="card-header">

  </div>
  <div class="card-body">
    <h5 class="card-title">投票頁面</h5>
    <br>
    <form action="${contextRoot}/vote/submit" method="post" >
<label for="voter">投票者姓名:</label>
<input type="text" name="voter">
    <br>
    <br>
    <h6>您需要採買哪些設備(可以複選)</h6>
    <br>
<jstl:forEach items="${list}" var="list">
<input type="checkbox" name="option" value="${list.voteNumber}">
${list.voteNumber}號選項
${list.voteName}
</jstl:forEach>

  </div>
  <div class="card-footer text-muted">
    <input type="submit" class="btn btn-primary" value="送出">
  </div>
  </form>
</div>

</div>
</body>
</html>