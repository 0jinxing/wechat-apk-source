package com.tencent.ttpic.model;

import java.util.List;

public class FaceFeatureItem
{
  private String dataPath;
  private List<DistortionItem> distortionItemList;
  private List<FaceItem> faceOffItemList;
  private String id;
  private int maskAnchorPoint;
  private List<StickerItem> stickerItems;

  public String getDataPath()
  {
    return this.dataPath;
  }

  public List<DistortionItem> getDistortionItemList()
  {
    return this.distortionItemList;
  }

  public List<FaceItem> getFaceOffItemList()
  {
    return this.faceOffItemList;
  }

  public String getId()
  {
    return this.id;
  }

  public int getMaskAnchorPoint()
  {
    return this.maskAnchorPoint;
  }

  public List<StickerItem> getStickerItems()
  {
    return this.stickerItems;
  }

  public void setDataPath(String paramString)
  {
    this.dataPath = paramString;
  }

  public void setDistortionItemList(List<DistortionItem> paramList)
  {
    this.distortionItemList = paramList;
  }

  public void setFaceOffItemList(List<FaceItem> paramList)
  {
    this.faceOffItemList = paramList;
  }

  public void setId(String paramString)
  {
    this.id = paramString;
  }

  public void setMaskAnchorPoint(int paramInt)
  {
    this.maskAnchorPoint = paramInt;
  }

  public void setStickerItems(List<StickerItem> paramList)
  {
    this.stickerItems = paramList;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.model.FaceFeatureItem
 * JD-Core Version:    0.6.2
 */