package android.support.v4.os;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

final class b$a$a
  implements b
{
  private IBinder mRemote;

  b$a$a(IBinder paramIBinder)
  {
    this.mRemote = paramIBinder;
  }

  public final IBinder asBinder()
  {
    return this.mRemote;
  }

  public final void send(int paramInt, Bundle paramBundle)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("android.support.v4.os.IResultReceiver");
      localParcel.writeInt(paramInt);
      if (paramBundle != null)
      {
        localParcel.writeInt(1);
        paramBundle.writeToParcel(localParcel, 0);
      }
      while (true)
      {
        this.mRemote.transact(1, localParcel, null, 1);
        return;
        localParcel.writeInt(0);
      }
    }
    finally
    {
      localParcel.recycle();
    }
    throw paramBundle;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     android.support.v4.os.b.a.a
 * JD-Core Version:    0.6.2
 */