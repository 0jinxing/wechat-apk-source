package android.support.v4.os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class b$a extends Binder
  implements b
{
  public b$a()
  {
    attachInterface(this, "android.support.v4.os.IResultReceiver");
  }

  public static b e(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      paramIBinder = null;
    while (true)
    {
      return paramIBinder;
      IInterface localIInterface = paramIBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
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
    case 1598968902:
      for (bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2); ; bool = true)
      {
        return bool;
        paramParcel2.writeString("android.support.v4.os.IResultReceiver");
      }
    case 1:
    }
    paramParcel1.enforceInterface("android.support.v4.os.IResultReceiver");
    paramInt1 = paramParcel1.readInt();
    if (paramParcel1.readInt() != 0);
    for (paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; paramParcel1 = null)
    {
      send(paramInt1, paramParcel1);
      bool = true;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.os.b.a
 * JD-Core Version:    0.6.2
 */