package com.google.android.gms.common.config;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzc extends GservicesValue<Integer>
{
  zzc(String paramString, Integer paramInteger)
  {
    super(paramString, paramInteger);
  }

  private static Integer zza(Context paramContext, String paramString, Integer paramInteger)
  {
    AppMethodBeat.i(89542);
    paramContext = paramContext.getSharedPreferences("gservices-direboot-cache", 0).getString(paramString, null);
    if (paramContext != null);
    while (true)
    {
      try
      {
        int i = Integer.parseInt(paramContext);
        paramInteger = Integer.valueOf(i);
        AppMethodBeat.o(89542);
        return paramInteger;
      }
      catch (NumberFormatException paramContext)
      {
      }
      AppMethodBeat.o(89542);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.config.zzc
 * JD-Core Version:    0.6.2
 */