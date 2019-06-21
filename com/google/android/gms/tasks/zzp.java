package com.google.android.gms.tasks;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.CancellationException;

final class zzp
  implements Runnable
{
  zzp(zzo paramzzo, Task paramTask)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(57407);
    try
    {
      Task localTask = zzo.zza(this.zzafz).then(this.zzafn.getResult());
      if (localTask == null)
      {
        this.zzafz.onFailure(new NullPointerException("Continuation returned null"));
        AppMethodBeat.o(57407);
        return;
      }
    }
    catch (RuntimeExecutionException localRuntimeExecutionException)
    {
      while (true)
        if ((localRuntimeExecutionException.getCause() instanceof Exception))
        {
          this.zzafz.onFailure((Exception)localRuntimeExecutionException.getCause());
          AppMethodBeat.o(57407);
        }
        else
        {
          this.zzafz.onFailure(localRuntimeExecutionException);
          AppMethodBeat.o(57407);
        }
    }
    catch (CancellationException localCancellationException)
    {
      while (true)
      {
        this.zzafz.onCanceled();
        AppMethodBeat.o(57407);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        this.zzafz.onFailure(localException);
        AppMethodBeat.o(57407);
        continue;
        localException.addOnSuccessListener(TaskExecutors.zzagd, this.zzafz);
        localException.addOnFailureListener(TaskExecutors.zzagd, this.zzafz);
        localException.addOnCanceledListener(TaskExecutors.zzagd, this.zzafz);
        AppMethodBeat.o(57407);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.tasks.zzp
 * JD-Core Version:    0.6.2
 */