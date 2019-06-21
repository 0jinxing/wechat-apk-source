package com.google.android.gms.common.config;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzb extends GservicesValue<Long>
{
  zzb(String paramString, Long paramLong)
  {
    super(paramString, paramLong);
  }

  private static Long zza(Context paramContext, String paramString, Long paramLong)
  {
    AppMethodBeat.i(89539);
    paramContext = paramContext.getSharedPreferences("gservices-direboot-cache", 0).getString(paramString, null);
    if (paramContext != null);
    while (true)
    {
      try
      {
        long l = Long.parseLong(paramContext);
        paramLong = Long.valueOf(l);
        AppMethodBeat.o(89539);
        return paramLong;
      }
      catch (NumberFormatException paramContext)
      {
      }
      AppMethodBeat.o(89539);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.config.zzb
 * JD-Core Version:    0.6.2
 */