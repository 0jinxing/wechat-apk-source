package com.tencent.mm.plugin.cdndownloader.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskInfo;
import com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskState;

public abstract interface a extends IInterface
{
  public abstract boolean HA(String paramString);

  public abstract boolean HB(String paramString);

  public abstract CDNTaskState HC(String paramString);

  public abstract int a(CDNTaskInfo paramCDNTaskInfo);

  public abstract void a(b paramb);

  public abstract int b(CDNTaskInfo paramCDNTaskInfo);

  public abstract void b(b paramb);

  public abstract void beR();

  public abstract void beS();

  public abstract void beT();

  public abstract void tr(int paramInt);

  public static abstract class a extends Binder
    implements a
  {
    public a()
    {
      attachInterface(this, "com.tencent.mm.plugin.cdndownloader.aidl.ICDNDownloadService");
    }

    public static a s(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        paramIBinder = null;
      while (true)
      {
        return paramIBinder;
        IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.mm.plugin.cdndownloader.aidl.ICDNDownloadService");
        if ((localIInterface != null) && ((localIInterface instanceof a)))
          paramIBinder = (a)localIInterface;
        else
          paramIBinder = new a.a.a(paramIBinder);
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
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
      case 11:
      }
      while (true)
      {
        return bool1;
        paramParcel2.writeString("com.tencent.mm.plugin.cdndownloader.aidl.ICDNDownloadService");
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.plugin.cdndownloader.aidl.ICDNDownloadService");
        if (paramParcel1.readInt() != 0)
          localObject2 = (CDNTaskInfo)CDNTaskInfo.CREATOR.createFromParcel(paramParcel1);
        paramInt1 = a((CDNTaskInfo)localObject2);
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.plugin.cdndownloader.aidl.ICDNDownloadService");
        localObject2 = localObject1;
        if (paramParcel1.readInt() != 0)
          localObject2 = (CDNTaskInfo)CDNTaskInfo.CREATOR.createFromParcel(paramParcel1);
        paramInt1 = b((CDNTaskInfo)localObject2);
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.plugin.cdndownloader.aidl.ICDNDownloadService");
        boolean bool2 = HA(paramParcel1.readString());
        paramParcel2.writeNoException();
        if (bool2);
        for (paramInt1 = 1; ; paramInt1 = 0)
        {
          paramParcel2.writeInt(paramInt1);
          break;
        }
        paramParcel1.enforceInterface("com.tencent.mm.plugin.cdndownloader.aidl.ICDNDownloadService");
        bool2 = HB(paramParcel1.readString());
        paramParcel2.writeNoException();
        paramInt1 = i;
        if (bool2)
          paramInt1 = 1;
        paramParcel2.writeInt(paramInt1);
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.plugin.cdndownloader.aidl.ICDNDownloadService");
        paramParcel1 = HC(paramParcel1.readString());
        paramParcel2.writeNoException();
        if (paramParcel1 != null)
        {
          paramParcel2.writeInt(1);
          paramParcel1.writeToParcel(paramParcel2, 1);
        }
        else
        {
          paramParcel2.writeInt(0);
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.plugin.cdndownloader.aidl.ICDNDownloadService");
          a(b.a.t(paramParcel1.readStrongBinder()));
          paramParcel2.writeNoException();
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.plugin.cdndownloader.aidl.ICDNDownloadService");
          b(b.a.t(paramParcel1.readStrongBinder()));
          paramParcel2.writeNoException();
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.plugin.cdndownloader.aidl.ICDNDownloadService");
          tr(paramParcel1.readInt());
          paramParcel2.writeNoException();
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.plugin.cdndownloader.aidl.ICDNDownloadService");
          beR();
          paramParcel2.writeNoException();
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.plugin.cdndownloader.aidl.ICDNDownloadService");
          beS();
          paramParcel2.writeNoException();
          continue;
          paramParcel1.enforceInterface("com.tencent.mm.plugin.cdndownloader.aidl.ICDNDownloadService");
          beT();
          paramParcel2.writeNoException();
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.cdndownloader.a.a
 * JD-Core Version:    0.6.2
 */