package com.tencent.mm.network;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.matrix.trace.core.AppMethodBeat;

public abstract interface h extends IInterface
{
  public abstract void networkAnalysisCallBack(int paramInt1, int paramInt2, boolean paramBoolean, String paramString);

  public static abstract class a extends Binder
    implements h
  {
    public a()
    {
      attachInterface(this, "com.tencent.mm.network.INetworkDiagnoseCallback_AIDL");
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
      case 1598968902:
        for (bool2 = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2); ; bool2 = bool1)
        {
          return bool2;
          paramParcel2.writeString("com.tencent.mm.network.INetworkDiagnoseCallback_AIDL");
        }
      case 1:
      }
      paramParcel1.enforceInterface("com.tencent.mm.network.INetworkDiagnoseCallback_AIDL");
      paramInt1 = paramParcel1.readInt();
      paramInt2 = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0);
      for (boolean bool2 = true; ; bool2 = false)
      {
        networkAnalysisCallBack(paramInt1, paramInt2, bool2, paramParcel1.readString());
        paramParcel2.writeNoException();
        bool2 = bool1;
        break;
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

      public final IBinder asBinder()
      {
        return this.mRemote;
      }

      public final void networkAnalysisCallBack(int paramInt1, int paramInt2, boolean paramBoolean, String paramString)
      {
        int i = 1;
        AppMethodBeat.i(58518);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.INetworkDiagnoseCallback_AIDL");
          localParcel1.writeInt(paramInt1);
          localParcel1.writeInt(paramInt2);
          if (paramBoolean);
          for (paramInt1 = i; ; paramInt1 = 0)
          {
            localParcel1.writeInt(paramInt1);
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
          AppMethodBeat.o(58518);
        }
        throw paramString;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.h
 * JD-Core Version:    0.6.2
 */