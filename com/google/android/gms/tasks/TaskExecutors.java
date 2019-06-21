package com.google.android.gms.tasks;

import android.os.Handler;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.Executor;

public final class TaskExecutors
{
  public static final Executor MAIN_THREAD;
  static final Executor zzagd;

  static
  {
    AppMethodBeat.i(57349);
    MAIN_THREAD = new zza();
    zzagd = new zzt();
    AppMethodBeat.o(57349);
  }

  static final class zza
    implements Executor
  {
    private final Handler mHandler;

    public zza()
    {
      AppMethodBeat.i(57347);
      this.mHandler = new Handler(Looper.getMainLooper());
      AppMethodBeat.o(57347);
    }

    public final void execute(Runnable paramRunnable)
    {
      AppMethodBeat.i(57348);
      this.mHandler.post(paramRunnable);
      AppMethodBeat.o(57348);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.tasks.TaskExecutors
 * JD-Core Version:    0.6.2
 */