package com.tencent.mm.network;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.matrix.trace.core.AppMethodBeat;

public abstract interface l extends IInterface
{
  public abstract void a(int paramInt1, int paramInt2, int paramInt3, String paramString, r paramr, byte[] paramArrayOfByte);

  public static abstract class a extends Binder
    implements l
  {
    public a()
    {
      attachInterface(this, "com.tencent.mm.network.IOnGYNetEnd_AIDL");
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
      }
      while (true)
      {
        return bool;
        paramParcel2.writeString("com.tencent.mm.network.IOnGYNetEnd_AIDL");
        bool = true;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.network.IOnGYNetEnd_AIDL");
        a(paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readString(), r.a.q(paramParcel1.readStrongBinder()), paramParcel1.createByteArray());
        paramParcel2.writeNoException();
        bool = true;
      }
    }

    static final class a
      implements l
    {
      private IBinder mRemote;

      a(IBinder paramIBinder)
      {
        this.mRemote = paramIBinder;
      }

      public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, r paramr, byte[] paramArrayOfByte)
      {
        AppMethodBeat.i(58525);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IOnGYNetEnd_AIDL");
          localParcel1.writeInt(paramInt1);
          localParcel1.writeInt(paramInt2);
          localParcel1.writeInt(paramInt3);
          localParcel1.writeString(paramString);
          if (paramr != null);
          for (paramString = paramr.asBinder(); ; paramString = null)
          {
            localParcel1.writeStrongBinder(paramString);
            localParcel1.writeByteArray(paramArrayOfByte);
            this.mRemote.transact(1, localParcel1, localParcel2, 0);
            localParcel2.readException();
            return;
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58525);
        }
        throw paramString;
      }

      public final IBinder asBinder()
      {
        return this.mRemote;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.l
 * JD-Core Version:    0.6.2
 */