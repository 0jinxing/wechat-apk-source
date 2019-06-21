package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.signin.SignInClient;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.locks.Lock;

final class zzas
  implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener
{
  private zzas(zzaj paramzzaj)
  {
  }

  public final void onConnected(Bundle paramBundle)
  {
    AppMethodBeat.i(60759);
    zzaj.zzf(this.zzhv).signIn(new zzaq(this.zzhv));
    AppMethodBeat.o(60759);
  }

  public final void onConnectionFailed(ConnectionResult paramConnectionResult)
  {
    AppMethodBeat.i(60760);
    zzaj.zzc(this.zzhv).lock();
    try
    {
      if (zzaj.zzb(this.zzhv, paramConnectionResult))
      {
        zzaj.zzi(this.zzhv);
        zzaj.zzj(this.zzhv);
      }
      while (true)
      {
        return;
        zzaj.zza(this.zzhv, paramConnectionResult);
      }
    }
    finally
    {
      zzaj.zzc(this.zzhv).unlock();
      AppMethodBeat.o(60760);
    }
    throw paramConnectionResult;
  }

  public final void onConnectionSuspended(int paramInt)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.internal.zzas
 * JD-Core Version:    0.6.2
 */