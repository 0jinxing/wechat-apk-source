package com.tencent.mm.loader.g;

import a.f.b.j;

public final class i
  implements Runnable
{
  private b eQR;
  private c eRp;
  private i.a eRq;

  public i(c paramc, b paramb, i.a parama)
  {
    this.eRp = paramc;
    this.eQR = paramb;
    this.eRq = parama;
  }

  public final void run()
  {
    c localc = this.eRp;
    b localb = this.eQR;
    i.a locala = this.eRq;
    j.p(localb, "loader");
    j.p(locala, "watch");
    localc.eQR = localb;
    localc.eQS = locala;
    localc.Pa();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.loader.g.i
 * JD-Core Version:    0.6.2
 */