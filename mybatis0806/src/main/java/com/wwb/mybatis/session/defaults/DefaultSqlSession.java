package com.wwb.mybatis.session.defaults;

import com.wwb.mybatis.cfg.Configuration;
import com.wwb.mybatis.session.SqlSession;
import com.wwb.mybatis.session.proxy.MapperProxy;
import com.wwb.mybatis.utils.DataSourceUtils;

import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @Description TODO
 * @Package: com.wwb.mybatis.session.defaults
 * @ClassName DefaultSqlSession
 * @author: wuwb
 * @date: 2019/8/6 11:45
 */
@SuppressWarnings("all")
public class DefaultSqlSession implements SqlSession {

	private Configuration cfg;
	private Connection conn;

	public DefaultSqlSession(Configuration cfg) {
		this.cfg = cfg;
		this.conn = DataSourceUtils.getConnection(cfg);
	}

	public <T> T getMapper(Class<T> DaoInterfaceClass) {
		return (T) Proxy.newProxyInstance(DaoInterfaceClass.getClassLoader(),
				new Class[]{DaoInterfaceClass},
				new MapperProxy(cfg.getMappers(),conn));
	}

	public void close() {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
