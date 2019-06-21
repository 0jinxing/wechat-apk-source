package com.tencent.mm.network;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.matrix.trace.core.AppMethodBeat;

public abstract interface i extends IInterface
{
  public abstract int amP();

  public abstract void amQ();

  public abstract long amR();

  public abstract boolean c(n paramn);

  public abstract boolean d(n paramn);

  public static abstract class a extends Binder
    implements i
  {
    public a()
    {
      attachInterface(this, "com.tencent.mm.network.INetworkEvent_AIDL");
    }

    public static i n(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        paramIBinder = null;
      while (true)
      {
        return paramIBinder;
        IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.mm.network.INetworkEvent_AIDL");
        if ((localIInterface != null) && ((localIInterface instanceof i)))
          paramIBinder = (i)localIInterface;
        else
          paramIBinder = new a(paramIBinder);
      }
    }

    public IBinder asBinder()
    {
      return this;
    }

    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      int i = 0;
      int j = 0;
      boolean bool1 = true;
      switch (paramInt1)
      {
      default:
        bool1 = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      case 1598968902:
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      }
      while (true)
      {
        return bool1;
        paramParcel2.writeString("com.tencent.mm.network.INetworkEvent_AIDL");
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.network.INetworkEvent_AIDL");
        paramInt1 = amP();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.network.INetworkEvent_AIDL");
        boolean bool2 = c(n.a.p(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        paramInt1 = j;
        if (bool2)
          paramInt1 = 1;
        paramParcel2.writeInt(paramInt1);
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.network.INetworkEvent_AIDL");
        bool2 = d(n.a.p(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        paramInt1 = i;
        if (bool2)
          paramInt1 = 1;
        paramParcel2.writeInt(paramInt1);
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.network.INetworkEvent_AIDL");
        amQ();
        paramParcel2.writeNoException();
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.network.INetworkEvent_AIDL");
        long l = amR();
        paramParcel2.writeNoException();
        paramParcel2.writeLong(l);
      }
    }

    static final class a
      implements i
    {
      private IBinder mRemote;

      a(IBinder paramIBinder)
      {
        this.mRemote = paramIBinder;
      }

      public final int amP()
      {
        AppMethodBeat.i(58519);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.INetworkEvent_AIDL");
          this.mRemote.transact(1, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          return i;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58519);
        }
      }

      public final void amQ()
      {
        AppMethodBeat.i(58522);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.INetworkEvent_AIDL");
          this.mRemote.transact(4, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58522);
        }
      }

      public final long amR()
      {
        AppMethodBeat.i(58523);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.INetworkEvent_AIDL");
          this.mRemote.transact(5, localParcel1, localParcel2, 0);
          localParcel2.readException();
          long l = localParcel2.readLong();
          return l;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58523);
        }
      }

      public final IBinder asBinder()
      {
        return this.mRemote;
      }

      public final boolean c(n paramn)
      {
        boolean bool = false;
        AppMethodBeat.i(58520);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.INetworkEvent_AIDL");
          if (paramn != null);
          for (paramn = paramn.asBinder(); ; paramn = null)
          {
            localParcel1.writeStrongBinder(paramn);
            this.mRemote.transact(2, localParcel1, localParcel2, 0);
            localParcel2.readException();
            int i = localParcel2.readInt();
            if (i != 0)
              bool = true;
            return bool;
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58520);
        }
        throw paramn;
      }

      public final boolean d(n paramn)
      {
        boolean bool = false;
        AppMethodBeat.i(58521);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.INetworkEvent_AIDL");
          if (paramn != null);
          for (paramn = paramn.asBinder(); ; paramn = null)
          {
            localParcel1.writeStrongBinder(paramn);
            this.mRemote.transact(3, localParcel1, localParcel2, 0);
            localParcel2.readException();
            int i = localParcel2.readInt();
            if (i != 0)
              bool = true;
            return bool;
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58521);
        }
        throw paramn;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.i
 * JD-Core Version:    0.6.2
 */