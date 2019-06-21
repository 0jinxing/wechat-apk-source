package com.tencent.mm.remoteservice;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract interface b extends IInterface
{
  public abstract void onCallback(String paramString, Bundle paramBundle, boolean paramBoolean);

  public static abstract class a extends Binder
    implements b
  {
    public a()
    {
      attachInterface(this, "com.tencent.mm.remoteservice.ICommClientCallback");
    }

    public static b asInterface(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        paramIBinder = null;
      while (true)
      {
        return paramIBinder;
        IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.mm.remoteservice.ICommClientCallback");
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
      boolean bool1 = true;
      boolean bool2;
      switch (paramInt1)
      {
      default:
        bool2 = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      case 1598968902:
      case 1:
      }
      while (true)
      {
        return bool2;
        paramParcel2.writeString("com.tencent.mm.remoteservice.ICommClientCallback");
        bool2 = bool1;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.remoteservice.ICommClientCallback");
        String str = paramParcel1.readString();
        Bundle localBundle;
        if (paramParcel1.readInt() != 0)
        {
          localBundle = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
          label92: if (paramParcel1.readInt() == 0)
            break label146;
        }
        label146: for (bool2 = true; ; bool2 = false)
        {
          onCallback(str, localBundle, bool2);
          paramParcel2.writeNoException();
          if (localBundle == null)
            break label152;
          paramParcel2.writeInt(1);
          localBundle.writeToParcel(paramParcel2, 1);
          bool2 = bool1;
          break;
          localBundle = null;
          break label92;
        }
        label152: paramParcel2.writeInt(0);
        bool2 = bool1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.remoteservice.b
 * JD-Core Version:    0.6.2
 */