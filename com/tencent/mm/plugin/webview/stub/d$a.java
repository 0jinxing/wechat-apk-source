package com.tencent.mm.plugin.webview.stub;

import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class d$a extends Binder
  implements d
{
  public d$a()
  {
    attachInterface(this, "com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
  }

  public static d G(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      paramIBinder = null;
    while (true)
    {
      return paramIBinder;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
      if ((localIInterface != null) && ((localIInterface instanceof d)))
        paramIBinder = (d)localIInterface;
      else
        paramIBinder = new d.a.a(paramIBinder);
    }
  }

  public IBinder asBinder()
  {
    return this;
  }

  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    int i5 = 0;
    int i6 = 0;
    boolean bool1 = false;
    int i7 = 0;
    boolean bool2 = false;
    int i8 = 0;
    int i9 = 0;
    int i10 = 0;
    int i11 = 0;
    int i12 = 0;
    int i13 = 0;
    int i14 = 0;
    boolean bool3 = true;
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
    case 23:
    case 24:
    case 25:
    case 26:
    case 27:
    case 28:
    case 29:
    case 30:
    case 31:
    case 32:
    case 33:
    case 34:
    case 35:
    case 36:
    case 37:
    case 38:
    case 39:
    case 40:
    case 41:
    case 42:
    case 43:
    case 44:
    case 45:
    case 46:
    case 47:
    case 48:
    case 49:
    case 50:
    case 51:
    case 52:
    case 53:
    case 54:
    case 55:
    case 56:
    case 57:
    case 58:
    case 59:
    case 60:
    case 61:
    case 62:
    case 63:
    case 64:
    case 65:
    case 66:
    case 67:
    case 68:
    case 69:
    case 70:
    case 71:
    case 72:
    case 73:
    case 74:
    case 75:
    case 76:
      while (true)
      {
        return bool1;
        paramParcel2.writeString("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        bool1 = bool3;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        bool1 = afj(paramParcel1.readString());
        paramParcel2.writeNoException();
        if (bool1);
        for (paramInt1 = 1; ; paramInt1 = 0)
        {
          paramParcel2.writeInt(paramInt1);
          bool1 = bool3;
          break;
        }
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        paramParcel1 = mJ(paramParcel1.readString());
        paramParcel2.writeNoException();
        paramParcel2.writeString(paramParcel1);
        bool1 = bool3;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        bool1 = mY(paramParcel1.readString());
        paramParcel2.writeNoException();
        paramInt1 = i14;
        if (bool1)
          paramInt1 = 1;
        paramParcel2.writeInt(paramInt1);
        bool1 = bool3;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        bool1 = nI(paramParcel1.readString());
        paramParcel2.writeNoException();
        paramInt1 = i;
        if (bool1)
          paramInt1 = 1;
        paramParcel2.writeInt(paramInt1);
        bool1 = bool3;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        bool1 = mZ(paramParcel1.readString());
        paramParcel2.writeNoException();
        paramInt1 = j;
        if (bool1)
          paramInt1 = 1;
        paramParcel2.writeInt(paramInt1);
        bool1 = bool3;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        paramParcel1 = aff(paramParcel1.readString());
        paramParcel2.writeNoException();
        paramParcel2.writeString(paramParcel1);
        bool1 = bool3;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        bool1 = Mn();
        paramParcel2.writeNoException();
        paramInt1 = k;
        if (bool1)
          paramInt1 = 1;
        paramParcel2.writeInt(paramInt1);
        bool1 = bool3;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        bool1 = isSDCardAvailable();
        paramParcel2.writeNoException();
        paramInt1 = m;
        if (bool1)
          paramInt1 = 1;
        paramParcel2.writeInt(paramInt1);
        bool1 = bool3;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        bool1 = cZd();
        paramParcel2.writeNoException();
        paramInt1 = n;
        if (bool1)
          paramInt1 = 1;
        paramParcel2.writeInt(paramInt1);
        bool1 = bool3;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        bool1 = Ze();
        paramParcel2.writeNoException();
        paramInt1 = i1;
        if (bool1)
          paramInt1 = 1;
        paramParcel2.writeInt(paramInt1);
        bool1 = bool3;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        paramInt1 = gw(paramParcel1.readInt(), paramParcel1.readInt());
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        bool1 = bool3;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        gx(paramParcel1.readInt(), paramParcel1.readInt());
        paramParcel2.writeNoException();
        bool1 = bool3;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        paramParcel1 = bF(paramParcel1.readInt(), paramParcel1.readString());
        paramParcel2.writeNoException();
        paramParcel2.writeString(paramParcel1);
        bool1 = bool3;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        paramInt1 = paramParcel1.readInt();
        if (paramParcel1.readInt() != 0);
        for (localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; localObject2 = null)
        {
          a(paramInt1, (Bundle)localObject2, paramParcel1.readInt());
          paramParcel2.writeNoException();
          bool1 = bool3;
          break;
        }
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        if (paramParcel1.readInt() != 0);
        for (paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; paramParcel1 = null)
        {
          localObject1 = Z(paramParcel1);
          paramParcel2.writeNoException();
          paramParcel1 = (Parcel)localObject2;
          if (localObject1 != null)
            paramParcel1 = ((b)localObject1).asBinder();
          paramParcel2.writeStrongBinder(paramParcel1);
          bool1 = bool3;
          break;
        }
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        if (paramParcel1.readInt() != 0);
        for (paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; paramParcel1 = null)
        {
          bool1 = aa(paramParcel1);
          paramParcel2.writeNoException();
          paramInt1 = i2;
          if (bool1)
            paramInt1 = 1;
          paramParcel2.writeInt(paramInt1);
          bool1 = bool3;
          break;
        }
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        paramInt1 = afm(paramParcel1.readString());
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        bool1 = bool3;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        favEditTag();
        paramParcel2.writeNoException();
        bool1 = bool3;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        paramInt1 = paramParcel1.readInt();
        if (paramParcel1.readInt() != 0);
        for (paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; paramParcel1 = null)
        {
          bool1 = s(paramInt1, paramParcel1);
          paramParcel2.writeNoException();
          paramInt1 = i3;
          if (bool1)
            paramInt1 = 1;
          paramParcel2.writeInt(paramInt1);
          bool1 = bool3;
          break;
        }
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        bool1 = x(paramParcel1.readLong(), paramParcel1.readString());
        paramParcel2.writeNoException();
        paramInt1 = i4;
        if (bool1)
          paramInt1 = 1;
        paramParcel2.writeInt(paramInt1);
        bool1 = bool3;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        afn(paramParcel1.readString());
        paramParcel2.writeNoException();
        bool1 = bool3;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        bool1 = aeD();
        paramParcel2.writeNoException();
        paramInt1 = i5;
        if (bool1)
          paramInt1 = 1;
        paramParcel2.writeInt(paramInt1);
        bool1 = bool3;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        paramParcel1 = aeC();
        paramParcel2.writeNoException();
        paramParcel2.writeStringList(paramParcel1);
        bool1 = bool3;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        k(paramParcel1.readInt(), paramParcel1.createStringArrayList());
        paramParcel2.writeNoException();
        bool1 = bool3;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        localObject2 = paramParcel1.readString();
        if (paramParcel1.readInt() != 0)
        {
          bool1 = true;
          label1721: if (paramParcel1.readInt() == 0)
            break label1784;
        }
        label1784: for (paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; paramParcel1 = null)
        {
          bool1 = a((String)localObject2, bool1, paramParcel1);
          paramParcel2.writeNoException();
          paramInt1 = i6;
          if (bool1)
            paramInt1 = 1;
          paramParcel2.writeInt(paramInt1);
          bool1 = bool3;
          break;
          bool1 = false;
          break label1721;
        }
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        paramParcel1 = afg(paramParcel1.readString());
        paramParcel2.writeNoException();
        paramParcel2.writeString(paramParcel1);
        bool1 = bool3;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        dB(paramParcel1.readString(), paramParcel1.readInt());
        paramParcel2.writeNoException();
        bool1 = bool3;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        localObject2 = paramParcel1.readString();
        if (paramParcel1.readInt() != 0)
          bool1 = true;
        bG((String)localObject2, bool1);
        paramParcel2.writeNoException();
        bool1 = bool3;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        bool1 = dq(paramParcel1.readString());
        paramParcel2.writeNoException();
        paramInt1 = i7;
        if (bool1)
          paramInt1 = 1;
        paramParcel2.writeInt(paramInt1);
        bool1 = bool3;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        paramInt1 = paramParcel1.readInt();
        if (paramParcel1.readInt() != 0);
        for (paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; paramParcel1 = null)
        {
          j(paramInt1, paramParcel1);
          paramParcel2.writeNoException();
          bool1 = bool3;
          break;
        }
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        paramInt1 = paramParcel1.readInt();
        if (paramParcel1.readInt() != 0);
        for (paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; paramParcel1 = null)
        {
          paramParcel1 = p(paramInt1, paramParcel1);
          paramParcel2.writeNoException();
          if (paramParcel1 == null)
            break label2054;
          paramParcel2.writeInt(1);
          paramParcel1.writeToParcel(paramParcel2, 1);
          bool1 = bool3;
          break;
        }
        label2054: paramParcel2.writeInt(0);
        bool1 = bool3;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        localObject2 = paramParcel1.readString();
        bool1 = bool2;
        if (paramParcel1.readInt() != 0)
          bool1 = true;
        i((String)localObject2, bool1, paramParcel1.readInt());
        paramParcel2.writeNoException();
        bool1 = bool3;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        paramParcel1 = Ja(paramParcel1.readInt());
        paramParcel2.writeNoException();
        if (paramParcel1 != null)
        {
          paramParcel2.writeInt(1);
          paramParcel1.writeToParcel(paramParcel2, 1);
          bool1 = bool3;
        }
        else
        {
          paramParcel2.writeInt(0);
          bool1 = bool3;
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          bool1 = Jb(paramParcel1.readInt());
          paramParcel2.writeNoException();
          paramInt1 = i8;
          if (bool1)
            paramInt1 = 1;
          paramParcel2.writeInt(paramInt1);
          bool1 = bool3;
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          String str1 = paramParcel1.readString();
          String str2 = paramParcel1.readString();
          String str3 = paramParcel1.readString();
          if (paramParcel1.readInt() != 0)
          {
            localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
            label2255: if (paramParcel1.readInt() == 0)
              break label2328;
          }
          label2328: for (localObject1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; localObject1 = null)
          {
            bool1 = a(str1, str2, str3, (Bundle)localObject2, (Bundle)localObject1, paramParcel1.readInt());
            paramParcel2.writeNoException();
            paramInt1 = i9;
            if (bool1)
              paramInt1 = 1;
            paramParcel2.writeInt(paramInt1);
            bool1 = bool3;
            break;
            localObject2 = null;
            break label2255;
          }
          paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          L(paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readInt());
          paramParcel2.writeNoException();
          bool1 = bool3;
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          localObject1 = paramParcel1.readString();
          if (paramParcel1.readInt() != 0);
          for (localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; localObject2 = null)
          {
            a((String)localObject1, (Bundle)localObject2, paramParcel1.readInt());
            paramParcel2.writeNoException();
            bool1 = bool3;
            break;
          }
          paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          afh(paramParcel1.readString());
          paramParcel2.writeNoException();
          bool1 = bool3;
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          paramParcel1 = afi(paramParcel1.readString());
          paramParcel2.writeNoException();
          paramParcel2.writeString(paramParcel1);
          bool1 = bool3;
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          ao(paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readInt());
          paramParcel2.writeNoException();
          bool1 = bool3;
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          a(e.a.H(paramParcel1.readStrongBinder()), paramParcel1.readInt());
          paramParcel2.writeNoException();
          bool1 = bool3;
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          Jc(paramParcel1.readInt());
          paramParcel2.writeNoException();
          bool1 = bool3;
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          paramParcel1 = cZe();
          paramParcel2.writeNoException();
          paramParcel2.writeStringArray(paramParcel1);
          bool1 = bool3;
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          paramParcel1 = cZf();
          paramParcel2.writeNoException();
          paramParcel2.writeString(paramParcel1);
          bool1 = bool3;
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          paramParcel1 = aek(paramParcel1.readString());
          paramParcel2.writeNoException();
          paramParcel2.writeString(paramParcel1);
          bool1 = bool3;
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          paramParcel1 = cZg();
          paramParcel2.writeNoException();
          paramParcel2.writeString(paramParcel1);
          bool1 = bool3;
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          paramParcel1 = afk(paramParcel1.readString());
          paramParcel2.writeNoException();
          paramParcel2.writeString(paramParcel1);
          bool1 = bool3;
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          paramParcel1 = cZi();
          paramParcel2.writeNoException();
          paramParcel2.writeMap(paramParcel1);
          bool1 = bool3;
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          paramParcel1 = hf(paramParcel1.readString(), paramParcel1.readString());
          paramParcel2.writeNoException();
          paramParcel2.writeString(paramParcel1);
          bool1 = bool3;
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          afl(paramParcel1.readString());
          paramParcel2.writeNoException();
          bool1 = bool3;
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          paramParcel1 = dC(paramParcel1.readString(), paramParcel1.readInt());
          paramParcel2.writeNoException();
          paramParcel2.writeString(paramParcel1);
          bool1 = bool3;
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          paramParcel1 = getLanguage();
          paramParcel2.writeNoException();
          paramParcel2.writeString(paramParcel1);
          bool1 = bool3;
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          paramParcel1 = cZh();
          paramParcel2.writeNoException();
          paramParcel2.writeString(paramParcel1);
          bool1 = bool3;
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          paramInt1 = cZj();
          paramParcel2.writeNoException();
          paramParcel2.writeInt(paramInt1);
          bool1 = bool3;
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          paramInt1 = cZk();
          paramParcel2.writeNoException();
          paramParcel2.writeInt(paramInt1);
          bool1 = bool3;
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          cZl();
          paramParcel2.writeNoException();
          bool1 = bool3;
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          cZm();
          paramParcel2.writeNoException();
          bool1 = bool3;
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          Jd(paramParcel1.readInt());
          paramParcel2.writeNoException();
          bool1 = bool3;
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          Je(paramParcel1.readInt());
          paramParcel2.writeNoException();
          bool1 = bool3;
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          IP(paramParcel1.readInt());
          paramParcel2.writeNoException();
          bool1 = bool3;
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          dD(paramParcel1.readString(), paramParcel1.readInt());
          paramParcel2.writeNoException();
          bool1 = bool3;
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          bool1 = cZn();
          paramParcel2.writeNoException();
          paramInt1 = i10;
          if (bool1)
            paramInt1 = 1;
          paramParcel2.writeInt(paramInt1);
          bool1 = bool3;
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          paramParcel1 = afp(paramParcel1.readString());
          paramParcel2.writeNoException();
          paramParcel2.writeString(paramParcel1);
          bool1 = bool3;
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          bool1 = cZp();
          paramParcel2.writeNoException();
          paramInt1 = i11;
          if (bool1)
            paramInt1 = 1;
          paramParcel2.writeInt(paramInt1);
          bool1 = bool3;
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          bool1 = cZo();
          paramParcel2.writeNoException();
          paramInt1 = i12;
          if (bool1)
            paramInt1 = 1;
          paramParcel2.writeInt(paramInt1);
          bool1 = bool3;
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          bool1 = cZs();
          paramParcel2.writeNoException();
          paramInt1 = i13;
          if (bool1)
            paramInt1 = 1;
          paramParcel2.writeInt(paramInt1);
          bool1 = bool3;
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          a(paramParcel1.readString(), paramParcel1.createIntArray(), paramParcel1.readInt(), paramParcel1.readInt());
          paramParcel2.writeNoException();
          bool1 = bool3;
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          afo(paramParcel1.readString());
          paramParcel2.writeNoException();
          bool1 = bool3;
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          str1 = paramParcel1.readString();
          str2 = paramParcel1.readString();
          str3 = paramParcel1.readString();
          paramInt1 = paramParcel1.readInt();
          paramInt2 = paramParcel1.readInt();
          localObject2 = localObject1;
          if (paramParcel1.readInt() != 0)
            localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
          a(str1, str2, str3, paramInt1, paramInt2, (Bundle)localObject2);
          paramParcel2.writeNoException();
          bool1 = bool3;
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          paramInt1 = paramParcel1.readInt();
          if (paramParcel1.readInt() != 0);
          for (paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; paramParcel1 = null)
          {
            paramParcel1 = g(paramInt1, paramParcel1);
            paramParcel2.writeNoException();
            if (paramParcel1 == null)
              break label3494;
            paramParcel2.writeInt(1);
            paramParcel1.writeToParcel(paramParcel2, 1);
            bool1 = bool3;
            break;
          }
          label3494: paramParcel2.writeInt(0);
          bool1 = bool3;
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          if (paramParcel1.readInt() != 0);
          for (paramParcel1 = (Intent)Intent.CREATOR.createFromParcel(paramParcel1); ; paramParcel1 = null)
          {
            aB(paramParcel1);
            paramParcel2.writeNoException();
            bool1 = bool3;
            break;
          }
          paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          J(paramParcel1.readInt(), paramParcel1.readString(), paramParcel1.readString());
          paramParcel2.writeNoException();
          bool1 = bool3;
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          paramParcel1 = cZq();
          paramParcel2.writeNoException();
          paramParcel2.writeStringList(paramParcel1);
          bool1 = bool3;
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          if (paramParcel1.readInt() != 0);
          for (localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; localObject2 = null)
          {
            a((Bundle)localObject2, paramParcel1.readInt());
            paramParcel2.writeNoException();
            bool1 = bool3;
            break;
          }
          paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          paramInt1 = cZr();
          paramParcel2.writeNoException();
          paramParcel2.writeInt(paramInt1);
          bool1 = bool3;
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          paramParcel1 = cZt();
          paramParcel2.writeNoException();
          paramParcel2.writeStringArray(paramParcel1);
          bool1 = bool3;
        }
      }
    case 77:
    }
    paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
    paramInt1 = paramParcel1.readInt();
    if (paramParcel1.readInt() != 0);
    for (paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; paramParcel1 = null)
    {
      r(paramInt1, paramParcel1);
      paramParcel2.writeNoException();
      bool1 = bool3;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.stub.d.a
 * JD-Core Version:    0.6.2
 */