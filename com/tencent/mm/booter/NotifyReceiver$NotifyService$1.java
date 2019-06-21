package com.tencent.mm.booter;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.report.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

final class NotifyReceiver$NotifyService$1
  implements com.tencent.mm.kernel.api.g
{
  NotifyReceiver$NotifyService$1(NotifyReceiver.NotifyService paramNotifyService, long paramLong, Intent paramIntent)
  {
  }

  public final void BR()
  {
    AppMethodBeat.i(57789);
    com.tencent.mm.kernel.g.RQ().b(this);
    NotifyReceiver.NotifyService.a(this.ecp);
    long l = System.currentTimeMillis() - this.ecn;
    ab.i("MicroMsg.NotifyReceiver", "summerboot startupDone[%b] take[%d]ms tid[%d] post last notify task", new Object[] { Boolean.valueOf(com.tencent.mm.kernel.g.RQ().eKi.eKC), Long.valueOf(l), Long.valueOf(Thread.currentThread().getId()) });
    e.pXa.e(11098, new Object[] { Integer.valueOf(3600), Long.valueOf(l) });
    e.pXa.a(99L, 214L, 1L, false);
    al.n(new NotifyReceiver.NotifyService.1.1(this), 500L);
    AppMethodBeat.o(57789);
  }

  public final void bi(boolean paramBoolean)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.NotifyReceiver.NotifyService.1
 * JD-Core Version:    0.6.2
 */