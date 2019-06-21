package com.tencent.wcdb.support;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.matrix.trace.core.AppMethodBeat;

public abstract interface ICancellationSignal extends IInterface
{
  public abstract void cancel();

  public static abstract class Stub extends Binder
    implements ICancellationSignal
  {
    private static final String DESCRIPTOR = "com.tencent.wcdb.support.ICancellationSignal";
    static final int TRANSACTION_cancel = 1;

    public Stub()
    {
      attachInterface(this, "com.tencent.wcdb.support.ICancellationSignal");
    }

    public static ICancellationSignal asInterface(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        paramIBinder = null;
      while (true)
      {
        return paramIBinder;
        IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.wcdb.support.ICancellationSignal");
        if ((localIInterface != null) && ((localIInterface instanceof ICancellationSignal)))
          paramIBinder = (ICancellationSignal)localIInterface;
        else
          paramIBinder = new Proxy(paramIBinder);
      }
    }

    public IBinder asBinder()
    {
      return this;
    }

    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      boolean bool = true;
      switch (paramInt1)
      {
      default:
        bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      case 1598968902:
      case 1:
      }
      while (true)
      {
        return bool;
        paramParcel2.writeString("com.tencent.wcdb.support.ICancellationSignal");
        continue;
        paramParcel1.enforceInterface("com.tencent.wcdb.support.ICancellationSignal");
        cancel();
      }
    }

    static class Proxy
      implements ICancellationSignal
    {
      private IBinder mRemote;

      Proxy(IBinder paramIBinder)
      {
        this.mRemote = paramIBinder;
      }

      public IBinder asBinder()
      {
        return this.mRemote;
      }

      public void cancel()
      {
        AppMethodBeat.i(12708);
        Parcel localParcel = Parcel.obtain();
        try
        {
          localParcel.writeInterfaceToken("com.tencent.wcdb.support.ICancellationSignal");
          this.mRemote.transact(1, localParcel, null, 1);
          return;
        }
        finally
        {
          localParcel.recycle();
          AppMethodBeat.o(12708);
        }
      }

      public String getInterfaceDescriptor()
      {
        return "com.tencent.wcdb.support.ICancellationSignal";
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.wcdb.support.ICancellationSignal
 * JD-Core Version:    0.6.2
 */