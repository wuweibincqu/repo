package com.wwb.mybatis.session;

import com.wwb.mybatis.cfg.Configuration;
import com.wwb.mybatis.session.defaults.DefalutSqlSessionFactory;
import com.wwb.mybatis.utils.XMLConfigBuilder;

import java.io.InputStream; /**
 * @Description TODO
 * @Package: com.wwb.mybatis.session
 * @ClassName SqlSessionFactoryBuilder
 * @author: wuwb
 * @date: 2019/8/6 11:21
 */
public class SqlSessionFactoryBuilder {

	public SqlSessionFactory build(InputStream config) {
		Configuration cfg = XMLConfigBuilder.loadConfiguration(config);
		return new DefalutSqlSessionFactory(cfg);
	}
}
