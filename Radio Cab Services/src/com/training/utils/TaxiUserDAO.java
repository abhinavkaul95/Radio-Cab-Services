package com.training.utils;

import java.sql.*;
import java.util.*;

import com.training.model.TaxiUser;
import com.training.ifaces.InterfaceMyDAO;

public class TaxiUserDAO implements InterfaceMyDAO<TaxiUser>{
private Connection conn = null;

/** No-arg constructor.
 * 
 */

public TaxiUserDAO() {
super();
conn = MySQLConnection.getMyOracleConnection();
}

/**Parameterized Constructor.
 * 
 * @param conn Connection
 */

public TaxiUserDAO(Connection conn) {
	super();
	this.conn = conn;
}

/** Add a taxiUser.
 * 
 * @param taxiUser TaxiUser
 */

@Override
public int add(TaxiUser taxiUser) {
int rowAdded = 0;
String sql = "insert into taxiUser values(?,?,?,?,?)";
PreparedStatement pstmt;
try {
pstmt = conn.prepareStatement(sql);
pstmt.setString(1, taxiUser.getName());
pstmt.setString(2, taxiUser.getEmail());
pstmt.setString(3, taxiUser.getPassword());
pstmt.setString(4, taxiUser.getTelephone());
pstmt.setString(5, taxiUser.getCity());
rowAdded = pstmt.executeUpdate();
} catch (SQLException e) {
e.printStackTrace();
}
return rowAdded;
}

/** Update an entry.
 * 
 * @param taxiUsername TaxiUsername
 * @param password Password
 */

@Override
public int update(String email, String name, String password, String telephone, String city) {
int rowUpdated = 0;
String sql = "update taxiUser set name=?, password=?, telephone=?, city=? where email = " + email;
PreparedStatement pstmt;
try {
pstmt = conn.prepareStatement(sql);
pstmt.setString(1, name);
pstmt.setString(2, password);
pstmt.setString(3, telephone);
pstmt.setString(4, city);
rowUpdated = pstmt.executeUpdate();
} catch (SQLException e) {
e.printStackTrace();
}
return rowUpdated;
}

/** Find a taxiUser.
 * 
 * @param email Email ID
 */

@Override
public TaxiUser find(String email) {
String sql = "select * from taxiUser where email = " + email;
PreparedStatement pstmt;
ResultSet rs;
String name = "", password = "", telephone = "", city = "";
try {
pstmt = conn.prepareStatement(sql);
rs = pstmt.executeQuery(sql);
while(rs.next()){
name = rs.getString("name");
password = rs.getString("password");
telephone = rs.getString("telephone");
city = rs.getString("city");
}
} catch (SQLException e) {
e.printStackTrace();
}
return new TaxiUser(name, email, password, telephone, city);
}

/**
 * 
 */

@Override
public String findPasswordForEmail(String email) {
String sql = "select password from taxiUser where email = '" + email + "'";
PreparedStatement pstmt;
ResultSet rs;
String password = "";
try {
pstmt = conn.prepareStatement(sql);
rs = pstmt.executeQuery(sql);
while(rs.next()){
password = rs.getString("password");
}
} catch (SQLException e) {
e.printStackTrace();
}
return password;
}

/** Delete a taxiUser record.
 * 
 * @param email EMail ID
 */

@Override
public int delete(String email) {
int result = 0;
CallableStatement callstmt;
try {
callstmt = conn.prepareCall("{call delete_taxi_user_record(?)}");
callstmt.setString(1, email);
result = callstmt.executeUpdate();
} catch (SQLException e) {
e.printStackTrace();
}
return result;
}

/** Finds all taxiUsers.
 * 
 */

@Override
public List<TaxiUser> findAll() {
List<TaxiUser> list = new ArrayList<TaxiUser>();
String sql = "select * from taxiUser";
PreparedStatement pstmt;
ResultSet rs;
String name = "", email = "", password = "", telephone = "", city = "";
try {
pstmt = conn.prepareStatement(sql);
rs = pstmt.executeQuery(sql);
while(rs.next()){
name = rs.getString("name");
email = rs.getString("email");
password = rs.getString("password");
telephone = rs.getString("telephone");
city = rs.getString("city");
list.add(new TaxiUser(name, email, password, telephone, city));
}
} catch (SQLException e) {
e.printStackTrace();
}
return list;
}

/** Closes the connection.
 * 
 */

@Override
public void close() {
try {
conn.close();
} catch (SQLException e) {
e.printStackTrace();
}
}
}
