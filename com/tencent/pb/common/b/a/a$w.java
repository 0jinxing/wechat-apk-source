package com.tencent.pb.common.b.a;

import com.google.a.a.b;
import com.google.a.a.c;
import com.google.a.a.e;

public final class a$w extends e
{
  private static volatile w[] AnN;
  public String AnO = "";
  public String AnP = "";

  public a$w()
  {
    this.bxt = -1;
  }

  public static w[] dPC()
  {
    if (AnN == null);
    synchronized (c.bxs)
    {
      if (AnN == null)
        AnN = new w[0];
      return AnN;
    }
  }

  public final void a(b paramb)
  {
    if (!this.AnO.equals(""))
      paramb.e(1, this.AnO);
    if (!this.AnP.equals(""))
      paramb.e(2, this.AnP);
    super.a(paramb);
  }

  public final int vr()
  {
    int i = super.vr();
    int j = i;
    if (!this.AnO.equals(""))
      j = i + b.f(1, this.AnO);
    i = j;
    if (!this.AnP.equals(""))
      i = j + b.f(2, this.AnP);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.pb.common.b.a.a.w
 * JD-Core Version:    0.6.2
 */