package com.tencent.tinker.c.a.a.a;

import com.tencent.tinker.a.a.i.e;
import com.tencent.tinker.a.a.t;
import com.tencent.tinker.a.a.t.a;
import com.tencent.tinker.a.a.u;
import com.tencent.tinker.a.c.b;
import com.tencent.tinker.c.a.c.c;

public final class p extends i<u>
{
  private t.a AAh = null;
  private i.e AAi = null;

  public p(com.tencent.tinker.c.a.b.a parama, com.tencent.tinker.a.a.i parami1, com.tencent.tinker.a.a.i parami2, c paramc)
  {
    super(parama, parami1, paramc);
    if (parami2 != null)
    {
      this.AAh = parami2.AxY.AyA;
      this.AAi = parami2.a(this.AAh);
    }
  }

  protected final void a(c paramc, int paramInt1, int paramInt2)
  {
    if (paramInt2 >= 0)
      paramc.ABf.RI(paramInt2);
  }

  protected final void a(c paramc, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (paramInt2 != paramInt4)
      paramc.AAR.put(paramInt2, paramInt4);
  }

  protected final t.a c(com.tencent.tinker.a.a.i parami)
  {
    return parami.AxY.AyA;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.c.a.a.a.p
 * JD-Core Version:    0.6.2
 */