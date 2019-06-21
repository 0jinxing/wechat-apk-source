package com.tencent.mm.protocal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.matrix.trace.core.AppMethodBeat;

public abstract interface y extends IInterface
{
  public abstract int K(byte[] paramArrayOfByte);

  public abstract byte[] Ri();

  public abstract byte[] Rj();

  public static abstract class a extends Binder
    implements y
  {
    public a()
    {
      attachInterface(this, "com.tencent.mm.protocal.MMSyncCheckCoder_AIDL");
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
      case 2:
      case 3:
      }
      while (true)
      {
        return bool;
        paramParcel2.writeString("com.tencent.mm.protocal.MMSyncCheckCoder_AIDL");
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.protocal.MMSyncCheckCoder_AIDL");
        paramParcel1 = Ri();
        paramParcel2.writeNoException();
        paramParcel2.writeByteArray(paramParcel1);
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.protocal.MMSyncCheckCoder_AIDL");
        paramParcel1 = Rj();
        paramParcel2.writeNoException();
        paramParcel2.writeByteArray(paramParcel1);
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.protocal.MMSyncCheckCoder_AIDL");
        paramInt1 = K(paramParcel1.createByteArray());
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
      }
    }

    public static final class a
      implements y
    {
      private IBinder mRemote;

      public a(IBinder paramIBinder)
      {
        this.mRemote = paramIBinder;
      }

      public final int K(byte[] paramArrayOfByte)
      {
        AppMethodBeat.i(58872);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.MMSyncCheckCoder_AIDL");
          localParcel1.writeByteArray(paramArrayOfByte);
          this.mRemote.transact(3, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          return i;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58872);
        }
        throw paramArrayOfByte;
      }

      public final byte[] Ri()
      {
        AppMethodBeat.i(58870);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.MMSyncCheckCoder_AIDL");
          this.mRemote.transact(1, localParcel1, localParcel2, 0);
          localParcel2.readException();
          byte[] arrayOfByte = localParcel2.createByteArray();
          return arrayOfByte;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58870);
        }
      }

      public final byte[] Rj()
      {
        AppMethodBeat.i(58871);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.MMSyncCheckCoder_AIDL");
          this.mRemote.transact(2, localParcel1, localParcel2, 0);
          localParcel2.readException();
          byte[] arrayOfByte = localParcel2.createByteArray();
          return arrayOfByte;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58871);
        }
      }

      public final IBinder asBinder()
      {
        return this.mRemote;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.y
 * JD-Core Version:    0.6.2
 */