package com.tencent.ttpic.filter;

import com.tencent.filter.h;

public abstract interface ITransitionFilter
{
  public abstract void RenderProcess(int paramInt1, int paramInt2, int paramInt3, int paramInt4, double paramDouble, h paramh);

  public abstract void reset();

  public abstract void setDataPath(String paramString);

  public abstract void setLastTex(int paramInt);

  public abstract void updatePreview(long paramLong);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.filter.ITransitionFilter
 * JD-Core Version:    0.6.2
 */