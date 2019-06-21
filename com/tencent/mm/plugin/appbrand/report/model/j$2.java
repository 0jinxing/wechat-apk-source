package com.tencent.mm.plugin.appbrand.report.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

final class j$2 extends ThreadPoolExecutor
{
  j$2(TimeUnit paramTimeUnit, BlockingQueue paramBlockingQueue, ThreadFactory paramThreadFactory)
  {
    super(1, 1, 1000L, paramTimeUnit, paramBlockingQueue, paramThreadFactory);
  }

  protected final void afterExecute(Runnable paramRunnable, Throwable paramThrowable)
  {
    AppMethodBeat.i(132616);
    super.afterExecute(paramRunnable, paramThrowable);
    if ((paramRunnable instanceof j.a))
      j.aLq().a((j.a)paramRunnable);
    AppMethodBeat.o(132616);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.report.model.j.2
 * JD-Core Version:    0.6.2
 */