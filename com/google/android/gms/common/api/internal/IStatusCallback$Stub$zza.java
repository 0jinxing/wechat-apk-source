package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.stable.zza;
import com.google.android.gms.internal.stable.zzc;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class IStatusCallback$Stub$zza extends zza
  implements IStatusCallback
{
  IStatusCallback$Stub$zza(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.common.api.internal.IStatusCallback");
  }

  public final void onResult(Status paramStatus)
  {
    AppMethodBeat.i(60638);
    Parcel localParcel = obtainAndWriteInterfaceToken();
    zzc.zza(localParcel, paramStatus);
    transactOneway(1, localParcel);
    AppMethodBeat.o(60638);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.internal.IStatusCallback.Stub.zza
 * JD-Core Version:    0.6.2
 */