package com.tencent.tinker.c.a.a.a;

import com.tencent.tinker.a.a.i.e;
import com.tencent.tinker.a.a.t;
import com.tencent.tinker.a.a.t.a;
import com.tencent.tinker.a.c.b;
import com.tencent.tinker.c.a.c.c;

public final class a extends i<com.tencent.tinker.a.a.a>
{
  private t.a AzD = null;
  private i.e AzE = null;

  public a(com.tencent.tinker.c.a.b.a parama, com.tencent.tinker.a.a.i parami1, com.tencent.tinker.a.a.i parami2, c paramc)
  {
    super(parama, parami1, paramc);
    if (parami2 != null)
    {
      this.AzD = parami2.AxY.AyH;
      this.AzE = parami2.a(this.AzD);
    }
  }

  protected final void a(c paramc, int paramInt1, int paramInt2)
  {
    if (paramInt2 >= 0)
      paramc.ABg.RI(paramInt2);
  }

  protected final void a(c paramc, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (paramInt2 != paramInt4)
      paramc.AAS.put(paramInt2, paramInt4);
  }

  protected final t.a c(com.tencent.tinker.a.a.i parami)
  {
    return parami.AxY.AyH;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.c.a.a.a.a
 * JD-Core Version:    0.6.2
 */