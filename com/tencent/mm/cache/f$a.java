package com.tencent.mm.cache;

import android.graphics.Bitmap;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class f$a extends Binder
  implements f
{
  public f$a()
  {
    attachInterface(this, "com.tencent.mm.cache.IMMCache_AIDL");
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
      bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
    case 1:
    case 2:
      while (true)
      {
        return bool;
        paramParcel2.writeString("com.tencent.mm.cache.IMMCache_AIDL");
        bool = true;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.cache.IMMCache_AIDL");
        jM(paramParcel1.readString());
        paramParcel2.writeNoException();
        paramParcel2.writeInt(0);
        bool = true;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.cache.IMMCache_AIDL");
        str = paramParcel1.readString();
        if (paramParcel1.readInt() != 0)
          MCacheItem.CREATOR.createFromParcel(paramParcel1);
        jN(str);
        paramParcel2.writeNoException();
        bool = true;
      }
    case 3:
      paramParcel1.enforceInterface("com.tencent.mm.cache.IMMCache_AIDL");
      paramParcel1 = getBitmap(paramParcel1.readString());
      paramParcel2.writeNoException();
      if (paramParcel1 != null)
      {
        paramParcel2.writeInt(1);
        paramParcel1.writeToParcel(paramParcel2, 1);
      }
      while (true)
      {
        bool = true;
        break;
        paramParcel2.writeInt(0);
      }
    case 4:
    }
    paramParcel1.enforceInterface("com.tencent.mm.cache.IMMCache_AIDL");
    String str = paramParcel1.readString();
    if (paramParcel1.readInt() != 0);
    for (paramParcel1 = (Bitmap)Bitmap.CREATOR.createFromParcel(paramParcel1); ; paramParcel1 = null)
    {
      b(str, paramParcel1);
      paramParcel2.writeNoException();
      bool = true;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.cache.f.a
 * JD-Core Version:    0.6.2
 */