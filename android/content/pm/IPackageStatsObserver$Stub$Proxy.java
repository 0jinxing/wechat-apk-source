package android.content.pm;

import android.os.IBinder;
import android.os.Parcel;

class IPackageStatsObserver$Stub$Proxy
  implements IPackageStatsObserver
{
  private IBinder mRemote;

  IPackageStatsObserver$Stub$Proxy(IBinder paramIBinder)
  {
    this.mRemote = paramIBinder;
  }

  public IBinder asBinder()
  {
    return this.mRemote;
  }

  public String getInterfaceDescriptor()
  {
    return "IPackageStatsObserver";
  }

  public void onGetStatsCompleted(PackageStats paramPackageStats, boolean paramBoolean)
  {
    int i = 1;
    Parcel localParcel = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel.writeInterfaceToken("IPackageStatsObserver");
        if (paramPackageStats != null)
        {
          localParcel.writeInt(1);
          paramPackageStats.writeToParcel(localParcel, 0);
          if (paramBoolean)
          {
            localParcel.writeInt(i);
            this.mRemote.transact(1, localParcel, null, 1);
          }
        }
        else
        {
          localParcel.writeInt(0);
          continue;
        }
      }
      finally
      {
        localParcel.recycle();
      }
      i = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     android.content.pm.IPackageStatsObserver.Stub.Proxy
 * JD-Core Version:    0.6.2
 */