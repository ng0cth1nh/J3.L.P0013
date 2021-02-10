<%-- 
    Document   : find-us
    Created on : Feb 10, 2021, 11:46:41 PM
    Author     : Vu Ngoc Thinh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Find us</title>
        <link href="css/index.css" rel="stylesheet" type="text/css"/>
        <link href="css/find-us.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <c:set var="media" scope="request" value="${requestScope.media}"/>
        <c:set var="infor" scope="request" value="${requestScope.infor}"/>
        <div class="container">
            <%@include file="header.jsp"%>
            <div class="main-container">
                <div class="left-main-container">
                    <h1 id="menu-tag">Find us</h1> 
                    <div class="infor-wrapper">
                        <div class="left">
                            <h2>Address and contact:</h2>
                            <span>${infor.getName()}</span>
                            <br>
                            <span>${infor.getAddress()}</span>
                            <div class="tel-wrapper">
                                <span class="label">Tel:</span>
                                <span id="telephone">${infor.getTelephone()}</span>
                            </div>
                            <div class="email-wrapper">
                                <span class="label">Email:</span>
                                <span>${infor.getEmail()}</span>
                            </div>
                        </div>
                        <div class="right">
                            <h2>Opening hours:</h2>
                            <div class="opening-wrapper">
                                <p class="opening">
                                    ${infor.getOpening()}
                                </p>  
                            </div>

                        </div>
                    </div>
                    <div id="map-warpper">
                        <img id="map" src="${infor.getMap()}"/>                           
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

            <%@include file="footer.jsp"%>  
        </div>
    </body>
</html>
