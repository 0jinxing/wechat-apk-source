package com.tencent.mm.plugin.cdndownloader.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.matrix.trace.core.AppMethodBeat;

public abstract interface b extends IInterface
{
  public abstract void e(String paramString1, int paramInt1, int paramInt2, String paramString2);

  public abstract void l(String paramString, long paramLong1, long paramLong2);

  static final class a$a
    implements b
  {
    private IBinder mRemote;

    a$a(IBinder paramIBinder)
    {
      this.mRemote = paramIBinder;
    }

    public final IBinder asBinder()
    {
      return this.mRemote;
    }

    public final void e(String paramString1, int paramInt1, int paramInt2, String paramString2)
    {
      AppMethodBeat.i(872);
      Parcel localParcel1 = Parcel.obtain();
      Parcel localParcel2 = Parcel.obtain();
      try
      {
        localParcel1.writeInterfaceToken("com.tencent.mm.plugin.cdndownloader.aidl.ICDNDownloadServiceCallback");
        localParcel1.writeString(paramString1);
        localParcel1.writeInt(paramInt1);
        localParcel1.writeInt(paramInt2);
        localParcel1.writeString(paramString2);
        this.mRemote.transact(1, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
        AppMethodBeat.o(872);
      }
      throw paramString1;
    }

    public final void l(String paramString, long paramLong1, long paramLong2)
    {
      AppMethodBeat.i(873);
      Parcel localParcel1 = Parcel.obtain();
      Parcel localParcel2 = Parcel.obtain();
      try
      {
        localParcel1.writeInterfaceToken("com.tencent.mm.plugin.cdndownloader.aidl.ICDNDownloadServiceCallback");
        localParcel1.writeString(paramString);
        localParcel1.writeLong(paramLong1);
        localParcel1.writeLong(paramLong2);
        this.mRemote.transact(2, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
        AppMethodBeat.o(873);
      }
      throw paramString;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.cdndownloader.a.b
 * JD-Core Version:    0.6.2
 */