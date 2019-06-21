package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.report.c;
import com.tencent.mm.plugin.report.service.h;

final class AppBrandPrepareTask$3
  implements Runnable
{
  AppBrandPrepareTask$3(AppBrandPrepareTask paramAppBrandPrepareTask)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(131734);
    int i = 369;
    if (this.ifV.hrs)
      i = 777;
    h.pYm.a(i, 3L, 1L, false);
    c.a(AppBrandPrepareTask.PrepareParams.a(this.ifV.ifS), 0, AppBrandPrepareTask.PrepareParams.b(this.ifV.ifS), i, 3);
    AppMethodBeat.o(131734);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask.3
 * JD-Core Version:    0.6.2
 */