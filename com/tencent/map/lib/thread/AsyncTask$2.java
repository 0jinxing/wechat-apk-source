package com.tencent.map.lib.thread;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class AsyncTask$2 extends FutureTask<Result>
{
  AsyncTask$2(AsyncTask paramAsyncTask, Callable paramCallable)
  {
    super(paramCallable);
  }

  protected void done()
  {
    AppMethodBeat.i(98166);
    try
    {
      AsyncTask.b(this.a, get());
      AppMethodBeat.o(98166);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      while (true)
        AppMethodBeat.o(98166);
    }
    catch (ExecutionException localExecutionException)
    {
      RuntimeException localRuntimeException = new RuntimeException("An error occured while executing doInBackground()", localExecutionException.getCause());
      AppMethodBeat.o(98166);
      throw localRuntimeException;
    }
    catch (CancellationException localCancellationException)
    {
      while (true)
      {
        AsyncTask.b(this.a, null);
        AppMethodBeat.o(98166);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.map.lib.thread.AsyncTask.2
 * JD-Core Version:    0.6.2
 */