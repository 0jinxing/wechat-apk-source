package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks;
import com.google.android.gms.common.internal.Preconditions;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

final class zzal
  implements BaseGmsClient.ConnectionProgressReportCallbacks
{
  private final Api<?> mApi;
  private final boolean zzfo;
  private final WeakReference<zzaj> zzhw;

  public zzal(zzaj paramzzaj, Api<?> paramApi, boolean paramBoolean)
  {
    AppMethodBeat.i(60750);
    this.zzhw = new WeakReference(paramzzaj);
    this.mApi = paramApi;
    this.zzfo = paramBoolean;
    AppMethodBeat.o(60750);
  }

  public final void onReportServiceBinding(ConnectionResult paramConnectionResult)
  {
    boolean bool = false;
    AppMethodBeat.i(60751);
    zzaj localzzaj = (zzaj)this.zzhw.get();
    if (localzzaj == null)
      AppMethodBeat.o(60751);
    while (true)
    {
      return;
      if (Looper.myLooper() == zzaj.zzd(localzzaj).zzfq.getLooper())
        bool = true;
      Preconditions.checkState(bool, "onReportServiceBinding must be called on the GoogleApiClient handler thread");
      zzaj.zzc(localzzaj).lock();
      try
      {
        bool = zzaj.zza(localzzaj, 0);
        if (!bool)
        {
          zzaj.zzc(localzzaj).unlock();
          AppMethodBeat.o(60751);
        }
        else
        {
          if (!paramConnectionResult.isSuccess())
            zzaj.zza(localzzaj, paramConnectionResult, this.mApi, this.zzfo);
          if (zzaj.zzk(localzzaj))
            zzaj.zzj(localzzaj);
          zzaj.zzc(localzzaj).unlock();
          AppMethodBeat.o(60751);
        }
      }
      finally
      {
        zzaj.zzc(localzzaj).unlock();
        AppMethodBeat.o(60751);
      }
    }
    throw paramConnectionResult;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.internal.zzal
 * JD-Core Version:    0.6.2
 */