package com.tencent.mm.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.matrix.trace.core.AppMethodBeat;

public abstract interface a extends IInterface
{
  public abstract void M(IBinder paramIBinder);

  public static abstract class a extends Binder
    implements a
  {
    public a()
    {
      attachInterface(this, "com.tencent.mm.service.IMMServiceConnectionStub_AIDL");
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
        paramParcel2.writeString("com.tencent.mm.service.IMMServiceConnectionStub_AIDL");
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.service.IMMServiceConnectionStub_AIDL");
        M(paramParcel1.readStrongBinder());
        paramParcel2.writeNoException();
      }
    }

    static final class a
      implements a
    {
      private IBinder mRemote;

      a(IBinder paramIBinder)
      {
        this.mRemote = paramIBinder;
      }

      public final void M(IBinder paramIBinder)
      {
        AppMethodBeat.i(115267);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.service.IMMServiceConnectionStub_AIDL");
          localParcel1.writeStrongBinder(paramIBinder);
          this.mRemote.transact(1, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(115267);
        }
        throw paramIBinder;
      }

      public final IBinder asBinder()
      {
        return this.mRemote;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.service.a
 * JD-Core Version:    0.6.2
 */