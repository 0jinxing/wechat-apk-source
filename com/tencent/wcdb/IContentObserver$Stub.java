package com.tencent.wcdb;

import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class IContentObserver$Stub extends Binder
  implements IContentObserver
{
  private static final String DESCRIPTOR = "com.tencent.wcdb.IContentObserver";
  static final int TRANSACTION_onChange = 1;

  public IContentObserver$Stub()
  {
    attachInterface(this, "com.tencent.wcdb.IContentObserver");
  }

  public static IContentObserver asInterface(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      paramIBinder = null;
    while (true)
    {
      return paramIBinder;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.wcdb.IContentObserver");
      if ((localIInterface != null) && ((localIInterface instanceof IContentObserver)))
        paramIBinder = (IContentObserver)localIInterface;
      else
        paramIBinder = new IContentObserver.Stub.Proxy(paramIBinder);
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
    case 1598968902:
      for (bool2 = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2); ; bool2 = bool1)
      {
        return bool2;
        paramParcel2.writeString("com.tencent.wcdb.IContentObserver");
      }
    case 1:
    }
    paramParcel1.enforceInterface("com.tencent.wcdb.IContentObserver");
    if (paramParcel1.readInt() != 0)
    {
      bool2 = true;
      label75: if (paramParcel1.readInt() == 0)
        break label115;
    }
    label115: for (paramParcel1 = (Uri)Uri.CREATOR.createFromParcel(paramParcel1); ; paramParcel1 = null)
    {
      onChange(bool2, paramParcel1);
      bool2 = bool1;
      break;
      bool2 = false;
      break label75;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.wcdb.IContentObserver.Stub
 * JD-Core Version:    0.6.2
 */