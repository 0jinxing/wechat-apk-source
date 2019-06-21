package com.tencent.soter.soterserver;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$a$a
  implements a
{
  private IBinder mRemote;

  a$a$a(IBinder paramIBinder)
  {
    this.mRemote = paramIBinder;
  }

  public final SoterSessionResult O(int paramInt, String paramString1, String paramString2)
  {
    AppMethodBeat.i(73099);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.soter.soterserver.ISoterService");
      localParcel1.writeInt(paramInt);
      localParcel1.writeString(paramString1);
      localParcel1.writeString(paramString2);
      this.mRemote.transact(9, localParcel1, localParcel2, 0);
      localParcel2.readException();
      if (localParcel2.readInt() != 0)
      {
        paramString1 = (SoterSessionResult)SoterSessionResult.CREATOR.createFromParcel(localParcel2);
        return paramString1;
      }
      paramString1 = null;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(73099);
    }
  }

  public final int Re(int paramInt)
  {
    AppMethodBeat.i(73091);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.soter.soterserver.ISoterService");
      localParcel1.writeInt(paramInt);
      this.mRemote.transact(1, localParcel1, localParcel2, 0);
      localParcel2.readException();
      paramInt = localParcel2.readInt();
      return paramInt;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(73091);
    }
  }

  public final SoterExportResult Rf(int paramInt)
  {
    AppMethodBeat.i(73092);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.soter.soterserver.ISoterService");
      localParcel1.writeInt(paramInt);
      this.mRemote.transact(2, localParcel1, localParcel2, 0);
      localParcel2.readException();
      if (localParcel2.readInt() != 0)
      {
        localSoterExportResult = (SoterExportResult)SoterExportResult.CREATOR.createFromParcel(localParcel2);
        return localSoterExportResult;
      }
      SoterExportResult localSoterExportResult = null;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(73092);
    }
  }

  public final boolean Rg(int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(73093);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.soter.soterserver.ISoterService");
      localParcel1.writeInt(paramInt);
      this.mRemote.transact(3, localParcel1, localParcel2, 0);
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
      AppMethodBeat.o(73093);
    }
  }

  public final int Rh(int paramInt)
  {
    AppMethodBeat.i(73097);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.soter.soterserver.ISoterService");
      localParcel1.writeInt(paramInt);
      this.mRemote.transact(7, localParcel1, localParcel2, 0);
      localParcel2.readException();
      paramInt = localParcel2.readInt();
      return paramInt;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(73097);
    }
  }

  public final IBinder asBinder()
  {
    return this.mRemote;
  }

  public final int bS(int paramInt, String paramString)
  {
    AppMethodBeat.i(73094);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.soter.soterserver.ISoterService");
      localParcel1.writeInt(paramInt);
      localParcel1.writeString(paramString);
      this.mRemote.transact(4, localParcel1, localParcel2, 0);
      localParcel2.readException();
      paramInt = localParcel2.readInt();
      return paramInt;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(73094);
    }
    throw paramString;
  }

  public final int bT(int paramInt, String paramString)
  {
    AppMethodBeat.i(73095);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.soter.soterserver.ISoterService");
      localParcel1.writeInt(paramInt);
      localParcel1.writeString(paramString);
      this.mRemote.transact(5, localParcel1, localParcel2, 0);
      localParcel2.readException();
      paramInt = localParcel2.readInt();
      return paramInt;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(73095);
    }
    throw paramString;
  }

  public final SoterExportResult bU(int paramInt, String paramString)
  {
    AppMethodBeat.i(73096);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.soter.soterserver.ISoterService");
      localParcel1.writeInt(paramInt);
      localParcel1.writeString(paramString);
      this.mRemote.transact(6, localParcel1, localParcel2, 0);
      localParcel2.readException();
      if (localParcel2.readInt() != 0)
      {
        paramString = (SoterExportResult)SoterExportResult.CREATOR.createFromParcel(localParcel2);
        return paramString;
      }
      paramString = null;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(73096);
    }
  }

  public final boolean bV(int paramInt, String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(73098);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.soter.soterserver.ISoterService");
      localParcel1.writeInt(paramInt);
      localParcel1.writeString(paramString);
      this.mRemote.transact(8, localParcel1, localParcel2, 0);
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
      AppMethodBeat.o(73098);
    }
    throw paramString;
  }

  public final SoterDeviceResult dRb()
  {
    AppMethodBeat.i(73101);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.soter.soterserver.ISoterService");
      this.mRemote.transact(11, localParcel1, localParcel2, 0);
      localParcel2.readException();
      if (localParcel2.readInt() != 0)
      {
        localSoterDeviceResult = (SoterDeviceResult)SoterDeviceResult.CREATOR.createFromParcel(localParcel2);
        return localSoterDeviceResult;
      }
      SoterDeviceResult localSoterDeviceResult = null;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(73101);
    }
  }

  public final int getVersion()
  {
    AppMethodBeat.i(73102);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.soter.soterserver.ISoterService");
      this.mRemote.transact(12, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int i = localParcel2.readInt();
      return i;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(73102);
    }
  }

  public final SoterSignResult nD(long paramLong)
  {
    AppMethodBeat.i(73100);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.soter.soterserver.ISoterService");
      localParcel1.writeLong(paramLong);
      this.mRemote.transact(10, localParcel1, localParcel2, 0);
      localParcel2.readException();
      if (localParcel2.readInt() != 0)
      {
        localSoterSignResult = (SoterSignResult)SoterSignResult.CREATOR.createFromParcel(localParcel2);
        return localSoterSignResult;
      }
      SoterSignResult localSoterSignResult = null;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(73100);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.soter.soterserver.a.a.a
 * JD-Core Version:    0.6.2
 */