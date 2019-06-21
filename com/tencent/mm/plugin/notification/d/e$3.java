package com.tencent.mm.plugin.notification.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ox;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;

final class e$3
  implements Runnable
{
  e$3(e parame, long paramLong)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(23157);
    ab.d("MicroMsg.SendSnsFailNotification", "resend snsInfo id:%d", new Object[] { Long.valueOf(this.cgB) });
    ox localox = new ox();
    localox.cLl.cLm = ((int)this.cgB);
    a.xxA.m(localox);
    AppMethodBeat.o(23157);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.notification.d.e.3
 * JD-Core Version:    0.6.2
 */