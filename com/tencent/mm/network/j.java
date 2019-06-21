package com.tencent.mm.network;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.matrix.trace.core.AppMethodBeat;

public abstract interface j extends IInterface
{
  public abstract void a(r paramr, int paramInt1, int paramInt2, String paramString);

  public static abstract class a extends Binder
    implements j
  {
    public a()
    {
      attachInterface(this, "com.tencent.mm.network.IOnAutoAuth_AIDL");
    }

    public static j o(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        paramIBinder = null;
      while (true)
      {
        return paramIBinder;
        IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.mm.network.IOnAutoAuth_AIDL");
        if ((localIInterface != null) && ((localIInterface instanceof j)))
          paramIBinder = (j)localIInterface;
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
        paramParcel2.writeString("com.tencent.mm.network.IOnAutoAuth_AIDL");
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.network.IOnAutoAuth_AIDL");
        a(r.a.q(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readString());
        paramParcel2.writeNoException();
      }
    }

    static final class a
      implements j
    {
      private IBinder mRemote;

      a(IBinder paramIBinder)
      {
        this.mRemote = paramIBinder;
      }

      public final void a(r paramr, int paramInt1, int paramInt2, String paramString)
      {
        AppMethodBeat.i(58524);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IOnAutoAuth_AIDL");
          if (paramr != null);
          for (paramr = paramr.asBinder(); ; paramr = null)
          {
            localParcel1.writeStrongBinder(paramr);
            localParcel1.writeInt(paramInt1);
            localParcel1.writeInt(paramInt2);
            localParcel1.writeString(paramString);
            this.mRemote.transact(1, localParcel1, localParcel2, 0);
            localParcel2.readException();
            return;
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58524);
        }
        throw paramr;
      }

      public final IBinder asBinder()
      {
        return this.mRemote;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.j
 * JD-Core Version:    0.6.2
 */