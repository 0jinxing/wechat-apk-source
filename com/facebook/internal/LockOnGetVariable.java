package com.facebook.internal;

import com.facebook.FacebookSdk;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

public class LockOnGetVariable<T>
{
  private CountDownLatch initLatch;
  private T value;

  public LockOnGetVariable(T paramT)
  {
    this.value = paramT;
  }

  public LockOnGetVariable(Callable<T> paramCallable)
  {
    AppMethodBeat.i(72402);
    this.initLatch = new CountDownLatch(1);
    FacebookSdk.getExecutor().execute(new FutureTask(new LockOnGetVariable.1(this, paramCallable)));
    AppMethodBeat.o(72402);
  }

  private void waitOnInit()
  {
    AppMethodBeat.i(72404);
    if (this.initLatch == null)
      AppMethodBeat.o(72404);
    while (true)
    {
      return;
      try
      {
        this.initLatch.await();
        AppMethodBeat.o(72404);
      }
      catch (InterruptedException localInterruptedException)
      {
        AppMethodBeat.o(72404);
      }
    }
  }

  public T getValue()
  {
    AppMethodBeat.i(72403);
    waitOnInit();
    Object localObject = this.value;
    AppMethodBeat.o(72403);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.facebook.internal.LockOnGetVariable
 * JD-Core Version:    0.6.2
 */