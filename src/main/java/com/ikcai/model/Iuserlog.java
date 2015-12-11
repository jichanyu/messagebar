package com.ikcai.model;

import java.util.Date;
/** 
 * <p>标题：用户登陆表实体类</p>
 * <p>功能：</p>
 * <p>版权： Copyright © 2015 IKCAI</p>
 * <p>公司：一棵菜</p>
 * <p>创建日期：2015年12月3日 下午10:51:22</p>
 * <p>类全名：com.ikcai.model.Iuserlog</p>
 * 作者：赵力
 * @version 1.0
 */
public class Iuserlog {

	private int logid;
	private int userid;
	/**用户名*/
	private String username;
	/**姓名*/
	private String name;
	/**登录日期*/
	private Date logindate;
	/**登录IP*/
	private String loginip;
	
	public int getLogid() {
		return logid;
	}
	public void setLogid(int logid) {
		this.logid = logid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getLogindate() {
		return logindate;
	}
	public void setLogindate(Date logindate) {
		this.logindate = logindate;
	}
	public String getLoginip() {
		return loginip;
	}
	public void setLoginip(String loginip) {
		this.loginip = loginip;
	}
	
}
