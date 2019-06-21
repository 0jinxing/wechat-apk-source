package com.tencent.pb.common.b.a;

import com.google.a.a.b;
import com.google.a.a.e;

public final class a$an extends e
{
  public int Aor = 0;
  public long fNf = 0L;
  public int fQi = 0;

  public a$an()
  {
    this.bxt = -1;
  }

  public final void a(b paramb)
  {
    if (this.fNf != 0L)
      paramb.l(1, this.fNf);
    if (this.fQi != 0)
      paramb.br(2, this.fQi);
    if (this.Aor != 0)
      paramb.br(3, this.Aor);
    super.a(paramb);
  }

  public final int vr()
  {
    int i = super.vr();
    int j = i;
    if (this.fNf != 0L)
      j = i + b.n(1, this.fNf);
    i = j;
    if (this.fQi != 0)
      i = j + b.bt(2, this.fQi);
    j = i;
    if (this.Aor != 0)
      j = i + b.bt(3, this.Aor);
    return j;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.pb.common.b.a.a.an
 * JD-Core Version:    0.6.2
 */