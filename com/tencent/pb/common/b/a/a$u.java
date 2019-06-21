package com.tencent.pb.common.b.a;

import com.google.a.a.b;
import com.google.a.a.e;

public final class a$u extends e
{
  public int AmC = 0;
  public int AnK = 0;
  public int AnL = 0;
  public int Cn = 0;
  public int ret = 0;
  public String userName = "";
  public int vzt = 0;

  public a$u()
  {
    this.bxt = -1;
  }

  public final void a(b paramb)
  {
    if (!this.userName.equals(""))
      paramb.e(2, this.userName);
    if (this.Cn != 0)
      paramb.bq(3, this.Cn);
    if (this.AnK != 0)
      paramb.br(4, this.AnK);
    if (this.ret != 0)
      paramb.bq(5, this.ret);
    if (this.AnL != 0)
      paramb.bq(6, this.AnL);
    if (this.AmC != 0)
      paramb.br(7, this.AmC);
    if (this.vzt != 0)
      paramb.br(8, this.vzt);
    super.a(paramb);
  }

  public final int vr()
  {
    int i = super.vr();
    int j = i;
    if (!this.userName.equals(""))
      j = i + b.f(2, this.userName);
    i = j;
    if (this.Cn != 0)
      i = j + b.bs(3, this.Cn);
    j = i;
    if (this.AnK != 0)
      j = i + b.bt(4, this.AnK);
    i = j;
    if (this.ret != 0)
      i = j + b.bs(5, this.ret);
    j = i;
    if (this.AnL != 0)
      j = i + b.bs(6, this.AnL);
    i = j;
    if (this.AmC != 0)
      i = j + b.bt(7, this.AmC);
    j = i;
    if (this.vzt != 0)
      j = i + b.bt(8, this.vzt);
    return j;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.pb.common.b.a.a.u
 * JD-Core Version:    0.6.2
 */