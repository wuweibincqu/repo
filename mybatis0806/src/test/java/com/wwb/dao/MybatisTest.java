package com.wwb.dao;

import com.wwb.domain.User;
import com.wwb.mybatis.io.Resources;
import com.wwb.mybatis.session.SqlSession;
import com.wwb.mybatis.session.SqlSessionFactory;
import com.wwb.mybatis.session.SqlSessionFactoryBuilder;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


/**
 * @Package: com.wwb.dao
 * @ClassName MybatisTest
 * @Description TODO
 * @author: wuwb
 * @date: 2019/8/2 16:34
 */
@SuppressWarnings("all")
public class MybatisTest {

	@Test
	public void findAll() {
		InputStream is = null;
		SqlSession session = null;
		try {
			is = Resources.getResourceAsStream("SqlMapConfig.xml");
			SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
			SqlSessionFactory factory = builder.build(is);
			session = factory.openSession();
			IUserDao userDao = session.getMapper(IUserDao.class);
			List<User> users = userDao.findAll();
			for (User user : users) {
				System.out.println(user);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
			if (is != null) {
				try {
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
