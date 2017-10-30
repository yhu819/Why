package sugang.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import sugang.dao.StudentDao;
import sugang.vo.Student;

public class StudentDaoImpl implements StudentDao{
	private static StudentDaoImpl instance;

	private StudentDaoImpl() {

	}

	public static StudentDaoImpl getInstance() {
		if (instance == null)
			instance = new StudentDaoImpl();
		return instance;
	}

	private String makeSqlId(String id) {
		return "sugang.config.mapper.studentMapper"+id;
	}
	
	@Override
	public int insertStudent(SqlSession session, Student student) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateStudent(SqlSession session, Student student) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteStudentById(SqlSession session, int studentId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Student> selectAllStudent(SqlSession session) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student selectStudentById(SqlSession session, int studentId) {
		return session.selectOne(makeSqlId("selectStudentById"), studentId);
	}

	@Override
	public List<Student> selectStudentByName(SqlSession session, String studentName) {
		return session.selectList(makeSqlId("selectStudentByName"), studentName);
	}
	
	
}
