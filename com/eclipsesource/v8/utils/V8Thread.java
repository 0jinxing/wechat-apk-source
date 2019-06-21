package com.eclipsesource.v8.utils;

import com.eclipsesource.v8.V8;
import com.eclipsesource.v8.V8Locker;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class V8Thread extends Thread
{
  private V8 runtime;
  private final V8Runnable target;

  public V8Thread(V8Runnable paramV8Runnable)
  {
    this.target = paramV8Runnable;
  }

  public void run()
  {
    AppMethodBeat.i(75159);
    this.runtime = V8.createV8Runtime();
    try
    {
      this.target.run(this.runtime);
      try
      {
        if (this.runtime.getLocker().hasLock())
        {
          this.runtime.release();
          this.runtime = null;
        }
        return;
      }
      finally
      {
        AppMethodBeat.o(75159);
      }
    }
    finally
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.eclipsesource.v8.utils.V8Thread
 * JD-Core Version:    0.6.2
 */