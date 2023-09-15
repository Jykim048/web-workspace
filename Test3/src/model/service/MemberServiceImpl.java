package model.service;
import org.apache.ibatis.session.SqlSession;
import common.SqlSessionTemplate;
import model.dao.MemberDAO;
import model.vo.MemberVO;

public class MemberServiceImpl {
   
	public int insertMember(MemberVO mOne) {
		
		
		SqlSession session = SqlSessionTemplate.getSqlSession();
		int result = new MemberDAO().insertMember(session, mOne);
		
		if(result>0) session.commit();
		session.close();
		return result;
	
	}
}

// 5