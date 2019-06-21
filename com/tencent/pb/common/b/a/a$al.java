package com.tencent.pb.common.b.a;

import com.google.a.a.b;
import com.google.a.a.e;
import com.google.a.a.g;
import java.util.Arrays;

public final class a$al extends e
{
  public byte[] buffer = g.bxA;
  public int iLen = 0;

  public a$al()
  {
    this.bxt = -1;
  }

  public final void a(b paramb)
  {
    paramb.br(1, this.iLen);
    if (!Arrays.equals(this.buffer, g.bxA))
      paramb.b(2, this.buffer);
    super.a(paramb);
  }

  public final int vr()
  {
    int i = super.vr() + b.bt(1, this.iLen);
    int j = i;
    if (!Arrays.equals(this.buffer, g.bxA))
      j = i + b.c(2, this.buffer);
    return j;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.pb.common.b.a.a.al
 * JD-Core Version:    0.6.2
 */