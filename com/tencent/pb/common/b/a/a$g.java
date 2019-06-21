package com.tencent.pb.common.b.a;

import com.google.a.a.b;
import com.google.a.a.e;

public final class a$g extends e
{
  public String Amx = "";
  public int boZ = 0;
  public String groupId = "";
  public int sQS = 0;
  public long sQT = 0L;

  public a$g()
  {
    this.bxt = -1;
  }

  public final void a(b paramb)
  {
    if (!this.groupId.equals(""))
      paramb.e(1, this.groupId);
    if (this.sQS != 0)
      paramb.bq(2, this.sQS);
    if (this.sQT != 0L)
      paramb.m(3, this.sQT);
    if (this.boZ != 0)
      paramb.bq(4, this.boZ);
    if (!this.Amx.equals(""))
      paramb.e(5, this.Amx);
    super.a(paramb);
  }

  public final int vr()
  {
    int i = super.vr();
    int j = i;
    if (!this.groupId.equals(""))
      j = i + b.f(1, this.groupId);
    i = j;
    if (this.sQS != 0)
      i = j + b.bs(2, this.sQS);
    j = i;
    if (this.sQT != 0L)
      j = i + b.o(3, this.sQT);
    i = j;
    if (this.boZ != 0)
      i = j + b.bs(4, this.boZ);
    j = i;
    if (!this.Amx.equals(""))
      j = i + b.f(5, this.Amx);
    return j;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.pb.common.b.a.a.g
 * JD-Core Version:    0.6.2
 */