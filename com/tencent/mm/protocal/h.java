package com.tencent.mm.protocal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.matrix.trace.core.AppMethodBeat;

public abstract interface h extends IInterface
{
  public abstract int QF();

  public abstract void T(byte[] paramArrayOfByte);

  public abstract void U(byte[] paramArrayOfByte);

  public abstract boolean a(int paramInt1, byte[] paramArrayOfByte1, int paramInt2, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3, int paramInt3, boolean paramBoolean);

  public abstract byte[] adk();

  public abstract byte[] adl();

  public abstract String adm();

  public abstract String adn();

  public abstract int ado();

  public abstract byte[] adp();

  public abstract String adq();

  public abstract boolean adr();

  public abstract long ads();

  public abstract int getClientVersion();

  public abstract int getCmdId();

  public abstract String getPassword();

  public abstract String getUserName();

  public abstract void hB(int paramInt);

  public abstract void kY(int paramInt);

  public abstract void kZ(int paramInt);

  public abstract void qu(String paramString);

  public abstract void qv(String paramString);

  public static abstract class a extends Binder
    implements h
  {
    public a()
    {
      attachInterface(this, "com.tencent.mm.protocal.IMMBaseReq_AIDL");
    }

    public static h J(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        paramIBinder = null;
      while (true)
      {
        return paramIBinder;
        IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.mm.protocal.IMMBaseReq_AIDL");
        if ((localIInterface != null) && ((localIInterface instanceof h)))
          paramIBinder = (h)localIInterface;
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
      boolean bool2;
      switch (paramInt1)
      {
      default:
        bool2 = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
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
      case 15:
      case 16:
      case 17:
      case 18:
      case 19:
      case 20:
      case 21:
      case 22:
      }
      while (true)
      {
        return bool2;
        paramParcel2.writeString("com.tencent.mm.protocal.IMMBaseReq_AIDL");
        bool2 = bool1;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseReq_AIDL");
        paramInt1 = paramParcel1.readInt();
        byte[] arrayOfByte1 = paramParcel1.createByteArray();
        paramInt2 = paramParcel1.readInt();
        byte[] arrayOfByte2 = paramParcel1.createByteArray();
        byte[] arrayOfByte3 = paramParcel1.createByteArray();
        i = paramParcel1.readInt();
        if (paramParcel1.readInt() != 0);
        for (bool2 = true; ; bool2 = false)
        {
          bool2 = a(paramInt1, arrayOfByte1, paramInt2, arrayOfByte2, arrayOfByte3, i, bool2);
          paramParcel2.writeNoException();
          paramInt1 = j;
          if (bool2)
            paramInt1 = 1;
          paramParcel2.writeInt(paramInt1);
          bool2 = bool1;
          break;
        }
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseReq_AIDL");
        paramParcel1 = adk();
        paramParcel2.writeNoException();
        paramParcel2.writeByteArray(paramParcel1);
        bool2 = bool1;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseReq_AIDL");
        T(paramParcel1.createByteArray());
        paramParcel2.writeNoException();
        bool2 = bool1;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseReq_AIDL");
        paramParcel1 = adl();
        paramParcel2.writeNoException();
        paramParcel2.writeByteArray(paramParcel1);
        bool2 = bool1;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseReq_AIDL");
        hB(paramParcel1.readInt());
        paramParcel2.writeNoException();
        bool2 = bool1;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseReq_AIDL");
        paramInt1 = QF();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        bool2 = bool1;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseReq_AIDL");
        kY(paramParcel1.readInt());
        paramParcel2.writeNoException();
        bool2 = bool1;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseReq_AIDL");
        paramInt1 = getClientVersion();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        bool2 = bool1;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseReq_AIDL");
        qu(paramParcel1.readString());
        paramParcel2.writeNoException();
        bool2 = bool1;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseReq_AIDL");
        paramParcel1 = adm();
        paramParcel2.writeNoException();
        paramParcel2.writeString(paramParcel1);
        bool2 = bool1;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseReq_AIDL");
        paramParcel1 = adn();
        paramParcel2.writeNoException();
        paramParcel2.writeString(paramParcel1);
        bool2 = bool1;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseReq_AIDL");
        qv(paramParcel1.readString());
        paramParcel2.writeNoException();
        bool2 = bool1;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseReq_AIDL");
        kZ(paramParcel1.readInt());
        paramParcel2.writeNoException();
        bool2 = bool1;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseReq_AIDL");
        paramInt1 = ado();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        bool2 = bool1;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseReq_AIDL");
        paramParcel1 = adp();
        paramParcel2.writeNoException();
        paramParcel2.writeByteArray(paramParcel1);
        bool2 = bool1;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseReq_AIDL");
        U(paramParcel1.createByteArray());
        paramParcel2.writeNoException();
        bool2 = bool1;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseReq_AIDL");
        paramParcel1 = getUserName();
        paramParcel2.writeNoException();
        paramParcel2.writeString(paramParcel1);
        bool2 = bool1;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseReq_AIDL");
        paramParcel1 = getPassword();
        paramParcel2.writeNoException();
        paramParcel2.writeString(paramParcel1);
        bool2 = bool1;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseReq_AIDL");
        paramParcel1 = adq();
        paramParcel2.writeNoException();
        paramParcel2.writeString(paramParcel1);
        bool2 = bool1;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseReq_AIDL");
        paramInt1 = getCmdId();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        bool2 = bool1;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseReq_AIDL");
        bool2 = adr();
        paramParcel2.writeNoException();
        paramInt1 = i;
        if (bool2)
          paramInt1 = 1;
        paramParcel2.writeInt(paramInt1);
        bool2 = bool1;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseReq_AIDL");
        long l = ads();
        paramParcel2.writeNoException();
        paramParcel2.writeLong(l);
        bool2 = bool1;
      }
    }

    static final class a
      implements h
    {
      private IBinder mRemote;

      a(IBinder paramIBinder)
      {
        this.mRemote = paramIBinder;
      }

      public final int QF()
      {
        AppMethodBeat.i(58800);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
          this.mRemote.transact(6, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          return i;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58800);
        }
      }

      public final void T(byte[] paramArrayOfByte)
      {
        AppMethodBeat.i(58797);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
          localParcel1.writeByteArray(paramArrayOfByte);
          this.mRemote.transact(3, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58797);
        }
        throw paramArrayOfByte;
      }

      public final void U(byte[] paramArrayOfByte)
      {
        AppMethodBeat.i(58810);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
          localParcel1.writeByteArray(paramArrayOfByte);
          this.mRemote.transact(16, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58810);
        }
        throw paramArrayOfByte;
      }

