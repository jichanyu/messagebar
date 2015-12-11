package com.ikcai.dao;

import org.apache.ibatis.annotations.Param;
import com.ikcai.model.Iuser;

public interface IuserMapper
{
	public Iuser findIuserByName(@Param("username") String username);
	
	public Iuser findIuserById(@Param("userid") int userid);

	public String getIusernameById(@Param("userid") int userid);

	public void addIuser(Iuser user);

	public void editIuser(Iuser user);
}
