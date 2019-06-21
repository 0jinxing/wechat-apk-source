package com.a.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class c$a extends Binder
  implements c
{
  public static c i(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      paramIBinder = null;
    while (true)
    {
      return paramIBinder;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.huawei.securitymgr.IAuthenticationService");
      if ((localIInterface != null) && ((localIInterface instanceof c)))
        paramIBinder = (c)localIInterface;
      else
        paramIBinder = new c.a.a(paramIBinder);
    }
  }

  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
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
    case 9:
    case 10:
    case 11:
    case 12:
    case 13:
    case 14:
    case 15:
    case 16:
    }
    while (true)
    {
      return bool2;
      paramParcel2.writeString("com.huawei.securitymgr.IAuthenticationService");
      bool2 = bool1;
      continue;
      paramParcel1.enforceInterface("com.huawei.securitymgr.IAuthenticationService");
      bool2 = a(b.a.h(paramParcel1.readStrongBinder()), paramParcel1.readInt());
      paramParcel2.writeNoException();
      paramInt1 = m;
      if (bool2)
        paramInt1 = 1;
      paramParcel2.writeInt(paramInt1);
      bool2 = bool1;
      continue;
      paramParcel1.enforceInterface("com.huawei.securitymgr.IAuthenticationService");
      paramInt1 = a(b.a.h(paramParcel1.readStrongBinder()), paramParcel1.createIntArray(), paramParcel1.createByteArray());
      paramParcel2.writeNoException();
      paramParcel2.writeInt(paramInt1);
      bool2 = bool1;
      continue;
      paramParcel1.enforceInterface("com.huawei.securitymgr.IAuthenticationService");
      a(b.a.h(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      bool2 = bool1;
      continue;
      paramParcel1.enforceInterface("com.huawei.securitymgr.IAuthenticationService");
      b(b.a.h(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      bool2 = bool1;
      continue;
      paramParcel1.enforceInterface("com.huawei.securitymgr.IAuthenticationService");
      paramParcel1 = c(b.a.h(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      paramParcel2.writeIntArray(paramParcel1);
      bool2 = bool1;
      continue;
      paramParcel1.enforceInterface("com.huawei.securitymgr.IAuthenticationService");
      paramParcel1 = vS();
      paramParcel2.writeNoException();
      paramParcel2.writeIntArray(paramParcel1);
      bool2 = bool1;
      continue;
      paramParcel1.enforceInterface("com.huawei.securitymgr.IAuthenticationService");
      bool2 = fK(paramParcel1.readInt());
      paramParcel2.writeNoException();
      paramInt1 = i;
      if (bool2)
        paramInt1 = 1;
      paramParcel2.writeInt(paramInt1);
      bool2 = bool1;
      continue;
      paramParcel1.enforceInterface("com.huawei.securitymgr.IAuthenticationService");
      paramInt1 = fL(paramParcel1.readInt());
      paramParcel2.writeNoException();
      paramParcel2.writeInt(paramInt1);
      bool2 = bool1;
      continue;
      paramParcel1.enforceInterface("com.huawei.securitymgr.IAuthenticationService");
      bool2 = bm(paramParcel1.readString());
      paramParcel2.writeNoException();
      paramInt1 = j;
      if (bool2)
        paramInt1 = 1;
      paramParcel2.writeInt(paramInt1);
      bool2 = bool1;
      continue;
      paramParcel1.enforceInterface("com.huawei.securitymgr.IAuthenticationService");
      paramParcel1 = b(b.a.h(paramParcel1.readStrongBinder()), paramParcel1.readInt());
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      bool2 = bool1;
      continue;
      paramParcel1.enforceInterface("com.huawei.securitymgr.IAuthenticationService");
      paramParcel1 = c(b.a.h(paramParcel1.readStrongBinder()), paramParcel1.readInt());
      paramParcel2.writeNoException();
      paramParcel2.writeIntArray(paramParcel1);
      bool2 = bool1;
      continue;
      paramParcel1.enforceInterface("com.huawei.securitymgr.IAuthenticationService");
      paramInt1 = d(b.a.h(paramParcel1.readStrongBinder()), paramParcel1.readInt());
      paramParcel2.writeNoException();
      paramParcel2.writeInt(paramInt1);
      bool2 = bool1;
      continue;
      paramParcel1.enforceInterface("com.huawei.securitymgr.IAuthenticationService");
      b localb = b.a.h(paramParcel1.readStrongBinder());
      paramInt1 = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0);
      for (bool2 = true; ; bool2 = false)
      {
        bool2 = a(localb, paramInt1, bool2);
        paramParcel2.writeNoException();
        paramInt1 = k;
        if (bool2)
          paramInt1 = 1;
        paramParcel2.writeInt(paramInt1);
        bool2 = bool1;
        break;
      }
      paramParcel1.enforceInterface("com.huawei.securitymgr.IAuthenticationService");
      long l = d(b.a.h(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      paramParcel2.writeLong(l);
      bool2 = bool1;
      continue;
      paramParcel1.enforceInterface("com.huawei.securitymgr.IAuthenticationService");
      paramInt1 = a(b.a.h(paramParcel1.readStrongBinder()), paramParcel1.createIntArray(), paramParcel1.createByteArray(), paramParcel1.readInt());
      paramParcel2.writeNoException();
      paramParcel2.writeInt(paramInt1);
      bool2 = bool1;
      continue;
      paramParcel1.enforceInterface("com.huawei.securitymgr.IAuthenticationService");
      paramParcel1 = e(b.a.h(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      paramParcel2.writeByteArray(paramParcel1);
      bool2 = bool1;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.a.a.c.a
 * JD-Core Version:    0.6.2
 */