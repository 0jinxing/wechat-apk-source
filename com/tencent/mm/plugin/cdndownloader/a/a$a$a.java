package com.tencent.mm.plugin.cdndownloader.a;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskInfo;
import com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskState;

final class a$a$a
  implements a
{
  private IBinder mRemote;

  a$a$a(IBinder paramIBinder)
  {
    this.mRemote = paramIBinder;
  }

  public final boolean HA(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(863);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.mm.plugin.cdndownloader.aidl.ICDNDownloadService");
      localParcel1.writeString(paramString);
      this.mRemote.transact(3, localParcel1, localParcel2, 0);
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
      AppMethodBeat.o(863);
    }
    throw paramString;
  }

  public final boolean HB(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(864);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.mm.plugin.cdndownloader.aidl.ICDNDownloadService");
      localParcel1.writeString(paramString);
      this.mRemote.transact(4, localParcel1, localParcel2, 0);
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
      AppMethodBeat.o(864);
    }
    throw paramString;
  }

  public final CDNTaskState HC(String paramString)
  {
    AppMethodBeat.i(865);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.mm.plugin.cdndownloader.aidl.ICDNDownloadService");
      localParcel1.writeString(paramString);
      this.mRemote.transact(5, localParcel1, localParcel2, 0);
      localParcel2.readException();
      if (localParcel2.readInt() != 0)
      {
        paramString = (CDNTaskState)CDNTaskState.CREATOR.createFromParcel(localParcel2);
        return paramString;
      }
      paramString = null;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(865);
    }
  }

  public final int a(CDNTaskInfo paramCDNTaskInfo)
  {
    AppMethodBeat.i(861);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.mm.plugin.cdndownloader.aidl.ICDNDownloadService");
      if (paramCDNTaskInfo != null)
      {
        localParcel1.writeInt(1);
        paramCDNTaskInfo.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        this.mRemote.transact(1, localParcel1, localParcel2, 0);
        localParcel2.readException();
        int i = localParcel2.readInt();
        return i;
        localParcel1.writeInt(0);
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(861);
    }
    throw paramCDNTaskInfo;
  }

  public final void a(b paramb)
  {
    AppMethodBeat.i(866);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.mm.plugin.cdndownloader.aidl.ICDNDownloadService");
      if (paramb != null);
      for (paramb = paramb.asBinder(); ; paramb = null)
      {
        localParcel1.writeStrongBinder(paramb);
        this.mRemote.transact(6, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(866);
    }
    throw paramb;
  }

  public final IBinder asBinder()
  {
    return this.mRemote;
  }

  public final int b(CDNTaskInfo paramCDNTaskInfo)
  {
    AppMethodBeat.i(862);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.mm.plugin.cdndownloader.aidl.ICDNDownloadService");
      if (paramCDNTaskInfo != null)
      {
        localParcel1.writeInt(1);
        paramCDNTaskInfo.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        this.mRemote.transact(2, localParcel1, localParcel2, 0);
        localParcel2.readException();
        int i = localParcel2.readInt();
        return i;
        localParcel1.writeInt(0);
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(862);
    }
    throw paramCDNTaskInfo;
  }

  public final void b(b paramb)
  {
    AppMethodBeat.i(867);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.mm.plugin.cdndownloader.aidl.ICDNDownloadService");
      if (paramb != null);
      for (paramb = paramb.asBinder(); ; paramb = null)
      {
        localParcel1.writeStrongBinder(paramb);
        this.mRemote.transact(7, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(867);
    }
    throw paramb;
  }

  public final void beR()
  {
    AppMethodBeat.i(869);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.mm.plugin.cdndownloader.aidl.ICDNDownloadService");
      this.mRemote.transact(9, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(869);
    }
  }

  public final void beS()
  {
    AppMethodBeat.i(870);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.mm.plugin.cdndownloader.aidl.ICDNDownloadService");
      this.mRemote.transact(10, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(870);
    }
  }

  public final void beT()
  {
    AppMethodBeat.i(871);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.mm.plugin.cdndownloader.aidl.ICDNDownloadService");
      this.mRemote.transact(11, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(871);
    }
  }

  public final void tr(int paramInt)
  {
    AppMethodBeat.i(868);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.mm.plugin.cdndownloader.aidl.ICDNDownloadService");
      localParcel1.writeInt(paramInt);
      this.mRemote.transact(8, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(868);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.cdndownloader.a.a.a.a
 * JD-Core Version:    0.6.2
 */