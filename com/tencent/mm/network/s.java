package com.tencent.mm.network;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.matrix.trace.core.AppMethodBeat;

public abstract interface s extends IInterface
{
  public abstract boolean check();

  public static abstract class a extends Binder
    implements s
  {
    public a()
    {
      attachInterface(this, "com.tencent.mm.network.IWorkerCallback_AIDL");
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
        bool1 = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      case 1598968902:
        while (true)
        {
          return bool1;
          paramParcel2.writeString("com.tencent.mm.network.IWorkerCallback_AIDL");
        }
      case 1:
      }
      paramParcel1.enforceInterface("com.tencent.mm.network.IWorkerCallback_AIDL");
      boolean bool2 = check();
      paramParcel2.writeNoException();
      if (bool2);
      for (paramInt1 = 1; ; paramInt1 = 0)
      {
        paramParcel2.writeInt(paramInt1);
        break;
      }
    }

    static final class a
      implements s
    {
      private IBinder mRemote;

      a(IBinder paramIBinder)
      {
        this.mRemote = paramIBinder;
      }

      public final IBinder asBinder()
      {
        return this.mRemote;
      }

      public final boolean check()
      {
        boolean bool = true;
        AppMethodBeat.i(58550);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IWorkerCallback_AIDL");
          this.mRemote.transact(1, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          if (i != 0)
            return bool;
          bool = false;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58550);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.s
 * JD-Core Version:    0.6.2
 */