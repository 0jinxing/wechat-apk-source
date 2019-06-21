package com.tencent.pb.common.b.a;

import com.google.a.a.b;
import com.google.a.a.c;
import com.google.a.a.e;
import com.google.a.a.g;
import java.util.Arrays;

public final class a$n extends e
{
  private static volatile n[] AmW;
  public int AmX = 0;
  public int AmY = 0;
  public byte[] cDT = g.bxA;

  public a$n()
  {
    this.bxt = -1;
  }

  public static n[] dPA()
  {
    if (AmW == null);
    synchronized (c.bxs)
    {
      if (AmW == null)
        AmW = new n[0];
      return AmW;
    }
  }

  public final void a(b paramb)
  {
    if (this.AmX != 0)
      paramb.bq(1, this.AmX);
    if (!Arrays.equals(this.cDT, g.bxA))
      paramb.b(2, this.cDT);
    if (this.AmY != 0)
      paramb.br(3, this.AmY);
    super.a(paramb);
  }

  public final int vr()
  {
    int i = super.vr();
    int j = i;
    if (this.AmX != 0)
      j = i + b.bs(1, this.AmX);
    i = j;
    if (!Arrays.equals(this.cDT, g.bxA))
      i = j + b.c(2, this.cDT);
    j = i;
    if (this.AmY != 0)
      j = i + b.bt(3, this.AmY);
    return j;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.pb.common.b.a.a.n
 * JD-Core Version:    0.6.2
 */