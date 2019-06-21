package com.tencent.tinker.c.a.a.a;

import com.tencent.tinker.a.a.i.e;
import com.tencent.tinker.a.a.t;
import com.tencent.tinker.a.a.t.a;
import com.tencent.tinker.a.c.b;
import com.tencent.tinker.c.a.c.c;

public final class e extends i<com.tencent.tinker.a.a.e>
{
  private t.a AzL = null;
  private i.e AzM = null;

  public e(com.tencent.tinker.c.a.b.a parama, com.tencent.tinker.a.a.i parami1, com.tencent.tinker.a.a.i parami2, c paramc)
  {
    super(parama, parami1, paramc);
    if (parami2 != null)
    {
      this.AzL = parami2.AxY.AyD;
      this.AzM = parami2.a(this.AzL);
    }
  }

  protected final void a(c paramc, int paramInt1, int paramInt2)
  {
    if (paramInt2 >= 0)
      paramc.ABl.RI(paramInt2);
  }

  protected final void a(c paramc, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (paramInt2 != paramInt4)
      paramc.AAX.put(paramInt2, paramInt4);
  }

  protected final t.a c(com.tencent.tinker.a.a.i parami)
  {
    return parami.AxY.AyD;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.c.a.a.a.e
 * JD-Core Version:    0.6.2
 */