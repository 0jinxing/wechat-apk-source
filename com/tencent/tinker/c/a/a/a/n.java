package com.tencent.tinker.c.a.a.a;

import com.tencent.tinker.a.a.i.e;
import com.tencent.tinker.a.a.s;
import com.tencent.tinker.a.a.t;
import com.tencent.tinker.a.a.t.a;
import com.tencent.tinker.a.c.b;
import com.tencent.tinker.c.a.c.c;

public final class n extends i<s>
{
  private t.a AAb = null;
  private t.a AAc = null;
  private i.e AAd = null;
  private i.e AAe = null;

  public n(com.tencent.tinker.c.a.b.a parama, com.tencent.tinker.a.a.i parami1, com.tencent.tinker.a.a.i parami2, c paramc)
  {
    super(parama, parami1, paramc);
    if (parami2 != null)
    {
      this.AAb = parami2.AxY.AyF;
      this.AAc = parami2.AxY.Ayt;
      this.AAd = parami2.a(this.AAb);
      this.AAe = parami2.a(this.AAc);
    }
  }

  protected final void a(c paramc, int paramInt1, int paramInt2)
  {
    if (paramInt1 >= 0)
      paramc.ABa.RI(paramInt1);
  }

  protected final void a(c paramc, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (paramInt1 != paramInt3)
      paramc.AAM.put(paramInt1, paramInt3);
  }

  protected final t.a c(com.tencent.tinker.a.a.i parami)
  {
    return parami.AxY.AyF;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.c.a.a.a.n
 * JD-Core Version:    0.6.2
 */