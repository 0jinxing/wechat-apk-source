package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzs extends zzo
  implements zzr
{
  public static zzr zza(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      paramIBinder = null;
    while (true)
    {
      return paramIBinder;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
      if ((localIInterface instanceof zzr))
        paramIBinder = (zzr)localIInterface;
      else
        paramIBinder = new zzt(paramIBinder);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzs
 * JD-Core Version:    0.6.2
 */