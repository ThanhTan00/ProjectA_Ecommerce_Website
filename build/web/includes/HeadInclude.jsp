<%-- 
    Document   : HeadInclude
    Created on : Aug 6, 2023, 9:12:07â€¯PM
    Author     : tanle
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!-- search section menu -->
      <div class="header_top">
        <div class="container-fluid">
          <div class="top_nav_container">
            <div class="contact_nav">
              <a href="https://chat.zalo.me/">
                <i class="fa fa-phone" aria-hidden="true"></i>
                <span>
                  Call : +84 589677777
              </a>
              <a href="https://mail.google.com/">
                <i class="fa fa-envelope" aria-hidden="true"></i>
                <span>
                  Email : tgdlaptopoffice@gmai.com
                </span>
              </a>
            </div>
            <form class="search_form" action="SearchServlet" method="get">
                <input name="search" type="text" class="form-control" placeholder="Search here..." value="${value}">
              <button class="" type="submit">
                <i class="fa fa-search" aria-hidden="true"></i>
              </button>
            </form>
            <div class="user_option_box">
                <c:if test="${sessionScope.account.isAdmin == 1}">
                  <span style="color: white; margin-left: 20px">Hi, ${sessionScope.account.user}</span>
                  <a href="logout" class="account-link">
                <span>
                  Log out
                </span>
              </a>
                <a href="">
                <span>
                  Manage Account
                </span>
              </a>
                <a href="ManagerControl">
                <span>
                  Manage Product
                </span>
              </a> 
                </c:if>
                <c:if test="${sessionScope.account.isSeller == 1}">
                  <span style="color: white; margin-left: 20px">Hi, ${sessionScope.account.user}</span>
                  <a href="logout" class="account-link">
                <span>
                  Log out
                </span>
              </a>
                <a href="ManagerControl">
                <span>
                  Manage Product
                </span>
              </a> 
                </c:if>
              <c:if test="${sessionScope.account == null}">
                  <a href="Login.jsp" class="account-link">
                <i class="fa fa-user" aria-hidden="true"></i>
                <span>
                  Login to your account
                </span>
              </a>
                  <a href="SignUp.jsp" class="account-link">
                <span>
                  Sign Up
                </span>
              </a>
              </c:if>
                <c:if test="${sessionScope.account != null and sessionScope.account.isAdmin != 1 and sessionScope.account.isSeller != 1}">
                  <span style="color: white; margin-left: 20px">Hi, ${sessionScope.account.user}</span>
                  <a href="logout" class="account-link">
                <span>
                  Log out
                </span>
              </a>
              <a href="HomeControl" class="cart-link">
                <i class="fa fa-shopping-cart" aria-hidden="true"></i>
                <span>
                  Cart
                </span>
              </a>
              </c:if>
                
            </div>
          </div>

        </div>
      </div>
      <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <div class="container-fluid">
            <a class="navbar-brand" href="HomeControl"><image src="images/logo.png"> </image></a>
          <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
          <div class="d-flex flex-row-reverse bd-highlight">
          <div class="collapse navbar-collapse" id="navbarNavDarkDropdown">
              <ul class="navbar-nav">
              <li class="nav-item" style="width: 120px; font-size: 20px">
                  <a class="nav-link" href="HomeControl">Home</a>
              </li>
               <li class="nav-item" style="width: 120px; font-size: 20px">
                  <a class="nav-link" href="Dicrector?dicrect=About">About Us</a>
              </li>
              <li class="nav-item dropdown" style="width: 120px; font-size: 20px">
                <a class="nav-link dropdown-toggle" href="#" id="navbarDarkDropdownMenuLink" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                    Brands
                </a>
                <ul class="dropdown-menu dropdown-menu-dark" aria-labelledby="navbarDarkDropdownMenuLink">
                    <li style="font-size: 20px"><a class="dropdown-item" href="CategoryServlet?cid=">All Brands</a></li>
                  <c:forEach items="${listC}" var="o">
                  <li style="font-size: 20px"><a class="dropdown-item" href="CategoryServlet?cid=${o.getId()}&cname=${o.getName()}">${o.getName()}</a></li>
                  </c:forEach>
                </ul>
              </li>
              <li class="nav-item" style="width: 120px; font-size: 20px">
                  <a class="nav-link" href="Dicrector?dicrect=Why">Why Us</a>
              </li>
              <li class="nav-item" style="width: 120px; font-size: 20px">
                  <a class="nav-link" href="Dicrector?dicrect=Testimoninal">Testimoninal</a>
              </li>
            </ul>
          </div>
          </div>
        </div>
      </nav>
    <!-- end header menu -->
