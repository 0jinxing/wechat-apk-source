package com.tencent.mm.plugin.webview.stub;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class e$a$a
  implements e
{
  private IBinder mRemote;

  e$a$a(IBinder paramIBinder)
  {
    this.mRemote = paramIBinder;
  }

  public final boolean IZ(int paramInt)
  {
    boolean bool = true;
    AppMethodBeat.i(7312);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
      localParcel1.writeInt(paramInt);
      this.mRemote.transact(1, localParcel1, localParcel2, 0);
      localParcel2.readException();
      paramInt = localParcel2.readInt();
      if (paramInt != 0)
        return bool;
      bool = false;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(7312);
    }
  }

  public final void W(Bundle paramBundle)
  {
    AppMethodBeat.i(7324);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
      if (paramBundle != null)
      {
        localParcel1.writeInt(1);
        paramBundle.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        this.mRemote.transact(13, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
        localParcel1.writeInt(0);
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(7324);
    }
    throw paramBundle;
  }

  public final void X(Bundle paramBundle)
  {
    AppMethodBeat.i(7330);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
      if (paramBundle != null)
      {
        localParcel1.writeInt(1);
        paramBundle.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        this.mRemote.transact(19, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
        localParcel1.writeInt(0);
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(7330);
    }
    throw paramBundle;
  }

  public final boolean a(c paramc)
  {
    boolean bool = false;
    AppMethodBeat.i(7314);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
      if (paramc != null);
      for (paramc = paramc.asBinder(); ; paramc = null)
      {
        localParcel1.writeStrongBinder(paramc);
        this.mRemote.transact(3, localParcel1, localParcel2, 0);
        localParcel2.readException();
        int i = localParcel2.readInt();
        if (i != 0)
          bool = true;
        return bool;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(7314);
    }
    throw paramc;
  }

  public final boolean a(String paramString1, String paramString2, Bundle paramBundle, boolean paramBoolean)
  {
    boolean bool = true;
    AppMethodBeat.i(7315);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
        localParcel1.writeString(paramString1);
        localParcel1.writeString(paramString2);
        if (paramBundle != null)
        {
          localParcel1.writeInt(1);
          paramBundle.writeToParcel(localParcel1, 0);
          if (paramBoolean)
          {
            i = 1;
            localParcel1.writeInt(i);
            this.mRemote.transact(4, localParcel1, localParcel2, 0);
            localParcel2.readException();
            i = localParcel2.readInt();
            if (i == 0)
              break label160;
            paramBoolean = bool;
            return paramBoolean;
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
        AppMethodBeat.o(7315);
      }
      int i = 0;
      continue;
      label160: paramBoolean = false;
    }
  }

  public final void afd(String paramString)
  {
    AppMethodBeat.i(7325);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
      localParcel1.writeString(paramString);
      this.mRemote.transact(14, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(7325);
    }
    throw paramString;
  }

  public final IBinder asBinder()
  {
    return this.mRemote;
  }

  public final boolean c(int paramInt, Bundle paramBundle)
  {
    boolean bool = true;
    AppMethodBeat.i(7313);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
        localParcel1.writeInt(paramInt);
        if (paramBundle != null)
        {
          localParcel1.writeInt(1);
          paramBundle.writeToParcel(localParcel1, 0);
          this.mRemote.transact(2, localParcel1, localParcel2, 0);
          localParcel2.readException();
          if (localParcel2.readInt() != 0)
          {
            if (localParcel2.readInt() != 0)
              paramBundle.readFromParcel(localParcel2);
            return bool;
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
        AppMethodBeat.o(7313);
      }
      bool = false;
    }
  }

  public final String cYY()
  {
    AppMethodBeat.i(7316);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
      this.mRemote.transact(5, localParcel1, localParcel2, 0);
      localParcel2.readException();
      String str = localParcel2.readString();
      return str;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(7316);
    }
  }

  public final String cYZ()
  {
    AppMethodBeat.i(7318);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
      this.mRemote.transact(7, localParcel1, localParcel2, 0);
      localParcel2.readException();
      String str = localParcel2.readString();
      return str;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(7318);
    }
  }

  public final int cZa()
  {
    AppMethodBeat.i(7319);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
      this.mRemote.transact(8, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int i = localParcel2.readInt();
      return i;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(7319);
    }
  }

  public final void cZb()
  {
    AppMethodBeat.i(7323);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
      this.mRemote.transact(12, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(7323);
    }
  }

  public final void cZc()
  {
    AppMethodBeat.i(7327);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
      this.mRemote.transact(16, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(7327);
    }
  }

  public final Bundle dj(String paramString1, String paramString2)
  {
    AppMethodBeat.i(7333);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
      localParcel1.writeString(paramString1);
      localParcel1.writeString(paramString2);
      this.mRemote.transact(22, localParcel1, localParcel2, 0);
      localParcel2.readException();
      if (localParcel2.readInt() != 0)
      {
        paramString1 = (Bundle)Bundle.CREATOR.createFromParcel(localParcel2);
        return paramString1;
      }
      paramString1 = null;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(7333);
    }
  }

  public final void e(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(7328);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
      localParcel1.writeString(paramString1);
      localParcel1.writeString(paramString2);
      localParcel1.writeInt(paramInt1);
      localParcel1.writeInt(paramInt2);
      this.mRemote.transact(17, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(7328);
    }
    throw paramString1;
  }

  public final Bundle g(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(7329);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
        localParcel1.writeInt(paramInt);
        if (paramBundle != null)
        {
          localParcel1.writeInt(1);
          paramBundle.writeToParcel(localParcel1, 0);
          this.mRemote.transact(18, localParcel1, localParcel2, 0);
          localParcel2.readException();
          if (localParcel2.readInt() != 0)
          {
            paramBundle = (Bundle)Bundle.CREATOR.createFromParcel(localParcel2);
            return paramBundle;
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
        AppMethodBeat.o(7329);
      }
      paramBundle = null;
    }
  }

  public final String getCurrentUrl()
  {
    AppMethodBeat.i(7317);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
      this.mRemote.transact(6, localParcel1, localParcel2, 0);
      localParcel2.readException();
      String str = localParcel2.readString();
      return str;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(7317);
    }
  }

  public final void hd(String paramString1, String paramString2)
  {
    AppMethodBeat.i(7326);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
      localParcel1.writeString(paramString1);
      localParcel1.writeString(paramString2);
      this.mRemote.transact(15, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(7326);
    }
    throw paramString1;
  }

  public final void he(String paramString1, String paramString2)
  {
    AppMethodBeat.i(7332);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
      localParcel1.writeString(paramString1);
      localParcel1.writeString(paramString2);
      this.mRemote.transact(21, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(7332);
    }
    throw paramString1;
  }

  public final void nJ(boolean paramBoolean)
  {
    int i = 0;
    AppMethodBeat.i(7320);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
      if (paramBoolean)
        i = 1;
      localParcel1.writeInt(i);
      this.mRemote.transact(9, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(7320);
    }
  }

  public final void nK(boolean paramBoolean)
  {
    int i = 0;
    AppMethodBeat.i(7321);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
      if (paramBoolean)
        i = 1;
      localParcel1.writeInt(i);
      this.mRemote.transact(10, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(7321);
    }
  }

  public final void nL(boolean paramBoolean)
  {
    int i = 0;
    AppMethodBeat.i(7331);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
      if (paramBoolean)
        i = 1;
      localParcel1.writeInt(i);
      this.mRemote.transact(20, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(7331);
    }
  }

  public final void q(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(7322);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
      localParcel1.writeInt(paramInt);
      if (paramBundle != null)
      {
        localParcel1.writeInt(1);
        paramBundle.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        this.mRemote.transact(11, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
        localParcel1.writeInt(0);
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(7322);
    }
    throw paramBundle;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.stub.e.a.a
 * JD-Core Version:    0.6.2
 */