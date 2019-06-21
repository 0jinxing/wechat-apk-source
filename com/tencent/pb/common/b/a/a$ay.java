package com.tencent.pb.common.b.a;

import com.google.a.a.b;
import com.google.a.a.e;

public final class a$ay extends e
{
  public int ApH = 0;
  public int sQS = 0;
  public long sQT = 0L;

  public a$ay()
  {
    this.bxt = -1;
  }

  public final void a(b paramb)
  {
    if (this.sQS != 0)
      paramb.bq(1, this.sQS);
    if (this.sQT != 0L)
      paramb.m(2, this.sQT);
    if (this.ApH != 0)
      paramb.br(3, this.ApH);
    super.a(paramb);
  }

  public final int vr()
  {
    int i = super.vr();
    int j = i;
    if (this.sQS != 0)
      j = i + b.bs(1, this.sQS);
    i = j;
    if (this.sQT != 0L)
      i = j + b.o(2, this.sQT);
    j = i;
    if (this.ApH != 0)
      j = i + b.bt(3, this.ApH);
    return j;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.pb.common.b.a.a.ay
 * JD-Core Version:    0.6.2
 */