package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.stable.zzb;
import com.google.android.gms.internal.stable.zzc;

public abstract class IStatusCallback$Stub extends zzb
  implements IStatusCallback
{
  public IStatusCallback$Stub()
  {
    super("com.google.android.gms.common.api.internal.IStatusCallback");
  }

  public static IStatusCallback asInterface(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      paramIBinder = null;
    while (true)
    {
      return paramIBinder;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
      if ((localIInterface instanceof IStatusCallback))
        paramIBinder = (IStatusCallback)localIInterface;
      else
        paramIBinder = new IStatusCallback.Stub.zza(paramIBinder);
    }
  }

  public boolean dispatchTransaction(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    if (paramInt1 == 1)
      onResult((Status)zzc.zza(paramParcel1, Status.CREATOR));
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.internal.IStatusCallback.Stub
 * JD-Core Version:    0.6.2
 */