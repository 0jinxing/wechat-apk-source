package com.facebook.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AttributionIdentifiers$GoogleAdInfo
  implements IInterface
{
  private static final int FIRST_TRANSACTION_CODE = 1;
  private static final int SECOND_TRANSACTION_CODE = 2;
  private IBinder binder;

  AttributionIdentifiers$GoogleAdInfo(IBinder paramIBinder)
  {
    this.binder = paramIBinder;
  }

  public final IBinder asBinder()
  {
    return this.binder;
  }

  public final String getAdvertiserId()
  {
    AppMethodBeat.i(72232);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
      this.binder.transact(1, localParcel1, localParcel2, 0);
      localParcel2.readException();
      String str = localParcel2.readString();
      return str;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(72232);
    }
  }

  public final boolean isTrackingLimited()
  {
    boolean bool = true;
    AppMethodBeat.i(72233);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
      localParcel1.writeInt(1);
      this.binder.transact(2, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int i = localParcel2.readInt();
      if (i != 0)
        return bool;
      bool = false;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
      AppMethodBeat.o(72233);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.facebook.internal.AttributionIdentifiers.GoogleAdInfo
 * JD-Core Version:    0.6.2
 */