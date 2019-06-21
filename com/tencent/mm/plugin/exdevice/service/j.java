package com.tencent.mm.plugin.exdevice.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract interface j extends IInterface
{
  public abstract void a(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3, int paramInt3, byte[] paramArrayOfByte);

  public static abstract class a extends Binder
    implements j
  {
    public a()
    {
      attachInterface(this, "com.tencent.mm.plugin.exdevice.service.IBTOnScanCallback_AIDL");
    }

    public static j w(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        paramIBinder = null;
      while (true)
      {
        return paramIBinder;
        IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.mm.plugin.exdevice.service.IBTOnScanCallback_AIDL");
        if ((localIInterface != null) && ((localIInterface instanceof j)))
          paramIBinder = (j)localIInterface;
        else
          paramIBinder = new j.a.a(paramIBinder);
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
        bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      case 1598968902:
      case 1:
      }
      while (true)
      {
        return bool;
        paramParcel2.writeString("com.tencent.mm.plugin.exdevice.service.IBTOnScanCallback_AIDL");
        bool = true;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IBTOnScanCallback_AIDL");
        a(paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readInt(), paramParcel1.createByteArray());
        paramParcel2.writeNoException();
        bool = true;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.service.j
 * JD-Core Version:    0.6.2
 */