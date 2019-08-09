package com.wwb.mybatis.utils;

import com.wwb.mybatis.cfg.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @Description TODO
 * @Package: com.wwb.mybatis.utils
 * @ClassName DataSourceUtils
 * @author: wuwb
 * @date: 2019/8/6 12:25
 */
public class DataSourceUtils {

	public static Connection getConnection(Configuration cfg)  {
		try {
			Class.forName(cfg.getDriver());
			return DriverManager.getConnection(cfg.getUrl(), cfg.getUsername(), cfg.getPassword());
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
