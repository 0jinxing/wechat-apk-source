package com.google.android.gms.tasks;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzd
  implements Runnable
{
  zzd(zzc paramzzc, Task paramTask)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(57383);
    if (this.zzafn.isCanceled())
    {
      zzc.zza(this.zzafo).zzdp();
      AppMethodBeat.o(57383);
    }
    while (true)
    {
      return;
      try
      {
        Object localObject = zzc.zzb(this.zzafo).then(this.zzafn);
        zzc.zza(this.zzafo).setResult(localObject);
        AppMethodBeat.o(57383);
      }
      catch (RuntimeExecutionException localRuntimeExecutionException)
      {
        if ((localRuntimeExecutionException.getCause() instanceof Exception))
        {
          zzc.zza(this.zzafo).setException((Exception)localRuntimeExecutionException.getCause());
          AppMethodBeat.o(57383);
        }
        else
        {
          zzc.zza(this.zzafo).setException(localRuntimeExecutionException);
          AppMethodBeat.o(57383);
        }
      }
      catch (Exception localException)
      {
        zzc.zza(this.zzafo).setException(localException);
        AppMethodBeat.o(57383);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.tasks.zzd
 * JD-Core Version:    0.6.2
 */