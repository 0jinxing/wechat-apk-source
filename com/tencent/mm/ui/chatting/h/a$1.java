package com.tencent.mm.ui.chatting.h;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.modelsimple.t;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.storage.bi;

final class a$1
  implements Runnable
{
  a$1(a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(32502);
    this.yYQ.cKd.setType(10002);
    t.a(ah.getContext().getString(2131298222), "", this.yYQ.cKd, "");
    aw.ZK();
    c.XO().a(this.yYQ.cKd.field_msgId, this.yYQ.cKd);
    ab.i("MicroMsg.InvokeMessageNewXmlMsg", "checkExpired:%s", new Object[] { Long.valueOf(this.yYQ.cKd.field_msgId) });
    AppMethodBeat.o(32502);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.h.a.1
 * JD-Core Version:    0.6.2
 */