package com.tencent.mm.plugin.exdevice.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class h$a extends Binder
  implements h
{
  public h$a()
  {
    attachInterface(this, "com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
  }

  public static h u(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      paramIBinder = null;
    while (true)
    {
      return paramIBinder;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
      if ((localIInterface != null) && ((localIInterface instanceof h)))
        paramIBinder = (h)localIInterface;
      else
        paramIBinder = new h.a.a(paramIBinder);
    }
  }

  public IBinder asBinder()
  {
    return this;
  }

  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = null;
    Object localObject4 = null;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    int i5 = 0;
    int i6 = 0;
    int i7 = 0;
    int i8 = 0;
    int i9 = 0;
    boolean bool1 = true;
    boolean bool2;
    switch (paramInt1)
    {
    default:
      bool2 = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
    case 10:
    case 11:
    case 12:
    case 13:
    case 14:
    case 15:
    case 16:
    case 17:
      while (true)
      {
        return bool2;
        paramParcel2.writeString("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
        bool2 = bool1;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
        bool2 = b(paramParcel1.readInt(), j.a.w(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        if (bool2);
        for (paramInt1 = 1; ; paramInt1 = 0)
        {
          paramParcel2.writeInt(paramInt1);
          bool2 = bool1;
          break;
        }
        paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
        bool2 = c(paramParcel1.readInt(), j.a.w(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        paramInt1 = i9;
        if (bool2)
          paramInt1 = 1;
        paramParcel2.writeInt(paramInt1);
        bool2 = bool1;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
        paramParcel1 = bpl();
        paramParcel2.writeNoException();
        paramParcel2.writeLongArray(paramParcel1);
        bool2 = bool1;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
        bool2 = a(paramParcel1.readLong(), paramParcel1.readInt(), k.a.x(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        paramInt1 = i;
        if (bool2)
          paramInt1 = 1;
        paramParcel2.writeInt(paramInt1);
        bool2 = bool1;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
        bool2 = hZ(paramParcel1.readLong());
        paramParcel2.writeNoException();
        paramInt1 = j;
        if (bool2)
          paramInt1 = 1;
        paramParcel2.writeInt(paramInt1);
        bool2 = bool1;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
        bool2 = ia(paramParcel1.readLong());
        paramParcel2.writeNoException();
        paramInt1 = k;
        if (bool2)
          paramInt1 = 1;
        paramParcel2.writeInt(paramInt1);
        bool2 = bool1;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
        l = a(p.a.A(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        paramParcel2.writeLong(l);
        bool2 = bool1;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
        bool2 = ib(paramParcel1.readLong());
        paramParcel2.writeNoException();
        paramInt1 = m;
        if (bool2)
          paramInt1 = 1;
        paramParcel2.writeInt(paramInt1);
        bool2 = bool1;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
        bool2 = a(i.a.v(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        paramInt1 = n;
        if (bool2)
          paramInt1 = 1;
        paramParcel2.writeInt(paramInt1);
        bool2 = bool1;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
        bool2 = b(i.a.v(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        paramInt1 = i1;
        if (bool2)
          paramInt1 = 1;
        paramParcel2.writeInt(paramInt1);
        bool2 = bool1;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
        paramParcel1 = paramParcel1.readStrongBinder();
        if (paramParcel1 == null)
          paramParcel1 = localObject4;
        while (true)
        {
          a(paramParcel1);
          paramParcel2.writeNoException();
          bool2 = bool1;
          break;
          localObject1 = paramParcel1.queryLocalInterface("com.tencent.mm.plugin.exdevice.service.IExDeviceInvoker_AIDL");
          if ((localObject1 != null) && ((localObject1 instanceof n)))
            paramParcel1 = (n)localObject1;
          else
            paramParcel1 = new n.a.a(paramParcel1);
        }
        paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
        setChannelSessionKey(paramParcel1.readLong(), paramParcel1.createByteArray());
        paramParcel2.writeNoException();
        bool2 = bool1;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
        localObject3 = paramParcel1.readString();
        if (paramParcel1.readInt() != 0)
        {
          bool2 = true;
          paramParcel1 = paramParcel1.readStrongBinder();
          if (paramParcel1 != null)
            break label871;
          paramParcel1 = (Parcel)localObject1;
        }
        while (true)
        {
          bool2 = a((String)localObject3, bool2, paramParcel1);
          paramParcel2.writeNoException();
          paramInt1 = i2;
          if (bool2)
            paramInt1 = 1;
          paramParcel2.writeInt(paramInt1);
          bool2 = bool1;
          break;
          bool2 = false;
          break label816;
          localObject1 = paramParcel1.queryLocalInterface("com.tencent.mm.plugin.exdevice.service.IIBeaconCallback_AIDL");
          if ((localObject1 != null) && ((localObject1 instanceof q)))
            paramParcel1 = (q)localObject1;
          else
            paramParcel1 = new q.a.a(paramParcel1);
        }
        paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
        bool2 = d(paramParcel1.readInt(), j.a.w(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        paramInt1 = i3;
        if (bool2)
          paramInt1 = 1;
        paramParcel2.writeInt(paramInt1);
        bool2 = bool1;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
        bool2 = e(paramParcel1.readInt(), j.a.w(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        paramInt1 = i4;
        if (bool2)
          paramInt1 = 1;
        paramParcel2.writeInt(paramInt1);
        bool2 = bool1;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
        bool2 = b(paramParcel1.readLong(), paramParcel1.readInt(), k.a.x(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        paramInt1 = i5;
        if (bool2)
          paramInt1 = 1;
        paramParcel2.writeInt(paramInt1);
        bool2 = bool1;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
        bool2 = ic(paramParcel1.readLong());
        paramParcel2.writeNoException();
        paramInt1 = i6;
        if (bool2)
          paramInt1 = 1;
        paramParcel2.writeInt(paramInt1);
        bool2 = bool1;
      }
    case 18:
      label816: label871: paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
      paramParcel1 = paramParcel1.readStrongBinder();
      if (paramParcel1 == null)
        paramParcel1 = localObject2;
      while (true)
      {
        bool2 = a(paramParcel1);
        paramParcel2.writeNoException();
        paramInt1 = i7;
        if (bool2)
          paramInt1 = 1;
        paramParcel2.writeInt(paramInt1);
        bool2 = bool1;
        break;
        localObject1 = paramParcel1.queryLocalInterface("com.tencent.mm.plugin.exdevice.service.ISimpleBTOnRecv_AIDL");
        if ((localObject1 != null) && ((localObject1 instanceof s)))
          paramParcel1 = (s)localObject1;
        else
          paramParcel1 = new s.a.a(paramParcel1);
      }
    case 19:
    }
    paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
    long l = paramParcel1.readLong();
    localObject1 = paramParcel1.createByteArray();
    paramParcel1 = paramParcel1.readStrongBinder();
    if (paramParcel1 == null)
      paramParcel1 = (Parcel)localObject3;
    while (true)
    {
      bool2 = b(l, (byte[])localObject1, paramParcel1);
      paramParcel2.writeNoException();
      paramInt1 = i8;
      if (bool2)
        paramInt1 = 1;
      paramParcel2.writeInt(paramInt1);
      bool2 = bool1;
      break;
      localObject3 = paramParcel1.queryLocalInterface("com.tencent.mm.plugin.exdevice.service.ISimpleBTOnSendEnd_AIDL");
      if ((localObject3 != null) && ((localObject3 instanceof t)))
        paramParcel1 = (t)localObject3;
      else
        paramParcel1 = new t.a.a(paramParcel1);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.service.h.a
 * JD-Core Version:    0.6.2
 */