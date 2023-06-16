<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl" %>
<jstl:set var="contextRoot" value="${pageContext.request.contextPath}"/>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<!-- <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script> -->


<link href="${contextRoot}/css/bootstrap.min.css" rel="stylesheet" />
</head>
<body>

<nav class="navbar navbar-expand-lg bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="${contextRoot}/vote/allVotes">Vote</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="${contextRoot}/vote/allVotes">首頁</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="${contextRoot}/vote/add">新增投票內容</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="${contextRoot}/vote/list">我要投票</a>
        </li>
      </ul>
    </div>
  </div>
</nav>



<script src="${contextRoot}/js/bootstrap.bundle.min.js"></script>
</body>
</html>