package com.tencent.mm.plugin.wepkg.ipc;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
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

  public final IBinder asBinder()
  {
    return this.mRemote;
  }

  public final void r(Message paramMessage)
  {
    AppMethodBeat.i(63478);
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.tencent.mm.plugin.wepkg.ipc.IWepkgMainProcessService");
      if (paramMessage != null)
      {
        localParcel.writeInt(1);
        paramMessage.writeToParcel(localParcel, 0);
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
      AppMethodBeat.o(63478);
    }
    throw paramMessage;
  }

  public final void x(Bundle paramBundle)
  {
    AppMethodBeat.i(63479);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.mm.plugin.wepkg.ipc.IWepkgMainProcessService");
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
      AppMethodBeat.o(63479);
    }
    throw paramBundle;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wepkg.ipc.a.a.a
 * JD-Core Version:    0.6.2
 */