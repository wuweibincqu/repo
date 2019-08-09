package com.wwb.mybatis.cfg;

/**
 * @Description TODO
 * @Package: com.wwb.mybatis.cfg
 * @ClassName Mapper
 * @author: wuwb
 * @date: 2019/8/6 11:33
 */
public class Mapper {

	private String queryString;
	private String resultType;

	public String getQueryString() {
		return queryString;
	}

	public void setQueryString(String queryString) {
		this.queryString = queryString;
	}

	public String getResultType() {
		return resultType;
	}

	public void setResultType(String resultType) {
		this.resultType = resultType;
	}
}
