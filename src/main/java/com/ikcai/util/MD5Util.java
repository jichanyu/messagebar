package com.ikcai.util;

import org.apache.commons.codec.digest.DigestUtils;
/**
 * <p>标题：加密工具类</p>
 * <p>功能：对数据进行加密</p>
 * <p>版权： Copyright © 2015 IKCAI</p>
 * <p>公司： 一棵菜</p>
 * <p>创建日期：2015年12月3日 下午10:58:19</p>
 * <p>类全名：com.ikcai.util.MD5Util</p>
 * 作者：赵力
 * @version 1.0
 */
public class MD5Util
{
	/**
	 * md5加密
	 * @param str
	 * @return 
	 */
	public static String md5(String str)
	{
		return DigestUtils.md5Hex(str);
	}
}
