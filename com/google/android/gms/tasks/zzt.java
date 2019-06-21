package com.google.android.gms.tasks;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.Executor;

final class zzt
  implements Executor
{
  public final void execute(Runnable paramRunnable)
  {
    AppMethodBeat.i(57412);
    paramRunnable.run();
    AppMethodBeat.o(57412);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.tasks.zzt
 * JD-Core Version:    0.6.2
 */