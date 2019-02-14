<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@include file="/WEB-INF/views/template/header.jsp"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Moje Invektory</h1>

            <p class="lead">To jest opis produktu</p>
        </div>

        <table class="table table-striped table-hover">
            <thead>
            <tr class="bg-success">
                <th>Zdjecie</th>
                <th>Nazwa Produktu</th>
                <th>Kategoria</th>
                <th>Stan Produktu</th>
                <th>Cena</th>
                <th>Szczegóły</th>
            </tr>
            </thead>
            <c:forEach items="${produkty}" var="product">
                <tr>
                    <td><img src="<c:url value="/resources/images/${product.produktId}.png" /> " alt="image" style="width:50px;"/></td>
                    <td>${product.nazwaProduktu}</td>
                    <td>${product.kategoriaProduktu}</td>
                    <td>${product.stanProduktu}</td>
                    <td>${product.cenaProduktu} USD</td>
                    <td><a href="<spring:url value="/productList/viewProdukt/${product.produktId}"/>"><span class="glyphicon glyphicon-edit"></span></a>
                    <a href="<spring:url value="/admin/produktInventory/usunProdukt/${product.produktId}" />"><span class="glyphicon glyphicon-remove"></span></a>
                    </td>

                </tr>
            </c:forEach>
        </table>

<a href="<spring:url value="/admin/produktInventory/dodajProdukt" />" class="btn btn-primary">Dodaj Produkt</a>
<%@include file="/WEB-INF/views/template/footer.jsp" %>