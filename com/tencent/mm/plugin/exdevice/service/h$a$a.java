package com.tencent.mm.plugin.exdevice.service;

import android.os.IBinder;
import android.os.Parcel;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class h$a$a
  implements h
{
  private IBinder mRemote;

  h$a$a(IBinder paramIBinder)
  {
    this.mRemote = paramIBinder;
  }

  public final long a(p paramp)
  {
    AppMethodBeat.i(19598);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
      if (paramp != null);
      for (paramp = paramp.asBinder(); ; paramp = null)
      {
        localParcel1.writeStrongBinder(paramp);
        this.mRemote.transact(7, localParcel1, localParcel2, 0);
        localParcel2.readException();
        long l = localParcel2.readLong();
        return l;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(19598);
    }
    throw paramp;
  }

  public final void a(n paramn)
  {
    AppMethodBeat.i(19602);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
      if (paramn != null);
      for (paramn = paramn.asBinder(); ; paramn = null)
      {
        localParcel1.writeStrongBinder(paramn);
        this.mRemote.transact(11, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(19602);
    }
    throw paramn;
  }

  public final boolean a(long paramLong, int paramInt, k paramk)
  {
    boolean bool = false;
    AppMethodBeat.i(19595);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
      localParcel1.writeLong(paramLong);
      localParcel1.writeInt(paramInt);
      if (paramk != null);
      for (paramk = paramk.asBinder(); ; paramk = null)
      {
        localParcel1.writeStrongBinder(paramk);
        this.mRemote.transact(4, localParcel1, localParcel2, 0);
        localParcel2.readException();
        paramInt = localParcel2.readInt();
        if (paramInt != 0)
          bool = true;
        return bool;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(19595);
    }
    throw paramk;
  }

  public final boolean a(i parami)
  {
    boolean bool = false;
    AppMethodBeat.i(19600);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
      if (parami != null);
      for (parami = parami.asBinder(); ; parami = null)
      {
        localParcel1.writeStrongBinder(parami);
        this.mRemote.transact(9, localParcel1, localParcel2, 0);
        localParcel2.readException();
        int i = localParcel2.readInt();
        if (i != 0)
          bool = true;
        return bool;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(19600);
    }
    throw parami;
  }

  public final boolean a(s params)
  {
    boolean bool = false;
    AppMethodBeat.i(19609);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
      if (params != null);
      for (params = params.asBinder(); ; params = null)
      {
        localParcel1.writeStrongBinder(params);
        this.mRemote.transact(18, localParcel1, localParcel2, 0);
        localParcel2.readException();
        int i = localParcel2.readInt();
        if (i != 0)
          bool = true;
        return bool;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(19609);
    }
    throw params;
  }

  public final boolean a(String paramString, boolean paramBoolean, q paramq)
  {
    boolean bool = true;
    AppMethodBeat.i(19604);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
      localParcel1.writeString(paramString);
      int i;
      if (paramBoolean)
      {
        i = 1;
        localParcel1.writeInt(i);
        if (paramq == null)
          break label124;
        paramString = paramq.asBinder();
        label57: localParcel1.writeStrongBinder(paramString);
        this.mRemote.transact(13, localParcel1, localParcel2, 0);
        localParcel2.readException();
        i = localParcel2.readInt();
        if (i == 0)
          break label129;
      }
      label129: for (paramBoolean = bool; ; paramBoolean = false)
      {
        return paramBoolean;
        i = 0;
        break;
        label124: paramString = null;
        break label57;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(19604);
    }
    throw paramString;
  }

  public final IBinder asBinder()
  {
    return this.mRemote;
  }

  public final boolean b(int paramInt, j paramj)
  {
    boolean bool = true;
    AppMethodBeat.i(19592);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
      localParcel1.writeInt(paramInt);
      if (paramj != null)
      {
        paramj = paramj.asBinder();
        localParcel1.writeStrongBinder(paramj);
        this.mRemote.transact(1, localParcel1, localParcel2, 0);
        localParcel2.readException();
        paramInt = localParcel2.readInt();
        if (paramInt == 0)
          break label102;
      }
      while (true)
      {
        return bool;
        paramj = null;
        break;
        label102: bool = false;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(19592);
    }
    throw paramj;
  }

  public final boolean b(long paramLong, int paramInt, k paramk)
  {
    boolean bool = false;
    AppMethodBeat.i(19607);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
      localParcel1.writeLong(paramLong);
      localParcel1.writeInt(paramInt);
      if (paramk != null);
      for (paramk = paramk.asBinder(); ; paramk = null)
      {
        localParcel1.writeStrongBinder(paramk);
        this.mRemote.transact(16, localParcel1, localParcel2, 0);
        localParcel2.readException();
        paramInt = localParcel2.readInt();
        if (paramInt != 0)
          bool = true;
        return bool;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(19607);
    }
    throw paramk;
  }

  public final boolean b(long paramLong, byte[] paramArrayOfByte, t paramt)
  {
    boolean bool = false;
    AppMethodBeat.i(19610);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
      localParcel1.writeLong(paramLong);
      localParcel1.writeByteArray(paramArrayOfByte);
      if (paramt != null);
      for (paramArrayOfByte = paramt.asBinder(); ; paramArrayOfByte = null)
      {
        localParcel1.writeStrongBinder(paramArrayOfByte);
        this.mRemote.transact(19, localParcel1, localParcel2, 0);
        localParcel2.readException();
        int i = localParcel2.readInt();
        if (i != 0)
          bool = true;
        return bool;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(19610);
    }
    throw paramArrayOfByte;
  }

  public final boolean b(i parami)
  {
    boolean bool = false;
    AppMethodBeat.i(19601);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
      if (parami != null);
      for (parami = parami.asBinder(); ; parami = null)
      {
        localParcel1.writeStrongBinder(parami);
        this.mRemote.transact(10, localParcel1, localParcel2, 0);
        localParcel2.readException();
        int i = localParcel2.readInt();
        if (i != 0)
          bool = true;
        return bool;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(19601);
    }
    throw parami;
  }

  public final long[] bpl()
  {
    AppMethodBeat.i(19594);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
      this.mRemote.transact(3, localParcel1, localParcel2, 0);
      localParcel2.readException();
      long[] arrayOfLong = localParcel2.createLongArray();
      return arrayOfLong;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(19594);
    }
  }

  public final boolean c(int paramInt, j paramj)
  {
    boolean bool = false;
    AppMethodBeat.i(19593);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
      localParcel1.writeInt(paramInt);
      if (paramj != null);
      for (paramj = paramj.asBinder(); ; paramj = null)
      {
        localParcel1.writeStrongBinder(paramj);
        this.mRemote.transact(2, localParcel1, localParcel2, 0);
        localParcel2.readException();
        paramInt = localParcel2.readInt();
        if (paramInt != 0)
          bool = true;
        return bool;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(19593);
    }
    throw paramj;
  }

  public final boolean d(int paramInt, j paramj)
  {
    boolean bool = false;
    AppMethodBeat.i(19605);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
      localParcel1.writeInt(paramInt);
      if (paramj != null);
      for (paramj = paramj.asBinder(); ; paramj = null)
      {
        localParcel1.writeStrongBinder(paramj);
        this.mRemote.transact(14, localParcel1, localParcel2, 0);
        localParcel2.readException();
        paramInt = localParcel2.readInt();
        if (paramInt != 0)
          bool = true;
        return bool;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(19605);
    }
    throw paramj;
  }

  public final boolean e(int paramInt, j paramj)
  {
    boolean bool = false;
    AppMethodBeat.i(19606);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
      localParcel1.writeInt(paramInt);
      if (paramj != null);
      for (paramj = paramj.asBinder(); ; paramj = null)
      {
        localParcel1.writeStrongBinder(paramj);
        this.mRemote.transact(15, localParcel1, localParcel2, 0);
        localParcel2.readException();
        paramInt = localParcel2.readInt();
        if (paramInt != 0)
          bool = true;
        return bool;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(19606);
    }
    throw paramj;
  }

  public final boolean hZ(long paramLong)
  {
    boolean bool = false;
    AppMethodBeat.i(19596);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
      localParcel1.writeLong(paramLong);
      this.mRemote.transact(5, localParcel1, localParcel2, 0);
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
      AppMethodBeat.o(19596);
    }
  }

  public final boolean ia(long paramLong)
  {
    boolean bool = false;
    AppMethodBeat.i(19597);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
      localParcel1.writeLong(paramLong);
      this.mRemote.transact(6, localParcel1, localParcel2, 0);
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
      AppMethodBeat.o(19597);
    }
  }

  public final boolean ib(long paramLong)
  {
    boolean bool = false;
    AppMethodBeat.i(19599);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
      localParcel1.writeLong(paramLong);
      this.mRemote.transact(8, localParcel1, localParcel2, 0);
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
      AppMethodBeat.o(19599);
    }
  }

  public final boolean ic(long paramLong)
  {
    boolean bool = false;
    AppMethodBeat.i(19608);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
      localParcel1.writeLong(paramLong);
      this.mRemote.transact(17, localParcel1, localParcel2, 0);
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
      AppMethodBeat.o(19608);
    }
  }

  public final void setChannelSessionKey(long paramLong, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(19603);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
      localParcel1.writeLong(paramLong);
      localParcel1.writeByteArray(paramArrayOfByte);
      this.mRemote.transact(12, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(19603);
    }
    throw paramArrayOfByte;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.service.h.a.a
 * JD-Core Version:    0.6.2
 */