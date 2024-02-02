/*
 * Created on 10 Sep 2013
 * Revised 22 Oct 2017
 *
 * To change the template for this generated file go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
package com.tutorial.jaxrs;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.*;
import java.sql.*;
import java.util.*;

@Path("/calc")
public class CalcREST {

    public static final String propsFile = "com/tutorial/jaxrs/calc/client/jdbc.properties";

//    public static Connection getConnection() throws IOException, SQLException {
//        // Load properties
//
//        FileInputStream in = new FileInputStream(propsFile);
//        Properties props = new Properties();
//        props.load(in);
//
//        // Define JDBC driver
//
//        String drivers = props.getProperty("jdbc.drivers");
//        if (drivers != null)
//            System.setProperty("jdbc.drivers", drivers);
//        // Setting standard system property jdbc.drivers
//        // is an alternative to loading the driver manually
//        // by calling Class.forName()
//
//        // Obtain access parameters and use them to create connection
//
//        String url = props.getProperty("jdbc.url");
//        String user = props.getProperty("jdbc.user");
//        String password = props.getProperty("jdbc.password");
//
//        return DriverManager.getConnection(url, user, password);
//    }

    @GET
    @Path("/add/{a}")
    @Produces(MediaType.TEXT_PLAIN)
    public String findNames(@PathParam("a") String a) throws SQLException {
        /*Statement statement = database.createStatement();
        ResultSet results = statement.executeQuery(
                "SELECT * FROM students WHERE surname = '" + a + "'");
        while (results.next()) {
            String forename = results.getString("forename");
            return forename + " " + a + "";
        }
        statement.close();
*/
        return "none";
    }
}



