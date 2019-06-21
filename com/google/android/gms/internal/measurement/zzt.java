package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class zzt extends zzn
  implements zzr
{
  zzt(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
  }

  public final Bundle zza(Bundle paramBundle)
  {
    AppMethodBeat.i(69743);
    Object localObject = obtainAndWriteInterfaceToken();
    zzp.zza((Parcel)localObject, paramBundle);
    paramBundle = transactAndReadException(1, (Parcel)localObject);
    localObject = (Bundle)zzp.zza(paramBundle, Bundle.CREATOR);
    paramBundle.recycle();
    AppMethodBeat.o(69743);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzt
 * JD-Core Version:    0.6.2
 */