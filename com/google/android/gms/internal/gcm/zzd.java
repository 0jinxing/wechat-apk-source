package com.google.android.gms.internal.gcm;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class zzd
  implements IInterface
{
  private final IBinder zzd;
  private final String zze;

  protected zzd(IBinder paramIBinder, String paramString)
  {
    this.zzd = paramIBinder;
    this.zze = paramString;
  }

  public IBinder asBinder()
  {
    return this.zzd;
  }

  protected final Parcel obtainAndWriteInterfaceToken()
  {
    AppMethodBeat.i(57618);
    Parcel localParcel = Parcel.obtain();
    localParcel.writeInterfaceToken(this.zze);
    AppMethodBeat.o(57618);
    return localParcel;
  }

  protected final void transactAndReadExceptionReturnVoid(int paramInt, Parcel paramParcel)
  {
    AppMethodBeat.i(57619);
    Parcel localParcel = Parcel.obtain();
    try
    {
      this.zzd.transact(2, paramParcel, localParcel, 0);
      localParcel.readException();
      return;
    }
    finally
    {
      paramParcel.recycle();
      localParcel.recycle();
      AppMethodBeat.o(57619);
    }
  }

  protected final void transactOneway(int paramInt, Parcel paramParcel)
  {
    AppMethodBeat.i(57620);
    try
    {
      this.zzd.transact(1, paramParcel, null, 1);
      return;
    }
    finally
    {
      paramParcel.recycle();
      AppMethodBeat.o(57620);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.gcm.zzd
 * JD-Core Version:    0.6.2
 */