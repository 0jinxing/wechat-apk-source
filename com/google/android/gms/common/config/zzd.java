package com.google.android.gms.common.config;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzd extends GservicesValue<Double>
{
  zzd(String paramString, Double paramDouble)
  {
    super(paramString, paramDouble);
  }

  private static Double zza(Context paramContext, String paramString, Double paramDouble)
  {
    AppMethodBeat.i(89545);
    paramContext = paramContext.getSharedPreferences("gservices-direboot-cache", 0).getString(paramString, null);
    if (paramContext != null);
    while (true)
    {
      try
      {
        double d = Double.parseDouble(paramContext);
        paramDouble = Double.valueOf(d);
        AppMethodBeat.o(89545);
        return paramDouble;
      }
      catch (NumberFormatException paramContext)
      {
      }
      AppMethodBeat.o(89545);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.config.zzd
 * JD-Core Version:    0.6.2
 */