package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class zzb
{
  private SharedPreferences zzs;

  public zzb(Context paramContext)
  {
    AppMethodBeat.i(115340);
    try
    {
      paramContext = GooglePlayServicesUtilLight.getRemoteContext(paramContext);
      if (paramContext == null);
      for (paramContext = null; ; paramContext = paramContext.getSharedPreferences("google_ads_flags", 0))
      {
        this.zzs = paramContext;
        AppMethodBeat.o(115340);
        return;
      }
    }
    catch (Throwable paramContext)
    {
      while (true)
      {
        this.zzs = null;
        AppMethodBeat.o(115340);
      }
    }
  }

  public final boolean getBoolean(String paramString, boolean paramBoolean)
  {
    boolean bool = false;
    AppMethodBeat.i(115341);
    try
    {
      SharedPreferences localSharedPreferences = this.zzs;
      if (localSharedPreferences == null)
      {
        AppMethodBeat.o(115341);
        paramBoolean = bool;
      }
      while (true)
      {
        return paramBoolean;
        paramBoolean = this.zzs.getBoolean(paramString, false);
        AppMethodBeat.o(115341);
      }
    }
    catch (Throwable paramString)
    {
      while (true)
      {
        AppMethodBeat.o(115341);
        paramBoolean = bool;
      }
    }
  }

  final float getFloat(String paramString, float paramFloat)
  {
    float f = 0.0F;
    AppMethodBeat.i(115342);
    try
    {
      SharedPreferences localSharedPreferences = this.zzs;
      if (localSharedPreferences == null)
      {
        AppMethodBeat.o(115342);
        paramFloat = f;
      }
      while (true)
      {
        return paramFloat;
        paramFloat = this.zzs.getFloat(paramString, 0.0F);
        AppMethodBeat.o(115342);
      }
    }
    catch (Throwable paramString)
    {
      while (true)
      {
        AppMethodBeat.o(115342);
        paramFloat = f;
      }
    }
  }

  final String getString(String paramString1, String paramString2)
  {
    AppMethodBeat.i(115343);
    try
    {
      SharedPreferences localSharedPreferences = this.zzs;
      if (localSharedPreferences == null)
        AppMethodBeat.o(115343);
      while (true)
      {
        return paramString2;
        paramString1 = this.zzs.getString(paramString1, paramString2);
        paramString2 = paramString1;
        AppMethodBeat.o(115343);
      }
    }
    catch (Throwable paramString1)
    {
      while (true)
        AppMethodBeat.o(115343);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.identifier.zzb
 * JD-Core Version:    0.6.2
 */