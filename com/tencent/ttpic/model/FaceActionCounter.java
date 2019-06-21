package com.tencent.ttpic.model;

public class FaceActionCounter
{
  public int count;
  public long updateTime;

  public FaceActionCounter(int paramInt, long paramLong)
  {
    this.count = paramInt;
    this.updateTime = paramLong;
  }

  public void clear()
  {
    this.count = 0;
    this.updateTime = 0L;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.model.FaceActionCounter
 * JD-Core Version:    0.6.2
 */