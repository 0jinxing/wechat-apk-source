package com.tencent.wcdb;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import com.tencent.matrix.trace.core.AppMethodBeat;

class IContentObserver$Stub$Proxy
  implements IContentObserver
{
  private IBinder mRemote;

  IContentObserver$Stub$Proxy(IBinder paramIBinder)
  {
    this.mRemote = paramIBinder;
  }

  public IBinder asBinder()
  {
    return this.mRemote;
  }

  public String getInterfaceDescriptor()
  {
    return "com.tencent.wcdb.IContentObserver";
  }

  public void onChange(boolean paramBoolean, Uri paramUri)
  {
    int i = 1;
    AppMethodBeat.i(12173);
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.tencent.wcdb.IContentObserver");
      if (paramBoolean)
      {
        localParcel.writeInt(i);
        if (paramUri == null)
          break label79;
        localParcel.writeInt(1);
        paramUri.writeToParcel(localParcel, 0);
      }
      while (true)
      {
        this.mRemote.transact(1, localParcel, null, 1);
        return;
        i = 0;
        break;
        label79: localParcel.writeInt(0);
      }
    }
    finally
    {
      localParcel.recycle();
      AppMethodBeat.o(12173);
    }
    throw paramUri;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.wcdb.IContentObserver.Stub.Proxy
 * JD-Core Version:    0.6.2
 */