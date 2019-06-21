package com.tencent.mm.plugin.appbrand.jsapi;

import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.d;

public final class bm extends a<d>
{
  public static final int CTRL_INDEX = 215;
  public static final String NAME = "updatePerfData";
  private static final SparseArray<Integer> hzt;

  static
  {
    AppMethodBeat.i(101957);
    SparseArray localSparseArray = new SparseArray();
    hzt = localSparseArray;
    localSparseArray.put("firstRenderTime".hashCode(), Integer.valueOf(301));
    hzt.put("reRenderTime".hashCode(), Integer.valueOf(302));
    hzt.put("webview2AppServiceTotalTime".hashCode(), Integer.valueOf(402));
    hzt.put("webview2AppServiceDataSize".hashCode(), Integer.valueOf(403));
    hzt.put("webview2AppServiceNativeTime".hashCode(), Integer.valueOf(404));
    hzt.put("appService2WebviewTotalTime".hashCode(), Integer.valueOf(405));
    hzt.put("appService2WebviewDataSize".hashCode(), Integer.valueOf(406));
    hzt.put("appService2WebviewNativeTime".hashCode(), Integer.valueOf(407));
    AppMethodBeat.o(101957);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bm
 * JD-Core Version:    0.6.2
 */