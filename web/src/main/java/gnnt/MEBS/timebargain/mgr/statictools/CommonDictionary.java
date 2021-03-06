package gnnt.MEBS.timebargain.mgr.statictools;

import java.util.LinkedHashMap;
import java.util.Map;

public class CommonDictionary
{
  public static Map MARKET_STATUS;
  public static Map COMMODITY_STATUS;
  public static Map TRADER_STATUS;
  public static Map SUFFIX_STATUS;
  public static Map CUSTOMER_STATUS;
  public static Map CUSTOMERMAP_STATUS;
  public static Map BS_FLAG;
  public static Map BS_FLAG1;
  public static Map ORDERTYPE;
  public static Map ORDER_STATUS;
  public static Map DELAYORDERTYPE_STATUS;
  public static Map CLOSEFLAG;
  public static Map TRADETYPE;
  public static Map CLOSEMODE;
  public static Map TIMEFLAG;
  public static Map CLOSEFlAG2;
  public static Map OPERATION;
  public static Map FAILCODE;
  public static Map WITHDRAWTYPE;
  public static Map LOGTYPE = new LinkedHashMap();
  public static Map TRANSFER_STATUS;
  public static Map RESPOND_STATUS;
  public static Map DIDING_TYPE;
  public static Map GATHERBID_STATUS;
  public static Map BS_FLAG2;
  public static Map PRESENTSTATUS;
  public static Map APPLYTYPE;
  public static Map BILLTYPE;
  public static Map ALIVEPRESENTSTATUS;
  public static Map FIRMPRIVILEGE_B;
  public static Map FIRMPRIVILEGE_S;
  public static Map UPDOWNFLAG;
  public static Map WL;
  public static Map LOSERMODE;
  public static Map DEDUCTSTATUS;
  public static Map TYPE;
  public static Map CONSIGNERTYPE;
  public static Map KIND;
  public static Map MARGINALGR;
  public static Map FEEALGR;
  public static Map MAXHOLDQTY;
  public static Map BROADCAST_STATUS;
  public static Map VIRTUALFUNDSTATUS;
  public static Map VIRTUALFUNDAPPLYTYPE;
  public static Map OPERATECHECK;
  public static Map DELAYORDERTYPE;
  public static Map OPRTYPE;
  public static Map BILLTRADETYPE;
  public static Map PRIVILEGECODE_B;
  public static Map PRIVILEGECODE_S;
  public static Map SETTLEFEEALGR;
  public static Map MARGINPRICETYPE;
  
