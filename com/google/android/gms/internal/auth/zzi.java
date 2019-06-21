package com.google.android.gms.internal.auth;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzi extends zze
  implements zzh
{
  public static zzh zzd(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      paramIBinder = null;
    while (true)
    {
      return paramIBinder;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
      if ((localIInterface instanceof zzh))
        paramIBinder = (zzh)localIInterface;
      else
        paramIBinder = new zzj(paramIBinder);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.auth.zzi
 * JD-Core Version:    0.6.2
 */