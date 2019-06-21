package com.google.android.gms.common.internal.service;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.stable.zza;
import com.google.android.gms.internal.stable.zzb;
import com.google.android.gms.internal.stable.zzc;
import com.tencent.matrix.trace.core.AppMethodBeat;

public abstract interface ICommonService extends IInterface
{
  public abstract void clearDefaultAccount(ICommonCallbacks paramICommonCallbacks);

  public static abstract class Stub extends zzb
    implements ICommonService
  {
    public Stub()
    {
      super();
    }

    public static ICommonService asInterface(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        paramIBinder = null;
      while (true)
      {
        return paramIBinder;
        IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.common.internal.service.ICommonService");
        if ((localIInterface instanceof ICommonService))
          paramIBinder = (ICommonService)localIInterface;
        else
          paramIBinder = new Proxy(paramIBinder);
      }
    }

    public boolean dispatchTransaction(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      boolean bool = true;
      if (paramInt1 == 1)
        clearDefaultAccount(ICommonCallbacks.Stub.asInterface(paramParcel1.readStrongBinder()));
      while (true)
      {
        return bool;
        bool = false;
      }
    }

    public static class Proxy extends zza
      implements ICommonService
    {
      Proxy(IBinder paramIBinder)
      {
        super("com.google.android.gms.common.internal.service.ICommonService");
      }

      public void clearDefaultAccount(ICommonCallbacks paramICommonCallbacks)
      {
        AppMethodBeat.i(61398);
        Parcel localParcel = obtainAndWriteInterfaceToken();
        zzc.zza(localParcel, paramICommonCallbacks);
        transactOneway(1, localParcel);
        AppMethodBeat.o(61398);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.service.ICommonService
 * JD-Core Version:    0.6.2
 */