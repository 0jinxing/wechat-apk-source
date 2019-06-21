package com.tencent.tmassistantsdk.aidl;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo;
import java.util.Map;

class ITMAssistantDownloadSDKServiceInterface$Stub$Proxy
  implements ITMAssistantDownloadSDKServiceInterface
{
  private IBinder mRemote;

  ITMAssistantDownloadSDKServiceInterface$Stub$Proxy(IBinder paramIBinder)
  {
    this.mRemote = paramIBinder;
  }

  public IBinder asBinder()
  {
    return this.mRemote;
  }

  public void cancelDownloadTask(String paramString1, String paramString2)
  {
    AppMethodBeat.i(75604);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface");
      localParcel1.writeString(paramString1);
      localParcel1.writeString(paramString2);
      this.mRemote.transact(9, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(75604);
    }
    throw paramString1;
  }

  public TMAssistantDownloadTaskInfo getDownloadTaskInfo(String paramString1, String paramString2)
  {
    AppMethodBeat.i(75601);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface");
      localParcel1.writeString(paramString1);
      localParcel1.writeString(paramString2);
      this.mRemote.transact(6, localParcel1, localParcel2, 0);
      localParcel2.readException();
      if (localParcel2.readInt() != 0)
      {
        paramString1 = (TMAssistantDownloadTaskInfo)TMAssistantDownloadTaskInfo.CREATOR.createFromParcel(localParcel2);
        return paramString1;
      }
      paramString1 = null;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(75601);
    }
  }

  public String getInterfaceDescriptor()
  {
    return "com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface";
  }

  public int getServiceVersion()
  {
    AppMethodBeat.i(75596);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface");
      this.mRemote.transact(1, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int i = localParcel2.readInt();
      return i;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(75596);
    }
  }

  public boolean isAllDownloadFinished()
  {
    boolean bool = false;
    AppMethodBeat.i(75600);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface");
      this.mRemote.transact(5, localParcel1, localParcel2, 0);
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
      AppMethodBeat.o(75600);
    }
  }

  public void pauseDownloadTask(String paramString1, String paramString2)
  {
    AppMethodBeat.i(75603);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface");
      localParcel1.writeString(paramString1);
      localParcel1.writeString(paramString2);
      this.mRemote.transact(8, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(75603);
    }
    throw paramString1;
  }

  public void registerDownloadTaskCallback(String paramString, ITMAssistantDownloadSDKServiceCallback paramITMAssistantDownloadSDKServiceCallback)
  {
    AppMethodBeat.i(75605);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface");
      localParcel1.writeString(paramString);
      if (paramITMAssistantDownloadSDKServiceCallback != null);
      for (paramString = paramITMAssistantDownloadSDKServiceCallback.asBinder(); ; paramString = null)
      {
        localParcel1.writeStrongBinder(paramString);
        this.mRemote.transact(10, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(75605);
    }
    throw paramString;
  }

  public void setServiceSetingIsDownloadWifiOnly(boolean paramBoolean)
  {
    int i = 0;
    AppMethodBeat.i(75598);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface");
      if (paramBoolean)
        i = 1;
      localParcel1.writeInt(i);
      this.mRemote.transact(3, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(75598);
    }
  }

  public void setServiceSetingIsTaskAutoResume(boolean paramBoolean)
  {
    int i = 0;
    AppMethodBeat.i(75597);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface");
      if (paramBoolean)
        i = 1;
      localParcel1.writeInt(i);
      this.mRemote.transact(2, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(75597);
    }
  }

  public void setServiceSetingMaxTaskNum(int paramInt)
  {
    AppMethodBeat.i(75599);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface");
      localParcel1.writeInt(paramInt);
      this.mRemote.transact(4, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(75599);
    }
  }

  public int startDownloadTask(String paramString1, String paramString2, String paramString3, long paramLong, int paramInt, String paramString4, String paramString5, Map paramMap)
  {
    AppMethodBeat.i(75602);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface");
      localParcel1.writeString(paramString1);
      localParcel1.writeString(paramString2);
      localParcel1.writeString(paramString3);
      localParcel1.writeLong(paramLong);
      localParcel1.writeInt(paramInt);
      localParcel1.writeString(paramString4);
      localParcel1.writeString(paramString5);
      localParcel1.writeMap(paramMap);
      this.mRemote.transact(7, localParcel1, localParcel2, 0);
      localParcel2.readException();
      paramInt = localParcel2.readInt();
      return paramInt;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(75602);
    }
    throw paramString1;
  }

  public void unregisterDownloadTaskCallback(String paramString, ITMAssistantDownloadSDKServiceCallback paramITMAssistantDownloadSDKServiceCallback)
  {
    AppMethodBeat.i(75606);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface");
      localParcel1.writeString(paramString);
      if (paramITMAssistantDownloadSDKServiceCallback != null);
      for (paramString = paramITMAssistantDownloadSDKServiceCallback.asBinder(); ; paramString = null)
      {
        localParcel1.writeStrongBinder(paramString);
        this.mRemote.transact(11, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(75606);
    }
    throw paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface.Stub.Proxy
 * JD-Core Version:    0.6.2
 */