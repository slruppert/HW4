<%--//if you need to update 1st video 16:55 mins. in
--%>

<%@page import="model.Customer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% Customer customer = (Customer) request.getAttribute("customer"); %>
<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Customer</title>
    </head>
    <body>
        <h1>Update Customer Record</h1>
        <form name="updateForm" action="updateCustomer" method="get"
               
            <label> Customer ID: </label>
            <input type="text" name="name"value=""<%= customer.getCustomerID() %>/>
            <br>    
            <label>First Name: </label>
            <input type="text" name="name"value=""<%= customer.getFirstName() %>/>
            <br>   
            <label>Last Name: </label>
            <input type="text" location="location"value=""<%= customer.getLastName() %>/>
            <br>
            <label>Address1: </label>
            <input type="text" location="location"value=""<%= customer.getAddress1() %>/>
            <br>
            <label>Address2: </label>
            <input type="text" location="location"value=""<%= customer.getAddress2() %>/>
            <br>
            <label>City: </label>
            <input type="text" location="location"value=""<%= customer.getCity() %>/>
            <br>
            <label>State: </label>
            <input type="text" location="location"value=""<%= customer.getState1() %>/>
            <br>
            <label>Zip: </label>
            <input type="text" location="location"value=""<%= customer.getZip() %>/>
            <br>
            <label>Email Address: </label>
            <input type="text" location="location"value=""<%= customer.getEmailAddr() %>/>
            <br>
            <label>Age: </label>
            <input type="text" location="location"value=""<%= customer.getAge() %>/>
            <br>
            <input type="submit" name="submit" value="Update" />
        </form>
        
    </body>
</html>
