package com.tencent.mm.plugin.appbrand.jsapi.op_report;

import android.util.SparseIntArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

public final class AppBrandOpReportLogic$b
{
  private static final SparseIntArray hST;

  static
  {
    AppMethodBeat.i(102002);
    hST = new SparseIntArray();
    AppMethodBeat.o(102002);
  }

  static void bi(String paramString, int paramInt)
  {
    AppMethodBeat.i(102001);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(102001);
    while (true)
    {
      return;
      synchronized (hST)
      {
        hST.put(paramString.hashCode(), paramInt);
        AppMethodBeat.o(102001);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.op_report.AppBrandOpReportLogic.b
 * JD-Core Version:    0.6.2
 */