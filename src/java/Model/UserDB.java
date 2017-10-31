package Model;

import java.sql.*;

public class UserDB {


    public static int insert(User user) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;

        String query
                = "INSERT INTO user (user_id, password, first_name, last_name, email, age, gender, travel_location) "
                + "VALUES (?,?,?,?,?,?,?,?)";
        try {
            ps = connection.prepareStatement(query);
            
            ps.setString(1, user.getUser_id());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getFirst_name());
            ps.setString(4, user.getLast_name());
            ps.setString(5, user.getEmail());
            ps.setInt(6, user.getAge());
            ps.setString(7, user.getGender());
            ps.setString(8, user.getTravel_location());
            
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        } finally {
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }

    public static int update(User user) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        
        String query = "UPDATE user SET "
                + "password = ?, "
                + "first_name = ?, "
                + "last_name = ?, "
                + "email = ?, "
                + "age = ?, "
                + "gender = ?, "
                + "travel_location = ? "
                + "WHERE user_id = ? ";
        try {
            ps = connection.prepareStatement(query);
            
            ps.setString(1, user.getPassword());
            ps.setString(2, user.getFirst_name());
            ps.setString(3, user.getLast_name());
            ps.setString(4, user.getEmail());
            ps.setInt(5, user.getAge());
            ps.setString(6, user.getGender());
            ps.setString(7, user.getTravel_location());
            ps.setString(8, user.getUser_id());
            
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        } finally {
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }

    public static int delete(User user) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;

        String query = "DELETE FROM user "
                + "WHERE user_id = ? ";
        
        try {
            ps = connection.prepareStatement(query);
            
            ps.setString(1, user.getUser_id());
            
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        } finally {
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }

    public static boolean userExists(String user_id, String password) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;

        String query = "SELECT user_id FROM user "
                + "WHERE user_id = ? "
                + "and password = ? ";
        try {
            ps = connection.prepareStatement(query);
            
            ps.setString(1, user_id);
            ps.setString(2, password);
            
            rs = ps.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }

    public static User selectUser(String user_id) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;

        String query = "SELECT password FROM user "
                + "WHERE user_id = ? ";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, user_id);
            
            rs = ps.executeQuery();
            User user = null;
            if (rs.next()) {
                user = new User();
                user.setUser_id(rs.getString("user_id"));
            }
            return user;
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }
}