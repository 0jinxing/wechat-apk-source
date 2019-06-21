package com.tencent.mm.plugin.webview.stub;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract interface b extends IInterface
{
  public abstract boolean cYV();

  public abstract boolean getResult();

  public abstract int getRet();

  public abstract int getType();

  public static abstract class a extends Binder
    implements b
  {
    public a()
    {
      attachInterface(this, "com.tencent.mm.plugin.webview.stub.FavUrl_Result_AIDL");
    }

    public static b F(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        paramIBinder = null;
      while (true)
      {
        return paramIBinder;
        IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.mm.plugin.webview.stub.FavUrl_Result_AIDL");
        if ((localIInterface != null) && ((localIInterface instanceof b)))
          paramIBinder = (b)localIInterface;
        else
          paramIBinder = new b.a.a(paramIBinder);
      }
    }

    public IBinder asBinder()
    {
      return this;
    }

    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      int i = 0;
      int j = 0;
      boolean bool1 = true;
      switch (paramInt1)
      {
      default:
        bool1 = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      case 1598968902:
      case 1:
      case 2:
      case 3:
      case 4:
      }
      while (true)
      {
        return bool1;
        paramParcel2.writeString("com.tencent.mm.plugin.webview.stub.FavUrl_Result_AIDL");
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.FavUrl_Result_AIDL");
        boolean bool2 = cYV();
        paramParcel2.writeNoException();
        paramInt1 = j;
        if (bool2)
          paramInt1 = 1;
        paramParcel2.writeInt(paramInt1);
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.FavUrl_Result_AIDL");
        bool2 = getResult();
        paramParcel2.writeNoException();
        paramInt1 = i;
        if (bool2)
          paramInt1 = 1;
        paramParcel2.writeInt(paramInt1);
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.FavUrl_Result_AIDL");
        paramInt1 = getRet();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.FavUrl_Result_AIDL");
        paramInt1 = getType();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.stub.b
 * JD-Core Version:    0.6.2
 */