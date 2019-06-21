package com.google.android.gms.internal.auth;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class zzbl extends zzd
  implements zzbk
{
  zzbl(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.auth.api.internal.IAuthService");
  }

  public final void zzd(zzbi paramzzbi, ProxyRequest paramProxyRequest)
  {
    AppMethodBeat.i(77106);
    Parcel localParcel = obtainAndWriteInterfaceToken();
    zzf.zzd(localParcel, paramzzbi);
    zzf.zzd(localParcel, paramProxyRequest);
    transactAndReadExceptionReturnVoid(1, localParcel);
    AppMethodBeat.o(77106);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.auth.zzbl
 * JD-Core Version:    0.6.2
 */