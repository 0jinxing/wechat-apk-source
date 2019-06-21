package com.tencent.mm.plugin.exdevice.service;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class n$a extends Binder
  implements n
{
  public n$a()
  {
    attachInterface(this, "com.tencent.mm.plugin.exdevice.service.IExDeviceInvoker_AIDL");
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
        paramParcel2.writeString("com.tencent.mm.plugin.exdevice.service.IExDeviceInvoker_AIDL");
      }
    case 1:
    }
    paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IExDeviceInvoker_AIDL");
    paramInt1 = paramParcel1.readInt();
    if (paramParcel1.readInt() != 0)
    {
      paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      label85: paramParcel1 = k(paramInt1, paramParcel1);
      paramParcel2.writeNoException();
      if (paramParcel1 == null)
        break label122;
      paramParcel2.writeInt(1);
      paramParcel1.writeToParcel(paramParcel2, 1);
    }
    while (true)
    {
      bool = true;
      break;
      paramParcel1 = null;
      break label85;
      label122: paramParcel2.writeInt(0);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.service.n.a
 * JD-Core Version:    0.6.2
 */