package com.wwb.mybatis.session.defaults;

import com.wwb.mybatis.cfg.Configuration;
import com.wwb.mybatis.session.SqlSession;
import com.wwb.mybatis.session.SqlSessionFactory;

import java.io.InputStream;

/**
 * @Description TODO
 * @Package: com.wwb.mybatis.session.defaults
 * @ClassName DefalutSqlSessionFactory
 * @author: wuwb
 * @date: 2019/8/6 11:43
 */
public class DefalutSqlSessionFactory implements SqlSessionFactory {

	private Configuration config;

	public DefalutSqlSessionFactory(Configuration config) {
		this.config = config;
	}

	public SqlSession openSession() {
		return new DefaultSqlSession(config);
	}
}