      public final boolean a(int paramInt1, byte[] paramArrayOfByte1, int paramInt2, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3, int paramInt3, boolean paramBoolean)
      {
        boolean bool = true;
        AppMethodBeat.i(58795);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
          localParcel1.writeInt(paramInt1);
          localParcel1.writeByteArray(paramArrayOfByte1);
          localParcel1.writeInt(paramInt2);
          localParcel1.writeByteArray(paramArrayOfByte2);
          localParcel1.writeByteArray(paramArrayOfByte3);
          localParcel1.writeInt(paramInt3);
          if (paramBoolean)
          {
            paramInt1 = 1;
            localParcel1.writeInt(paramInt1);
            this.mRemote.transact(1, localParcel1, localParcel2, 0);
            localParcel2.readException();
            paramInt1 = localParcel2.readInt();
            if (paramInt1 == 0)
              break label135;
          }
          label135: for (paramBoolean = bool; ; paramBoolean = false)
          {
            return paramBoolean;
            paramInt1 = 0;
            break;
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58795);
        }
        throw paramArrayOfByte1;
      }

      public final byte[] adk()
      {
        AppMethodBeat.i(58796);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
          this.mRemote.transact(2, localParcel1, localParcel2, 0);
          localParcel2.readException();
          byte[] arrayOfByte = localParcel2.createByteArray();
          return arrayOfByte;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58796);
        }
      }

      public final byte[] adl()
      {
        AppMethodBeat.i(58798);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
          this.mRemote.transact(4, localParcel1, localParcel2, 0);
          localParcel2.readException();
          byte[] arrayOfByte = localParcel2.createByteArray();
          return arrayOfByte;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58798);
        }
      }

      public final String adm()
      {
        AppMethodBeat.i(58804);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
          this.mRemote.transact(10, localParcel1, localParcel2, 0);
          localParcel2.readException();
          String str = localParcel2.readString();
          return str;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58804);
        }
      }

      public final String adn()
      {
        AppMethodBeat.i(58805);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
          this.mRemote.transact(11, localParcel1, localParcel2, 0);
          localParcel2.readException();
          String str = localParcel2.readString();
          return str;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58805);
        }
      }

      public final int ado()
      {
        AppMethodBeat.i(58808);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
          this.mRemote.transact(14, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          return i;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58808);
        }
      }

      public final byte[] adp()
      {
        AppMethodBeat.i(58809);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
          this.mRemote.transact(15, localParcel1, localParcel2, 0);
          localParcel2.readException();
          byte[] arrayOfByte = localParcel2.createByteArray();
          return arrayOfByte;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58809);
        }
      }

      public final String adq()
      {
        AppMethodBeat.i(58813);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
          this.mRemote.transact(19, localParcel1, localParcel2, 0);
          localParcel2.readException();
          String str = localParcel2.readString();
          return str;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58813);
        }
      }

      public final boolean adr()
      {
        boolean bool = false;
        AppMethodBeat.i(58815);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
          this.mRemote.transact(21, localParcel1, localParcel2, 0);
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
          AppMethodBeat.o(58815);
        }
      }

      public final long ads()
      {
        AppMethodBeat.i(58816);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
          this.mRemote.transact(22, localParcel1, localParcel2, 0);
          localParcel2.readException();
          long l = localParcel2.readLong();
          return l;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58816);
        }
      }

      public final IBinder asBinder()
      {
        return this.mRemote;
      }

      public final int getClientVersion()
      {
        AppMethodBeat.i(58802);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
          this.mRemote.transact(8, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          return i;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58802);
        }
      }

      public final int getCmdId()
      {
        AppMethodBeat.i(58814);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
          this.mRemote.transact(20, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          return i;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58814);
        }
      }

      public final String getPassword()
      {
        AppMethodBeat.i(58812);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
          this.mRemote.transact(18, localParcel1, localParcel2, 0);
          localParcel2.readException();
          String str = localParcel2.readString();
          return str;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58812);
        }
      }

      public final String getUserName()
      {
        AppMethodBeat.i(58811);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
          this.mRemote.transact(17, localParcel1, localParcel2, 0);
          localParcel2.readException();
          String str = localParcel2.readString();
          return str;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58811);
        }
      }

      public final void hB(int paramInt)
      {
        AppMethodBeat.i(58799);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
          localParcel1.writeInt(paramInt);
          this.mRemote.transact(5, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58799);
        }
      }

      public final void kY(int paramInt)
      {
        AppMethodBeat.i(58801);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
          localParcel1.writeInt(paramInt);
          this.mRemote.transact(7, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58801);
        }
      }

      public final void kZ(int paramInt)
      {
        AppMethodBeat.i(58807);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
          localParcel1.writeInt(paramInt);
          this.mRemote.transact(13, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58807);
        }
      }

      public final void qu(String paramString)
      {
        AppMethodBeat.i(58803);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
          localParcel1.writeString(paramString);
          this.mRemote.transact(9, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58803);
        }
        throw paramString;
      }

      public final void qv(String paramString)
      {
        AppMethodBeat.i(58806);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
          localParcel1.writeString(paramString);
          this.mRemote.transact(12, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58806);
        }
        throw paramString;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.h
 * JD-Core Version:    0.6.2
 */