package com.tencent.map.lib.thread;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;
import java.util.concurrent.Executor;

class AsyncTask$c
  implements Executor
{
  final LinkedList<Runnable> a;
  Runnable b;

  private AsyncTask$c()
  {
    AppMethodBeat.i(98171);
    this.a = new LinkedList();
    AppMethodBeat.o(98171);
  }

  protected void a()
  {
    try
    {
      AppMethodBeat.i(98173);
      Runnable localRunnable = (Runnable)this.a.poll();
      this.b = localRunnable;
      if (localRunnable != null)
        AsyncTask.sHighThreadExecutor.execute(this.b);
      AppMethodBeat.o(98173);
      return;
    }
    finally
    {
    }
  }

  public void execute(Runnable paramRunnable)
  {
    try
    {
      AppMethodBeat.i(98172);
      LinkedList localLinkedList = this.a;
      AsyncTask.c.1 local1 = new com/tencent/map/lib/thread/AsyncTask$c$1;
      local1.<init>(this, paramRunnable);
      localLinkedList.offer(local1);
      if (this.b == null)
        a();
      AppMethodBeat.o(98172);
      return;
    }
    finally
    {
    }
    throw paramRunnable;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.map.lib.thread.AsyncTask.c
 * JD-Core Version:    0.6.2
 */