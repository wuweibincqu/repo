package com.wwb.mybatis.session.proxy;

import com.wwb.mybatis.cfg.Mapper;
import com.wwb.mybatis.utils.Executor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.util.Map;

/**
 * @Description TODO
 * @Package: com.wwb.mybatis.session.proxy
 * @ClassName MapperProxy
 * @author: wuwb
 * @date: 2019/8/6 11:56
 */
@SuppressWarnings("all")
public class MapperProxy implements InvocationHandler {

	private Map<String,Mapper> mappers;
	private Connection conn;

	public MapperProxy(Map<String, Mapper> mappers, Connection conn) {
		this.mappers = mappers;
		this.conn = conn;
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		//方法名
		String methodName = method.getName();
		String className = method.getDeclaringClass().getName();
		String key = className + "." + methodName;
		Mapper mapper = mappers.get(key);
		if (mapper == null) {
			throw new IllegalArgumentException("传入的参数有误");
		}

		return new Executor().selectList(mapper, conn);
	}
}
