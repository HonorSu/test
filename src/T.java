
public class T {
	
	/*
	 * 字符数据存入数据库时，加的预处理。
	 */
	static public String String2DBField(String strField)
	{
		if (strField == null)
			return "null";
		else
			return "'" + strField + "'";
	}
	
	public static void main(String[] args){
		String strQq_openid="123";
		String strUserID="18290028818";
		String strEmail="suyr@lelight.cn";
		String strPhonecode="18290028818";	
		String sql="UPDATE SYUSER SET QQ_OPENID = '"+strQq_openid+"' WHERE ((LOGINNAME = '"+strUserID+"') or (EMAIL = "+String2DBField(strEmail)+" and not isnull(EMAIL) and EMAIL <> '') or (PHONECODE = "+String2DBField(strPhonecode)+" and not isnull(PHONECODE) and PHONECODE <> ''))";
		System.out.print(sql);
	}

}
