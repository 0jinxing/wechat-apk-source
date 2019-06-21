package com.tencent.mm.modelappbrand;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.report.e;
import com.tencent.mm.sdk.platformtools.MultiProcessSharedPreferences;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;

public final class b
{
  public static String fpD;
  public static String fpE;

  public static String abv()
  {
    AppMethodBeat.i(114902);
    Object localObject = new StringBuilder("sid_");
    g.RN();
    fpD = a.QF() + "_" + bo.anU();
    ab.v("MicroMsg.AppBrandReporter", "refreshWeAppSearchSessionId : %s", new Object[] { fpD });
    localObject = fpD;
    AppMethodBeat.o(114902);
    return localObject;
  }

  public static long abw()
  {
    AppMethodBeat.i(114904);
    try
    {
      SharedPreferences localSharedPreferences = MultiProcessSharedPreferences.getSharedPreferences(ah.getContext(), "pref_appbrand_process", 4);
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ah.getProcessName() + ":start_time";
      l = System.currentTimeMillis();
      if (localSharedPreferences.contains((String)localObject))
      {
        l = localSharedPreferences.getLong((String)localObject, l);
        AppMethodBeat.o(114904);
      }
      while (true)
      {
        return l;
        AppMethodBeat.o(114904);
      }
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.AppBrandReporter", localThrowable, "getProcessStartTime", new Object[0]);
        long l = System.currentTimeMillis();
        AppMethodBeat.o(114904);
      }
    }
  }

  public static void pj(String paramString)
  {
    AppMethodBeat.i(114903);
    try
    {
      Object localObject1 = MultiProcessSharedPreferences.getSharedPreferences(ah.getContext(), "pref_appbrand_process", 4);
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = paramString + ":start_time";
      localObject1 = ((SharedPreferences)localObject1).edit();
      ((SharedPreferences.Editor)localObject1).remove((String)localObject2);
      ((SharedPreferences.Editor)localObject1).commit();
      e.pXa.a(365L, 5L, 1L, false);
      ab.v("MicroMsg.AppBrandReporter", "onProcessExit");
      AppMethodBeat.o(114903);
      return;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.AppBrandReporter", localThrowable, "onProcessExit(%s)", new Object[] { paramString });
        AppMethodBeat.o(114903);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelappbrand.b
 * JD-Core Version:    0.6.2
 */