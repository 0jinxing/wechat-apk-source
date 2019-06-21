package com.tencent.mm.plugin.exdevice.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class q$a extends Binder
  implements q
{
  public q$a()
  {
    attachInterface(this, "com.tencent.mm.plugin.exdevice.service.IIBeaconCallback_AIDL");
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
      bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
    case 1:
    }
    while (true)
    {
      return bool;
      paramParcel2.writeString("com.tencent.mm.plugin.exdevice.service.IIBeaconCallback_AIDL");
      bool = true;
      continue;
      paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IIBeaconCallback_AIDL");
      a(paramParcel1.readDouble(), paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.createByteArray(), paramParcel1.readDouble(), paramParcel1.readInt(), paramParcel1.readString());
      paramParcel2.writeNoException();
      bool = true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.service.q.a
 * JD-Core Version:    0.6.2
 */