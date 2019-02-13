<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@include file="/WEB-INF/views/template/header.jsp"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Produkt Detail</h1>

            <p class="lead">Tutaj znajduje sie informacja o produkcie</p>
        </div>

        <%--Grid system https://getbootstrap.com/docs/4.0/layout/grid/--%>
        <div class="container">
            <div class="row">
                <div class="col-md-5">
                    <img src="#" alt="image" style="width: 100%; height: 300px; "/>
                </div>


                    <div class="col-md-5">
                        <h3>${produkt.nazwaProduktu}</h3>
                        <p>${produkt.opisProduktu}</p>
                        <p> <strong>Wykonawca</strong> : ${produkt.wykonawcaProduktu}</p>
                        <p><strong>Kategoria</strong> : ${produkt.kategoriaProduktu}</p>
                        <p><strong>Stan</strong> : ${produkt.stanProduktu}</p>
                        <h4>${produkt.cenaProduktu} USD</h4>
                    </div>
            </div>
        </div>

<%@include file="/WEB-INF/views/template/footer.jsp" %>