package com.tencent.pb.common.b.a;

import com.google.a.a.b;
import com.google.a.a.c;
import com.google.a.a.e;
import com.google.a.a.g;
import java.util.Arrays;

public final class a$ar extends e
{
  private static volatile ar[] Aow;
  public int Aox = 0;
  public int Aoy = 0;
  public byte[] Aoz = g.bxA;

  public a$ar()
  {
    this.bxt = -1;
  }

  public static ar[] dPF()
  {
    if (Aow == null);
    synchronized (c.bxs)
    {
      if (Aow == null)
        Aow = new ar[0];
      return Aow;
    }
  }

  public final void a(b paramb)
  {
    if (this.Aox != 0)
      paramb.bq(1, this.Aox);
    if (this.Aoy != 0)
      paramb.bq(2, this.Aoy);
    if (!Arrays.equals(this.Aoz, g.bxA))
      paramb.b(3, this.Aoz);
    super.a(paramb);
  }

  public final int vr()
  {
    int i = super.vr();
    int j = i;
    if (this.Aox != 0)
      j = i + b.bs(1, this.Aox);
    i = j;
    if (this.Aoy != 0)
      i = j + b.bs(2, this.Aoy);
    j = i;
    if (!Arrays.equals(this.Aoz, g.bxA))
      j = i + b.c(3, this.Aoz);
    return j;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.pb.common.b.a.a.ar
 * JD-Core Version:    0.6.2
 */