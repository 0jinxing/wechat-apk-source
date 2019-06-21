package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.internal.stable.zza;
import com.google.android.gms.internal.stable.zzb;
import com.google.android.gms.internal.stable.zzc;
import com.tencent.matrix.trace.core.AppMethodBeat;

public abstract interface ICertData extends IInterface
{
  public abstract IObjectWrapper getBytesWrapped();

  public abstract int getHashCode();

  public static abstract class Stub extends zzb
    implements ICertData
  {
    public Stub()
    {
      super();
    }

    public static ICertData asInterface(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        paramIBinder = null;
      while (true)
      {
        return paramIBinder;
        IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        if ((localIInterface instanceof ICertData))
          paramIBinder = (ICertData)localIInterface;
        else
          paramIBinder = new Proxy(paramIBinder);
      }
    }

    public boolean dispatchTransaction(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      boolean bool;
      switch (paramInt1)
      {
      default:
        bool = false;
        return bool;
      case 1:
        paramParcel1 = getBytesWrapped();
        paramParcel2.writeNoException();
        zzc.zza(paramParcel2, paramParcel1);
      case 2:
      }
      while (true)
      {
        bool = true;
        break;
        paramInt1 = getHashCode();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
      }
    }

    public static class Proxy extends zza
      implements ICertData
    {
      Proxy(IBinder paramIBinder)
      {
        super("com.google.android.gms.common.internal.ICertData");
      }

      public IObjectWrapper getBytesWrapped()
      {
        AppMethodBeat.i(89668);
        Parcel localParcel = transactAndReadException(1, obtainAndWriteInterfaceToken());
        IObjectWrapper localIObjectWrapper = IObjectWrapper.Stub.asInterface(localParcel.readStrongBinder());
        localParcel.recycle();
        AppMethodBeat.o(89668);
        return localIObjectWrapper;
      }

      public int getHashCode()
      {
        AppMethodBeat.i(89669);
        Parcel localParcel = transactAndReadException(2, obtainAndWriteInterfaceToken());
        int i = localParcel.readInt();
        localParcel.recycle();
        AppMethodBeat.o(89669);
        return i;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.ICertData
 * JD-Core Version:    0.6.2
 */