<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head lang="ru">
    <meta http-equiv="content-type" content="text/html; charset=UTF-8" />
    <meta http-equiv="Cache-Control" content="no-cache">
    <title>Академия исскуств</title>
    <link href="css/bootstrap.min.css" rel="stylesheet" />
    <script src="js/bootstrap.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
</head>
<body>

<div class="container" >

      <!-- Static navbar, смотрите пример тут: http://bootstrap-3.ru/examples/navbar/ -->
    <div class="navbar  navbar-static-top">
      <div class="navbar navbar-default" role="navigation">
        <div class="container-fluid">
          <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
              <span class="sr-only">Toggle navigation</span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="do?command=Index">Главная</a>
          </div>
          <div class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
              <li><a href="do?command=ShowCourses">Каталог курсов</a></li>
              <li><a href="do?command=ShowUsers">Список пользователей</a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
               <li><a href="do?command=SignUp">Зарегистрироваться</a></li>
                  <c:choose>
                     <c:when test="${user!=null}">
                        <li><a href="do?command=Profile">Профиль</a></li>
                     </c:when>
                     <c:otherwise>
                        <li><a href="do?command=Login">Войти</a></li>
                     </c:otherwise>
                  </c:choose>

               <li><a href="/manager/html/list">Tomcat</a></li>
             </ul>
          </div><!--/.nav-collapse -->
        </div><!--/.container-fluid -->
      </div>
    </div>