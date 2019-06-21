package com.tencent.pb.common.b.a;

import com.google.a.a.b;
import com.google.a.a.c;
import com.google.a.a.e;

public final class a$ao extends e
{
  private static volatile ao[] Aos;
  public int Aof = 0;
  public int Aot = 0;
  public int fps = 0;
  public int kyZ = 0;

  public a$ao()
  {
    this.bxt = -1;
  }

  public static ao[] dPE()
  {
    if (Aos == null);
    synchronized (c.bxs)
    {
      if (Aos == null)
        Aos = new ao[0];
      return Aos;
    }
  }

  public final void a(b paramb)
  {
    if (this.kyZ != 0)
      paramb.bq(1, this.kyZ);
    if (this.Aot != 0)
      paramb.bq(2, this.Aot);
    if (this.fps != 0)
      paramb.bq(3, this.fps);
    if (this.Aof != 0)
      paramb.bq(4, this.Aof);
    super.a(paramb);
  }

  public final int vr()
  {
    int i = super.vr();
    int j = i;
    if (this.kyZ != 0)
      j = i + b.bs(1, this.kyZ);
    i = j;
    if (this.Aot != 0)
      i = j + b.bs(2, this.Aot);
    j = i;
    if (this.fps != 0)
      j = i + b.bs(3, this.fps);
    i = j;
    if (this.Aof != 0)
      i = j + b.bs(4, this.Aof);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.pb.common.b.a.a.ao
 * JD-Core Version:    0.6.2
 */