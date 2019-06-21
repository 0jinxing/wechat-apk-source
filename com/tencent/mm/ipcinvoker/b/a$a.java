package com.tencent.mm.ipcinvoker.b;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class a$a extends Binder
  implements a
{
  public a$a()
  {
    attachInterface(this, "com.tencent.mm.ipcinvoker.aidl.AIDL_IPCInvokeBridge");
  }

  public static a k(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      paramIBinder = null;
    while (true)
    {
      return paramIBinder;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.mm.ipcinvoker.aidl.AIDL_IPCInvokeBridge");
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
    Object localObject = null;
    boolean bool;
    switch (paramInt1)
    {
    default:
    case 1598968902:
      for (bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2); ; bool = true)
      {
        return bool;
        paramParcel2.writeString("com.tencent.mm.ipcinvoker.aidl.AIDL_IPCInvokeBridge");
      }
    case 1:
      paramParcel1.enforceInterface("com.tencent.mm.ipcinvoker.aidl.AIDL_IPCInvokeBridge");
      label92: String str;
      if (paramParcel1.readInt() != 0)
      {
        paramParcel2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        str = paramParcel1.readString();
        paramParcel1 = paramParcel1.readStrongBinder();
        if (paramParcel1 != null)
          break label129;
        paramParcel1 = (Parcel)localObject;
      }
      while (true)
      {
        a(paramParcel2, str, paramParcel1);
        bool = true;
        break;
        paramParcel2 = null;
        break label92;
        label129: localObject = paramParcel1.queryLocalInterface("com.tencent.mm.ipcinvoker.aidl.AIDL_IPCInvokeCallback");
        if ((localObject != null) && ((localObject instanceof b)))
          paramParcel1 = (b)localObject;
        else
          paramParcel1 = new b.a.a(paramParcel1);
      }
    case 2:
    }
    paramParcel1.enforceInterface("com.tencent.mm.ipcinvoker.aidl.AIDL_IPCInvokeBridge");
    if (paramParcel1.readInt() != 0)
    {
      localObject = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      label200: paramParcel1 = f((Bundle)localObject, paramParcel1.readString());
      paramParcel2.writeNoException();
      if (paramParcel1 == null)
        break label242;
      paramParcel2.writeInt(1);
      paramParcel1.writeToParcel(paramParcel2, 1);
    }
    while (true)
    {
      bool = true;
      break;
      localObject = null;
      break label200;
      label242: paramParcel2.writeInt(0);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ipcinvoker.b.a.a
 * JD-Core Version:    0.6.2
 */