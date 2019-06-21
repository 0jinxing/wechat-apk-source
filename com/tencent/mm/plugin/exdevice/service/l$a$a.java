package com.tencent.mm.plugin.exdevice.service;

import android.os.IBinder;
import android.os.Parcel;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class l$a$a
  implements l
{
  private IBinder mRemote;

  l$a$a(IBinder paramIBinder)
  {
    this.mRemote = paramIBinder;
  }

  public final void a(long paramLong, int paramInt1, int paramInt2, String paramString, p paramp)
  {
    AppMethodBeat.i(19614);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IBTOnTaskEnd_AIDL");
      localParcel1.writeLong(paramLong);
      localParcel1.writeInt(paramInt1);
      localParcel1.writeInt(paramInt2);
      localParcel1.writeString(paramString);
      if (paramp != null);
      for (paramString = paramp.asBinder(); ; paramString = null)
      {
        localParcel1.writeStrongBinder(paramString);
        this.mRemote.transact(1, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(19614);
    }
    throw paramString;
  }

  public final IBinder asBinder()
  {
    return this.mRemote;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.service.l.a.a
 * JD-Core Version:    0.6.2
 */