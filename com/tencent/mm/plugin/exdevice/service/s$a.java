package com.tencent.mm.plugin.exdevice.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class s$a extends Binder
  implements s
{
  public s$a()
  {
    attachInterface(this, "com.tencent.mm.plugin.exdevice.service.ISimpleBTOnRecv_AIDL");
  }

  public IBinder asBinder()
  {
    return this;
  }

  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    boolean bool = true;
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
      paramParcel2.writeString("com.tencent.mm.plugin.exdevice.service.ISimpleBTOnRecv_AIDL");
      continue;
      paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.ISimpleBTOnRecv_AIDL");
      c(paramParcel1.readLong(), paramParcel1.createByteArray());
      paramParcel2.writeNoException();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.service.s.a
 * JD-Core Version:    0.6.2
 */