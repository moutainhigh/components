package gnnt.MEBS.espot.front.model.commodity;

import gnnt.MEBS.common.front.model.StandardModel;
import gnnt.MEBS.common.front.model.StandardModel.PrimaryInfo;
import gnnt.MEBS.common.front.model.translate.ClassDiscription;

public class GoodsResourceProperty
  extends StandardModel
{
  private static final long serialVersionUID = 8185059694024913916L;
  @ClassDiscription(name="所属商品资源", description="对应商品资源ID")
  private GoodsResource goodsResource;
  @ClassDiscription(name="属性名称", description="")
  private String propertyName;
  @ClassDiscription(name="商品属性值", description="")
  private String propertyValue;
  @ClassDiscription(name="类型编号", description="")
  private Long propertyTypeID;
  
  public GoodsResource getGoodsResource()
  {
    return this.goodsResource;
  }
  
  public void setGoodsResource(GoodsResource paramGoodsResource)
  {
    this.goodsResource = paramGoodsResource;
  }
  
  public String getPropertyName()
  {
    return this.propertyName;
  }
  
  public void setPropertyName(String paramString)
  {
    this.propertyName = paramString;
  }
  
  public String getPropertyValue()
  {
    return this.propertyValue;
  }
  
  public void setPropertyValue(String paramString)
  {
    this.propertyValue = paramString;
  }
  
  public Long getPropertyTypeID()
  {
    return this.propertyTypeID;
  }
  
  public void setPropertyTypeID(Long paramLong)
  {
    this.propertyTypeID = paramLong;
  }
  
  public StandardModel.PrimaryInfo fetchPKey()
  {
    return null;
  }
}
