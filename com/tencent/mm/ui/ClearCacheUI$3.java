package com.tencent.mm.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.g.b;
import com.tencent.mm.g.a.bq;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

final class ClearCacheUI$3
  implements Runnable
{
  ClearCacheUI$3(ClearCacheUI paramClearCacheUI, long paramLong)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(29168);
    ab.w("MicroMsg.ClearCacheUI", "doClearCache flag %d", new Object[] { Long.valueOf(this.yfQ) });
    if ((this.yfQ & 1L) != 0L)
      com.tencent.mm.vfs.e.N(com.tencent.mm.plugin.i.c.bGF(), true);
    if ((this.yfQ & 0x2) != 0L)
      com.tencent.mm.vfs.e.N(b.eSG, true);
    if ((this.yfQ & 0x4) != 0L)
      com.tencent.mm.vfs.e.N(com.tencent.mm.compatible.util.e.euX, true);
    if ((this.yfQ & 0x8) != 0L)
    {
      aw.ZK();
      com.tencent.mm.vfs.e.N(com.tencent.mm.model.c.Yf(), true);
    }
    if ((this.yfQ & 0x10) != 0L)
      com.tencent.mm.vfs.e.N(com.tencent.mm.plugin.avatar.c.aSn(), true);
    if ((this.yfQ & 0x20) != 0L)
    {
      aw.ZK();
      com.tencent.mm.vfs.e.N(com.tencent.mm.model.c.Ya(), true);
    }
    if ((this.yfQ & 0x40) != 0L)
    {
      aw.ZK();
      com.tencent.mm.vfs.e.N(com.tencent.mm.model.c.getAccSnsPath(), true);
    }
    bq localbq = new bq();
    localbq.cuL.cuM = this.yfQ;
    a.xxA.m(localbq);
    al.d(new ClearCacheUI.3.1(this));
    AppMethodBeat.o(29168);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.ClearCacheUI.3
 * JD-Core Version:    0.6.2
 */