package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.internal.stable.zza;
import com.google.android.gms.internal.stable.zzb;
import com.google.android.gms.internal.stable.zzc;
import com.tencent.matrix.trace.core.AppMethodBeat;

public abstract interface IDynamiteLoaderV2 extends IInterface
{
  public abstract IObjectWrapper loadModule(IObjectWrapper paramIObjectWrapper, String paramString, byte[] paramArrayOfByte);

  public abstract IObjectWrapper loadModule2(IObjectWrapper paramIObjectWrapper1, String paramString, int paramInt, IObjectWrapper paramIObjectWrapper2);

  public static abstract class Stub extends zzb
    implements IDynamiteLoaderV2
  {
    public Stub()
    {
      super();
    }

    public static IDynamiteLoaderV2 asInterface(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        paramIBinder = null;
      while (true)
      {
        return paramIBinder;
        IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
        if ((localIInterface instanceof IDynamiteLoaderV2))
          paramIBinder = (IDynamiteLoaderV2)localIInterface;
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
        paramParcel1 = loadModule(IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.createByteArray());
        paramParcel2.writeNoException();
        zzc.zza(paramParcel2, paramParcel1);
      case 2:
      }
      while (true)
      {
        bool = true;
        break;
        paramParcel1 = loadModule2(IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readInt(), IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        zzc.zza(paramParcel2, paramParcel1);
      }
    }

    public static class Proxy extends zza
      implements IDynamiteLoaderV2
    {
      Proxy(IBinder paramIBinder)
      {
        super("com.google.android.gms.dynamite.IDynamiteLoaderV2");
      }

      public IObjectWrapper loadModule(IObjectWrapper paramIObjectWrapper, String paramString, byte[] paramArrayOfByte)
      {
        AppMethodBeat.i(90446);
        Parcel localParcel = obtainAndWriteInterfaceToken();
        zzc.zza(localParcel, paramIObjectWrapper);
        localParcel.writeString(paramString);
        localParcel.writeByteArray(paramArrayOfByte);
        paramString = transactAndReadException(1, localParcel);
        paramIObjectWrapper = IObjectWrapper.Stub.asInterface(paramString.readStrongBinder());
        paramString.recycle();
        AppMethodBeat.o(90446);
        return paramIObjectWrapper;
      }

      public IObjectWrapper loadModule2(IObjectWrapper paramIObjectWrapper1, String paramString, int paramInt, IObjectWrapper paramIObjectWrapper2)
      {
        AppMethodBeat.i(90447);
        Parcel localParcel = obtainAndWriteInterfaceToken();
        zzc.zza(localParcel, paramIObjectWrapper1);
        localParcel.writeString(paramString);
        localParcel.writeInt(paramInt);
        zzc.zza(localParcel, paramIObjectWrapper2);
        paramString = transactAndReadException(2, localParcel);
        paramIObjectWrapper1 = IObjectWrapper.Stub.asInterface(paramString.readStrongBinder());
        paramString.recycle();
        AppMethodBeat.o(90447);
        return paramIObjectWrapper1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.dynamite.IDynamiteLoaderV2
 * JD-Core Version:    0.6.2
 */