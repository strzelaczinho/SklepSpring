<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="/WEB-INF/views/template/header.jsp" %>


<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Dodaj produkt</h1>

            <p class="lead">Wypelnij dane aby dodac produkt</p>
        </div>

        <form:form action="${pageContext.request.contextPath}/admin/produktInventory/dodajProdukt" method="post"
                   modelAttribute="produkt" enctype="multipart/form-data">   <!--kontekt aplikacji :)) multipart support fileupload -->
        <div class="form-group">
            <label for="nazwa">Name</label>
            <form:input path="nazwaProduktu" id="nazwa" class="form-Control"/>
        </div>

        <div class="form-group">
            <label for="kategoria">Kategoria</label>
            <label class="checkbox-inline"><form:radiobutton path="kategoriaProduktu" id="kategoria"
                                                             value="Instrument" />Instrument</label>
            <label class="checkbox-inline"><form:radiobutton path="kategoriaProduktu" id="kategoria"
                                                             value="Record" />Record</label>
            <label class="checkbox-inline"><form:radiobutton path="kategoriaProduktu" id="kategoria"
                                                             value="Akcesoria" />Akcesoria</label>
        </div>

        <div class="form-group">
            <label for="opis">OpisProduktu</label>
            <form:textarea path="opisProduktu" id="opis" class="form-Control"/>
        </div>

        <div class="form-group">
            <label for="cena">Cena</label>
            <form:input path="cenaProduktu" id="cena" class="form-Control"/>
        </div>

        <div class="form-group">
            <label for="stan">Stan</label>
            <label class="checkbox-inline"><form:radiobutton path="stanProduktu" id="stan"
                                                             value="nowy" />Nowy</label>
            <label class="checkbox-inline"><form:radiobutton path="stanProduktu" id="stan"
                                                             value="uzywany" />Uzywany</label>
        </div>

        <div class="form-group">
            <label for="status">Status</label>
            <label class="checkbox-inline"><form:radiobutton path="statusProduktu" id="status"
                                                             value="aktywny" />Aktywny</label>
            <label class="checkbox-inline"><form:radiobutton path="statusProduktu" id="status"
                                                             value="nieaktywny" />Nieaktywny</label>
        </div>

        <div class="form-group">
            <label for="liczba">Liczba produktow w magazynie</label>
            <form:input path="iloscWMagazynie" id="liczba" class="form-Control"/>
        </div>

        <div class="form-group">
            <label for="wykonawca">Wykonawca</label>
            <form:input path="wykonawcaProduktu" id="wykonawca" class="form-Control"/>
        </div>


        <div class="form-group">
            <label class="control-label" for="productImage">Upload Zdjecie</label>
            <form:input id="productImage" path="productImage" type="file" class="form:input-large" />
        </div>
        <br><br>
        <input type="submit" value="submit" class="btn btn-default">
        <a href="<c:url value="/admin/produktInventory" />" class="btn btn-default">Cancel</a>
        </form:form>


        <%@include file="/WEB-INF/views/template/footer.jsp" %>
