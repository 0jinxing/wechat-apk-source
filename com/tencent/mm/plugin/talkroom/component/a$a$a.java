package com.tencent.mm.plugin.talkroom.component;

import android.os.IBinder;
import android.os.Parcel;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$a$a
  implements a
{
  private IBinder mRemote;

  a$a$a(IBinder paramIBinder)
  {
    this.mRemote = paramIBinder;
  }

  public final int Close()
  {
    AppMethodBeat.i(25696);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.mm.plugin.talkroom.component.IEngine_AIDL");
      this.mRemote.transact(5, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int i = localParcel2.readInt();
      return i;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(25696);
    }
  }

  public final int SetCurrentMicId(int paramInt)
  {
    AppMethodBeat.i(25695);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.mm.plugin.talkroom.component.IEngine_AIDL");
      localParcel1.writeInt(paramInt);
      this.mRemote.transact(4, localParcel1, localParcel2, 0);
      localParcel2.readException();
      paramInt = localParcel2.readInt();
      return paramInt;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(25695);
    }
  }

  public final int a(b paramb, int paramInt1, int paramInt2, int paramInt3, long paramLong, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt4)
  {
    AppMethodBeat.i(25694);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.mm.plugin.talkroom.component.IEngine_AIDL");
      if (paramb != null);
      for (paramb = paramb.asBinder(); ; paramb = null)
      {
        localParcel1.writeStrongBinder(paramb);
        localParcel1.writeInt(paramInt1);
        localParcel1.writeInt(paramInt2);
        localParcel1.writeInt(paramInt3);
        localParcel1.writeLong(paramLong);
        localParcel1.writeIntArray(paramArrayOfInt1);
        localParcel1.writeIntArray(paramArrayOfInt2);
        localParcel1.writeInt(paramInt4);
        this.mRemote.transact(3, localParcel1, localParcel2, 0);
        localParcel2.readException();
        paramInt1 = localParcel2.readInt();
        return paramInt1;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(25694);
    }
    throw paramb;
  }

  public final e a(c paramc)
  {
    AppMethodBeat.i(25698);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.mm.plugin.talkroom.component.IEngine_AIDL");
      if (paramc != null);
      for (paramc = paramc.asBinder(); ; paramc = null)
      {
        localParcel1.writeStrongBinder(paramc);
        this.mRemote.transact(7, localParcel1, localParcel2, 0);
        localParcel2.readException();
        paramc = e.a.E(localParcel2.readStrongBinder());
        return paramc;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(25698);
    }
    throw paramc;
  }

  public final IBinder asBinder()
  {
    return this.mRemote;
  }

  public final int cEb()
  {
    AppMethodBeat.i(25692);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.mm.plugin.talkroom.component.IEngine_AIDL");
      this.mRemote.transact(1, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int i = localParcel2.readInt();
      return i;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(25692);
    }
  }

  public final d cEc()
  {
    AppMethodBeat.i(25699);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.mm.plugin.talkroom.component.IEngine_AIDL");
      this.mRemote.transact(8, localParcel1, localParcel2, 0);
      localParcel2.readException();
      d locald = d.a.D(localParcel2.readStrongBinder());
      return locald;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(25699);
    }
  }

  public final byte[] e(int[] paramArrayOfInt, String paramString)
  {
    AppMethodBeat.i(25697);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.mm.plugin.talkroom.component.IEngine_AIDL");
      if (paramArrayOfInt == null)
        localParcel1.writeInt(-1);
      while (true)
      {
        localParcel1.writeString(paramString);
        this.mRemote.transact(6, localParcel1, localParcel2, 0);
        localParcel2.readException();
        paramString = localParcel2.createByteArray();
        localParcel2.readIntArray(paramArrayOfInt);
        return paramString;
        localParcel1.writeInt(paramArrayOfInt.length);
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(25697);
    }
    throw paramArrayOfInt;
  }

  public final int uninitLive()
  {
    AppMethodBeat.i(25693);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.mm.plugin.talkroom.component.IEngine_AIDL");
      this.mRemote.transact(2, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int i = localParcel2.readInt();
      return i;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(25693);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.talkroom.component.a.a.a
 * JD-Core Version:    0.6.2
 */