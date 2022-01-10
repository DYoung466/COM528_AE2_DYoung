<%-- 
    Document   : content
    Created on : Jan 4, 2020, 11:19:47 AM
    Author     : cgallen
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="org.solent.com504.oodd.cart.model.dto.User"%>
<%@page import="org.solent.com504.oodd.cart.model.dto.UserRole"%>
<%@page import="org.solent.com504.oodd.cart.model.dto.ShoppingItem"%>
<c:set var = "selectedPage" value = "items" scope="request"/>
<jsp:include page="header.jsp" />

<!-- Begin page content -->
<main role="main" class="container">

    <table class="table">

        <tr>
            <th>Item Name</th>
            <th>Price</th>
            <th>Quantity</th>
            <th>Price</th>
            <th>Item ID</th>
            <th>UUID</th>
            <th></th>
        </tr>
        

        <c:forEach var="item" items="${availableItems}">

            <tr>
                <td>${ShoppingItem.name}</td>
                <td>${ShoppingItem.price}</td>
                <td>${ShoppingItem.quantity}</td>
                <td>${ShoppingItem.id}</td>
                <td>${ShoppingItem.uuid}</td>
                <td></td>
<!--                <td>
                     post avoids url encoded parameters 
                    <form action="./home" method="get">
                        <input type="hidden" name="itemName" value="${item.name}">
                        <input type="hidden" name="action" value="addItemToCart">
                        <button type="submit" >Add Item</button>
                    </form>
                    <form action="./viewModifyItem" method="GET">
                        <input type="hidden" name="username" value="${sessionUser.username}">
                        <button class="btn" type="submit" >Modify Item</button>
                    </form>
                        
                        
                </td>-->
            </tr>
        </c:forEach>
    </table>
</main>
<jsp:include page="footer.jsp" />
