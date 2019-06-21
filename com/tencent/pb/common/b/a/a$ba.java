package com.tencent.pb.common.b.a;

import com.google.a.a.b;
import com.google.a.a.e;

public final class a$ba extends e
{
  public a.al ApN = null;
  public int type = 0;

  public a$ba()
  {
    this.bxt = -1;
  }

  public final void a(b paramb)
  {
    if (this.type != 0)
      paramb.bq(1, this.type);
    if (this.ApN != null)
      paramb.a(2, this.ApN);
    super.a(paramb);
  }

  public final int vr()
  {
    int i = super.vr();
    int j = i;
    if (this.type != 0)
      j = i + b.bs(1, this.type);
    i = j;
    if (this.ApN != null)
      i = j + b.b(2, this.ApN);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.pb.common.b.a.a.ba
 * JD-Core Version:    0.6.2
 */