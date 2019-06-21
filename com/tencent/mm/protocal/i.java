package com.tencent.mm.protocal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.matrix.trace.core.AppMethodBeat;

public abstract interface i extends IInterface
{
  public abstract int QF();

  public abstract boolean a(int paramInt, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, long paramLong);

  public abstract String adA();

  public abstract String adB();

  public abstract int adC();

  public abstract String adD();

  public abstract byte[] ada();

  public abstract byte[] adc();

  public abstract int adw();

  public abstract String adx();

  public abstract int ady();

  public abstract byte[] adz();

  public abstract int getCmdId();

  public abstract byte[] jQ(int paramInt);

  public abstract void la(int paramInt);

  public abstract void qx(String paramString);

  public static abstract class a extends Binder
    implements i
  {
    public a()
    {
      attachInterface(this, "com.tencent.mm.protocal.IMMBaseResp_AIDL");
    }

    public static i K(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        paramIBinder = null;
      while (true)
      {
        return paramIBinder;
        IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.mm.protocal.IMMBaseResp_AIDL");
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
      case 15:
      case 16:
      }
      while (true)
      {
        return bool1;
        paramParcel2.writeString("com.tencent.mm.protocal.IMMBaseResp_AIDL");
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseResp_AIDL");
        boolean bool2 = a(paramParcel1.readInt(), paramParcel1.createByteArray(), paramParcel1.createByteArray(), paramParcel1.readLong());
        paramParcel2.writeNoException();
        if (bool2);
        for (paramInt1 = 1; ; paramInt1 = 0)
        {
          paramParcel2.writeInt(paramInt1);
          break;
        }
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseResp_AIDL");
        paramParcel1 = ada();
        paramParcel2.writeNoException();
        paramParcel2.writeByteArray(paramParcel1);
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseResp_AIDL");
        la(paramParcel1.readInt());
        paramParcel2.writeNoException();
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseResp_AIDL");
        paramInt1 = ady();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseResp_AIDL");
        paramInt1 = adw();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseResp_AIDL");
        paramParcel1 = adx();
        paramParcel2.writeNoException();
        paramParcel2.writeString(paramParcel1);
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseResp_AIDL");
        qx(paramParcel1.readString());
        paramParcel2.writeNoException();
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseResp_AIDL");
        paramParcel1 = jQ(paramParcel1.readInt());
        paramParcel2.writeNoException();
        paramParcel2.writeByteArray(paramParcel1);
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseResp_AIDL");
        paramParcel1 = adz();
        paramParcel2.writeNoException();
        paramParcel2.writeByteArray(paramParcel1);
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseResp_AIDL");
        paramParcel1 = adc();
        paramParcel2.writeNoException();
        paramParcel2.writeByteArray(paramParcel1);
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseResp_AIDL");
        paramInt1 = QF();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseResp_AIDL");
        paramParcel1 = adD();
        paramParcel2.writeNoException();
        paramParcel2.writeString(paramParcel1);
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseResp_AIDL");
        paramInt1 = getCmdId();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseResp_AIDL");
        paramParcel1 = adA();
        paramParcel2.writeNoException();
        paramParcel2.writeString(paramParcel1);
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseResp_AIDL");
        paramParcel1 = adB();
        paramParcel2.writeNoException();
        paramParcel2.writeString(paramParcel1);
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseResp_AIDL");
        paramInt1 = adC();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
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

      public final int QF()
      {
        AppMethodBeat.i(58827);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseResp_AIDL");
          this.mRemote.transact(11, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          return i;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58827);
        }
      }

      public final boolean a(int paramInt, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, long paramLong)
      {
        boolean bool = true;
        AppMethodBeat.i(58817);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseResp_AIDL");
          localParcel1.writeInt(paramInt);
          localParcel1.writeByteArray(paramArrayOfByte1);
          localParcel1.writeByteArray(paramArrayOfByte2);
          localParcel1.writeLong(paramLong);
          this.mRemote.transact(1, localParcel1, localParcel2, 0);
          localParcel2.readException();
          paramInt = localParcel2.readInt();
          if (paramInt != 0)
            return bool;
          bool = false;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58817);
        }
      }

