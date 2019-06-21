package com.tencent.mm.plugin.exdevice.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.matrix.trace.core.AppMethodBeat;

public abstract class i$a extends Binder
  implements i
{
  public i$a()
  {
    attachInterface(this, "com.tencent.mm.plugin.exdevice.service.IBTOnDeviceRequest_AIDL");
  }

  public static i v(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      paramIBinder = null;
    while (true)
    {
      return paramIBinder;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.mm.plugin.exdevice.service.IBTOnDeviceRequest_AIDL");
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
      paramParcel2.writeString("com.tencent.mm.plugin.exdevice.service.IBTOnDeviceRequest_AIDL");
      bool = true;
      continue;
      paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IBTOnDeviceRequest_AIDL");
      a(paramParcel1.readInt(), paramParcel1.readLong(), paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.createByteArray());
      paramParcel2.writeNoException();
      bool = true;
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

    public final void a(int paramInt1, long paramLong, int paramInt2, int paramInt3, byte[] paramArrayOfByte)
    {
      AppMethodBeat.i(19611);
      Parcel localParcel1 = Parcel.obtain();
      Parcel localParcel2 = Parcel.obtain();
      try
      {
        localParcel1.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IBTOnDeviceRequest_AIDL");
        localParcel1.writeInt(paramInt1);
        localParcel1.writeLong(paramLong);
        localParcel1.writeInt(paramInt2);
        localParcel1.writeInt(paramInt3);
        localParcel1.writeByteArray(paramArrayOfByte);
        this.mRemote.transact(1, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
        AppMethodBeat.o(19611);
      }
      throw paramArrayOfByte;
    }

    public final IBinder asBinder()
    {
      return this.mRemote;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.service.i.a
 * JD-Core Version:    0.6.2
 */