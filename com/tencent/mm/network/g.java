package com.tencent.mm.network;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.matrix.trace.core.AppMethodBeat;

public abstract interface g extends IInterface
{
  public abstract void gi(int paramInt);

  public static abstract class a extends Binder
    implements g
  {
    public a()
    {
      attachInterface(this, "com.tencent.mm.network.IIpxxCallback_AIDL");
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
        paramParcel2.writeString("com.tencent.mm.network.IIpxxCallback_AIDL");
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.network.IIpxxCallback_AIDL");
        gi(paramParcel1.readInt());
        paramParcel2.writeNoException();
      }
    }

    static final class a
      implements g
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

      public final void gi(int paramInt)
      {
        AppMethodBeat.i(58517);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IIpxxCallback_AIDL");
          localParcel1.writeInt(paramInt);
          this.mRemote.transact(1, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58517);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.g
 * JD-Core Version:    0.6.2
 */