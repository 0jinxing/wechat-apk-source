package com.tencent.mm.plugin.game.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.vv;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class p$1
  implements Runnable
{
  public p$1(String paramString, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(111299);
    ab.i("MicroMsg.GameMessageParser", "MicroMsg.Wepkg message pkgid:%s, downloadTriggerType:%d", new Object[] { this.mXE, Integer.valueOf(this.mXF) });
    if (!bo.isNullOrNil(this.mXE))
    {
      vv localvv = new vv();
      localvv.cSX.cuy = 1;
      localvv.cSX.cSY = this.mXE;
      localvv.cSX.cTb = this.mXF;
      a.xxA.m(localvv);
      h.pYm.a(858L, 15L, 1L, false);
    }
    AppMethodBeat.o(111299);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.p.1
 * JD-Core Version:    0.6.2
 */