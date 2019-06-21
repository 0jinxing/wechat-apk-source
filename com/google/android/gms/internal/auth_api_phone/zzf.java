package com.google.android.gms.internal.auth_api_phone;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.auth-api-phone.zze;
import com.google.android.gms.internal.auth-api-phone.zzg;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class zzf extends zza
  implements zze
{
  zzf(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
  }

  public final void zza(zzg paramzzg)
  {
    AppMethodBeat.i(80431);
    Parcel localParcel = obtainAndWriteInterfaceToken();
    zzc.zza(localParcel, paramzzg);
    transactAndReadExceptionReturnVoid(1, localParcel);
    AppMethodBeat.o(80431);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.auth_api_phone.zzf
 * JD-Core Version:    0.6.2
 */