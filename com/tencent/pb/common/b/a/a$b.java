package com.tencent.pb.common.b.a;

import com.google.a.a.b;
import com.google.a.a.e;

public final class a$b extends e
{
  public String Amx = "";
  public int boZ = 0;

  public a$b()
  {
    this.bxt = -1;
  }

  public final void a(b paramb)
  {
    if (!this.Amx.equals(""))
      paramb.e(1, this.Amx);
    if (this.boZ != 0)
      paramb.bq(2, this.boZ);
    super.a(paramb);
  }

  public final int vr()
  {
    int i = super.vr();
    int j = i;
    if (!this.Amx.equals(""))
      j = i + b.f(1, this.Amx);
    i = j;
    if (this.boZ != 0)
      i = j + b.bs(2, this.boZ);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.pb.common.b.a.a.b
 * JD-Core Version:    0.6.2
 */