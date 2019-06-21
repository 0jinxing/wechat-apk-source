package com.tencent.mm.plugin.exdevice.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class o$a extends Binder
  implements o
{
  public o$a()
  {
    attachInterface(this, "com.tencent.mm.plugin.exdevice.service.IExDeviceTaskReq_AIDL");
  }

  public static o z(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      paramIBinder = null;
    while (true)
    {
      return paramIBinder;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.mm.plugin.exdevice.service.IExDeviceTaskReq_AIDL");
      if ((localIInterface != null) && ((localIInterface instanceof o)))
        paramIBinder = (o)localIInterface;
      else
        paramIBinder = new o.a.a(paramIBinder);
    }
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
    case 2:
    case 3:
    case 4:
    case 5:
    }
    while (true)
    {
      return bool;
      paramParcel2.writeString("com.tencent.mm.plugin.exdevice.service.IExDeviceTaskReq_AIDL");
      continue;
      paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IExDeviceTaskReq_AIDL");
      long l = bpp();
      paramParcel2.writeNoException();
      paramParcel2.writeLong(l);
      continue;
      paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IExDeviceTaskReq_AIDL");
      paramParcel1 = bpq();
      paramParcel2.writeNoException();
      paramParcel2.writeByteArray(paramParcel1);
      continue;
      paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IExDeviceTaskReq_AIDL");
      paramInt1 = bpr();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(paramInt1);
      continue;
      paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IExDeviceTaskReq_AIDL");
      paramInt1 = bps();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(paramInt1);
      continue;
      paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IExDeviceTaskReq_AIDL");
      paramInt1 = bpt();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(paramInt1);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.service.o.a
 * JD-Core Version:    0.6.2
 */