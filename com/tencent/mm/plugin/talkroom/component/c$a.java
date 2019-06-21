package com.tencent.mm.plugin.talkroom.component;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class c$a extends Binder
  implements c
{
  public c$a()
  {
    attachInterface(this, "com.tencent.mm.plugin.talkroom.component.IMemberUpdateCallback_AIDL");
  }

  public IBinder asBinder()
  {
    return this;
  }

  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    boolean bool1 = true;
    switch (paramInt1)
    {
    default:
    case 1598968902:
      for (bool2 = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2); ; bool2 = bool1)
      {
        return bool2;
        paramParcel2.writeString("com.tencent.mm.plugin.talkroom.component.IMemberUpdateCallback_AIDL");
      }
    case 1:
    }
    paramParcel1.enforceInterface("com.tencent.mm.plugin.talkroom.component.IMemberUpdateCallback_AIDL");
    paramInt1 = paramParcel1.readInt();
    paramInt2 = paramParcel1.readInt();
    if (paramParcel1.readInt() != 0);
    for (boolean bool2 = true; ; bool2 = false)
    {
      p(paramInt1, paramInt2, bool2);
      paramParcel2.writeNoException();
      bool2 = bool1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.talkroom.component.c.a
 * JD-Core Version:    0.6.2
 */