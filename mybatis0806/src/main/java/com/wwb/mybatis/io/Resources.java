package com.wwb.mybatis.io;

import java.io.InputStream;

/**
 * @Description TODO
 * @Package: com.wwb.mybatis.io
 * @ClassName Resources
 * @author: wuwb
 * @date: 2019/8/6 11:17
 */
public class Resources {

	/**
	 * @Description 根据传入的参数获取字节输入流
	 * @param filePath
	 * @return java.io.InputStream
	 * @throws
	 **/
	public static InputStream getResourceAsStream(String filePath) {
		return Resources.class.getClassLoader().getResourceAsStream(filePath);
	}
}
