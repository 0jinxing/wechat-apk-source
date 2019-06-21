package com.bumptech.glide.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.ThreadFactory;

final class a$a
  implements ThreadFactory
{
  public final Thread newThread(Runnable paramRunnable)
  {
    try
    {
      AppMethodBeat.i(51814);
      Thread localThread = new java/lang/Thread;
      localThread.<init>(paramRunnable, "glide-disk-lru-cache-thread");
      localThread.setPriority(1);
      AppMethodBeat.o(51814);
      return localThread;
    }
    finally
    {
      paramRunnable = finally;
    }
    throw paramRunnable;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.a.a.a
 * JD-Core Version:    0.6.2
 */