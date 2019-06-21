package com.tencent.mm.modelsimple;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bi;

final class t$1
  implements Runnable
{
  t$1(t paramt, bi parambi)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(16597);
    ab.i("MicroMsg.NetSceneRevokeMsg", "delete invoke message! msg:%s", new Object[] { Long.valueOf(this.fkD.field_msgId) });
    this.fkD.setType(10002);
    t.a(t.a(this.fPI), "", this.fkD, "");
    aw.ZK();
    c.XO().a(this.fkD.field_msgId, this.fkD);
    AppMethodBeat.o(16597);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.t.1
 * JD-Core Version:    0.6.2
 */