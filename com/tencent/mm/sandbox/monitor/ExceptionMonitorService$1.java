package com.tencent.mm.sandbox.monitor;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class ExceptionMonitorService$1
  implements Runnable
{
  ExceptionMonitorService$1(ExceptionMonitorService paramExceptionMonitorService)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(28787);
    ab.d("MicroMsg.CrashMonitorService", "stopSelf");
    this.xvu.stopSelf();
    AppMethodBeat.o(28787);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.monitor.ExceptionMonitorService.1
 * JD-Core Version:    0.6.2
 */