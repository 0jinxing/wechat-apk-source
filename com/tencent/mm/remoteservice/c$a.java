package com.tencent.mm.remoteservice;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class c$a extends Binder
  implements c
{
  public c$a()
  {
    attachInterface(this, "com.tencent.mm.remoteservice.ICommRemoteServer");
  }

  public static c L(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      paramIBinder = null;
    while (true)
    {
      return paramIBinder;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.mm.remoteservice.ICommRemoteServer");
      if ((localIInterface != null) && ((localIInterface instanceof c)))
        paramIBinder = (c)localIInterface;
      else
        paramIBinder = new c.a.a(paramIBinder);
    }
  }

  public IBinder asBinder()
  {
    return this;
  }

  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    boolean bool;
    switch (paramInt1)
    {
    default:
    case 1598968902:
      for (bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2); ; bool = true)
      {
        return bool;
        paramParcel2.writeString("com.tencent.mm.remoteservice.ICommRemoteServer");
      }
    case 1:
    }
    paramParcel1.enforceInterface("com.tencent.mm.remoteservice.ICommRemoteServer");
    String str1 = paramParcel1.readString();
    String str2 = paramParcel1.readString();
    Bundle localBundle;
    if (paramParcel1.readInt() != 0)
    {
      localBundle = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      label93: a(str1, str2, localBundle, b.a.asInterface(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      if (localBundle == null)
        break label143;
      paramParcel2.writeInt(1);
      localBundle.writeToParcel(paramParcel2, 1);
    }
    while (true)
    {
      bool = true;
      break;
      localBundle = null;
      break label93;
      label143: paramParcel2.writeInt(0);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.remoteservice.c.a
 * JD-Core Version:    0.6.2
 */