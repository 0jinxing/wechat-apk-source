package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.internal.stable.zzb;
import com.google.android.gms.internal.stable.zzc;

public abstract class ISignInButtonCreator$Stub extends zzb
  implements ISignInButtonCreator
{
  public ISignInButtonCreator$Stub()
  {
    super("com.google.android.gms.common.internal.ISignInButtonCreator");
  }

  public static ISignInButtonCreator asInterface(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      paramIBinder = null;
    while (true)
    {
      return paramIBinder;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
      if ((localIInterface instanceof ISignInButtonCreator))
        paramIBinder = (ISignInButtonCreator)localIInterface;
      else
        paramIBinder = new ISignInButtonCreator.Stub.Proxy(paramIBinder);
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
      paramParcel1 = newSignInButton(IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readInt());
      paramParcel2.writeNoException();
      zzc.zza(paramParcel2, paramParcel1);
    case 2:
    }
    while (true)
    {
      bool = true;
      break;
      paramParcel1 = newSignInButtonFromConfig(IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder()), (SignInButtonConfig)zzc.zza(paramParcel1, SignInButtonConfig.CREATOR));
      paramParcel2.writeNoException();
      zzc.zza(paramParcel2, paramParcel1);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.ISignInButtonCreator.Stub
 * JD-Core Version:    0.6.2
 */