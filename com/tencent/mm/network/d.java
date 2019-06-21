package com.tencent.mm.network;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.matrix.trace.core.AppMethodBeat;

public abstract interface d extends IInterface
{
  public abstract int QF();

  public abstract int S(byte[] paramArrayOfByte);

  public abstract void a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3, int paramInt);

  public abstract void ab(byte[] paramArrayOfByte);

  public abstract void ac(byte[] paramArrayOfByte);

  public abstract String adD();

  public abstract byte[] ada();

  public abstract boolean adb();

  public abstract byte[] adc();

  public abstract boolean ade();

  public abstract byte[] adf();

  public abstract void cE(boolean paramBoolean);

  public abstract String getUsername();

  public abstract void hB(int paramInt);

  public abstract byte[] jQ(int paramInt);

  public abstract void o(String paramString, byte[] paramArrayOfByte);

  public abstract byte[] qr(String paramString);

  public abstract void reset();

  public abstract void setUsername(String paramString);

  public abstract void va(String paramString);

  public static abstract class a extends Binder
    implements d
  {
    public a()
    {
      attachInterface(this, "com.tencent.mm.network.IAccInfo_AIDL");
    }

    public static d l(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        paramIBinder = null;
      while (true)
      {
        return paramIBinder;
        IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.mm.network.IAccInfo_AIDL");
        if ((localIInterface != null) && ((localIInterface instanceof d)))
          paramIBinder = (d)localIInterface;
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
      boolean bool1 = false;
      int i = 0;
      int j = 0;
      boolean bool2 = true;
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
      case 17:
      case 18:
      case 19:
      case 20:
      }
      while (true)
      {
        return bool1;
        paramParcel2.writeString("com.tencent.mm.network.IAccInfo_AIDL");
        bool1 = bool2;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.network.IAccInfo_AIDL");
        reset();
        paramParcel2.writeNoException();
        bool1 = bool2;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.network.IAccInfo_AIDL");
        a(paramParcel1.createByteArray(), paramParcel1.createByteArray(), paramParcel1.createByteArray(), paramParcel1.readInt());
        paramParcel2.writeNoException();
        bool1 = bool2;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.network.IAccInfo_AIDL");
        hB(paramParcel1.readInt());
        paramParcel2.writeNoException();
        bool1 = bool2;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.network.IAccInfo_AIDL");
        setUsername(paramParcel1.readString());
        paramParcel2.writeNoException();
        bool1 = bool2;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.network.IAccInfo_AIDL");
        ab(paramParcel1.createByteArray());
        paramParcel2.writeNoException();
        bool1 = bool2;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.network.IAccInfo_AIDL");
        ac(paramParcel1.createByteArray());
        paramParcel2.writeNoException();
        bool1 = bool2;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.network.IAccInfo_AIDL");
        paramParcel1 = getUsername();
        paramParcel2.writeNoException();
        paramParcel2.writeString(paramParcel1);
        bool1 = bool2;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.network.IAccInfo_AIDL");
        paramParcel1 = jQ(paramParcel1.readInt());
        paramParcel2.writeNoException();
        paramParcel2.writeByteArray(paramParcel1);
        bool1 = bool2;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.network.IAccInfo_AIDL");
        paramParcel1 = ada();
        paramParcel2.writeNoException();
        paramParcel2.writeByteArray(paramParcel1);
        bool1 = bool2;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.network.IAccInfo_AIDL");
        paramParcel1 = adc();
        paramParcel2.writeNoException();
        paramParcel2.writeByteArray(paramParcel1);
        bool1 = bool2;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.network.IAccInfo_AIDL");
        paramInt1 = QF();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        bool1 = bool2;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.network.IAccInfo_AIDL");
        bool1 = adb();
        paramParcel2.writeNoException();
        paramInt1 = j;
        if (bool1)
          paramInt1 = 1;
        paramParcel2.writeInt(paramInt1);
        bool1 = bool2;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.network.IAccInfo_AIDL");
        o(paramParcel1.readString(), paramParcel1.createByteArray());
        paramParcel2.writeNoException();
        bool1 = bool2;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.network.IAccInfo_AIDL");
        paramParcel1 = qr(paramParcel1.readString());
        paramParcel2.writeNoException();
        paramParcel2.writeByteArray(paramParcel1);
        bool1 = bool2;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.network.IAccInfo_AIDL");
        if (paramParcel1.readInt() != 0)
          bool1 = true;
        cE(bool1);
        paramParcel2.writeNoException();
        bool1 = bool2;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.network.IAccInfo_AIDL");
        bool1 = ade();
        paramParcel2.writeNoException();
        paramInt1 = i;
        if (bool1)
          paramInt1 = 1;
        paramParcel2.writeInt(paramInt1);
        bool1 = bool2;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.network.IAccInfo_AIDL");
        paramParcel1 = adD();
        paramParcel2.writeNoException();
        paramParcel2.writeString(paramParcel1);
        bool1 = bool2;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.network.IAccInfo_AIDL");
        va(paramParcel1.readString());
        paramParcel2.writeNoException();
        bool1 = bool2;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.network.IAccInfo_AIDL");
        paramInt1 = S(paramParcel1.createByteArray());
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        bool1 = bool2;
        continue;
        paramParcel1.enforceInterface("com.tencent.mm.network.IAccInfo_AIDL");
        paramParcel1 = adf();
        paramParcel2.writeNoException();
        paramParcel2.writeByteArray(paramParcel1);
        bool1 = bool2;
      }
    }

    static final class a
      implements d
    {
      private IBinder mRemote;

      a(IBinder paramIBinder)
      {
        this.mRemote = paramIBinder;
      }

      public final int QF()
      {
        AppMethodBeat.i(58470);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
          this.mRemote.transact(11, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          return i;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58470);
        }
      }

      public final int S(byte[] paramArrayOfByte)
      {
        AppMethodBeat.i(58478);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
          localParcel1.writeByteArray(paramArrayOfByte);
          this.mRemote.transact(19, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          return i;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58478);
        }
        throw paramArrayOfByte;
      }

      public final void a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3, int paramInt)
      {
        AppMethodBeat.i(58461);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
          localParcel1.writeByteArray(paramArrayOfByte1);
          localParcel1.writeByteArray(paramArrayOfByte2);
          localParcel1.writeByteArray(paramArrayOfByte3);
          localParcel1.writeInt(paramInt);
          this.mRemote.transact(2, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58461);
        }
        throw paramArrayOfByte1;
      }

      public final void ab(byte[] paramArrayOfByte)
      {
        AppMethodBeat.i(58464);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
          localParcel1.writeByteArray(paramArrayOfByte);
          this.mRemote.transact(5, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58464);
        }
        throw paramArrayOfByte;
      }

      public final void ac(byte[] paramArrayOfByte)
      {
        AppMethodBeat.i(58465);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
          localParcel1.writeByteArray(paramArrayOfByte);
          this.mRemote.transact(6, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58465);
        }
        throw paramArrayOfByte;
      }

      public final String adD()
      {
        AppMethodBeat.i(58476);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
          this.mRemote.transact(17, localParcel1, localParcel2, 0);
          localParcel2.readException();
          String str = localParcel2.readString();
          return str;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58476);
        }
      }

      public final byte[] ada()
      {
        AppMethodBeat.i(58468);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
          this.mRemote.transact(9, localParcel1, localParcel2, 0);
          localParcel2.readException();
          byte[] arrayOfByte = localParcel2.createByteArray();
          return arrayOfByte;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58468);
        }
      }

      public final boolean adb()
      {
        boolean bool = false;
        AppMethodBeat.i(58471);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
          this.mRemote.transact(12, localParcel1, localParcel2, 0);
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
          AppMethodBeat.o(58471);
        }
      }

      public final byte[] adc()
      {
        AppMethodBeat.i(58469);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
          this.mRemote.transact(10, localParcel1, localParcel2, 0);
          localParcel2.readException();
          byte[] arrayOfByte = localParcel2.createByteArray();
          return arrayOfByte;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58469);
        }
      }

      public final boolean ade()
      {
        boolean bool = false;
        AppMethodBeat.i(58475);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
          this.mRemote.transact(16, localParcel1, localParcel2, 0);
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
          AppMethodBeat.o(58475);
        }
      }

      public final byte[] adf()
      {
        AppMethodBeat.i(58479);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
          this.mRemote.transact(20, localParcel1, localParcel2, 0);
          localParcel2.readException();
          byte[] arrayOfByte = localParcel2.createByteArray();
          return arrayOfByte;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58479);
        }
      }

      public final IBinder asBinder()
      {
        return this.mRemote;
      }

      public final void cE(boolean paramBoolean)
      {
        int i = 0;
        AppMethodBeat.i(58474);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
          if (paramBoolean)
            i = 1;
          localParcel1.writeInt(i);
          this.mRemote.transact(15, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58474);
        }
      }

      public final String getUsername()
      {
        AppMethodBeat.i(58466);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
          this.mRemote.transact(7, localParcel1, localParcel2, 0);
          localParcel2.readException();
          String str = localParcel2.readString();
          return str;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58466);
        }
      }

      public final void hB(int paramInt)
      {
        AppMethodBeat.i(58462);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
          localParcel1.writeInt(paramInt);
          this.mRemote.transact(3, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58462);
        }
      }

      public final byte[] jQ(int paramInt)
      {
        AppMethodBeat.i(58467);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
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
          AppMethodBeat.o(58467);
        }
      }

      public final void o(String paramString, byte[] paramArrayOfByte)
      {
        AppMethodBeat.i(58472);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
          localParcel1.writeString(paramString);
          localParcel1.writeByteArray(paramArrayOfByte);
          this.mRemote.transact(13, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58472);
        }
        throw paramString;
      }

      public final byte[] qr(String paramString)
      {
        AppMethodBeat.i(58473);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
          localParcel1.writeString(paramString);
          this.mRemote.transact(14, localParcel1, localParcel2, 0);
          localParcel2.readException();
          paramString = localParcel2.createByteArray();
          return paramString;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58473);
        }
        throw paramString;
      }

      public final void reset()
      {
        AppMethodBeat.i(58460);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
          this.mRemote.transact(1, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58460);
        }
      }

      public final void setUsername(String paramString)
      {
        AppMethodBeat.i(58463);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
          localParcel1.writeString(paramString);
          this.mRemote.transact(4, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58463);
        }
        throw paramString;
      }

      public final void va(String paramString)
      {
        AppMethodBeat.i(58477);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
          localParcel1.writeString(paramString);
          this.mRemote.transact(18, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
          AppMethodBeat.o(58477);
        }
        throw paramString;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.d
 * JD-Core Version:    0.6.2
 */