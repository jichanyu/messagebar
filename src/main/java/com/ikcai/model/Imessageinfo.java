package com.ikcai.model;

import java.util.Date;

/**
 * <p>标题：</p>
 * <p>功能：</p>
 * <p>版权： Copyright © 2015 IKCAI</p>
 * <p>公司：一棵菜</p>
 * <p>创建日期：2015年12月3日 下午11:01:39</p>
 * <p>类全名：com.ikcai.model.Imessageinfo</p>
 * 作者：赵力
 * @version 1.0
 */
public class Imessageinfo {

	private int 	messageid;
	private int     suserid;
	private String  susername;
	private int     tuserid;
	private String  tusername;
	private String  notes;
	private Date    messagedate;
	
	public int getMessageid() {
		return messageid;
	}
	public void setMessageid(int messageid) {
		this.messageid = messageid;
	}
	public int getSuserid() {
		return suserid;
	}
	public void setSuserid(int suserid) {
		this.suserid = suserid;
	}
	public String getSusername() {
		return susername;
	}
	public void setSusername(String susername) {
		this.susername = susername;
	}
	public int getTuserid() {
		return tuserid;
	}
	public void setTuserid(int tuserid) {
		this.tuserid = tuserid;
	}
	public String getTusername() {
		return tusername;
	}
	public void setTusername(String tusername) {
		this.tusername = tusername;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public Date getMessagedate() {
		return messagedate;
	}
	public void setMessagedate(Date messagedate) {
		this.messagedate = messagedate;
	}
	
}
