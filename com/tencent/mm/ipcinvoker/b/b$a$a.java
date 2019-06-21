package com.tencent.mm.ipcinvoker.b;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$a$a
  implements b
{
  private IBinder mRemote;

  b$a$a(IBinder paramIBinder)
  {
    this.mRemote = paramIBinder;
  }

  public final IBinder asBinder()
  {
    return this.mRemote;
  }

  public final void l(Bundle paramBundle)
  {
    AppMethodBeat.i(114072);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.mm.ipcinvoker.aidl.AIDL_IPCInvokeCallback");
      if (paramBundle != null)
      {
        localParcel1.writeInt(1);
        paramBundle.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        this.mRemote.transact(1, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
        localParcel1.writeInt(0);
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(114072);
    }
    throw paramBundle;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ipcinvoker.b.b.a.a
 * JD-Core Version:    0.6.2
 */