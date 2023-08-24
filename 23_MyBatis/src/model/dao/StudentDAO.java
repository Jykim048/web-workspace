package model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import model.vo.StudentVO;

public class StudentDAO {

	public List<StudentVO> showStudent(SqlSession sqlSession) {
		return sqlSession.selectList("studentMapper.showStudent");
	}
}
