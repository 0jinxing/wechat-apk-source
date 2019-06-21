package com.tencent.pb.common.b.a;

import com.google.a.a.b;
import com.google.a.a.e;

public final class a$i extends e
{
  public int action = 0;
  public String groupId = "";
  public int nwu = 0;
  public long nwv = 0L;
  public long timestamp = 0L;

  public a$i()
  {
    this.bxt = -1;
  }

  public final void a(b paramb)
  {
    paramb.br(1, this.action);
    paramb.bq(2, this.nwu);
    paramb.m(3, this.nwv);
    if (!this.groupId.equals(""))
      paramb.e(4, this.groupId);
    if (this.timestamp != 0L)
      paramb.l(5, this.timestamp);
    super.a(paramb);
  }

  public final int vr()
  {
    int i = super.vr() + b.bt(1, this.action) + b.bs(2, this.nwu) + b.o(3, this.nwv);
    int j = i;
    if (!this.groupId.equals(""))
      j = i + b.f(4, this.groupId);
    i = j;
    if (this.timestamp != 0L)
      i = j + b.n(5, this.timestamp);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.pb.common.b.a.a.i
 * JD-Core Version:    0.6.2
 */