package com.tencent.pb.common.b.a;

import com.google.a.a.b;
import com.google.a.a.e;
import com.google.a.a.g;
import java.util.Arrays;

public final class a$j extends e
{
  public a.ba AmB = null;
  public int AmD = 0;
  public byte[] AmN = g.bxA;
  public String groupId = "";
  public int sQS = 0;
  public long sQT = 0L;

  public a$j()
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
    if (this.AmB != null)
      paramb.a(4, this.AmB);
    if (this.AmD != 0)
      paramb.br(5, this.AmD);
    if (!Arrays.equals(this.AmN, g.bxA))
      paramb.b(200, this.AmN);
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
    int k = i;
    if (this.sQT != 0L)
      k = i + b.o(3, this.sQT);
    j = k;
    if (this.AmB != null)
      j = k + b.b(4, this.AmB);
    i = j;
    if (this.AmD != 0)
      i = j + b.bt(5, this.AmD);
    j = i;
    if (!Arrays.equals(this.AmN, g.bxA))
      j = i + b.c(200, this.AmN);
    return j;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.pb.common.b.a.a.j
 * JD-Core Version:    0.6.2
 */