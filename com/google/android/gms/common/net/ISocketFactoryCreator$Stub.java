package com.google.android.gms.common.net;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.internal.stable.zzb;
import com.google.android.gms.internal.stable.zzc;

public abstract class ISocketFactoryCreator$Stub extends zzb
  implements ISocketFactoryCreator
{
  public ISocketFactoryCreator$Stub()
  {
    super("com.google.android.gms.common.net.ISocketFactoryCreator");
  }

  public static ISocketFactoryCreator asInterface(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      paramIBinder = null;
    while (true)
    {
      return paramIBinder;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.common.net.ISocketFactoryCreator");
      if ((localIInterface instanceof ISocketFactoryCreator))
        paramIBinder = (ISocketFactoryCreator)localIInterface;
      else
        paramIBinder = new ISocketFactoryCreator.Stub.Proxy(paramIBinder);
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
      paramParcel1 = newSocketFactory(IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder()), IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder()), IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder()), zzc.zza(paramParcel1));
      paramParcel2.writeNoException();
      zzc.zza(paramParcel2, paramParcel1);
    case 2:
    }
    while (true)
    {
      bool = true;
      break;
      paramParcel1 = newSocketFactoryWithCacheDir(IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder()), IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder()), IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      zzc.zza(paramParcel2, paramParcel1);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.net.ISocketFactoryCreator.Stub
 * JD-Core Version:    0.6.2
 */