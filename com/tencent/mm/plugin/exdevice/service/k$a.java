package com.tencent.mm.plugin.exdevice.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.matrix.trace.core.AppMethodBeat;

public abstract class k$a extends Binder
  implements k
{
  public k$a()
  {
    attachInterface(this, "com.tencent.mm.plugin.exdevice.service.IBTOnStateChange_AIDL");
  }

  public static k x(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      paramIBinder = null;
    while (true)
    {
      return paramIBinder;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.mm.plugin.exdevice.service.IBTOnStateChange_AIDL");
      if ((localIInterface != null) && ((localIInterface instanceof k)))
        paramIBinder = (k)localIInterface;
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
    boolean bool;
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
      paramParcel2.writeString("com.tencent.mm.plugin.exdevice.service.IBTOnStateChange_AIDL");
      bool = true;
      continue;
      paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IBTOnStateChange_AIDL");
      a(paramParcel1.readLong(), paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readLong());
      paramParcel2.writeNoException();
      bool = true;
    }
  }

  static final class a
    implements k
  {
    private IBinder mRemote;

    a(IBinder paramIBinder)
    {
      this.mRemote = paramIBinder;
    }

    public final void a(long paramLong1, int paramInt1, int paramInt2, int paramInt3, long paramLong2)
    {
      AppMethodBeat.i(19613);
      Parcel localParcel1 = Parcel.obtain();
      Parcel localParcel2 = Parcel.obtain();
      try
      {
        localParcel1.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IBTOnStateChange_AIDL");
        localParcel1.writeLong(paramLong1);
        localParcel1.writeInt(paramInt1);
        localParcel1.writeInt(paramInt2);
        localParcel1.writeInt(paramInt3);
        localParcel1.writeLong(paramLong2);
        this.mRemote.transact(1, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
        AppMethodBeat.o(19613);
      }
    }

    public final IBinder asBinder()
    {
      return this.mRemote;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.service.k.a
 * JD-Core Version:    0.6.2
 */