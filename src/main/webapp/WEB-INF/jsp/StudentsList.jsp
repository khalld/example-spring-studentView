<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE HTML>
<html>
<head>
<title>Students list</title>
<style type="text/css">@import url("<c:url value="/css/main.css"/>");</style>
</head>
<body>
<div id="global">
<h1>Lista Studenti</h1>
<table>
<tr>
    <th>MATRICOLA</th>
    <th>NOME</th>
    <th>COGNOME</th>
    <th>ISTITUTO</th>
    <th>ETA</th>
    <th>Modifica</th>
    <th>&nbsp;</th>
</tr>
<c:forEach items="${students}" var="stud">
    <tr>
        <td>${stud.matricola}</td>
        <td>${stud.nome}</td>
        <td>${stud.cognome}</td>
        <td>${stud.istituto}</td>
        <td>${stud.eta}</td>
        <td><a href="<c:url value="/edit-student/${stud.matricola}"/>">Modifica</a></td>
        
     <!--    <td><a href="edit-book/${book.id}">Modifica</a></td>  -->
    </tr>
</c:forEach>
</table>
<hr>
<a href="<c:url value="/input-student"/>">Aggiungi uno studente</a>

</div>
</body>
</html>