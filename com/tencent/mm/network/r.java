package com.tencent.mm.network;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.h;
import com.tencent.mm.protocal.h.a;
import com.tencent.mm.protocal.i;
import com.tencent.mm.protocal.i.a;

public abstract interface r extends IInterface
{
  public abstract void a(d paramd, j paramj, int paramInt1, int paramInt2);

  public abstract void a(j paramj, int paramInt1, int paramInt2);

  public abstract void a(j paramj, int paramInt1, int paramInt2, String paramString);

  public abstract int acB();

  public abstract int acC();

  public abstract boolean acG();

  public abstract boolean acH();

  public abstract int acO();

  public abstract h adt();

  public abstract i adu();

  public abstract int adv();

  public abstract int getType();

  public abstract String getUri();

  public abstract void qw(String paramString);

  public static abstract class a extends Binder
    implements r
  {
    public a()
    {
      attachInterface(this, "com.tencent.mm.network.IReqResp_AIDL");
    }

    public static r q(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        paramIBinder = null;
      while (true)
      {
        return paramIBinder;
        IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.mm.network.IReqResp_AIDL");
        if ((localIInterface != null) && ((localIInterface instanceof r)))
          paramIBinder = (r)localIInterface;
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
      i locali = null;
      h localh = null;
      int i = 0;
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
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
      case 11:
      case 12:
      case 13:
      case 14:
      }
      while (true)
      {
        return bool1;
        paramParcel2.writeString("com.tencent.mm.network.IReqResp_AIDL");
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.network.IReqResp_AIDL");
        paramInt1 = getType();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.network.IReqResp_AIDL");
        paramParcel1 = getUri();
        paramParcel2.writeNoException();
        paramParcel2.writeString(paramParcel1);
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.network.IReqResp_AIDL");
        locali = adu();
        paramParcel2.writeNoException();
        paramParcel1 = localh;
        if (locali != null)
          paramParcel1 = locali.asBinder();
        paramParcel2.writeStrongBinder(paramParcel1);
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.network.IReqResp_AIDL");
        localh = adt();
        paramParcel2.writeNoException();
        paramParcel1 = locali;
        if (localh != null)
          paramParcel1 = localh.asBinder();
        paramParcel2.writeStrongBinder(paramParcel1);
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.network.IReqResp_AIDL");
        a(j.a.o(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readInt());
        paramParcel2.writeNoException();
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.network.IReqResp_AIDL");
        paramInt1 = acO();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.network.IReqResp_AIDL");
        boolean bool2 = acG();
        paramParcel2.writeNoException();
        if (bool2);
        for (paramInt1 = 1; ; paramInt1 = 0)
        {
          paramParcel2.writeInt(paramInt1);
          break;
        }
        paramParcel1.enforceInterface("com.tencent.mm.network.IReqResp_AIDL");
        paramInt1 = acC();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.network.IReqResp_AIDL");
        qw(paramParcel1.readString());
        paramParcel2.writeNoException();
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.network.IReqResp_AIDL");
        a(j.a.o(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readString());
        paramParcel2.writeNoException();
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.network.IReqResp_AIDL");
        a(d.a.l(paramParcel1.readStrongBinder()), j.a.o(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readInt());
        paramParcel2.writeNoException();
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.network.IReqResp_AIDL");
        paramInt1 = adv();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.network.IReqResp_AIDL");
        paramInt1 = acB();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.network.IReqResp_AIDL");
        bool2 = acH();
        paramParcel2.writeNoException();
        paramInt1 = i;
        if (bool2)
          paramInt1 = 1;
        paramParcel2.writeInt(paramInt1);
      }
    }

    static final class a
      implements r
    {
      private IBinder mRemote;

      a(IBinder paramIBinder)
      {
        this.mRemote = paramIBinder;
      }

      public final void a(d paramd, j paramj, int paramInt1, int paramInt2)
      {
        Object localObject = null;
        AppMethodBeat.i(58546);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
          if (paramd != null);
          for (paramd = paramd.asBinder(); ; paramd = null)
          {
            localParcel1.writeStrongBinder(paramd);
            paramd = localObject;
            if (paramj != null)
              paramd = paramj.asBinder();
            localParcel1.writeStrongBinder(paramd);
            localParcel1.writeInt(paramInt1);
            localParcel1.writeInt(paramInt2);
            this.mRemote.transact(11, localParcel1, localParcel2, 0);
            localParcel2.readException();
            return;
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58546);
        }
        throw paramd;
      }

      public final void a(j paramj, int paramInt1, int paramInt2)
      {
        AppMethodBeat.i(58540);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
          if (paramj != null);
          for (paramj = paramj.asBinder(); ; paramj = null)
          {
            localParcel1.writeStrongBinder(paramj);
            localParcel1.writeInt(paramInt1);
            localParcel1.writeInt(paramInt2);
            this.mRemote.transact(5, localParcel1, localParcel2, 0);
            localParcel2.readException();
            return;
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58540);
        }
        throw paramj;
      }

      public final void a(j paramj, int paramInt1, int paramInt2, String paramString)
      {
        AppMethodBeat.i(58545);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
          if (paramj != null);
          for (paramj = paramj.asBinder(); ; paramj = null)
          {
            localParcel1.writeStrongBinder(paramj);
            localParcel1.writeInt(paramInt1);
            localParcel1.writeInt(paramInt2);
            localParcel1.writeString(paramString);
            this.mRemote.transact(10, localParcel1, localParcel2, 0);
            localParcel2.readException();
            return;
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58545);
        }
        throw paramj;
      }

      public final int acB()
      {
        AppMethodBeat.i(58548);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
          this.mRemote.transact(13, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          return i;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58548);
        }
      }

      public final int acC()
      {
        AppMethodBeat.i(58543);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
          this.mRemote.transact(8, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          return i;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58543);
        }
      }

