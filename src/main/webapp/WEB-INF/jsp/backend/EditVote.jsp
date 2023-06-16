<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl" %>
<jstl:set var="contextRoot" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>修改投票項目</title>
</head>
<body>
<jsp:include page="../layout/navbar.jsp"></jsp:include>

<div class="container">
<h1>修改投票項目</h1>


<div class="card">
  <div class="card-header">
  </div>
  <div class="card-body">
  <form:form method="POST" action="${contextRoot}/vote/editpost" modelAttribute="editVote">
  <div class="inputVo" style="width: 250px">
  <form:input path="vId" type="hidden"/>
  <h6>項目編號</h6>
  <form:input class="input-group mb-3" id="inputGroup-sizing-default" path="voteNumber"/>
  <h6>項目名稱</h6>
  <form:input class="input-group mb-3" id="inputGroup-sizing-default" path="voteName"/>
  </div>
  
  <input type="submit" class="btn btn-primary" value="送出"/>
  
  
  </form:form>
    
  </div>
</div>

</div>

</body>
</html>