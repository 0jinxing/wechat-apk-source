package com.google.android.gms.tasks;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.Callable;

final class zzv
  implements Runnable
{
  zzv(zzu paramzzu, Callable paramCallable)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(57447);
    try
    {
      this.zzagj.setResult(this.val$callable.call());
      AppMethodBeat.o(57447);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        this.zzagj.setException(localException);
        AppMethodBeat.o(57447);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.tasks.zzv
 * JD-Core Version:    0.6.2
 */