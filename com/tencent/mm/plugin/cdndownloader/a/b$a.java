package com.tencent.mm.plugin.cdndownloader.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class b$a extends Binder
  implements b
{
  public b$a()
  {
    attachInterface(this, "com.tencent.mm.plugin.cdndownloader.aidl.ICDNDownloadServiceCallback");
  }

  public static b t(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      paramIBinder = null;
    while (true)
    {
      return paramIBinder;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.mm.plugin.cdndownloader.aidl.ICDNDownloadServiceCallback");
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
    boolean bool;
    switch (paramInt1)
    {
    default:
      bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
    case 1:
    case 2:
    }
    while (true)
    {
      return bool;
      paramParcel2.writeString("com.tencent.mm.plugin.cdndownloader.aidl.ICDNDownloadServiceCallback");
      bool = true;
      continue;
      paramParcel1.enforceInterface("com.tencent.mm.plugin.cdndownloader.aidl.ICDNDownloadServiceCallback");
      e(paramParcel1.readString(), paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readString());
      paramParcel2.writeNoException();
      bool = true;
      continue;
      paramParcel1.enforceInterface("com.tencent.mm.plugin.cdndownloader.aidl.ICDNDownloadServiceCallback");
      l(paramParcel1.readString(), paramParcel1.readLong(), paramParcel1.readLong());
      paramParcel2.writeNoException();
      bool = true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.cdndownloader.a.b.a
 * JD-Core Version:    0.6.2
 */