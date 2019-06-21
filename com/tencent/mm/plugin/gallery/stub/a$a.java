package com.tencent.mm.plugin.gallery.stub;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class a$a extends Binder
  implements a
{
  public a$a()
  {
    attachInterface(this, "com.tencent.mm.plugin.gallery.stub.Gallery_AIDL");
  }

  public static a B(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      paramIBinder = null;
    while (true)
    {
      return paramIBinder;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.mm.plugin.gallery.stub.Gallery_AIDL");
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
    int i = 0;
    boolean bool1 = true;
    boolean bool2;
    switch (paramInt1)
    {
    default:
      bool2 = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    }
    while (true)
    {
      return bool2;
      paramParcel2.writeString("com.tencent.mm.plugin.gallery.stub.Gallery_AIDL");
      bool2 = bool1;
      continue;
      paramParcel1.enforceInterface("com.tencent.mm.plugin.gallery.stub.Gallery_AIDL");
      aK(paramParcel1.readInt(), paramParcel1.readString());
      paramParcel2.writeNoException();
      bool2 = bool1;
      continue;
      paramParcel1.enforceInterface("com.tencent.mm.plugin.gallery.stub.Gallery_AIDL");
      bCv();
      paramParcel2.writeNoException();
      bool2 = bool1;
      continue;
      paramParcel1.enforceInterface("com.tencent.mm.plugin.gallery.stub.Gallery_AIDL");
      paramInt1 = Nd();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(paramInt1);
      bool2 = bool1;
      continue;
      paramParcel1.enforceInterface("com.tencent.mm.plugin.gallery.stub.Gallery_AIDL");
      String str1 = paramParcel1.readString();
      String str2 = paramParcel1.readString();
      if (paramParcel1.readInt() != 0)
      {
        bool2 = true;
        label220: paramInt1 = paramParcel1.readInt();
        if (paramParcel1.readInt() == 0)
          break label265;
      }
      label265: for (boolean bool3 = true; ; bool3 = false)
      {
        a(str1, str2, bool2, paramInt1, bool3);
        paramParcel2.writeNoException();
        bool2 = bool1;
        break;
        bool2 = false;
        break label220;
      }
      paramParcel1.enforceInterface("com.tencent.mm.plugin.gallery.stub.Gallery_AIDL");
      paramInt1 = Nb();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(paramInt1);
      bool2 = bool1;
      continue;
      paramParcel1.enforceInterface("com.tencent.mm.plugin.gallery.stub.Gallery_AIDL");
      paramInt1 = Na();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(paramInt1);
      bool2 = bool1;
      continue;
      paramParcel1.enforceInterface("com.tencent.mm.plugin.gallery.stub.Gallery_AIDL");
      if (paramParcel1.readInt() != 0);
      for (bool2 = true; ; bool2 = false)
      {
        bool2 = hC(bool2);
        paramParcel2.writeNoException();
        paramInt1 = i;
        if (bool2)
          paramInt1 = 1;
        paramParcel2.writeInt(paramInt1);
        bool2 = bool1;
        break;
      }
      paramParcel1.enforceInterface("com.tencent.mm.plugin.gallery.stub.Gallery_AIDL");
      paramInt1 = ND(paramParcel1.readString());
      paramParcel2.writeNoException();
      paramParcel2.writeInt(paramInt1);
      bool2 = bool1;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.stub.a.a
 * JD-Core Version:    0.6.2
 */