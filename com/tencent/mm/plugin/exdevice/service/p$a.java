package com.tencent.mm.plugin.exdevice.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class p$a extends Binder
  implements p
{
  public p$a()
  {
    attachInterface(this, "com.tencent.mm.plugin.exdevice.service.IExDeviceTask_AIDL");
  }

  public static p A(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      paramIBinder = null;
    while (true)
    {
      return paramIBinder;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.mm.plugin.exdevice.service.IExDeviceTask_AIDL");
      if ((localIInterface != null) && ((localIInterface instanceof p)))
        paramIBinder = (p)localIInterface;
      else
        paramIBinder = new p.a.a(paramIBinder);
    }
  }

  public IBinder asBinder()
  {
    return this;
  }

  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    o localo = null;
    l locall = null;
    boolean bool;
    switch (paramInt1)
    {
    default:
      bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
    case 1:
    case 2:
    }
    while (true)
    {
      return bool;
      paramParcel2.writeString("com.tencent.mm.plugin.exdevice.service.IExDeviceTask_AIDL");
      bool = true;
      continue;
      paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IExDeviceTask_AIDL");
      localo = bpu();
      paramParcel2.writeNoException();
      paramParcel1 = locall;
      if (localo != null)
        paramParcel1 = localo.asBinder();
      paramParcel2.writeStrongBinder(paramParcel1);
      bool = true;
      continue;
      paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IExDeviceTask_AIDL");
      locall = bpv();
      paramParcel2.writeNoException();
      paramParcel1 = localo;
      if (locall != null)
        paramParcel1 = locall.asBinder();
      paramParcel2.writeStrongBinder(paramParcel1);
      bool = true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.service.p.a
 * JD-Core Version:    0.6.2
 */