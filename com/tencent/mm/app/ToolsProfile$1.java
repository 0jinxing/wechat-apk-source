package com.tencent.mm.app;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver;
import com.tencent.mm.sdk.platformtools.ao.c;

final class ToolsProfile$1
  implements ao.c
{
  ToolsProfile$1(ToolsProfile paramToolsProfile)
  {
  }

  public final void b(String paramString, Throwable paramThrowable)
  {
    AppMethodBeat.i(15405);
    KVCommCrossProcessReceiver.cgo();
    AppMethodBeat.o(15405);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.ToolsProfile.1
 * JD-Core Version:    0.6.2
 */