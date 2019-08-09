package com.wwb.mybatis.session;

/**
 * @Description TODO
 * @Package: com.wwb.mybatis.session
 * @ClassName SqlSessionFactory
 * @author: wuwb
 * @date: 2019/8/6 11:22
 */
public interface SqlSessionFactory {

	SqlSession openSession();
}
