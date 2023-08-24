package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.vo.UserDTO;

public interface UserDAOTemplate {

	Connection getConnection() throws SQLException;
    void closeAll(PreparedStatement ps, Connection conn) throws SQLException;
    void closeAll(ResultSet rs, PreparedStatement ps, Connection conn) throws SQLException;
    void registerMember(UserDTO dto) throws SQLException;
    
}
