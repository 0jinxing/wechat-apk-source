package com.tencent.mm.plugin.appbrand.ipc;

import android.os.Bundle;
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

  public final void a(IBinder paramIBinder, String paramString)
  {
    AppMethodBeat.i(91009);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.mm.plugin.appbrand.ipc.IMainProcessService");
      localParcel1.writeStrongBinder(paramIBinder);
      localParcel1.writeString(paramString);
      this.mRemote.transact(3, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(91009);
    }
    throw paramIBinder;
  }

  public final IBinder asBinder()
  {
    return this.mRemote;
  }

  public final void w(Bundle paramBundle)
  {
    AppMethodBeat.i(91007);
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.tencent.mm.plugin.appbrand.ipc.IMainProcessService");
      if (paramBundle != null)
      {
        localParcel.writeInt(1);
        paramBundle.writeToParcel(localParcel, 0);
      }
      while (true)
      {
        this.mRemote.transact(1, localParcel, null, 1);
        return;
        localParcel.writeInt(0);
      }
    }
    finally
    {
      localParcel.recycle();
      AppMethodBeat.o(91007);
    }
    throw paramBundle;
  }

  public final void x(Bundle paramBundle)
  {
    AppMethodBeat.i(91008);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.mm.plugin.appbrand.ipc.IMainProcessService");
      if (paramBundle != null)
      {
        localParcel1.writeInt(1);
        paramBundle.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        this.mRemote.transact(2, localParcel1, localParcel2, 0);
        localParcel2.readException();
        if (localParcel2.readInt() != 0)
          paramBundle.readFromParcel(localParcel2);
        return;
        localParcel1.writeInt(0);
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(91008);
    }
    throw paramBundle;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ipc.c.a.a
 * JD-Core Version:    0.6.2
 */