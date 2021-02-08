<%-- 
    Document   : header
    Created on : Feb 8, 2021, 9:39:27 PM
    Author     : Vu Ngoc Thinh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>


    <style>
        a{
            text-decoration: none;
            color: white;
            
            margin: 0 10px;
        }
        .header-container{
            margin: auto;

        }

        .header-title{
            margin: 0;
            font-family: 'Alegreya Sans',Helvetica,Arial,sans-serif;
            font-size: 40px;


        }
        .header-menu-container{
            background-color: #303030;

        }
        .header-menu{
            max-height: 35px;
            padding:10px;
            margin: auto;
            display: flex;
            text-decoration: none;
            list-style: none;

        }
        .header-title{
            color:#d5f46b;

        }
        .header-intro{
            color: #ffffef;
            font-family: 'Quattrocento Sans',Helvetica,Arial,sans-serif;
            font-size: 20px;
            margin: 10px 0px;
            font-weight: 200;
        }
        .header-infor{
            margin-left:20px;
            margin-bottom: 30px;

        }
        .header-menu-item{
            font-family: sans-serif;
            font-size: 15px;
            
        }
        .active{
            font-weight: 700;
        }
        
    </style>

    <body>
        <div class="header-container">
            <header>
                <div class="header-infor">
                    <h1 class="header-title">The Sushi Restaurant</h1>
                    <h3 class="header-intro">Welcome to this website</h3> 
                </div>
                <div class="header-menu-container">
                    <ul class="header-menu">
                        <li><a class="header-menu-item" href="/J3LP0013/home">Home</a></li> 
                        <li><a class="header-menu-item" href="/J3LP0013/menu">Menu and Price list</a></li> 
                        <li><a class="header-menu-item" href="/J3LP0013/find-us">Find us</a></li> 
                    </ul>
                </div>
            </header>
        </div>
    </body>
</html>
