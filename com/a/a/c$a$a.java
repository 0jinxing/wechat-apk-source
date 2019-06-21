package com.a.a;

import android.os.IBinder;
import android.os.Parcel;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class c$a$a
  implements c
{
  private IBinder mRemote;

  c$a$a(IBinder paramIBinder)
  {
    this.mRemote = paramIBinder;
  }

  public final int a(b paramb, int[] paramArrayOfInt, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(118227);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.huawei.securitymgr.IAuthenticationService");
      if (paramb != null);
      for (paramb = paramb.asBinder(); ; paramb = null)
      {
        localParcel1.writeStrongBinder(paramb);
        localParcel1.writeIntArray(paramArrayOfInt);
        localParcel1.writeByteArray(paramArrayOfByte);
        this.mRemote.transact(2, localParcel1, localParcel2, 0);
        localParcel2.readException();
        int i = localParcel2.readInt();
        return i;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(118227);
    }
    throw paramb;
  }

  public final int a(b paramb, int[] paramArrayOfInt, byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(118240);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.huawei.securitymgr.IAuthenticationService");
      if (paramb != null);
      for (paramb = paramb.asBinder(); ; paramb = null)
      {
        localParcel1.writeStrongBinder(paramb);
        localParcel1.writeIntArray(paramArrayOfInt);
        localParcel1.writeByteArray(paramArrayOfByte);
        localParcel1.writeInt(paramInt);
        this.mRemote.transact(15, localParcel1, localParcel2, 0);
        localParcel2.readException();
        paramInt = localParcel2.readInt();
        return paramInt;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(118240);
    }
    throw paramb;
  }

  public final void a(b paramb)
  {
    AppMethodBeat.i(118228);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.huawei.securitymgr.IAuthenticationService");
      if (paramb != null);
      for (paramb = paramb.asBinder(); ; paramb = null)
      {
        localParcel1.writeStrongBinder(paramb);
        this.mRemote.transact(3, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(118228);
    }
    throw paramb;
  }

  public final boolean a(b paramb, int paramInt)
  {
    boolean bool = true;
    AppMethodBeat.i(118226);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.huawei.securitymgr.IAuthenticationService");
      if (paramb != null)
      {
        paramb = paramb.asBinder();
        localParcel1.writeStrongBinder(paramb);
        localParcel1.writeInt(paramInt);
        this.mRemote.transact(1, localParcel1, localParcel2, 0);
        localParcel2.readException();
        paramInt = localParcel2.readInt();
        if (paramInt == 0)
          break label100;
      }
      while (true)
      {
        return bool;
        paramb = null;
        break;
        label100: bool = false;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(118226);
    }
    throw paramb;
  }

  public final boolean a(b paramb, int paramInt, boolean paramBoolean)
  {
    boolean bool = true;
    AppMethodBeat.i(118238);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.huawei.securitymgr.IAuthenticationService");
      if (paramb != null)
      {
        paramb = paramb.asBinder();
        localParcel1.writeStrongBinder(paramb);
        localParcel1.writeInt(paramInt);
        if (!paramBoolean)
          break label117;
        paramInt = 1;
        label54: localParcel1.writeInt(paramInt);
        this.mRemote.transact(13, localParcel1, localParcel2, 0);
        localParcel2.readException();
        paramInt = localParcel2.readInt();
        if (paramInt == 0)
          break label122;
      }
      label117: label122: for (paramBoolean = bool; ; paramBoolean = false)
      {
        return paramBoolean;
        paramb = null;
        break;
        paramInt = 0;
        break label54;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(118238);
    }
    throw paramb;
  }

  public final IBinder asBinder()
  {
    return this.mRemote;
  }

  public final String b(b paramb, int paramInt)
  {
    AppMethodBeat.i(118235);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.huawei.securitymgr.IAuthenticationService");
      if (paramb != null);
      for (paramb = paramb.asBinder(); ; paramb = null)
      {
        localParcel1.writeStrongBinder(paramb);
        localParcel1.writeInt(paramInt);
        this.mRemote.transact(10, localParcel1, localParcel2, 0);
        localParcel2.readException();
        paramb = localParcel2.readString();
        return paramb;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(118235);
    }
    throw paramb;
  }

  public final void b(b paramb)
  {
    AppMethodBeat.i(118229);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.huawei.securitymgr.IAuthenticationService");
      if (paramb != null);
      for (paramb = paramb.asBinder(); ; paramb = null)
      {
        localParcel1.writeStrongBinder(paramb);
        this.mRemote.transact(4, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(118229);
    }
    throw paramb;
  }

  public final boolean bm(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(118234);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.huawei.securitymgr.IAuthenticationService");
      localParcel1.writeString(paramString);
      this.mRemote.transact(9, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int i = localParcel2.readInt();
      if (i != 0)
        bool = true;
      return bool;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(118234);
    }
    throw paramString;
  }

  public final int[] c(b paramb)
  {
    AppMethodBeat.i(118230);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.huawei.securitymgr.IAuthenticationService");
      if (paramb != null);
      for (paramb = paramb.asBinder(); ; paramb = null)
      {
        localParcel1.writeStrongBinder(paramb);
        this.mRemote.transact(5, localParcel1, localParcel2, 0);
        localParcel2.readException();
        paramb = localParcel2.createIntArray();
        return paramb;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(118230);
    }
    throw paramb;
  }

  public final int[] c(b paramb, int paramInt)
  {
    AppMethodBeat.i(118236);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.huawei.securitymgr.IAuthenticationService");
      if (paramb != null);
      for (paramb = paramb.asBinder(); ; paramb = null)
      {
        localParcel1.writeStrongBinder(paramb);
        localParcel1.writeInt(paramInt);
        this.mRemote.transact(11, localParcel1, localParcel2, 0);
        localParcel2.readException();
        paramb = localParcel2.createIntArray();
        return paramb;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(118236);
    }
    throw paramb;
  }

  public final int d(b paramb, int paramInt)
  {
    AppMethodBeat.i(118237);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.huawei.securitymgr.IAuthenticationService");
      if (paramb != null);
      for (paramb = paramb.asBinder(); ; paramb = null)
      {
        localParcel1.writeStrongBinder(paramb);
        localParcel1.writeInt(paramInt);
        this.mRemote.transact(12, localParcel1, localParcel2, 0);
        localParcel2.readException();
        paramInt = localParcel2.readInt();
        return paramInt;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(118237);
    }
    throw paramb;
  }

  public final long d(b paramb)
  {
    AppMethodBeat.i(118239);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.huawei.securitymgr.IAuthenticationService");
      if (paramb != null);
      for (paramb = paramb.asBinder(); ; paramb = null)
      {
        localParcel1.writeStrongBinder(paramb);
        this.mRemote.transact(14, localParcel1, localParcel2, 0);
        localParcel2.readException();
        long l = localParcel2.readLong();
        return l;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(118239);
    }
    throw paramb;
  }

  public final byte[] e(b paramb)
  {
    AppMethodBeat.i(118241);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.huawei.securitymgr.IAuthenticationService");
      if (paramb != null);
      for (paramb = paramb.asBinder(); ; paramb = null)
      {
        localParcel1.writeStrongBinder(paramb);
        this.mRemote.transact(16, localParcel1, localParcel2, 0);
        localParcel2.readException();
        paramb = localParcel2.createByteArray();
        return paramb;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(118241);
    }
    throw paramb;
  }

  public final boolean fK(int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(118232);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.huawei.securitymgr.IAuthenticationService");
      localParcel1.writeInt(paramInt);
      this.mRemote.transact(7, localParcel1, localParcel2, 0);
      localParcel2.readException();
      paramInt = localParcel2.readInt();
      if (paramInt != 0)
        bool = true;
      return bool;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(118232);
    }
  }

  public final int fL(int paramInt)
  {
    AppMethodBeat.i(118233);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.huawei.securitymgr.IAuthenticationService");
      localParcel1.writeInt(paramInt);
      this.mRemote.transact(8, localParcel1, localParcel2, 0);
      localParcel2.readException();
      paramInt = localParcel2.readInt();
      return paramInt;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(118233);
    }
  }

  public final int[] vS()
  {
    AppMethodBeat.i(118231);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.huawei.securitymgr.IAuthenticationService");
      this.mRemote.transact(6, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int[] arrayOfInt = localParcel2.createIntArray();
      return arrayOfInt;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(118231);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.a.a.c.a.a
 * JD-Core Version:    0.6.2
 */