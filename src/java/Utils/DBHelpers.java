/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHelpers {

    public static Connection makeConnection() throws SQLException {
        try {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        String connectionUrl
                = "jdbc:sqlserver://;database=;user=;password=;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;useUnicode=true;characterEncoding=UTF-8";
        Connection connection = DriverManager.getConnection(connectionUrl);
        return connection;

    }
}
