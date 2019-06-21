package com.tencent.mm.sdk.g.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.RejectedExecutionException;

public final class c$a
  implements c.b
{
  public final void a(Runnable paramRunnable, c paramc)
  {
    AppMethodBeat.i(52594);
    paramRunnable = new RejectedExecutionException("Task " + paramRunnable.toString() + " rejected from " + paramc.toString());
    AppMethodBeat.o(52594);
    throw paramRunnable;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.g.b.c.a
 * JD-Core Version:    0.6.2
 */