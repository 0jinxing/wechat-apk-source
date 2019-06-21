package com.tencent.pb.common.b.a;

import com.google.a.a.b;
import com.google.a.a.e;

public final class a$ae extends e
{
  public int nwu = 0;
  public long nwv = 0L;

  public a$ae()
  {
    this.bxt = -1;
  }

  public final void a(b paramb)
  {
    if (this.nwu != 0)
      paramb.bq(1, this.nwu);
    if (this.nwv != 0L)
      paramb.m(2, this.nwv);
    super.a(paramb);
  }

  public final int vr()
  {
    int i = super.vr();
    int j = i;
    if (this.nwu != 0)
      j = i + b.bs(1, this.nwu);
    i = j;
    if (this.nwv != 0L)
      i = j + b.o(2, this.nwv);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.pb.common.b.a.a.ae
 * JD-Core Version:    0.6.2
 */