  static
  {
    LOGTYPE.put("01", "普通日志");
    LOGTYPE.put("02", "风险控制");
    LOGTYPE.put("03", "系统日志");
    LOGTYPE.put("04", "后台管理登陆日志");
    LOGTYPE.put("05", "加盟商登陆日志");
    LOGTYPE.put("06", "仓库管理登陆日志");
    
    TRANSFER_STATUS = new LinkedHashMap();
    TRANSFER_STATUS.put("1", "已审核");
    TRANSFER_STATUS.put("0", "未审核");
    
    RESPOND_STATUS = new LinkedHashMap();
    RESPOND_STATUS.put("0", "处理失败");
    RESPOND_STATUS.put("1", "未处理");
    RESPOND_STATUS.put("2", "已处理");
    
    MARKET_STATUS = new LinkedHashMap();
    MARKET_STATUS.put("1", "正常");
    MARKET_STATUS.put("2", "无效");
    
    COMMODITY_STATUS = new LinkedHashMap();
    COMMODITY_STATUS.put("0", "有效");
    COMMODITY_STATUS.put("1", "等待交收");
    COMMODITY_STATUS.put("2", "暂停交易");
    
    TRADER_STATUS = new LinkedHashMap();
    TRADER_STATUS.put("0", "正常");
    TRADER_STATUS.put("1", "禁用");
    
    SUFFIX_STATUS = new LinkedHashMap();
    SUFFIX_STATUS.put("0", "未用");
    SUFFIX_STATUS.put("1", "已用");
    
    CUSTOMER_STATUS = new LinkedHashMap();
    CUSTOMER_STATUS.put("0", "正常");
    CUSTOMER_STATUS.put("1", "禁止交易");
    CUSTOMER_STATUS.put("2", "退市");
    
    CUSTOMERMAP_STATUS = new LinkedHashMap();
    CUSTOMERMAP_STATUS.put("0", "有效");
    CUSTOMERMAP_STATUS.put("1", "禁止交易");
    CUSTOMERMAP_STATUS.put("2", "未开通");
    
    BS_FLAG = new LinkedHashMap();
    BS_FLAG.put("1", "买进");
    BS_FLAG.put("2", "卖出");
    
    BS_FLAG1 = new LinkedHashMap();
    BS_FLAG1.put("1", "买");
    BS_FLAG1.put("2", "卖");
    
    DIDING_TYPE = new LinkedHashMap();
    DIDING_TYPE.put("0", "抵顶");
    DIDING_TYPE.put("1", "取消抵顶");
    
    ORDERTYPE = new LinkedHashMap();
    ORDERTYPE.put("1", "订立");
    ORDERTYPE.put("2", "转让");
    ORDERTYPE.put("3", "强平");
    ORDERTYPE.put("4", "撤单");
    
    TRADETYPE = new LinkedHashMap();
    TRADETYPE.put("1", "正常交易");
    TRADETYPE.put("2", "代理强平");
    TRADETYPE.put("3", "市场强平");
    TRADETYPE.put("4", "委托交易");
    TRADETYPE.put("7", "卖仓单");
    TRADETYPE.put("8", "抵顶转让");
    
    ORDER_STATUS = new LinkedHashMap();
    ORDER_STATUS.put("1", "未成交");
    ORDER_STATUS.put("2", "部分成交");
    ORDER_STATUS.put("3", "全部成交");
    ORDER_STATUS.put("4", "正在撤单");
    ORDER_STATUS.put("5", "全部撤单");
    ORDER_STATUS.put("6", "部分成交后撤单");
    ORDER_STATUS.put("7", "撤单委托成功");
    ORDER_STATUS.put("8", "撤单委托失败");
    
    CLOSEFLAG = new LinkedHashMap();
    CLOSEFLAG.put("0", "交易员正常转让");
    CLOSEFLAG.put("1", "客户委托交易员转让");
    CLOSEFLAG.put("2", "交易员替客户强行转让");
    
    CLOSEMODE = new LinkedHashMap();
    CLOSEMODE.put("1", "不指定平仓");
    CLOSEMODE.put("2", "指定时间平仓");
    CLOSEMODE.put("3", "指定价格平仓");
    
    TIMEFLAG = new LinkedHashMap();
    TIMEFLAG.put("1", "平今仓");
    TIMEFLAG.put("2", "平历史仓");
    
    CLOSEFlAG2 = new LinkedHashMap();
    CLOSEFlAG2.put("1", "代为平仓");
    CLOSEFlAG2.put("2", "强行平仓");
    
    OPERATION = new LinkedHashMap();
    OPERATION.put("101", "入金");
    OPERATION.put("102", "出金");
    OPERATION.put("103", "手续费");
    OPERATION.put("104", "收保证金");
    OPERATION.put("105", "退保证金");
    OPERATION.put("106", "平仓盈亏");
    OPERATION.put("107", "收浮亏");
    OPERATION.put("108", "退浮亏");
    OPERATION.put("109", "市场手续费");
    OPERATION.put("110", "担保金入金");
    OPERATION.put("111", "担保金出金");
    OPERATION.put("901", "初始资金");
    OPERATION.put("112", "交收货款");
    OPERATION.put("113", "交收手续费");
    OPERATION.put("114", "交收盈亏");
    OPERATION.put("115", "增值税");
    OPERATION.put("116", "收交收保证金（卖方）");
    OPERATION.put("117", "退交收保证金（卖方）");
    OPERATION.put("118", "付卖方货款");
    
    FAILCODE = new LinkedHashMap();
    FAILCODE.put("1", "价格超过范围");
    FAILCODE.put("2", "资金不足");
    FAILCODE.put("3", "商品数量不足");
    FAILCODE.put("4", "非法客户代码");
    FAILCODE.put("5", "该商品已转入交收");
    FAILCODE.put("6", "委托指令价格不是最小变动价位整数倍");
    FAILCODE.put("7", "买卖数量超过最大买卖数量");
    FAILCODE.put("8", "委托数量超过最大订货量限制");
    FAILCODE.put("9", "委托价低于跌幅下限");
    FAILCODE.put("10", "委托价超过涨幅上限");
    FAILCODE.put("11", "转让数量超过订货量");
    FAILCODE.put("20", "其他");
    
    WITHDRAWTYPE = new LinkedHashMap();
    WITHDRAWTYPE.put("1", "委托撤单");
    WITHDRAWTYPE.put("2", "本地撤单");
    WITHDRAWTYPE.put("3", "委托失败时自动撤单");
    WITHDRAWTYPE.put("4", "闭市时自动撤单");
    
    GATHERBID_STATUS = new LinkedHashMap();
    GATHERBID_STATUS.put("0", "不启用");
    GATHERBID_STATUS.put("1", "启用");
    
    BS_FLAG2 = new LinkedHashMap();
    BS_FLAG2.put("1", "买");
    BS_FLAG2.put("2", "卖");
    
    PRESENTSTATUS = new LinkedHashMap();
    PRESENTSTATUS.put("1", "待审核");
    PRESENTSTATUS.put("2", "审核通过");
    PRESENTSTATUS.put("3", "审核不通过");
    
    APPLYTYPE = new LinkedHashMap();
    APPLYTYPE.put("1", "正常撤销已有抵顶");
    APPLYTYPE.put("2", "强制撤销已有抵顶");
    APPLYTYPE.put("3", "抵顶转提前交收");
    APPLYTYPE.put("4", "等待交收");
    APPLYTYPE.put("5", "抵顶");
    APPLYTYPE.put("6", "提前交收");
    APPLYTYPE.put("7", "撤消等待交收");
    APPLYTYPE.put("8", "延期交收");
    APPLYTYPE.put("9", "撤销延期交收");
    
    BILLTYPE = new LinkedHashMap();
    BILLTYPE.put("1", "抵顶");
    BILLTYPE.put("2", "已交收");
    BILLTYPE.put("3", "等待交收");
    BILLTYPE.put("4", "已提前交收");
    
    ALIVEPRESENTSTATUS = new LinkedHashMap();
    ALIVEPRESENTSTATUS.put("0", "已撤销");
    ALIVEPRESENTSTATUS.put("1", "有效");
    
    FIRMPRIVILEGE_B = new LinkedHashMap();
    FIRMPRIVILEGE_B.put("101", "全权");
    FIRMPRIVILEGE_B.put("102", "只可订立");
    FIRMPRIVILEGE_B.put("103", "只可转让");
    FIRMPRIVILEGE_B.put("104", "无权");
    FIRMPRIVILEGE_B.put("301", "查看市场行情");
    FIRMPRIVILEGE_B.put("302", "查看成交结果");
    FIRMPRIVILEGE_B.put("303", "输入委托单");
    FIRMPRIVILEGE_B.put("304", "查询委托单");
    FIRMPRIVILEGE_B.put("305", "查询会员公司");
    FIRMPRIVILEGE_B.put("306", "公司管理员");
    
    FIRMPRIVILEGE_S = new LinkedHashMap();
    FIRMPRIVILEGE_S.put("201", "全权");
    FIRMPRIVILEGE_S.put("202", "只可订立");
    FIRMPRIVILEGE_S.put("203", "只可转让");
    FIRMPRIVILEGE_S.put("204", "无权");
    
    UPDOWNFLAG = new LinkedHashMap();
    UPDOWNFLAG.put("1", "涨停");
    UPDOWNFLAG.put("2", "跌停");
    
    WL = new LinkedHashMap();
    WL.put("W", "盈利方");
    WL.put("L", "亏损方");
    
    LOSERMODE = new LinkedHashMap();
    LOSERMODE.put("1", "所有亏损会员");
    LOSERMODE.put("2", "亏损且报单会员");
    
    DEDUCTSTATUS = new LinkedHashMap();
    DEDUCTSTATUS.put("N", "未运行");
    DEDUCTSTATUS.put("P", "预运行");
    DEDUCTSTATUS.put("Y", "运行完毕");
    
    TYPE = new LinkedHashMap();
    TYPE.put("1", "交易商");
    TYPE.put("2", "交易客户");
    TYPE.put("3", "交易员");
    
    CONSIGNERTYPE = new LinkedHashMap();
    CONSIGNERTYPE.put("0", "代为委托员");
    CONSIGNERTYPE.put("1", "强平员");
    
    KIND = new LinkedHashMap();
    KIND.put("1", "品种");
    KIND.put("2", "商品");
    
    MARGINALGR = new LinkedHashMap();
    MARGINALGR.put("1", "按百分比");
    MARGINALGR.put("2", "按绝对值");
    
    FEEALGR = new LinkedHashMap();
    FEEALGR.put("1", "按百分比");
    
    FEEALGR.put("2", "按绝对值");
    
    MAXHOLDQTY = new LinkedHashMap();
    MAXHOLDQTY.put("-1", "无限制");
    
    BROADCAST_STATUS = new LinkedHashMap();
    BROADCAST_STATUS.put("0", "有效");
    BROADCAST_STATUS.put("1", "无效");
    
    VIRTUALFUNDSTATUS = new LinkedHashMap();
    VIRTUALFUNDSTATUS.put("1", "待审核");
    VIRTUALFUNDSTATUS.put("2", "审核通过");
    VIRTUALFUNDSTATUS.put("3", "审核不通过");
    
    VIRTUALFUNDAPPLYTYPE = new LinkedHashMap();
    VIRTUALFUNDAPPLYTYPE.put("1", "虚拟资金");
    VIRTUALFUNDAPPLYTYPE.put("2", "质押");
    
    OPERATECHECK = new LinkedHashMap();
    OPERATECHECK.put("1", "添加");
    OPERATECHECK.put("2", "删除");
    
    DELAYORDERTYPE = new LinkedHashMap();
    DELAYORDERTYPE.put("1", "交收申报");
    DELAYORDERTYPE.put("2", "中立仓申报");
    
    OPRTYPE = new LinkedHashMap();
    OPRTYPE.put("1", "登录");
    OPRTYPE.put("2", "注销");
    
    BILLTRADETYPE = new LinkedHashMap();
    BILLTRADETYPE.put("0", "正常");
    BILLTRADETYPE.put("1", "卖仓单");
    BILLTRADETYPE.put("2", "抵顶转让");
    
    PRIVILEGECODE_B = new LinkedHashMap();
    PRIVILEGECODE_B.put("101", "全权");
    PRIVILEGECODE_B.put("102", "只可交收申报");
    PRIVILEGECODE_B.put("103", "只可中立仓申报");
    PRIVILEGECODE_B.put("104", "无权");
    
    PRIVILEGECODE_S = new LinkedHashMap();
    PRIVILEGECODE_S.put("101", "全权");
    PRIVILEGECODE_S.put("102", "只可交收申报");
    PRIVILEGECODE_S.put("103", "只可中立仓申报");
    PRIVILEGECODE_S.put("104", "无权");
    
    DELAYORDERTYPE_STATUS = new LinkedHashMap();
    DELAYORDERTYPE_STATUS.put("1", "交收申报");
    DELAYORDERTYPE_STATUS.put("2", "中立仓申报");
    
    SETTLEFEEALGR = new LinkedHashMap();
    SETTLEFEEALGR.put("1", "按百分比");
    SETTLEFEEALGR.put("2", "按绝对值");
    
    MARGINPRICETYPE = new LinkedHashMap();
    MARGINPRICETYPE.put("0", "订立价");
    MARGINPRICETYPE.put("1", "昨结算价");
    MARGINPRICETYPE.put("2", "盘中按订立价");
  }
}
