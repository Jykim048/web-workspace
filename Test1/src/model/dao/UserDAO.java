package model.dao;
import model.vo.UserDTO;
import config.ServerInfo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




public class UserDAO implements UserDAOTemplate {

	private static UserDAO dao = new UserDAO();
	private UserDAO() {
		try {
			Class.forName(ServerInfo.DRIVER_NAME);
		} catch (ClassNotFoundException e) {}
	}
	public static UserDAO getInstance() {
		return dao;
	}
	@Override
	public Connection getConnection() throws SQLException {
		Connection conn = DriverManager.getConnection(ServerInfo.URL, ServerInfo.USER, ServerInfo.PASSWORD);
		return null;
	}

	@Override
	public void closeAll(PreparedStatement ps, Connection conn) throws SQLException {
		ps.close();
		conn.close();
	}

	@Override
	public void closeAll(ResultSet rs, PreparedStatement ps, Connection conn) throws SQLException {
		rs.close();
		closeAll(ps, conn);
	}

	@Override
	public void registerMember(UserDTO dto) throws SQLException {
		String query = "INSERT INTO member(userno, username, userage, userid) VALUES(?, ?, ?, ?)";
		PreparedStatement ps = conn.prepareStatement(query);
		
		ps.setInt(1, dto.getUserno());
		ps.setString(2, dto.getUsername());
		ps.setInt(3, dto.getUserage());
		ps.setString(4, dto.getUserid());
		ps.executeUpdate();
		
		closeAll(ps, conn);
		
	}
}
