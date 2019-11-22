<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE HTML>
<html>
<head>
<title>Add new Student Form</title>
<style type="text/css">@import url("<c:url value="/css/main.css"/>");</style>
</head>
<body>

<div id="global">
<!-- commandName : old style di propagare un attributo -->
<!--  stud o StuentdsAddForm? -->
<form:form modelAttribute="stud" action="add-student" method="post">
    <fieldset>
    <legend>Aggiungi uno studente</legend>
        
        <p>
            <label for="matricola">Matricola </label>
            <form:input id="matricola" path="matricola"/>
        </p>
        <p>
            <label for="nome">Nome: </label>
            <form:input id="nome" path="nome"/>
        </p>
        <p>
            <label for="cognome">Cognome: </label>
            <form:input id="cognome" path="cognome"/>
        </p>
        <p>
            <label for="istituto">Istituto: </label>
            <form:input id="istituto" path="istituto"/>
        </p>
        <p>
        	<label for="eta">Età: </label>
        	<form:input id="eta" path="eta"/>
        </p>
        
        <p id="buttons">
            <input id="reset" type="reset" tabindex="4">
            <input id="submit" type="submit" tabindex="5" value="Aggiungi">
        </p>
    </fieldset>
</form:form>
</div>
</body>
</html>
