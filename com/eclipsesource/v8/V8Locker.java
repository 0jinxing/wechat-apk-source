package com.eclipsesource.v8;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class V8Locker
{
  private boolean released;
  private V8 runtime;
  private Thread thread;

  V8Locker(V8 paramV8)
  {
    AppMethodBeat.i(75502);
    this.thread = null;
    this.released = false;
    this.runtime = paramV8;
    acquire();
    AppMethodBeat.o(75502);
  }

  public void acquire()
  {
    try
    {
      AppMethodBeat.i(75503);
      if ((this.thread != null) && (this.thread != Thread.currentThread()))
      {
        Error localError = new java/lang/Error;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("Invalid V8 thread access: current thread is ");
        localError.<init>(Thread.currentThread() + " while the locker has thread " + this.thread);
        AppMethodBeat.o(75503);
        throw localError;
      }
    }
    finally
    {
    }
    if (this.thread == Thread.currentThread())
      AppMethodBeat.o(75503);
    while (true)
    {
      return;
      this.runtime.acquireLock(this.runtime.getV8RuntimePtr());
      this.thread = Thread.currentThread();
      this.released = false;
      AppMethodBeat.o(75503);
    }
  }

  public void checkThread()
  {
    AppMethodBeat.i(75506);
    Error localError;
    if ((this.released) && (this.thread == null))
    {
      localError = new Error("Invalid V8 thread access: the locker has been released!");
      AppMethodBeat.o(75506);
      throw localError;
    }
    if (this.thread != Thread.currentThread())
    {
      localError = new Error("Invalid V8 thread access: current thread is " + Thread.currentThread() + " while the locker has thread " + this.thread);
      AppMethodBeat.o(75506);
      throw localError;
    }
    AppMethodBeat.o(75506);
  }

  public Thread getThread()
  {
    return this.thread;
  }

  public boolean hasLock()
  {
    AppMethodBeat.i(75507);
    boolean bool;
    if (this.thread == Thread.currentThread())
    {
      bool = true;
      AppMethodBeat.o(75507);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(75507);
    }
  }

  public void release()
  {
    try
    {
      AppMethodBeat.i(75505);
      if (((this.released) && (this.thread == null)) || (this.runtime.isReleased()))
        AppMethodBeat.o(75505);
      while (true)
      {
        return;
        checkThread();
        this.runtime.releaseLock(this.runtime.getV8RuntimePtr());
        this.thread = null;
        this.released = true;
        AppMethodBeat.o(75505);
      }
    }
    finally
    {
    }
  }

  public boolean tryAcquire()
  {
    boolean bool = false;
    try
    {
      AppMethodBeat.i(75504);
      if ((this.thread != null) && (this.thread != Thread.currentThread()))
        AppMethodBeat.o(75504);
      while (true)
      {
        return bool;
        if (this.thread == Thread.currentThread())
        {
          AppMethodBeat.o(75504);
          bool = true;
        }
        else
        {
          this.runtime.acquireLock(this.runtime.getV8RuntimePtr());
          this.thread = Thread.currentThread();
          this.released = false;
          AppMethodBeat.o(75504);
          bool = true;
        }
      }
    }
    finally
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.eclipsesource.v8.V8Locker
 * JD-Core Version:    0.6.2
 */