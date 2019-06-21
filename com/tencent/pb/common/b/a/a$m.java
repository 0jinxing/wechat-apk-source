package com.tencent.pb.common.b.a;

import com.google.a.a.b;
import com.google.a.a.c;
import com.google.a.a.e;

public final class a$m extends e
{
  private static volatile m[] AmU;
  public String AmV = "";
  public String nickname = "";
  public int vzt = 0;

  public a$m()
  {
    this.bxt = -1;
  }

  public static m[] dPz()
  {
    if (AmU == null);
    synchronized (c.bxs)
    {
      if (AmU == null)
        AmU = new m[0];
      return AmU;
    }
  }

  public final void a(b paramb)
  {
    if (this.vzt != 0)
      paramb.br(1, this.vzt);
    if (!this.nickname.equals(""))
      paramb.e(2, this.nickname);
    if (!this.AmV.equals(""))
      paramb.e(3, this.AmV);
    super.a(paramb);
  }

  public final int vr()
  {
    int i = super.vr();
    int j = i;
    if (this.vzt != 0)
      j = i + b.bt(1, this.vzt);
    i = j;
    if (!this.nickname.equals(""))
      i = j + b.f(2, this.nickname);
    j = i;
    if (!this.AmV.equals(""))
      j = i + b.f(3, this.AmV);
    return j;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.pb.common.b.a.a.m
 * JD-Core Version:    0.6.2
 */