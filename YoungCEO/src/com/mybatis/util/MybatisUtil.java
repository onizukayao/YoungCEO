package com.mybatis.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * @author YaoHF
 * 2018年9月26日 - 下午2:45:19
 * description:
 */
public class MybatisUtil {
	private MybatisUtil(){}
	private static SqlSessionFactory sqlSessionFactory;
	
	/**
	 * 通过单例模式创建SqlSessionFactory 加油
	 * wuxiaofeng jiayou 111
	 */
	private static SqlSessionFactory getsqlSessionFactory(){
		//String configPath="config.xml";
		String configPath="sqlMapConfig.xml";
		try {
			InputStream inputStream=Resources.getResourceAsStream(configPath);
			
			if(sqlSessionFactory==null){
				sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sqlSessionFactory;
	}
	/**
	 * 创建session实例
	 */
	public static SqlSession getSqlSession(){
		return MybatisUtil.getsqlSessionFactory().openSession();
	}
}
