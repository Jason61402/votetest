<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl" %>
<jstl:set var="contextRoot" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>首頁</title>
</head>
<body>
<jsp:include page="layout/navbar.jsp"></jsp:include>

<div class="container">
<h1>投票項目列表</h1>

<table class="table">
<tbody>
  <thead>
    <tr>
      <th scope="col">項目編碼</th>
      <th scope="col">項目名稱</th>
      <th scope="col">刪除項目</th>
      <th scope="col">修改項目</th>
    </tr>
  </thead>
  
  
  <jstl:forEach items="${allVotes}" var="allVote">
    <tr>
      <td>${allVote.voteNumber}</td>
      <td>${allVote.voteName}</td> 
      
       <td>
      	<form action="${contextRoot}/vote/delete" method="post">
      	<input name="_method" type="hidden" value="delete" />
      	<input name="vId" type="hidden" value="${allVote.vId}" />
      	<input type="submit"  class="btn btn-danger mybtn"  value="刪除" />
      	</form>
      </td>
      
      <td>
      	<form action="${contextRoot}/vote/edit" method="get">
      	<input name="vId" type="hidden" value="${allVote.vId}" />
      	<input type="submit"  class="btn btn-warning" value="更新" />
      	</form>
      </td>
    </tr>
      </jstl:forEach>
  </tbody>

</table>
</div>

<script>

document.addEventListener("DOMContentLoaded", function() {
	  var mybtn = document.getElementsByClassName('mybtn');
	  console.log(mybtn);
	  mybtn.addEventListener("click", function(e) {
		  alert('確定刪除嗎?');
	  });
	},false);

</script>
</body>
</html>