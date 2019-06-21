package com.tencent.ttpic.thread;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class VideoThreadFactory
  implements ThreadFactory
{
  private final AtomicInteger mCount;
  private final int priority;

  public VideoThreadFactory(int paramInt)
  {
    AppMethodBeat.i(83789);
    this.mCount = new AtomicInteger(1);
    this.priority = paramInt;
    AppMethodBeat.o(83789);
  }

  public Thread newThread(Runnable paramRunnable)
  {
    AppMethodBeat.i(83790);
    paramRunnable = new Thread(paramRunnable, "Video AsyncTask #" + this.mCount.getAndIncrement());
    paramRunnable.setPriority(this.priority);
    AppMethodBeat.o(83790);
    return paramRunnable;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.thread.VideoThreadFactory
 * JD-Core Version:    0.6.2
 */