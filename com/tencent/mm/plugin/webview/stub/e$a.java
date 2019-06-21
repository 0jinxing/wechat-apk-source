package com.tencent.mm.plugin.webview.stub;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class e$a extends Binder
  implements e
{
  public e$a()
  {
    attachInterface(this, "com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
  }

  public static e H(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      paramIBinder = null;
    while (true)
    {
      return paramIBinder;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
      if ((localIInterface != null) && ((localIInterface instanceof e)))
        paramIBinder = (e)localIInterface;
      else
        paramIBinder = new e.a.a(paramIBinder);
    }
  }

  public IBinder asBinder()
  {
    return this;
  }

  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    String str1 = null;
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = null;
    Object localObject4 = null;
    Object localObject5 = null;
    String str2 = null;
    int i = 0;
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    int j = 0;
    boolean bool4 = true;
    switch (paramInt1)
    {
    default:
      bool1 = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
    case 10:
    case 11:
    case 12:
    case 13:
    case 14:
    case 15:
    case 16:
    case 17:
    case 18:
    case 19:
    case 20:
    case 21:
    case 22:
    }
    while (true)
    {
      return bool1;
      paramParcel2.writeString("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
      bool1 = bool4;
      continue;
      paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
      bool1 = IZ(paramParcel1.readInt());
      paramParcel2.writeNoException();
      if (bool1);
      for (paramInt1 = 1; ; paramInt1 = 0)
      {
        paramParcel2.writeInt(paramInt1);
        bool1 = bool4;
        break;
      }
      paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
      paramInt1 = paramParcel1.readInt();
      localObject1 = str2;
      if (paramParcel1.readInt() != 0)
        localObject1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      bool1 = c(paramInt1, (Bundle)localObject1);
      paramParcel2.writeNoException();
      if (bool1);
      for (paramInt1 = 1; ; paramInt1 = 0)
      {
        paramParcel2.writeInt(paramInt1);
        if (localObject1 == null)
          break label397;
        paramParcel2.writeInt(1);
        ((Bundle)localObject1).writeToParcel(paramParcel2, 1);
        bool1 = bool4;
        break;
      }
      label397: paramParcel2.writeInt(0);
      bool1 = bool4;
      continue;
      paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
      paramParcel1 = paramParcel1.readStrongBinder();
      if (paramParcel1 == null)
        paramParcel1 = str1;
      while (true)
      {
        bool1 = a(paramParcel1);
        paramParcel2.writeNoException();
        paramInt1 = j;
        if (bool1)
          paramInt1 = 1;
        paramParcel2.writeInt(paramInt1);
        bool1 = bool4;
        break;
        localObject1 = paramParcel1.queryLocalInterface("com.tencent.mm.plugin.webview.stub.OnSceneEnd_AIDL");
        if ((localObject1 != null) && ((localObject1 instanceof c)))
          paramParcel1 = (c)localObject1;
        else
          paramParcel1 = new c.a.a(paramParcel1);
      }
      paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
      str1 = paramParcel1.readString();
      str2 = paramParcel1.readString();
      if (paramParcel1.readInt() != 0)
        localObject1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      if (paramParcel1.readInt() != 0);
      for (bool1 = true; ; bool1 = false)
      {
        bool1 = a(str1, str2, (Bundle)localObject1, bool1);
        paramParcel2.writeNoException();
        paramInt1 = i;
        if (bool1)
          paramInt1 = 1;
        paramParcel2.writeInt(paramInt1);
        bool1 = bool4;
        break;
      }
      paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
      paramParcel1 = cYY();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      bool1 = bool4;
      continue;
      paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
      paramParcel1 = getCurrentUrl();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      bool1 = bool4;
      continue;
      paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
      paramParcel1 = cYZ();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      bool1 = bool4;
      continue;
      paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
      paramInt1 = cZa();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(paramInt1);
      bool1 = bool4;
      continue;
      paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
      if (paramParcel1.readInt() != 0)
        bool1 = true;
      nJ(bool1);
      paramParcel2.writeNoException();
      bool1 = bool4;
      continue;
      paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
      bool1 = bool2;
      if (paramParcel1.readInt() != 0)
        bool1 = true;
      nK(bool1);
      paramParcel2.writeNoException();
      bool1 = bool4;
      continue;
      paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
      paramInt1 = paramParcel1.readInt();
      localObject1 = localObject2;
      if (paramParcel1.readInt() != 0)
        localObject1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      q(paramInt1, (Bundle)localObject1);
      paramParcel2.writeNoException();
      bool1 = bool4;
      continue;
      paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
      cZb();
      paramParcel2.writeNoException();
      bool1 = bool4;
      continue;
      paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
      localObject1 = localObject3;
      if (paramParcel1.readInt() != 0)
        localObject1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      W((Bundle)localObject1);
      paramParcel2.writeNoException();
      bool1 = bool4;
      continue;
      paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
      afd(paramParcel1.readString());
      paramParcel2.writeNoException();
      bool1 = bool4;
      continue;
      paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
      hd(paramParcel1.readString(), paramParcel1.readString());
      paramParcel2.writeNoException();
      bool1 = bool4;
      continue;
      paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
      cZc();
      paramParcel2.writeNoException();
      bool1 = bool4;
      continue;
      paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
      e(paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readInt(), paramParcel1.readInt());
      paramParcel2.writeNoException();
      bool1 = bool4;
      continue;
      paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
      paramInt1 = paramParcel1.readInt();
      localObject1 = localObject4;
      if (paramParcel1.readInt() != 0)
        localObject1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      paramParcel1 = g(paramInt1, (Bundle)localObject1);
      paramParcel2.writeNoException();
      if (paramParcel1 != null)
      {
        paramParcel2.writeInt(1);
        paramParcel1.writeToParcel(paramParcel2, 1);
        bool1 = bool4;
      }
      else
      {
        paramParcel2.writeInt(0);
        bool1 = bool4;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
        localObject1 = localObject5;
        if (paramParcel1.readInt() != 0)
          localObject1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        X((Bundle)localObject1);
        paramParcel2.writeNoException();
        bool1 = bool4;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
        bool1 = bool3;
        if (paramParcel1.readInt() != 0)
          bool1 = true;
        nL(bool1);
        paramParcel2.writeNoException();
        bool1 = bool4;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
        he(paramParcel1.readString(), paramParcel1.readString());
        paramParcel2.writeNoException();
        bool1 = bool4;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
        paramParcel1 = dj(paramParcel1.readString(), paramParcel1.readString());
        paramParcel2.writeNoException();
        if (paramParcel1 != null)
        {
          paramParcel2.writeInt(1);
          paramParcel1.writeToParcel(paramParcel2, 1);
          bool1 = bool4;
        }
        else
        {
          paramParcel2.writeInt(0);
          bool1 = bool4;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.stub.e.a
 * JD-Core Version:    0.6.2
 */