<%-- 
    Document   : home
    Created on : Feb 8, 2021, 9:47:44 PM
    Author     : Vu Ngoc Thinh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>The Sushi Restaurant</title>
        <link href="css/index.css" rel="stylesheet" type="text/css"/>
        <link href="css/home.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <c:set var="media" scope="request" value="${requestScope.media}"/>
        <c:set var="sushis" scope="request" value="${requestScope.sushis}"/>
        <c:set var="defaultSushi" scope="request" value="${requestScope.defaultSushi}"/>
        <div class="container">
            <%@include file="header.jsp"%>
            <div class="main-container">
                <div class="left-main-container">
                    <div class="top-section">
                        <div id="default-sushi-infor" class="sushi-infor">
                            <img id="default-sushi" src="${defaultSushi.getPhoto()}"/>
                        </div>

                    </div>
                    <div class="bottom-section">
                        <c:forEach items="${sushis}" var="sushi">
                            <div class="sushi-infor">
                                <h3 class="sushi-title">${sushi.getTitle()}</h3>
                                <div class="sushi-wrapper">
                                    <img class="sushi-photo" src="${sushi.getPhoto()}"/>
                                    <p class="sushi-description">${sushi.getDescription()}</p>
                                </div>
                            </div>  
                        </c:forEach>

                    </div>
                </div>
                <div class="right-main-container">

                    <div class="sidebar">
                        <h3 class="title-sidebar">
                            Share this page
                        </h3>
                        <c:forEach items="${media}" var="m">
                            <ul class="media-wrapper">
                                <li class="media-item">
                                    <img class="icon" src="${m.getIcon()}"/>
                                    <a class="link-media" href="${m.getLink()}">${m.getName()}</a>
                                </li>
                            </ul>

                        </c:forEach>

                    </div>
                </div>
            </div>

            <nav class="pagination-container">
                <ul class="pagination">
                    <c:forEach var="index" begin="1" end="${requestScope.totalPage}">
                        <c:choose>
                            <c:when test="${index == requestScope.pageIndex}">
                                <li class="page-item page-item-active"><a class="page-link page-link-active" href="home?page=${index}">${index}</a></li> 
                                </c:when>
                                <c:otherwise>
                                <li class="page-item"><a class="page-link" href="home?page=${index}">${index}</a></li>    
                                </c:otherwise>
                            </c:choose>

                    </c:forEach>

                </ul>
            </nav>
                    
               <%@include file="footer.jsp"%>          
        </div>
        
    </body>
</html>
