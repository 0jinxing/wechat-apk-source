package com.tencent.pb.common.b.a;

import com.google.a.a.b;
import com.google.a.a.e;

public final class a$k extends e
{
  public int AmD = 0;
  public String groupId = "";
  public int kyZ = -1;
  public int netType = 0;
  public int sQS = 0;
  public long sQT = 0L;

  public a$k()
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
    if (this.kyZ != -1)
      paramb.bq(4, this.kyZ);
    if (this.AmD != 0)
      paramb.br(5, this.AmD);
    if (this.netType != 0)
      paramb.br(6, this.netType);
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
    int k = j;
    if (this.kyZ != -1)
      k = j + b.bs(4, this.kyZ);
    i = k;
    if (this.AmD != 0)
      i = k + b.bt(5, this.AmD);
    j = i;
    if (this.netType != 0)
      j = i + b.bt(6, this.netType);
    return j;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.pb.common.b.a.a.k
 * JD-Core Version:    0.6.2
 */