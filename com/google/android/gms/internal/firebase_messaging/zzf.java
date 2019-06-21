package com.google.android.gms.internal.firebase_messaging;

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
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.iid.IMessengerCompat");
      if ((localIInterface instanceof zze))
        paramIBinder = (zze)localIInterface;
      else
        paramIBinder = new zzg(paramIBinder);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.firebase_messaging.zzf
 * JD-Core Version:    0.6.2
 */