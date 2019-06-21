package com.tencent.pb.common.b.a;

import com.google.a.a.b;
import com.google.a.a.e;

public final class a$h extends e
{
  public String emc = "";
  public String groupId = "";
  public int nwu = 0;
  public long nwv = 0L;
  public long timestamp = 0L;

  public a$h()
  {
    this.bxt = -1;
  }

  public final void a(b paramb)
  {
    paramb.bq(1, this.nwu);
    paramb.m(2, this.nwv);
    paramb.e(3, this.emc);
    if (!this.groupId.equals(""))
      paramb.e(4, this.groupId);
    if (this.timestamp != 0L)
      paramb.l(5, this.timestamp);
    super.a(paramb);
  }

  public final int vr()
  {
    int i = super.vr() + b.bs(1, this.nwu) + b.o(2, this.nwv) + b.f(3, this.emc);
    int j = i;
    if (!this.groupId.equals(""))
      j = i + b.f(4, this.groupId);
    i = j;
    if (this.timestamp != 0L)
      i = j + b.n(5, this.timestamp);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.pb.common.b.a.a.h
 * JD-Core Version:    0.6.2
 */