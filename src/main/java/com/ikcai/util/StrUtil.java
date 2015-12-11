package com.ikcai.util;

public class StrUtil
{
	static public boolean isStrTrimNull(final String str)
	{
		return str == null || str.trim().length() == 0 || str.equalsIgnoreCase("null");
	}
}
