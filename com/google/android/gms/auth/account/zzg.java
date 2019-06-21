package com.google.android.gms.auth.account;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.auth.zze;

public abstract class zzg extends zze
  implements zzf
{
  public static zzf zzf(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      paramIBinder = null;
    while (true)
    {
      return paramIBinder;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.auth.account.IWorkAccountService");
      if ((localIInterface instanceof zzf))
        paramIBinder = (zzf)localIInterface;
      else
        paramIBinder = new zzh(paramIBinder);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.auth.account.zzg
 * JD-Core Version:    0.6.2
 */