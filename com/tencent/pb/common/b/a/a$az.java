package com.tencent.pb.common.b.a;

import com.google.a.a.b;
import com.google.a.a.c;
import com.google.a.a.e;

public final class a$az extends e
{
  private static volatile az[] ApI;
  public int ApJ = 0;
  public int ApK = 0;
  public int ApL = 0;
  public int ApM = 0;
  public int timestamp = 0;

  public a$az()
  {
    this.bxt = -1;
  }

  public static az[] dPJ()
  {
    if (ApI == null);
    synchronized (c.bxs)
    {
      if (ApI == null)
        ApI = new az[0];
      return ApI;
    }
  }

  public final void a(b paramb)
  {
    if (this.timestamp != 0)
      paramb.bq(1, this.timestamp);
    if (this.ApJ != 0)
      paramb.bq(2, this.ApJ);
    if (this.ApK != 0)
      paramb.bq(3, this.ApK);
    if (this.ApL != 0)
      paramb.bq(4, this.ApL);
    if (this.ApM != 0)
      paramb.bq(5, this.ApM);
    super.a(paramb);
  }

  public final int vr()
  {
    int i = super.vr();
    int j = i;
    if (this.timestamp != 0)
      j = i + b.bs(1, this.timestamp);
    i = j;
    if (this.ApJ != 0)
      i = j + b.bs(2, this.ApJ);
    j = i;
    if (this.ApK != 0)
      j = i + b.bs(3, this.ApK);
    i = j;
    if (this.ApL != 0)
      i = j + b.bs(4, this.ApL);
    j = i;
    if (this.ApM != 0)
      j = i + b.bs(5, this.ApM);
    return j;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.pb.common.b.a.a.az
 * JD-Core Version:    0.6.2
 */