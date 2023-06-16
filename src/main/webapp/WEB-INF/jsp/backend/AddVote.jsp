<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl" %>
<jstl:set var="contextRoot" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>新增投票項目</title>
</head>
<body>
<jsp:include page="../layout/navbar.jsp"></jsp:include>

<div class="container">
<h1>新增投票項目</h1>


<div class="card">
  <div class="card-header">
    想新增什麼投票選項
  </div>
  <div class="card-body">
  <form:form action="${contextRoot}/vote/post" modelAttribute="votes" >
  <div class="inputVo" style="width: 250px">
  <h6>項目編號</h6>
  <form:input class="input-group mb-3" id="inputGroup-sizing-default" path="voteNumber"/>
  <h6>項目名稱</h6>
  <form:input class="input-group mb-3" id="inputGroup-sizing-default" path="voteName"/>
  </div>
  
  <button type="submit" class="btn btn-primary">送出</button>
  
  
  </form:form>
    
  </div>
</div>

</div>

</body>
</html>