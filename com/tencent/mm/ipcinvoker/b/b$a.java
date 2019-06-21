package com.tencent.mm.ipcinvoker.b;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class b$a extends Binder
  implements b
{
  public b$a()
  {
    attachInterface(this, "com.tencent.mm.ipcinvoker.aidl.AIDL_IPCInvokeCallback");
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
    case 1598968902:
      for (bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2); ; bool = true)
      {
        return bool;
        paramParcel2.writeString("com.tencent.mm.ipcinvoker.aidl.AIDL_IPCInvokeCallback");
      }
    case 1:
    }
    paramParcel1.enforceInterface("com.tencent.mm.ipcinvoker.aidl.AIDL_IPCInvokeCallback");
    if (paramParcel1.readInt() != 0);
    for (paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; paramParcel1 = null)
    {
      l(paramParcel1);
      paramParcel2.writeNoException();
      bool = true;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ipcinvoker.b.b.a
 * JD-Core Version:    0.6.2
 */