package com.tencent.tmassistantsdk.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class ITMAssistantDownloadSDKServiceCallback$Stub extends Binder
  implements ITMAssistantDownloadSDKServiceCallback
{
  private static final String DESCRIPTOR = "com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceCallback";
  static final int TRANSACTION_OnDownloadSDKServiceTaskProgressChanged = 2;
  static final int TRANSACTION_OnDownloadSDKServiceTaskStateChanged = 1;

  public ITMAssistantDownloadSDKServiceCallback$Stub()
  {
    attachInterface(this, "com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceCallback");
  }

  public static ITMAssistantDownloadSDKServiceCallback asInterface(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      paramIBinder = null;
    while (true)
    {
      return paramIBinder;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceCallback");
      if ((localIInterface != null) && ((localIInterface instanceof ITMAssistantDownloadSDKServiceCallback)))
        paramIBinder = (ITMAssistantDownloadSDKServiceCallback)localIInterface;
      else
        paramIBinder = new ITMAssistantDownloadSDKServiceCallback.Stub.Proxy(paramIBinder);
    }
  }

  public IBinder asBinder()
  {
    return this;
  }

  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    boolean bool1 = true;
    boolean bool2;
    switch (paramInt1)
    {
    default:
      bool2 = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
    case 1:
    case 2:
    }
    while (true)
    {
      return bool2;
      paramParcel2.writeString("com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceCallback");
      bool2 = bool1;
      continue;
      paramParcel1.enforceInterface("com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceCallback");
      String str1 = paramParcel1.readString();
      String str2 = paramParcel1.readString();
      paramInt1 = paramParcel1.readInt();
      paramInt2 = paramParcel1.readInt();
      String str3 = paramParcel1.readString();
      if (paramParcel1.readInt() != 0)
      {
        bool2 = true;
        label112: if (paramParcel1.readInt() == 0)
          break label156;
      }
      label156: for (boolean bool3 = true; ; bool3 = false)
      {
        OnDownloadSDKServiceTaskStateChanged(str1, str2, paramInt1, paramInt2, str3, bool2, bool3);
        paramParcel2.writeNoException();
        bool2 = bool1;
        break;
        bool2 = false;
        break label112;
      }
      paramParcel1.enforceInterface("com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceCallback");
      OnDownloadSDKServiceTaskProgressChanged(paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readLong(), paramParcel1.readLong());
      paramParcel2.writeNoException();
      bool2 = bool1;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceCallback.Stub
 * JD-Core Version:    0.6.2
 */