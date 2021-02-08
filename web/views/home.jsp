<%-- 
    Document   : home
    Created on : Feb 8, 2021, 9:47:44 PM
    Author     : Vu Ngoc Thinh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>The Sushi Restaurant</title>
        <style>
            
            body{
                background-image: url("./images/wine.png");
                background-color: #d5f46b;
                background-repeat: repeat-x;
                margin: 0;
                

            }
            .container{
                margin: 0 auto;
                width: 980px;
                background-color: #535353;
                padding-top: 30px;
                box-shadow: 0 0 24px rgb(0 0 0 / 80%);
            }

            .main-container{
                display: flex;
                margin: auto;
                width:940px;
                height: 100%;
                background-color: white;
            }

        </style>
    </head>
    <body>
        <div class="container">
            <%@include file="header.jsp"%>
            <div class="main-container">
                <div class="left-main-container"></div>
                <div class="right-main-container">
                    
                </div>
            </div>
        </div>
    </body>
</html>
