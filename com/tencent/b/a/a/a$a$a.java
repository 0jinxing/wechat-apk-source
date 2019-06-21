package com.tencent.b.a.a;

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

  public final int a(b paramb)
  {
    AppMethodBeat.i(75590);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.assistant.sdk.BaseService");
      if (paramb != null);
      for (paramb = paramb.asBinder(); ; paramb = null)
      {
        localParcel1.writeStrongBinder(paramb);
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
      AppMethodBeat.o(75590);
    }
    throw paramb;
  }

  public final int a(String paramString1, String paramString2, b paramb)
  {
    AppMethodBeat.i(75589);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.assistant.sdk.BaseService");
      localParcel1.writeString(paramString1);
      localParcel1.writeString(paramString2);
      if (paramb != null);
      for (paramString1 = paramb.asBinder(); ; paramString1 = null)
      {
        localParcel1.writeStrongBinder(paramString1);
        this.mRemote.transact(1, localParcel1, localParcel2, 0);
        localParcel2.readException();
        int i = localParcel2.readInt();
        return i;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(75589);
    }
    throw paramString1;
  }

  public final IBinder asBinder()
  {
    return this.mRemote;
  }

  public final byte[] c(String paramString, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(75591);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.assistant.sdk.BaseService");
      localParcel1.writeString(paramString);
      localParcel1.writeByteArray(paramArrayOfByte);
      this.mRemote.transact(3, localParcel1, localParcel2, 0);
      localParcel2.readException();
      paramString = localParcel2.createByteArray();
      return paramString;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(75591);
    }
    throw paramString;
  }

  public final void d(String paramString, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(75592);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.assistant.sdk.BaseService");
      localParcel1.writeString(paramString);
      localParcel1.writeByteArray(paramArrayOfByte);
      this.mRemote.transact(4, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(75592);
    }
    throw paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.b.a.a.a.a.a
 * JD-Core Version:    0.6.2
 */