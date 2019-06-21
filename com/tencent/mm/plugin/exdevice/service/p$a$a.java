package com.tencent.mm.plugin.exdevice.service;

import android.os.IBinder;
import android.os.Parcel;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class p$a$a
  implements p
{
  private IBinder mRemote;

  p$a$a(IBinder paramIBinder)
  {
    this.mRemote = paramIBinder;
  }

  public final IBinder asBinder()
  {
    return this.mRemote;
  }

  public final o bpu()
  {
    AppMethodBeat.i(19621);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IExDeviceTask_AIDL");
      this.mRemote.transact(1, localParcel1, localParcel2, 0);
      localParcel2.readException();
      o localo = o.a.z(localParcel2.readStrongBinder());
      return localo;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(19621);
    }
  }

  public final l bpv()
  {
    AppMethodBeat.i(19622);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IExDeviceTask_AIDL");
      this.mRemote.transact(2, localParcel1, localParcel2, 0);
      localParcel2.readException();
      l locall = l.a.y(localParcel2.readStrongBinder());
      return locall;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(19622);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.service.p.a.a
 * JD-Core Version:    0.6.2
 */