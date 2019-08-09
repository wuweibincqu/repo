package com.wwb.mybatis.session;

import com.wwb.dao.IUserDao; /**
 * @Description TODO
 * @Package: com.wwb.mybatis.session
 * @ClassName SqlSession
 * @author: wuwb
 * @date: 2019/8/6 11:24
 */
public interface SqlSession {
	/**
	 * @Description 根据接口字节码获取代理对象
	 * @param DaoInterfaceClass
	 * @return T
	 * @throws
	 **/
	<T> T getMapper(Class<T> DaoInterfaceClass);

	/**
	 * @Description 释放资源
	 * @param
	 * @return void
	 * @throws
	 **/
	void close();
}
