package com.google.android.gms.common.config;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zza extends GservicesValue<Boolean>
{
  zza(String paramString, Boolean paramBoolean)
  {
    super(paramString, paramBoolean);
  }

  private static Boolean zza(Context paramContext, String paramString, Boolean paramBoolean)
  {
    AppMethodBeat.i(89536);
    paramContext = paramContext.getSharedPreferences("gservices-direboot-cache", 0).getString(paramString, null);
    if (paramContext != null);
    while (true)
    {
      try
      {
        boolean bool = Boolean.parseBoolean(paramContext);
        paramBoolean = Boolean.valueOf(bool);
        AppMethodBeat.o(89536);
        return paramBoolean;
      }
      catch (NumberFormatException paramContext)
      {
      }
      AppMethodBeat.o(89536);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.config.zza
 * JD-Core Version:    0.6.2
 */