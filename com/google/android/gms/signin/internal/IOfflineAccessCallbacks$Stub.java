package com.google.android.gms.signin.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.stable.zzb;

public abstract class IOfflineAccessCallbacks$Stub extends zzb
  implements IOfflineAccessCallbacks
{
  public IOfflineAccessCallbacks$Stub()
  {
    super("com.google.android.gms.signin.internal.IOfflineAccessCallbacks");
  }

  public static IOfflineAccessCallbacks asInterface(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      paramIBinder = null;
    while (true)
    {
      return paramIBinder;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.signin.internal.IOfflineAccessCallbacks");
      if ((localIInterface instanceof IOfflineAccessCallbacks))
        paramIBinder = (IOfflineAccessCallbacks)localIInterface;
      else
        paramIBinder = new IOfflineAccessCallbacks.Stub.Proxy(paramIBinder);
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
    case 2:
      checkServerAuthorization(paramParcel1.readString(), paramParcel1.createTypedArrayList(Scope.CREATOR), ISignInService.Stub.asInterface(paramParcel1.readStrongBinder()));
    case 3:
    }
    while (true)
    {
      paramParcel2.writeNoException();
      bool = true;
      break;
      uploadServerAuthCode(paramParcel1.readString(), paramParcel1.readString(), ISignInService.Stub.asInterface(paramParcel1.readStrongBinder()));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.gms.signin.internal.IOfflineAccessCallbacks.Stub
 * JD-Core Version:    0.6.2
 */