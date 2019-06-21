package com.tencent.mm.plugin.exdevice.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract interface l extends IInterface
{
  public abstract void a(long paramLong, int paramInt1, int paramInt2, String paramString, p paramp);

  public static abstract class a extends Binder
    implements l
  {
    public a()
    {
      attachInterface(this, "com.tencent.mm.plugin.exdevice.service.IBTOnTaskEnd_AIDL");
    }

    public static l y(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        paramIBinder = null;
      while (true)
      {
        return paramIBinder;
        IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.mm.plugin.exdevice.service.IBTOnTaskEnd_AIDL");
        if ((localIInterface != null) && ((localIInterface instanceof l)))
          paramIBinder = (l)localIInterface;
        else
          paramIBinder = new l.a.a(paramIBinder);
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
      }
      while (true)
      {
        return bool;
        paramParcel2.writeString("com.tencent.mm.plugin.exdevice.service.IBTOnTaskEnd_AIDL");
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IBTOnTaskEnd_AIDL");
        a(paramParcel1.readLong(), paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readString(), p.a.A(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.service.l
 * JD-Core Version:    0.6.2
 */