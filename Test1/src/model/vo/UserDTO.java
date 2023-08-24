package model.vo;

public class UserDTO {

	private int userno;
	private String username;
    private int userage;
    private String userid;
    
	public UserDTO() {}
	
	
	public UserDTO(int userno, String username, int userage, String userid) {
		super();
		this.userno = userno;
		this.username = username;
		this.userage = userage;
		this.userid = userid;
	}
	public int getUserno() {
		return userno;
	}
	public void setUserno(int userno) {
		this.userno = userno;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getUserage() {
		return userage;
	}
	public void setUserage(int userage) {
		this.userage = userage;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	@Override
	public String toString() {
		return "UserDTO [userno=" + userno + ", username=" + username + ", userage=" + userage + ", userid=" + userid
				+ "]";
	}
    
    
}
