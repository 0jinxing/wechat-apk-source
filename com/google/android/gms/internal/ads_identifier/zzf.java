package com.google.android.gms.internal.ads_identifier;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzf extends zzb
  implements zze
{
  public static zze zza(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      paramIBinder = null;
    while (true)
    {
      return paramIBinder;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
      if ((localIInterface instanceof zze))
        paramIBinder = (zze)localIInterface;
      else
        paramIBinder = new zzg(paramIBinder);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads_identifier.zzf
 * JD-Core Version:    0.6.2
 */