      public final String adA()
      {
        AppMethodBeat.i(58830);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseResp_AIDL");
          this.mRemote.transact(14, localParcel1, localParcel2, 0);
          localParcel2.readException();
          String str = localParcel2.readString();
          return str;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58830);
        }
      }

      public final String adB()
      {
        AppMethodBeat.i(58831);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseResp_AIDL");
          this.mRemote.transact(15, localParcel1, localParcel2, 0);
          localParcel2.readException();
          String str = localParcel2.readString();
          return str;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58831);
        }
      }

      public final int adC()
      {
        AppMethodBeat.i(58832);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseResp_AIDL");
          this.mRemote.transact(16, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          return i;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58832);
        }
      }

      public final String adD()
      {
        AppMethodBeat.i(58828);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseResp_AIDL");
          this.mRemote.transact(12, localParcel1, localParcel2, 0);
          localParcel2.readException();
          String str = localParcel2.readString();
          return str;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58828);
        }
      }

      public final byte[] ada()
      {
        AppMethodBeat.i(58818);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseResp_AIDL");
          this.mRemote.transact(2, localParcel1, localParcel2, 0);
          localParcel2.readException();
          byte[] arrayOfByte = localParcel2.createByteArray();
          return arrayOfByte;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58818);
        }
      }

      public final byte[] adc()
      {
        AppMethodBeat.i(58826);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseResp_AIDL");
          this.mRemote.transact(10, localParcel1, localParcel2, 0);
          localParcel2.readException();
          byte[] arrayOfByte = localParcel2.createByteArray();
          return arrayOfByte;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58826);
        }
      }

      public final int adw()
      {
        AppMethodBeat.i(58821);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseResp_AIDL");
          this.mRemote.transact(5, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          return i;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58821);
        }
      }

      public final String adx()
      {
        AppMethodBeat.i(58822);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseResp_AIDL");
          this.mRemote.transact(6, localParcel1, localParcel2, 0);
          localParcel2.readException();
          String str = localParcel2.readString();
          return str;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58822);
        }
      }

      public final int ady()
      {
        AppMethodBeat.i(58820);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseResp_AIDL");
          this.mRemote.transact(4, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          return i;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58820);
        }
      }

      public final byte[] adz()
      {
        AppMethodBeat.i(58825);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseResp_AIDL");
          this.mRemote.transact(9, localParcel1, localParcel2, 0);
          localParcel2.readException();
          byte[] arrayOfByte = localParcel2.createByteArray();
          return arrayOfByte;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58825);
        }
      }

      public final IBinder asBinder()
      {
        return this.mRemote;
      }

      public final int getCmdId()
      {
        AppMethodBeat.i(58829);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseResp_AIDL");
          this.mRemote.transact(13, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          return i;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58829);
        }
      }

      public final byte[] jQ(int paramInt)
      {
        AppMethodBeat.i(58824);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseResp_AIDL");
          localParcel1.writeInt(paramInt);
          this.mRemote.transact(8, localParcel1, localParcel2, 0);
          localParcel2.readException();
          byte[] arrayOfByte = localParcel2.createByteArray();
          return arrayOfByte;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58824);
        }
      }

      public final void la(int paramInt)
      {
        AppMethodBeat.i(58819);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseResp_AIDL");
          localParcel1.writeInt(paramInt);
          this.mRemote.transact(3, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58819);
        }
      }

      public final void qx(String paramString)
      {
        AppMethodBeat.i(58823);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseResp_AIDL");
          localParcel1.writeString(paramString);
          this.mRemote.transact(7, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58823);
        }
        throw paramString;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.i
 * JD-Core Version:    0.6.2
 */