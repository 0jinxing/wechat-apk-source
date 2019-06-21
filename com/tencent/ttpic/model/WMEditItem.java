package com.tencent.ttpic.model;

public class WMEditItem
{
  public static int ITEM_TYPE_COUNTDOWN = 3;
  public static int ITEM_TYPE_SINCE;
  public static int ITEM_TYPE_TEXT = 1;
  public int itemType;
  public String value;

  static
  {
    ITEM_TYPE_SINCE = 2;
  }

  public WMEditItem(String paramString, int paramInt)
  {
    this.value = paramString;
    this.itemType = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.model.WMEditItem
 * JD-Core Version:    0.6.2
 */