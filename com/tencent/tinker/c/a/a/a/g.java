package com.tencent.tinker.c.a.a.a;

import com.tencent.tinker.a.a.i.e;
import com.tencent.tinker.a.a.t;
import com.tencent.tinker.a.a.t.a;
import com.tencent.tinker.a.c.b;
import com.tencent.tinker.c.a.c.c;

public final class g extends i<com.tencent.tinker.a.a.g>
{
  private t.a AzP = null;
  private i.e AzQ = null;

  public g(com.tencent.tinker.c.a.b.a parama, com.tencent.tinker.a.a.i parami1, com.tencent.tinker.a.a.i parami2, c paramc)
  {
    super(parama, parami1, paramc);
    if (parami2 != null)
    {
      this.AzP = parami2.AxY.AyE;
      this.AzQ = parami2.a(this.AzP);
    }
  }

  protected final void a(c paramc, int paramInt1, int paramInt2)
  {
    if (paramInt2 >= 0)
      paramc.ABn.RI(paramInt2);
  }

  protected final void a(c paramc, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (paramInt2 != paramInt4)
      paramc.AAZ.put(paramInt2, paramInt4);
  }

  protected final t.a c(com.tencent.tinker.a.a.i parami)
  {
    return parami.AxY.AyE;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.c.a.a.a.g
 * JD-Core Version:    0.6.2
 */