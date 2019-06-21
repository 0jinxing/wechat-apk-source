package com.tencent.mm.app;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ao.c;

final class AppBrandProfile$1
  implements ao.c
{
  AppBrandProfile$1(AppBrandProfile paramAppBrandProfile)
  {
  }

  public final void b(String paramString, Throwable paramThrowable)
  {
    AppMethodBeat.i(15365);
    h.pYm.a(365L, 3L, 1L, false);
    KVCommCrossProcessReceiver.cgo();
    AppMethodBeat.o(15365);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.AppBrandProfile.1
 * JD-Core Version:    0.6.2
 */