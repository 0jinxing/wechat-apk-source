package com.google.android.gms.tasks;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzf
  implements Runnable
{
  zzf(zze paramzze, Task paramTask)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(57389);
    try
    {
      Task localTask = (Task)zze.zza(this.zzafp).then(this.zzafn);
      if (localTask == null)
      {
        this.zzafp.onFailure(new NullPointerException("Continuation returned null"));
        AppMethodBeat.o(57389);
        return;
      }
    }
    catch (RuntimeExecutionException localRuntimeExecutionException)
    {
      while (true)
        if ((localRuntimeExecutionException.getCause() instanceof Exception))
        {
          zze.zzb(this.zzafp).setException((Exception)localRuntimeExecutionException.getCause());
          AppMethodBeat.o(57389);
        }
        else
        {
          zze.zzb(this.zzafp).setException(localRuntimeExecutionException);
          AppMethodBeat.o(57389);
        }
    }
    catch (Exception localException)
    {
      while (true)
      {
        zze.zzb(this.zzafp).setException(localException);
        AppMethodBeat.o(57389);
        continue;
        localException.addOnSuccessListener(TaskExecutors.zzagd, this.zzafp);
        localException.addOnFailureListener(TaskExecutors.zzagd, this.zzafp);
        localException.addOnCanceledListener(TaskExecutors.zzagd, this.zzafp);
        AppMethodBeat.o(57389);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.tasks.zzf
 * JD-Core Version:    0.6.2
 */