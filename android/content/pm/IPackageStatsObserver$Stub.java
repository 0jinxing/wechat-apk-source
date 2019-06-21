package android.content.pm;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class IPackageStatsObserver$Stub extends Binder
  implements IPackageStatsObserver
{
  private static final String DESCRIPTOR = "IPackageStatsObserver";
  static final int TRANSACTION_onGetStatsCompleted = 1;

  public IPackageStatsObserver$Stub()
  {
    attachInterface(this, "IPackageStatsObserver");
  }

  public static IPackageStatsObserver asInterface(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      paramIBinder = null;
    while (true)
    {
      return paramIBinder;
      IInterface localIInterface = paramIBinder.queryLocalInterface("IPackageStatsObserver");
      if ((localIInterface != null) && ((localIInterface instanceof IPackageStatsObserver)))
        paramIBinder = (IPackageStatsObserver)localIInterface;
      else
        paramIBinder = new IPackageStatsObserver.Stub.Proxy(paramIBinder);
    }
  }

  public IBinder asBinder()
  {
    return this;
  }

  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    boolean bool1 = true;
    switch (paramInt1)
    {
    default:
    case 1598968902:
      for (bool2 = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2); ; bool2 = bool1)
      {
        return bool2;
        paramParcel2.writeString("IPackageStatsObserver");
      }
    case 1:
    }
    paramParcel1.enforceInterface("IPackageStatsObserver");
    if (paramParcel1.readInt() != 0)
    {
      paramParcel2 = (PackageStats)PackageStats.CREATOR.createFromParcel(paramParcel1);
      label85: if (paramParcel1.readInt() == 0)
        break label114;
    }
    label114: for (boolean bool2 = true; ; bool2 = false)
    {
      onGetStatsCompleted(paramParcel2, bool2);
      bool2 = bool1;
      break;
      paramParcel2 = null;
      break label85;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     android.content.pm.IPackageStatsObserver.Stub
 * JD-Core Version:    0.6.2
 */