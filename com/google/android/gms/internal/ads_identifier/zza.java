package com.google.android.gms.internal.ads_identifier;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class zza
  implements IInterface
{
  private final IBinder zza;
  private final String zzb;

  protected zza(IBinder paramIBinder, String paramString)
  {
    this.zza = paramIBinder;
    this.zzb = paramString;
  }

  public IBinder asBinder()
  {
    return this.zza;
  }

  protected final Parcel obtainAndWriteInterfaceToken()
  {
    AppMethodBeat.i(115344);
    Parcel localParcel = Parcel.obtain();
    localParcel.writeInterfaceToken(this.zzb);
    AppMethodBeat.o(115344);
    return localParcel;
  }

  protected final Parcel transactAndReadException(int paramInt, Parcel paramParcel)
  {
    AppMethodBeat.i(115345);
    Parcel localParcel = Parcel.obtain();
    try
    {
      this.zza.transact(paramInt, paramParcel, localParcel, 0);
      localParcel.readException();
      return localParcel;
    }
    catch (RuntimeException localRuntimeException)
    {
      throw localRuntimeException;
    }
    finally
    {
      paramParcel.recycle();
      AppMethodBeat.o(115345);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads_identifier.zza
 * JD-Core Version:    0.6.2
 */