package com.tencent.mm.ipcinvoker;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.h.b;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

final class m$a$3
  implements RejectedExecutionHandler
{
  m$a$3(m.a parama)
  {
  }

  public final void rejectedExecution(Runnable paramRunnable, ThreadPoolExecutor paramThreadPoolExecutor)
  {
    AppMethodBeat.i(114061);
    b.w("IPC.ExecutorServiceCreatorImpl", "on rejectedExecution(r : %s)", new Object[] { paramRunnable });
    AppMethodBeat.o(114061);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ipcinvoker.m.a.3
 * JD-Core Version:    0.6.2
 */