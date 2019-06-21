package com.tencent.mm.plugin.talkroom.component;

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

  public final IBinder asBinder()
  {
    return this.mRemote;
  }

  public final void p(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i = 1;
    AppMethodBeat.i(25702);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.mm.plugin.talkroom.component.IMemberUpdateCallback_AIDL");
      localParcel1.writeInt(paramInt1);
      localParcel1.writeInt(paramInt2);
      if (paramBoolean);
      for (paramInt1 = i; ; paramInt1 = 0)
      {
        localParcel1.writeInt(paramInt1);
        this.mRemote.transact(1, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(25702);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.talkroom.component.c.a.a
 * JD-Core Version:    0.6.2
 */