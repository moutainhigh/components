package gnnt.MEBS.espot.core.exception;
/**
 * 自定义 Exception
 * 为用exception截获异常后，返回写入异常的相应信息使用
 * @author liuzx
 */
public class EspotCoreException extends RuntimeException{
	private static final long serialVersionUID = -6450992495382299063L;
	public EspotCoreException(String string) {
		super(string);
	}
}
