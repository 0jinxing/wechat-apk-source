package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.Set;

public final class zzep
{
  final String name;
  private final String origin;
  final long timestamp;
  final long zzafp;
  final zzer zzafq;
  final String zzti;

  zzep(zzgl paramzzgl, String paramString1, String paramString2, String paramString3, long paramLong1, long paramLong2, Bundle paramBundle)
  {
    AppMethodBeat.i(68722);
    Preconditions.checkNotEmpty(paramString2);
    Preconditions.checkNotEmpty(paramString3);
    this.zzti = paramString2;
    this.name = paramString3;
    paramString3 = paramString1;
    if (TextUtils.isEmpty(paramString1))
      paramString3 = null;
    this.origin = paramString3;
    this.timestamp = paramLong1;
    this.zzafp = paramLong2;
    if ((this.zzafp != 0L) && (this.zzafp > this.timestamp))
      paramzzgl.zzge().zzip().zzg("Event created with reverse previous/current timestamps. appId", zzfg.zzbm(paramString2));
    if ((paramBundle != null) && (!paramBundle.isEmpty()))
    {
      paramString1 = new Bundle(paramBundle);
      paramBundle = paramString1.keySet().iterator();
      while (paramBundle.hasNext())
      {
        paramString3 = (String)paramBundle.next();
        if (paramString3 == null)
        {
          paramzzgl.zzge().zzim().log("Param name can't be null");
          paramBundle.remove();
        }
        else
        {
          paramString2 = paramzzgl.zzgb().zzh(paramString3, paramString1.get(paramString3));
          if (paramString2 == null)
          {
            paramzzgl.zzge().zzip().zzg("Param value can't be null", paramzzgl.zzga().zzbk(paramString3));
            paramBundle.remove();
          }
          else
          {
            paramzzgl.zzgb().zza(paramString1, paramString3, paramString2);
          }
        }
      }
    }
    for (paramzzgl = new zzer(paramString1); ; paramzzgl = new zzer(new Bundle()))
    {
      this.zzafq = paramzzgl;
      AppMethodBeat.o(68722);
      return;
    }
  }

  private zzep(zzgl paramzzgl, String paramString1, String paramString2, String paramString3, long paramLong1, long paramLong2, zzer paramzzer)
  {
    AppMethodBeat.i(68721);
    Preconditions.checkNotEmpty(paramString2);
    Preconditions.checkNotEmpty(paramString3);
    Preconditions.checkNotNull(paramzzer);
    this.zzti = paramString2;
    this.name = paramString3;
    String str = paramString1;
    if (TextUtils.isEmpty(paramString1))
      str = null;
    this.origin = str;
    this.timestamp = paramLong1;
    this.zzafp = paramLong2;
    if ((this.zzafp != 0L) && (this.zzafp > this.timestamp))
      paramzzgl.zzge().zzip().zze("Event created with reverse previous/current timestamps. appId, name", zzfg.zzbm(paramString2), zzfg.zzbm(paramString3));
    this.zzafq = paramzzer;
    AppMethodBeat.o(68721);
  }

  public final String toString()
  {
    AppMethodBeat.i(68724);
    String str1 = this.zzti;
    String str2 = this.name;
    String str3 = String.valueOf(this.zzafq);
    str1 = String.valueOf(str1).length() + 33 + String.valueOf(str2).length() + String.valueOf(str3).length() + "Event{appId='" + str1 + "', name='" + str2 + "', params=" + str3 + '}';
    AppMethodBeat.o(68724);
    return str1;
  }

  final zzep zza(zzgl paramzzgl, long paramLong)
  {
    AppMethodBeat.i(68723);
    paramzzgl = new zzep(paramzzgl, this.origin, this.zzti, this.name, this.timestamp, paramLong, this.zzafq);
    AppMethodBeat.o(68723);
    return paramzzgl;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzep
 * JD-Core Version:    0.6.2
 */