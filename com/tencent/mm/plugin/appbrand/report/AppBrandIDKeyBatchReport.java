package com.tencent.mm.plugin.appbrand.report;

import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.b;
import com.tencent.mm.protocal.protobuf.cwt;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.j;

public final class AppBrandIDKeyBatchReport
{
  private static volatile AppBrandIDKeyBatchReport.IDKeyBatchReportTask izC;

  public static void a(cwt paramcwt)
  {
    AppMethodBeat.i(132535);
    if (ah.bqo())
    {
      AppBrandIDKeyBatchReport.b.c(paramcwt);
      AppMethodBeat.o(132535);
    }
    while (true)
    {
      return;
      a.b(paramcwt);
      AppMethodBeat.o(132535);
    }
  }

  public static AppBrandIDKeyBatchReport.IDKeyBatchReportTask aKW()
  {
    AppMethodBeat.i(132533);
    if (izC == null)
      izC = new AppBrandIDKeyBatchReport.IDKeyBatchReportTask();
    AppBrandIDKeyBatchReport.IDKeyBatchReportTask localIDKeyBatchReportTask = izC;
    AppMethodBeat.o(132533);
    return localIDKeyBatchReportTask;
  }

  static String aKX()
  {
    AppMethodBeat.i(132534);
    if (!g.RK())
    {
      localObject = new b();
      AppMethodBeat.o(132534);
      throw ((Throwable)localObject);
    }
    String str = g.RP().cachePath;
    Object localObject = str;
    if (!str.endsWith("/"))
      localObject = str + "/";
    localObject = (String)localObject + "appbrand/report/";
    j.aih((String)localObject);
    AppMethodBeat.o(132534);
    return localObject;
  }

  static final class a
  {
    private static final byte[] izD = new byte[0];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.report.AppBrandIDKeyBatchReport
 * JD-Core Version:    0.6.2
 */