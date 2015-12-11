package com.ikcai.model;

import java.util.Date;

/**
 * <p>标题：用户表实体类</p>
 * <p>功能：</p>
 * <p>版权： Copyright © 2015 IKCAI</p>
 * <p>公司：一棵菜</p>
 * <p>创建日期：2015年12月3日 下午10:55:24</p>
 * <p>类全名：com.ikcai.model.Iuser</p>
 * 作者：赵力
 * @version 1.0
 */
public class Iuser {

	private int userid;
	/**用户名*/
	private String username;
	/**用户密码*/
	private String password;
	/**姓名*/
	private String name;
	/**身份证*/
	private String cordno;
	/**出生日期*/
	private Date birthday;
	/**联系电话*/
	private String tel;
	/**联系地址*/
	private String address;
	/**用户名*/
	private String email;
	/**用户名*/
	private String imgurl;
	/**最近修改日期*/
	private Date modifydate;
	/**最近登录日期*/
	private Date logindate;
	/**登录次数*/
	private int logintotal;
	/**最近登陆IP*/
	private String loginip;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCordno() {
		return cordno;
	}
	public void setCordno(String cordno) {
		this.cordno = cordno;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getImgurl() {
		return imgurl;
	}
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}
	public Date getModifydate() {
		return modifydate;
	}
	public void setModifydate(Date modifydate) {
		this.modifydate = modifydate;
	}
	public Date getLogindate() {
		return logindate;
	}
	public void setLogindate(Date logindate) {
		this.logindate = logindate;
	}
	public int getLogintotal() {
		return logintotal;
	}
	public void setLogintotal(int logintotal) {
		this.logintotal = logintotal;
	}
	public String getLoginip() {
		return loginip;
	}
	public void setLoginip(String loginip) {
		this.loginip = loginip;
	}
	
}
