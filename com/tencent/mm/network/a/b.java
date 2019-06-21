package com.tencent.mm.network.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.matrix.trace.core.AppMethodBeat;

public abstract interface b extends IInterface
{
  public abstract void a(int paramInt1, int paramInt2, String paramString1, int paramInt3, String paramString2, boolean paramBoolean);

  public abstract void u(int paramInt1, int paramInt2, int paramInt3, int paramInt4);

  public static abstract class a extends Binder
    implements b
  {
    public a()
    {
      attachInterface(this, "com.tencent.mm.network.connpool.IConnPoolMoniter_AIDL");
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
        bool2 = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      case 1598968902:
      case 1:
      case 2:
      }
      while (true)
      {
        return bool2;
        paramParcel2.writeString("com.tencent.mm.network.connpool.IConnPoolMoniter_AIDL");
        bool2 = bool1;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.network.connpool.IConnPoolMoniter_AIDL");
        paramInt2 = paramParcel1.readInt();
        int i = paramParcel1.readInt();
        String str1 = paramParcel1.readString();
        paramInt1 = paramParcel1.readInt();
        String str2 = paramParcel1.readString();
        if (paramParcel1.readInt() != 0);
        for (bool2 = true; ; bool2 = false)
        {
          a(paramInt2, i, str1, paramInt1, str2, bool2);
          paramParcel2.writeNoException();
          bool2 = bool1;
          break;
        }
        paramParcel1.enforceInterface("com.tencent.mm.network.connpool.IConnPoolMoniter_AIDL");
        u(paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readInt());
        paramParcel2.writeNoException();
        bool2 = bool1;
      }
    }

    public static final class a
      implements b
    {
      private IBinder mRemote;

      public a(IBinder paramIBinder)
      {
        this.mRemote = paramIBinder;
      }

      public final void a(int paramInt1, int paramInt2, String paramString1, int paramInt3, String paramString2, boolean paramBoolean)
      {
        int i = 1;
        AppMethodBeat.i(58713);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.connpool.IConnPoolMoniter_AIDL");
          localParcel1.writeInt(paramInt1);
          localParcel1.writeInt(paramInt2);
          localParcel1.writeString(paramString1);
          localParcel1.writeInt(paramInt3);
          localParcel1.writeString(paramString2);
          if (paramBoolean);
          for (paramInt1 = i; ; paramInt1 = 0)
          {
            localParcel1.writeInt(paramInt1);
            this.mRemote.transact(1, localParcel1, localParcel2, 0);
            localParcel2.readException();
            return;
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58713);
        }
        throw paramString1;
      }

      public final IBinder asBinder()
      {
        return this.mRemote;
      }

      public final void u(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
      {
        AppMethodBeat.i(58714);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.connpool.IConnPoolMoniter_AIDL");
          localParcel1.writeInt(paramInt1);
          localParcel1.writeInt(paramInt2);
          localParcel1.writeInt(paramInt3);
          localParcel1.writeInt(paramInt4);
          this.mRemote.transact(2, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58714);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.a.b
 * JD-Core Version:    0.6.2
 */