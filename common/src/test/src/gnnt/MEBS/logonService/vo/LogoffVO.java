
package gnnt.MEBS.logonService.vo;


/**
 * <P>类说明：退出登录调用，传入 VO 对象
 * <br/>
 * <br/>
 * </p>
 * 修改记录:
 * <br/>
 * <ul>
 * 
 * <li> 创建类                    |2014-4-21下午03:04:16|金网安泰 </li>
 * 
 * </ul>
 * @author liuzx
 */
public class LogoffVO extends BaseVO{
	/** 序列编号 */
	private static final long serialVersionUID = 2924536056935552721L;

	/** AU SessionID */
	private long sessionID;

	/** 用户名 */
	private String userID;

	/**
	 * 登录类型<br/>
	 * web web服务登录<br/>
	 * pc 电脑客户端登录<br/>
	 * mobile 手机客户端登录<br/>
	 */
	private String logonType;

	/** 模块编号 */
	private int moduleID;

	/**
	 * 
	 * AU SessionID
	 * <br/><br/>
	 * @return
	 */
	public long getSessionID() {
		return sessionID;
	}

	/**
	 * 
	 * AU SessionID
	 * <br/><br/>
	 * @param sessionID
	 */
	public void setSessionID(long sessionID) {
		this.sessionID = sessionID;
	}

	/**
	 * 
	 * 用户名
	 * <br/><br/>
	 * @return
	 */
	public String getUserID() {
		return userID;
	}

	/**
	 * 
	 * 用户名
	 * <br/><br/>
	 * @param userID
	 */
	public void setUserID(String userID) {
		this.userID = userID;
	}

	/**
	 * 
	 * 登录类型<br/>
	 * web web服务登录<br/>
	 * pc 电脑客户端登录<br/>
	 * mobile 手机客户端登录<br/>
	 * <br/><br/>
	 * @return
	 */
	public String getLogonType() {
		return logonType;
	}

	/**
	 * 
	 * 登录类型<br/>
	 * web web服务登录<br/>
	 * pc 电脑客户端登录<br/>
	 * mobile 手机客户端登录<br/>
	 * <br/><br/>
	 * @param logonType
	 */
	public void setLogonType(String logonType) {
		this.logonType = logonType;
	}

	/**
	 * 
	 * 模块编号
	 * <br/><br/>
	 * @return
	 */
	public int getModuleID() {
		return moduleID;
	}

	/**
	 * 
	 * 模块编号
	 * <br/><br/>
	 * @param moduleID
	 */
	public void setModuleID(int moduleID) {
		this.moduleID = moduleID;
	}

}

