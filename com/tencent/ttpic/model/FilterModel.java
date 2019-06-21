package com.tencent.ttpic.model;

public class FilterModel
{
  private int effectIndex;
  private int filterId;

  public FilterModel(int paramInt1, int paramInt2)
  {
    this.filterId = paramInt1;
    this.effectIndex = paramInt2;
  }

  public int getEffectIndex()
  {
    return this.effectIndex;
  }

  public int getFilterId()
  {
    return this.filterId;
  }

  public void setEffectIndex(int paramInt)
  {
    this.effectIndex = paramInt;
  }

  public void setFilterId(int paramInt)
  {
    this.filterId = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.model.FilterModel
 * JD-Core Version:    0.6.2
 */