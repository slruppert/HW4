
package dbHelpers;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Customer;

public class SearchQuery {
    public Connection conn;
    private ResultSet results;
    
    public SearchQuery(){
    Properties props = new Properties(); 
        InputStream instr = getClass().getResourceAsStream("dbcon.properties");
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    String driver = props.getProperty("driver.name");
    String url = props.getProperty("server.name");
    String username = props.getProperty("user.name");
    String passwd = props.getProperty("user.password");  
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {        
            conn = DriverManager.getConnection(url, username, passwd);
        } catch (SQLException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
                
             }
    public void doSearch(String firstName) throws SQLException{
        String query = "Select * FROM Customer where UPPER (firstName) LIKE ?";
        
        PreparedStatement ps = conn.prepareStatement(query);
        try {
            ps.setString(1,"%" + firstName.toUpperCase() + "%");
        } catch (SQLException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            this.results = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public String getHTMLtable(){
        String table ="";
        table += "<table border=1>";
        
        try {
            while(this.results.next()){
                Customer customer = new Customer();
                customer.setCustomerID(this.results.getInt("customerID"));
                customer.setFirstName(this.results.getString("firstName"));
                customer.setLastName(this.results.getString("lastName"));
                customer.setAddress1(this.results.getString("address1"));
                customer.setAddress2(this.results.getString("address2"));
                customer.setCity(this.results.getString("city"));
                customer.setState1(this.results.getString("state1"));
                customer.setZip(this.results.getInt("zip"));
                customer.setEmailAddr(this.results.getString("emailAddr"));
                customer.setAge(this.results.getInt("age"));
               
                
                table += "<tr>";
                table += "<td>";
                
                table += customer.getCustomerID();
                
                table += "</td>";
                
                table += "<td>";
                
                table += customer.getFirstName();
                
                table += "</td>";
                
                table += "<td>";
                
                table += customer.getLastName();
                
                table += "</td>";
                
                table += "<td>";
                
                table += customer.getAddress1();
                
                table += "</td>";
                
                table += "<td>";
                
                table += customer.getAddress2();
                
                table += "</td>";
                
                table += "<td>";
                
                table += customer.getCity();
                
                table += "</td>";
                
                table += "<td>";
                
                table += customer.getState1();
                
                table += "</td>";
                
                table += "<td>";
                
                table += customer.getZip();
                
                table += "</td>";
                
                table += "<td>";
                
                table += customer.getEmailAddr();
                
                table += "</td>";
                
                table += "<td>";
                
                table += customer.getAge();
                
                table += "</td>";
                table += "< href=update?customerID=" + customer.getCustomerID() + ">Update </a>" + "<a href=delete?customerID"+ customer.getCustomerID() + "> Delete </a>";
                table += "</tr>";   
            }
        } catch (SQLException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        table += "</table>";
                return table;
                
    }

    public String getHTMLTable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
}

