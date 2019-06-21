package com.tencent.tinker.c.a.a.a;

import com.tencent.tinker.a.a.i.e;
import com.tencent.tinker.a.a.t;
import com.tencent.tinker.a.a.t.a;

public final class b extends i<com.tencent.tinker.a.a.c>
{
  private t.a AzF = null;
  private i.e AzG = null;

  public b(com.tencent.tinker.c.a.b.a parama, com.tencent.tinker.a.a.i parami1, com.tencent.tinker.a.a.i parami2, com.tencent.tinker.c.a.c.c paramc)
  {
    super(parama, parami1, paramc);
    if (parami2 != null)
    {
      this.AzF = parami2.AxY.AyB;
      this.AzG = parami2.a(this.AzF);
    }
  }

  protected final void a(com.tencent.tinker.c.a.c.c paramc, int paramInt1, int paramInt2)
  {
    if (paramInt2 >= 0)
      paramc.ABi.RI(paramInt2);
  }

  protected final void a(com.tencent.tinker.c.a.c.c paramc, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (paramInt2 != paramInt4)
      paramc.AAU.put(paramInt2, paramInt4);
  }

  protected final t.a c(com.tencent.tinker.a.a.i parami)
  {
    return parami.AxY.AyB;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.c.a.a.a.b
 * JD-Core Version:    0.6.2
 */