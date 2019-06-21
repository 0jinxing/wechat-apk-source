package com.google.android.gms.common.internal.service;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.stable.zza;
import com.google.android.gms.internal.stable.zzb;
import com.tencent.matrix.trace.core.AppMethodBeat;

public abstract interface ICommonCallbacks extends IInterface
{
  public abstract void onDefaultAccountCleared(int paramInt);

  public static abstract class Stub extends zzb
    implements ICommonCallbacks
  {
    public Stub()
    {
      super();
    }

    public static ICommonCallbacks asInterface(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        paramIBinder = null;
      while (true)
      {
        return paramIBinder;
        IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.common.internal.service.ICommonCallbacks");
        if ((localIInterface instanceof ICommonCallbacks))
          paramIBinder = (ICommonCallbacks)localIInterface;
        else
          paramIBinder = new Proxy(paramIBinder);
      }
    }

    public boolean dispatchTransaction(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      boolean bool = true;
      if (paramInt1 == 1)
      {
        onDefaultAccountCleared(paramParcel1.readInt());
        paramParcel2.writeNoException();
      }
      while (true)
      {
        return bool;
        bool = false;
      }
    }

    public static class Proxy extends zza
      implements ICommonCallbacks
    {
      Proxy(IBinder paramIBinder)
      {
        super("com.google.android.gms.common.internal.service.ICommonCallbacks");
      }

      public void onDefaultAccountCleared(int paramInt)
      {
        AppMethodBeat.i(61397);
        Parcel localParcel = obtainAndWriteInterfaceToken();
        localParcel.writeInt(paramInt);
        transactAndReadExceptionReturnVoid(1, localParcel);
        AppMethodBeat.o(61397);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.service.ICommonCallbacks
 * JD-Core Version:    0.6.2
 */