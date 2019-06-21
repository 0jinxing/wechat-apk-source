package com.tencent.mm.network;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.matrix.trace.core.AppMethodBeat;

public abstract interface o extends IInterface
{
  public abstract void reportKV(long paramLong, String paramString, boolean paramBoolean1, boolean paramBoolean2);

  public static abstract class a extends Binder
    implements o
  {
    public a()
    {
      attachInterface(this, "com.tencent.mm.network.IOnReportKV_AIDL");
    }

    public IBinder asBinder()
    {
      return this;
    }

    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      boolean bool1 = true;
      boolean bool2;
      switch (paramInt1)
      {
      default:
      case 1598968902:
        for (bool2 = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2); ; bool2 = bool1)
        {
          return bool2;
          paramParcel2.writeString("com.tencent.mm.network.IOnReportKV_AIDL");
        }
      case 1:
      }
      paramParcel1.enforceInterface("com.tencent.mm.network.IOnReportKV_AIDL");
      long l = paramParcel1.readLong();
      String str = paramParcel1.readString();
      if (paramParcel1.readInt() != 0)
      {
        bool2 = true;
        label87: if (paramParcel1.readInt() == 0)
          break label126;
      }
      label126: for (boolean bool3 = true; ; bool3 = false)
      {
        reportKV(l, str, bool2, bool3);
        paramParcel2.writeNoException();
        bool2 = bool1;
        break;
        bool2 = false;
        break label87;
      }
    }

    static final class a
      implements o
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

      public final void reportKV(long paramLong, String paramString, boolean paramBoolean1, boolean paramBoolean2)
      {
        int i = 1;
        AppMethodBeat.i(58527);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IOnReportKV_AIDL");
          localParcel1.writeLong(paramLong);
          localParcel1.writeString(paramString);
          if (paramBoolean1)
          {
            j = 1;
            localParcel1.writeInt(j);
            if (!paramBoolean2)
              break label111;
          }
          label111: for (int j = i; ; j = 0)
          {
            localParcel1.writeInt(j);
            this.mRemote.transact(1, localParcel1, localParcel2, 0);
            localParcel2.readException();
            return;
            j = 0;
            break;
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58527);
        }
        throw paramString;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.o
 * JD-Core Version:    0.6.2
 */