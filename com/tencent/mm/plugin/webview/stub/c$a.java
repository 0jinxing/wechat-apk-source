package com.tencent.mm.plugin.webview.stub;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public abstract class c$a extends Binder
  implements c
{
  public c$a()
  {
    attachInterface(this, "com.tencent.mm.plugin.webview.stub.OnSceneEnd_AIDL");
  }

  public IBinder asBinder()
  {
    return this;
  }

  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    boolean bool = true;
    switch (paramInt1)
    {
    default:
      bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    }
    while (true)
    {
      return bool;
      paramParcel2.writeString("com.tencent.mm.plugin.webview.stub.OnSceneEnd_AIDL");
      continue;
      paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.OnSceneEnd_AIDL");
      paramInt1 = getType();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(paramInt1);
      continue;
      paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.OnSceneEnd_AIDL");
      paramInt1 = cYW();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(paramInt1);
      continue;
      paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.OnSceneEnd_AIDL");
      paramInt1 = cYX();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(paramInt1);
      continue;
      paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.OnSceneEnd_AIDL");
      paramParcel1 = adx();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      continue;
      paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.OnSceneEnd_AIDL");
      paramParcel1 = getData();
      paramParcel2.writeNoException();
      if (paramParcel1 != null)
      {
        paramParcel2.writeInt(1);
        paramParcel1.writeToParcel(paramParcel2, 1);
      }
      else
      {
        paramParcel2.writeInt(0);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.stub.c.a
 * JD-Core Version:    0.6.2
 */