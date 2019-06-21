package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultTransform;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;

final class zzci
  implements Runnable
{
  zzci(zzch paramzzch, Result paramResult)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(60889);
    try
    {
      BasePendingResult.zzez.set(Boolean.TRUE);
      Object localObject1 = zzch.zzc(this.zzml).onSuccess(this.zzmk);
      zzch.zzd(this.zzml).sendMessage(zzch.zzd(this.zzml).obtainMessage(0, localObject1));
      BasePendingResult.zzez.set(Boolean.FALSE);
      zzch.zza(this.zzml, this.zzmk);
      localObject1 = (GoogleApiClient)zzch.zze(this.zzml).get();
      if (localObject1 != null)
        ((GoogleApiClient)localObject1).zzb(this.zzml);
      AppMethodBeat.o(60889);
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      while (true)
      {
        zzch.zzd(this.zzml).sendMessage(zzch.zzd(this.zzml).obtainMessage(1, localRuntimeException));
        BasePendingResult.zzez.set(Boolean.FALSE);
        zzch.zza(this.zzml, this.zzmk);
        localGoogleApiClient = (GoogleApiClient)zzch.zze(this.zzml).get();
        if (localGoogleApiClient != null)
          localGoogleApiClient.zzb(this.zzml);
        AppMethodBeat.o(60889);
      }
    }
    finally
    {
      BasePendingResult.zzez.set(Boolean.FALSE);
      zzch.zza(this.zzml, this.zzmk);
      GoogleApiClient localGoogleApiClient = (GoogleApiClient)zzch.zze(this.zzml).get();
      if (localGoogleApiClient != null)
        localGoogleApiClient.zzb(this.zzml);
      AppMethodBeat.o(60889);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.internal.zzci
 * JD-Core Version:    0.6.2
 */