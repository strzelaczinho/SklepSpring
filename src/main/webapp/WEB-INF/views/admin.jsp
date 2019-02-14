<%@include file="/WEB-INF/views/template/header.jsp"%>


<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Strefa admina</h1>

            <p class="lead">Tutaj znajduje sie informacja o administratorze</p>
        </div>

        <h3>
            <a href="<c:url value="/admin/produktInventory"/>">Produkt Invectory</a>
        </h3>

        <p>Tutaj mozesz przegladac produkty</p>
<%@include file="/WEB-INF/views/template/footer.jsp" %>