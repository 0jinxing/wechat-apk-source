package com.tencent.mm.plugin.notification.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ov;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bi;

final class d$3
  implements Runnable
{
  d$3(d paramd, long paramLong, bi parambi)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(23135);
    ab.d("MicroMsg.SendNormalMsgFailNotificaiton", "resend msgId:%d", new Object[] { Long.valueOf(this.cgB) });
    ov localov = new ov();
    localov.cLh.csG = this.fku;
    a.xxA.m(localov);
    AppMethodBeat.o(23135);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.notification.d.d.3
 * JD-Core Version:    0.6.2
 */