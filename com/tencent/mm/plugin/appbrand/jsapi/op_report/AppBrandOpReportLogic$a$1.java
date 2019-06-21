package com.tencent.mm.plugin.appbrand.jsapi.op_report;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent.c;
import com.tencent.mm.plugin.appbrand.jsapi.h;

final class AppBrandOpReportLogic$a$1
  implements MMToClientEvent.c
{
  AppBrandOpReportLogic$a$1(h paramh)
  {
  }

  public final void bk(Object paramObject)
  {
    AppMethodBeat.i(101999);
    if ((paramObject instanceof AppBrandOpReportLogic.AppBrandOnOpReportStartEvent))
    {
      paramObject = this.hBK.getRuntime();
      if (paramObject != null)
        a.k(paramObject.xT());
    }
    AppMethodBeat.o(101999);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.op_report.AppBrandOpReportLogic.a.1
 * JD-Core Version:    0.6.2
 */