      public final boolean acG()
      {
        boolean bool = false;
        AppMethodBeat.i(58542);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
          this.mRemote.transact(7, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          if (i != 0)
            bool = true;
          return bool;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58542);
        }
      }

      public final boolean acH()
      {
        boolean bool = false;
        AppMethodBeat.i(58549);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
          this.mRemote.transact(14, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          if (i != 0)
            bool = true;
          return bool;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58549);
        }
      }

      public final int acO()
      {
        AppMethodBeat.i(58541);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
          this.mRemote.transact(6, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          return i;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58541);
        }
      }

      public final h adt()
      {
        AppMethodBeat.i(58539);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
          this.mRemote.transact(4, localParcel1, localParcel2, 0);
          localParcel2.readException();
          h localh = h.a.J(localParcel2.readStrongBinder());
          return localh;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58539);
        }
      }

      public final i adu()
      {
        AppMethodBeat.i(58538);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
          this.mRemote.transact(3, localParcel1, localParcel2, 0);
          localParcel2.readException();
          i locali = i.a.K(localParcel2.readStrongBinder());
          return locali;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58538);
        }
      }

      public final int adv()
      {
        AppMethodBeat.i(58547);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
          this.mRemote.transact(12, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          return i;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58547);
        }
      }

      public final IBinder asBinder()
      {
        return this.mRemote;
      }

      public final int getType()
      {
        AppMethodBeat.i(58536);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
          this.mRemote.transact(1, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          return i;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58536);
        }
      }

      public final String getUri()
      {
        AppMethodBeat.i(58537);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
          this.mRemote.transact(2, localParcel1, localParcel2, 0);
          localParcel2.readException();
          String str = localParcel2.readString();
          return str;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58537);
        }
      }

      public final void qw(String paramString)
      {
        AppMethodBeat.i(58544);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
          localParcel1.writeString(paramString);
          this.mRemote.transact(9, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58544);
        }
        throw paramString;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.r
 * JD-Core Version:    0.6.2
 */