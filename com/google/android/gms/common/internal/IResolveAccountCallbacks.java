package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.stable.zza;
import com.google.android.gms.internal.stable.zzb;
import com.google.android.gms.internal.stable.zzc;
import com.tencent.matrix.trace.core.AppMethodBeat;

public abstract interface IResolveAccountCallbacks extends IInterface
{
  public abstract void onAccountResolutionComplete(ResolveAccountResponse paramResolveAccountResponse);

  public static abstract class Stub extends zzb
    implements IResolveAccountCallbacks
  {
    public Stub()
    {
      super();
    }

    public static IResolveAccountCallbacks asInterface(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        paramIBinder = null;
      while (true)
      {
        return paramIBinder;
        IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.common.internal.IResolveAccountCallbacks");
        if ((localIInterface instanceof IResolveAccountCallbacks))
          paramIBinder = (IResolveAccountCallbacks)localIInterface;
        else
          paramIBinder = new Proxy(paramIBinder);
      }
    }

    public boolean dispatchTransaction(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      if (paramInt1 == 2)
      {
        onAccountResolutionComplete((ResolveAccountResponse)zzc.zza(paramParcel1, ResolveAccountResponse.CREATOR));
        paramParcel2.writeNoException();
      }
      for (boolean bool = true; ; bool = false)
        return bool;
    }

    public static class Proxy extends zza
      implements IResolveAccountCallbacks
    {
      Proxy(IBinder paramIBinder)
      {
        super("com.google.android.gms.common.internal.IResolveAccountCallbacks");
      }

      public void onAccountResolutionComplete(ResolveAccountResponse paramResolveAccountResponse)
      {
        AppMethodBeat.i(61351);
        Parcel localParcel = obtainAndWriteInterfaceToken();
        zzc.zza(localParcel, paramResolveAccountResponse);
        transactAndReadExceptionReturnVoid(2, localParcel);
        AppMethodBeat.o(61351);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.IResolveAccountCallbacks
 * JD-Core Version:    0.6.2
 */