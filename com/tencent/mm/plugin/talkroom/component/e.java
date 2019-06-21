package com.tencent.mm.plugin.talkroom.component;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract interface e extends IInterface
{
  public abstract int cEe();

  public abstract void cEf();

  public abstract void cpN();

  public abstract void release();

  public abstract void start();

  public static abstract class a extends Binder
    implements e
  {
    public a()
    {
      attachInterface(this, "com.tencent.mm.plugin.talkroom.component.ITalkRoomPlayer_AIDL");
    }

    public static e E(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        paramIBinder = null;
      while (true)
      {
        return paramIBinder;
        IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.mm.plugin.talkroom.component.ITalkRoomPlayer_AIDL");
        if ((localIInterface != null) && ((localIInterface instanceof e)))
          paramIBinder = (e)localIInterface;
        else
          paramIBinder = new e.a.a(paramIBinder);
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
        paramParcel2.writeString("com.tencent.mm.plugin.talkroom.component.ITalkRoomPlayer_AIDL");
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.plugin.talkroom.component.ITalkRoomPlayer_AIDL");
        cpN();
        paramParcel2.writeNoException();
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.plugin.talkroom.component.ITalkRoomPlayer_AIDL");
        cEf();
        paramParcel2.writeNoException();
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.plugin.talkroom.component.ITalkRoomPlayer_AIDL");
        release();
        paramParcel2.writeNoException();
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.plugin.talkroom.component.ITalkRoomPlayer_AIDL");
        paramInt1 = cEe();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.plugin.talkroom.component.ITalkRoomPlayer_AIDL");
        start();
        paramParcel2.writeNoException();
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.talkroom.component.e
 * JD-Core Version:    0.6.2
 */