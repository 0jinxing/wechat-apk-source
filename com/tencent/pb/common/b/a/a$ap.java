package com.tencent.pb.common.b.a;

import com.google.a.a.b;
import com.google.a.a.e;

public final class a$ap extends e
{
  public int Aou = 0;
  public int Aov = 0;

  public a$ap()
  {
    this.bxt = -1;
  }

  public final void a(b paramb)
  {
    if (this.Aou != 0)
      paramb.bq(1, this.Aou);
    if (this.Aov != 0)
      paramb.bq(2, this.Aov);
    super.a(paramb);
  }

  public final int vr()
  {
    int i = super.vr();
    int j = i;
    if (this.Aou != 0)
      j = i + b.bs(1, this.Aou);
    i = j;
    if (this.Aov != 0)
      i = j + b.bs(2, this.Aov);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.pb.common.b.a.a.ap
 * JD-Core Version:    0.6.2
 */