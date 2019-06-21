package com.tencent.b.a.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class a$a extends Binder
  implements a
{
  public static a j(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      paramIBinder = null;
    while (true)
    {
      return paramIBinder;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.assistant.sdk.BaseService");
      if ((localIInterface != null) && ((localIInterface instanceof a)))
        paramIBinder = (a)localIInterface;
      else
        paramIBinder = new a.a.a(paramIBinder);
    }
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
    }
    while (true)
    {
      return bool;
      paramParcel2.writeString("com.tencent.assistant.sdk.BaseService");
      continue;
      paramParcel1.enforceInterface("com.tencent.assistant.sdk.BaseService");
      paramInt1 = a(paramParcel1.readString(), paramParcel1.readString(), b.a.asInterface(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      paramParcel2.writeInt(paramInt1);
      continue;
      paramParcel1.enforceInterface("com.tencent.assistant.sdk.BaseService");
      paramInt1 = a(b.a.asInterface(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      paramParcel2.writeInt(paramInt1);
      continue;
      paramParcel1.enforceInterface("com.tencent.assistant.sdk.BaseService");
      paramParcel1 = c(paramParcel1.readString(), paramParcel1.createByteArray());
      paramParcel2.writeNoException();
      paramParcel2.writeByteArray(paramParcel1);
      continue;
      paramParcel1.enforceInterface("com.tencent.assistant.sdk.BaseService");
      d(paramParcel1.readString(), paramParcel1.createByteArray());
      paramParcel2.writeNoException();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.b.a.a.a.a
 * JD-Core Version:    0.6.2
 */