package com.tencent.pb.common.b.a;

import com.google.a.a.b;
import com.google.a.a.c;
import com.google.a.a.e;

public final class a$o extends e
{
  private static volatile o[] AmZ;
  public int Ana = 0;
  public int port = 0;

  public a$o()
  {
    this.bxt = -1;
  }

  public static o[] dPB()
  {
    if (AmZ == null);
    synchronized (c.bxs)
    {
      if (AmZ == null)
        AmZ = new o[0];
      return AmZ;
    }
  }

  public final void a(b paramb)
  {
    if (this.Ana != 0)
      paramb.br(1, this.Ana);
    if (this.port != 0)
      paramb.bq(2, this.port);
    super.a(paramb);
  }

  public final int vr()
  {
    int i = super.vr();
    int j = i;
    if (this.Ana != 0)
      j = i + b.bt(1, this.Ana);
    i = j;
    if (this.port != 0)
      i = j + b.bs(2, this.port);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.pb.common.b.a.a.o
 * JD-Core Version:    0.6.2
 */