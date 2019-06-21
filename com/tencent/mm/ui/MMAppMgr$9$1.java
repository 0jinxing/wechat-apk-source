package com.tencent.mm.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.sf;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.f;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.modelvideo.y.a;
import com.tencent.mm.modelvoice.m;
import com.tencent.mm.pluginsdk.model.app.al.a;
import com.tencent.mm.pluginsdk.model.app.am;
import com.tencent.mm.sdk.b.a;

final class MMAppMgr$9$1
  implements Runnable
{
  MMAppMgr$9$1(MMAppMgr.9 param9)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(29556);
    m.amc().run();
    com.tencent.mm.modelvideo.o.alq().run();
    com.tencent.mm.at.o.ahj().run();
    am.dhP().run();
    if (ao.a.flx != null)
      ao.a.flx.Zw();
    a.xxA.m(new sf());
    aw.ZK();
    c.XL().c(null);
    AppMethodBeat.o(29556);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.MMAppMgr.9.1
 * JD-Core Version:    0.6.2
 */