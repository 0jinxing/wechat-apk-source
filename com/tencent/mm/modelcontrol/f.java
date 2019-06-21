package com.tencent.mm.modelcontrol;

public final class f
  implements Comparable
{
  public int fAa;
  public int fAb;
  public int fAc;
  public int fAd;
  public int fAe;
  public int fzY;
  public int fzZ;

  public f(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
  {
    this.fzY = paramInt1;
    this.fzZ = paramInt2;
    this.fAa = paramInt3;
    this.fAb = paramInt4;
    this.fAc = paramInt5;
    this.fAd = paramInt6;
    this.fAe = paramInt7;
  }

  public final int compareTo(Object paramObject)
  {
    int i = 0;
    if (paramObject == null);
    while (true)
    {
      return i;
      if ((paramObject instanceof f))
      {
        paramObject = (f)paramObject;
        i = this.fzY - paramObject.fzY;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelcontrol.f
 * JD-Core Version:    0.6.2
 */