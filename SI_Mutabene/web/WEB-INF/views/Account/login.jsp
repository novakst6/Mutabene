<%-- 
    Document   : login
    Created on : 26.7.2011, 10:57:14
    Author     : Anysek
--%>
<%@include file="../../parts/header.jspf"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page pageEncoding="UTF-8"%>
<%@page session="true"%>
<h2>Přihlášení</h2>
    <p>Vyplněním následujícího formuláře se přihlásíte na MUTABENE stránky.</p>
    <form:form action="submitLogin.htm" commandName="loginFormModel" method="post">
        <div>
            <fieldset>
                <legend>Přihlašovací formulář</legend>
                <form:errors path="errors" cssClass="error" />
                    <div class="editor-label">
                    Uživatelské jméno:
                    </div>
                   <div class="editor-field">
                        <form:input path="userName" />
                        <form:errors path="userName" cssClass="error"/>
                   </div>
                    <div class="editor-label">
                    Heslo:
                    </div>
                    <div class="editor-field">
                        <form:password path="pass" />
                        <form:errors path="pass" cssClass="error"/>
                    </div>
                    <p><input type="submit" /></p>
            </fieldset>
        </div>
        
    </form:form>
<%@include file="../../parts/footer.jspf"%>