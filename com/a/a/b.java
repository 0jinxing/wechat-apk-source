package com.a.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract interface b extends IInterface
{
  public abstract void b(int paramInt1, int paramInt2, int paramInt3, byte[] paramArrayOfByte);

  public static abstract class a extends Binder
    implements b
  {
    public a()
    {
      attachInterface(this, "com.huawei.securitymgr.IAuthenticationClient");
    }

    public static b h(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        paramIBinder = null;
      while (true)
      {
        return paramIBinder;
        IInterface localIInterface = paramIBinder.queryLocalInterface("com.huawei.securitymgr.IAuthenticationClient");
        if ((localIInterface != null) && ((localIInterface instanceof b)))
          paramIBinder = (b)localIInterface;
        else
          paramIBinder = new b.a.a(paramIBinder);
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
        paramParcel2.writeString("com.huawei.securitymgr.IAuthenticationClient");
        continue;
        paramParcel1.enforceInterface("com.huawei.securitymgr.IAuthenticationClient");
        b(paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.createByteArray());
        paramParcel2.writeNoException();
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.a.a.b
 * JD-Core Version:    0.6.2
 */