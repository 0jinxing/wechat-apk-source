package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zza
  implements PendingResult.StatusListener
{
  zza(Batch paramBatch)
  {
  }

  public final void onComplete(Status paramStatus)
  {
    AppMethodBeat.i(61009);
    synchronized (Batch.zza(this.zzch))
    {
      if (this.zzch.isCanceled())
      {
        AppMethodBeat.o(61009);
        return;
      }
      if (paramStatus.isCanceled())
        Batch.zza(this.zzch, true);
      while (paramStatus.isSuccess())
      {
        Batch.zzb(this.zzch);
        if (Batch.zzc(this.zzch) == 0)
        {
          if (!Batch.zzd(this.zzch))
            break label123;
          Batch.zze(this.zzch);
        }
        AppMethodBeat.o(61009);
        break;
      }
      Batch.zzb(this.zzch, true);
    }
    label123: if (Batch.zzf(this.zzch))
    {
      paramStatus = new com/google/android/gms/common/api/Status;
      paramStatus.<init>(13);
    }
    while (true)
    {
      Batch localBatch = this.zzch;
      BatchResult localBatchResult = new com/google/android/gms/common/api/BatchResult;
      localBatchResult.<init>(paramStatus, Batch.zzg(this.zzch));
      localBatch.setResult(localBatchResult);
      break;
      paramStatus = Status.RESULT_SUCCESS;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.zza
 * JD-Core Version:    0.6.2
 */