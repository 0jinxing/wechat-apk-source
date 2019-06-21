package com.tencent.mm.plugin.talkroom.component;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class a$a extends Binder
  implements a
{
  public a$a()
  {
    attachInterface(this, "com.tencent.mm.plugin.talkroom.component.IEngine_AIDL");
  }

  public static a C(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      paramIBinder = null;
    while (true)
    {
      return paramIBinder;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.mm.plugin.talkroom.component.IEngine_AIDL");
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
    boolean bool;
    Object localObject;
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
      while (true)
      {
        return bool;
        paramParcel2.writeString("com.tencent.mm.plugin.talkroom.component.IEngine_AIDL");
        bool = true;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.plugin.talkroom.component.IEngine_AIDL");
        paramInt1 = cEb();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        bool = true;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.plugin.talkroom.component.IEngine_AIDL");
        paramInt1 = uninitLive();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        bool = true;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.plugin.talkroom.component.IEngine_AIDL");
        localObject = paramParcel1.readStrongBinder();
        if (localObject == null)
          localObject = null;
        while (true)
        {
          paramInt1 = a((b)localObject, paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readLong(), paramParcel1.createIntArray(), paramParcel1.createIntArray(), paramParcel1.readInt());
          paramParcel2.writeNoException();
          paramParcel2.writeInt(paramInt1);
          bool = true;
          break;
          IInterface localIInterface = ((IBinder)localObject).queryLocalInterface("com.tencent.mm.plugin.talkroom.component.ILiveConEngineCallback_AIDL");
          if ((localIInterface != null) && ((localIInterface instanceof b)))
            localObject = (b)localIInterface;
          else
            localObject = new b.a.a((IBinder)localObject);
        }
        paramParcel1.enforceInterface("com.tencent.mm.plugin.talkroom.component.IEngine_AIDL");
        paramInt1 = SetCurrentMicId(paramParcel1.readInt());
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        bool = true;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.plugin.talkroom.component.IEngine_AIDL");
        paramInt1 = Close();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        bool = true;
      }
    case 6:
      paramParcel1.enforceInterface("com.tencent.mm.plugin.talkroom.component.IEngine_AIDL");
      paramInt1 = paramParcel1.readInt();
      if (paramInt1 < 0);
      for (localObject = null; ; localObject = new int[paramInt1])
      {
        paramParcel1 = e((int[])localObject, paramParcel1.readString());
        paramParcel2.writeNoException();
        paramParcel2.writeByteArray(paramParcel1);
        paramParcel2.writeIntArray((int[])localObject);
        bool = true;
        break;
      }
    case 7:
      paramParcel1.enforceInterface("com.tencent.mm.plugin.talkroom.component.IEngine_AIDL");
      localObject = paramParcel1.readStrongBinder();
      if (localObject == null)
      {
        paramParcel1 = null;
        label413: paramParcel1 = a(paramParcel1);
        paramParcel2.writeNoException();
        if (paramParcel1 == null)
          break label487;
      }
      label487: for (paramParcel1 = paramParcel1.asBinder(); ; paramParcel1 = null)
      {
        paramParcel2.writeStrongBinder(paramParcel1);
        bool = true;
        break;
        paramParcel1 = ((IBinder)localObject).queryLocalInterface("com.tencent.mm.plugin.talkroom.component.IMemberUpdateCallback_AIDL");
        if ((paramParcel1 != null) && ((paramParcel1 instanceof c)))
        {
          paramParcel1 = (c)paramParcel1;
          break label413;
        }
        paramParcel1 = new c.a.a((IBinder)localObject);
        break label413;
      }
    case 8:
    }
    paramParcel1.enforceInterface("com.tencent.mm.plugin.talkroom.component.IEngine_AIDL");
    paramParcel1 = cEc();
    paramParcel2.writeNoException();
    if (paramParcel1 != null);
    for (paramParcel1 = paramParcel1.asBinder(); ; paramParcel1 = null)
    {
      paramParcel2.writeStrongBinder(paramParcel1);
      bool = true;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.talkroom.component.a.a
 * JD-Core Version:    0.6.2
 */