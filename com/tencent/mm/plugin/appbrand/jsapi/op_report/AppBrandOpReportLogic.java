package com.tencent.mm.plugin.appbrand.jsapi.op_report;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent;
import com.tencent.mm.plugin.appbrand.jsapi.h;

public final class AppBrandOpReportLogic
{
  public static final class a
  {
    private static boolean bUt = false;

    public static void b(h paramh)
    {
      try
      {
        AppMethodBeat.i(102000);
        if (bUt)
          AppMethodBeat.o(102000);
        while (true)
        {
          return;
          String str = paramh.getAppId();
          AppBrandOpReportLogic.a.1 local1 = new com/tencent/mm/plugin/appbrand/jsapi/op_report/AppBrandOpReportLogic$a$1;
          local1.<init>(paramh);
          MMToClientEvent.a(str, local1);
          bUt = true;
          AppMethodBeat.o(102000);
        }
      }
      finally
      {
      }
      throw paramh;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.op_report.AppBrandOpReportLogic
 * JD-Core Version:    0.6.2
 */