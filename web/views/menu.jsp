<%-- 
    Document   : menu
    Created on : Feb 10, 2021, 9:57:07 PM
    Author     : Vu Ngoc Thinh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu</title>
        <link href="css/index.css" rel="stylesheet" type="text/css"/>
        <link href="css/menu.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <c:set var="media" scope="request" value="${requestScope.media}"/>
        <c:set var="menus" scope="request" value="${requestScope.menus}"/>
        <div class="container">      
            <%@include file="header.jsp"%>
            <div class="main-container">
                <div class="left-main-container">
                    <h1 id="menu-tag">Menu and Price list</h1>
                    <ul class="menu-wrapper">
                        <c:forEach items="${menus}" var="menu">
                            <li class="menu-item">
                                <div class="menu-content menu-label">
                                    <span class="menu-name-label">${menu.getName()}</span>
                                    <span class="menu-price-label">Price</span>
                                </div>
                                <div class="menu-content">
                                    <span class="menu-name-label">${menu.getTitle()}</span>
                                    <span class="menu-price-label">€${menu.getPrice()}</span>
                                </div>
                                <p class="menu-des">${menu.getDescription()}</p>
                            </li>  
                        </c:forEach>                       
                    </ul>                   
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
                                <li class="page-item"><a class="page-link" href="menu?page=${index}">${index}</a></li>    
                                </c:otherwise>
                            </c:choose>

                    </c:forEach>

                </ul>
            </nav>


            <%@include file="footer.jsp"%>  


        </div>
    </body>
</html>
