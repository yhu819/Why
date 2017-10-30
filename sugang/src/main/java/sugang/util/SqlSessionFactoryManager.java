package sugang.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionFactoryManager {

	private SqlSessionFactory factory;
	
	private static SqlSessionFactoryManager instance;
	
	public static SqlSessionFactoryManager getInstance() throws IOException{
		if(instance == null) instance = new SqlSessionFactoryManager();
		return instance;
	}
	
	private SqlSessionFactoryManager() throws IOException{
		InputStream in = Resources.getResourceAsStream("sugang/config/mybatis-config.xml");
		factory = new SqlSessionFactoryBuilder().build(in);
	}
	
	public SqlSessionFactory getSqlSessionFactory(){
		return factory;
	}
}
