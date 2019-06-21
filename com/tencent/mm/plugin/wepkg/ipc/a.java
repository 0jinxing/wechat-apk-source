package com.tencent.mm.plugin.wepkg.ipc;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract interface a extends IInterface
{
  public abstract void r(Message paramMessage);

  public abstract void x(Bundle paramBundle);

  public static abstract class a extends Binder
    implements a
  {
    public a()
    {
      attachInterface(this, "com.tencent.mm.plugin.wepkg.ipc.IWepkgMainProcessService");
    }

    public static a I(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        paramIBinder = null;
      while (true)
      {
        return paramIBinder;
        IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.mm.plugin.wepkg.ipc.IWepkgMainProcessService");
        if ((localIInterface != null) && ((localIInterface instanceof a)))
          paramIBinder = (a)localIInterface;
        else
          paramIBinder = new a.a.a(paramIBinder);
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
      boolean bool;
      switch (paramInt1)
      {
      default:
        bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      case 1598968902:
      case 1:
        while (true)
        {
          return bool;
          paramParcel2.writeString("com.tencent.mm.plugin.wepkg.ipc.IWepkgMainProcessService");
          bool = true;
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.plugin.wepkg.ipc.IWepkgMainProcessService");
          paramParcel2 = (Parcel)localObject2;
          if (paramParcel1.readInt() != 0)
            paramParcel2 = (Message)Message.CREATOR.createFromParcel(paramParcel1);
          r(paramParcel2);
          bool = true;
        }
      case 2:
      }
      paramParcel1.enforceInterface("com.tencent.mm.plugin.wepkg.ipc.IWepkgMainProcessService");
      localObject2 = localObject1;
      if (paramParcel1.readInt() != 0)
        localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      x((Bundle)localObject2);
      paramParcel2.writeNoException();
      if (localObject2 != null)
      {
        paramParcel2.writeInt(1);
        ((Bundle)localObject2).writeToParcel(paramParcel2, 1);
      }
      while (true)
      {
        bool = true;
        break;
        paramParcel2.writeInt(0);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wepkg.ipc.a
 * JD-Core Version:    0.6.2
 */