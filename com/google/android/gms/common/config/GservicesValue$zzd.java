package com.google.android.gms.common.config;

import android.content.ContentResolver;
import com.google.android.gms.internal.stable.zzg;
import com.google.android.gms.internal.stable.zzi;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class GservicesValue$zzd
  implements GservicesValue.zza
{
  private final ContentResolver mContentResolver;

  public GservicesValue$zzd(ContentResolver paramContentResolver)
  {
    this.mContentResolver = paramContentResolver;
  }

  public final Long getLong(String paramString, Long paramLong)
  {
    AppMethodBeat.i(89533);
    long l = zzi.getLong(this.mContentResolver, paramString, paramLong.longValue());
    AppMethodBeat.o(89533);
    return Long.valueOf(l);
  }

  public final String getString(String paramString1, String paramString2)
  {
    AppMethodBeat.i(89534);
    paramString1 = zzi.zza(this.mContentResolver, paramString1, paramString2);
    AppMethodBeat.o(89534);
    return paramString1;
  }

  public final Boolean zza(String paramString, Boolean paramBoolean)
  {
    AppMethodBeat.i(89529);
    boolean bool = zzi.zza(this.mContentResolver, paramString, paramBoolean.booleanValue());
    AppMethodBeat.o(89529);
    return Boolean.valueOf(bool);
  }

  public final Double zza(String paramString, Double paramDouble)
  {
    AppMethodBeat.i(89531);
    paramString = zzi.zza(this.mContentResolver, paramString, null);
    if (paramString != null);
    while (true)
    {
      try
      {
        double d = Double.parseDouble(paramString);
        paramDouble = Double.valueOf(d);
        AppMethodBeat.o(89531);
        return paramDouble;
      }
      catch (NumberFormatException paramString)
      {
      }
      AppMethodBeat.o(89531);
    }
  }

  public final Float zza(String paramString, Float paramFloat)
  {
    AppMethodBeat.i(89532);
    paramString = zzi.zza(this.mContentResolver, paramString, null);
    if (paramString != null);
    while (true)
    {
      try
      {
        float f = Float.parseFloat(paramString);
        paramFloat = Float.valueOf(f);
        AppMethodBeat.o(89532);
        return paramFloat;
      }
      catch (NumberFormatException paramString)
      {
      }
      AppMethodBeat.o(89532);
    }
  }

  public final Integer zza(String paramString, Integer paramInteger)
  {
    AppMethodBeat.i(89530);
    int i = zzi.getInt(this.mContentResolver, paramString, paramInteger.intValue());
    AppMethodBeat.o(89530);
    return Integer.valueOf(i);
  }

  public final String zzb(String paramString1, String paramString2)
  {
    AppMethodBeat.i(89535);
    paramString1 = zzg.zza(this.mContentResolver, paramString1, paramString2);
    AppMethodBeat.o(89535);
    return paramString1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.config.GservicesValue.zzd
 * JD-Core Version:    0.6.2
 */