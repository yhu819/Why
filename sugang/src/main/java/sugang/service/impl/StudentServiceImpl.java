package sugang.service.impl;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import sugang.dao.StudentDao;
import sugang.dao.impl.StudentDaoImpl;
import sugang.service.StudentService;
import sugang.util.SqlSessionFactoryManager;
import sugang.vo.Student;

public class StudentServiceImpl implements StudentService{
	private static StudentServiceImpl instance;

	private SqlSessionFactory factory;
	private StudentDao dao;
	
	private StudentServiceImpl() throws IOException {
		factory = SqlSessionFactoryManager.getInstance().getSqlSessionFactory();
		dao = StudentDaoImpl.getInstance();

	}

	public static StudentServiceImpl getInstance() throws IOException {
		if (instance == null)
			instance = new StudentServiceImpl();
		return instance;
	}

	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeStudentById(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Student> getStudentList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student findStudentById(int studentId) {
		SqlSession session = null;
		try {
			session = factory.openSession();
			return dao.selectStudentById(session, studentId);
		}finally {
			session.close();
		}
	}

	@Override
	public List<Student> findStudentByName(String studentName) {
		SqlSession session = null;
		try {
			session = factory.openSession();
			return dao.selectStudentByName(session, studentName);
		}finally {
			session.close(); 
		}
	}
	
}
