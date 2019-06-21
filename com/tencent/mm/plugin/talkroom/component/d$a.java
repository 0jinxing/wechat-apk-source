package com.tencent.mm.plugin.talkroom.component;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class d$a extends Binder
  implements d
{
  public d$a()
  {
    attachInterface(this, "com.tencent.mm.plugin.talkroom.component.IMicRecoder_AIDL");
  }

  public static d D(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      paramIBinder = null;
    while (true)
    {
      return paramIBinder;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.mm.plugin.talkroom.component.IMicRecoder_AIDL");
      if ((localIInterface != null) && ((localIInterface instanceof d)))
        paramIBinder = (d)localIInterface;
      else
        paramIBinder = new d.a.a(paramIBinder);
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
      paramParcel2.writeString("com.tencent.mm.plugin.talkroom.component.IMicRecoder_AIDL");
      continue;
      paramParcel1.enforceInterface("com.tencent.mm.plugin.talkroom.component.IMicRecoder_AIDL");
      cEd();
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.tencent.mm.plugin.talkroom.component.IMicRecoder_AIDL");
      akw();
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.tencent.mm.plugin.talkroom.component.IMicRecoder_AIDL");
      release();
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.tencent.mm.plugin.talkroom.component.IMicRecoder_AIDL");
      paramInt1 = cEe();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(paramInt1);
      continue;
      paramParcel1.enforceInterface("com.tencent.mm.plugin.talkroom.component.IMicRecoder_AIDL");
      start();
      paramParcel2.writeNoException();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.talkroom.component.d.a
 * JD-Core Version:    0.6.2
 */