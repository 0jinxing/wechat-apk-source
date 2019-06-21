package com.tencent.tmassistantsdk.aidl;

import android.os.IBinder;
import android.os.Parcel;
import com.tencent.matrix.trace.core.AppMethodBeat;

class ITMAssistantDownloadSDKServiceCallback$Stub$Proxy
  implements ITMAssistantDownloadSDKServiceCallback
{
  private IBinder mRemote;

  ITMAssistantDownloadSDKServiceCallback$Stub$Proxy(IBinder paramIBinder)
  {
    this.mRemote = paramIBinder;
  }

  public void OnDownloadSDKServiceTaskProgressChanged(String paramString1, String paramString2, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(75595);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceCallback");
      localParcel1.writeString(paramString1);
      localParcel1.writeString(paramString2);
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
      AppMethodBeat.o(75595);
    }
    throw paramString1;
  }

  public void OnDownloadSDKServiceTaskStateChanged(String paramString1, String paramString2, int paramInt1, int paramInt2, String paramString3, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = 1;
    AppMethodBeat.i(75594);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceCallback");
      localParcel1.writeString(paramString1);
      localParcel1.writeString(paramString2);
      localParcel1.writeInt(paramInt1);
      localParcel1.writeInt(paramInt2);
      localParcel1.writeString(paramString3);
      if (paramBoolean1)
      {
        paramInt1 = 1;
        localParcel1.writeInt(paramInt1);
        if (!paramBoolean2)
          break label126;
      }
      label126: for (paramInt1 = i; ; paramInt1 = 0)
      {
        localParcel1.writeInt(paramInt1);
        this.mRemote.transact(1, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
        paramInt1 = 0;
        break;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(75594);
    }
    throw paramString1;
  }

  public IBinder asBinder()
  {
    return this.mRemote;
  }

  public String getInterfaceDescriptor()
  {
    return "com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceCallback";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceCallback.Stub.Proxy
 * JD-Core Version:    0.6.2
 */