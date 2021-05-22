 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
<h1>Student List</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>Id</th><th>Name</th><th>percentage</th><th>grade</th></tr>  
   <c:forEach var="stud" items="${list}">   
   <tr>  
   <td>${stud.id}</td>  
   <td>${stud.sname}</td>  
   <td>${stud.percentage}</td>  
   <td>${stud.grade}</td>  
   
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  