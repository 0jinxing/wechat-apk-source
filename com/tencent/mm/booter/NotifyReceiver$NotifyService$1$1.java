package com.tencent.mm.booter;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.e;
import com.tencent.mm.sdk.platformtools.ab;

final class NotifyReceiver$NotifyService$1$1
  implements Runnable
{
  NotifyReceiver$NotifyService$1$1(NotifyReceiver.NotifyService.1 param1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(57788);
    ab.i("MicroMsg.NotifyReceiver", "summerboot startupDone do delay notify task");
    NotifyReceiver.NotifyService.a(this.ecq.ecp, this.ecq.eco);
    e.pXa.a(99L, 215L, 1L, false);
    AppMethodBeat.o(57788);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.NotifyReceiver.NotifyService.1.1
 * JD-Core Version:    0.6.2
 */