package com.tencent.mm.audio.mix.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class g
  implements ThreadFactory
{
  private final ThreadGroup cme;
  private final AtomicInteger cmf;
  private final String cmg;

  public g()
  {
    AppMethodBeat.i(137074);
    this.cmf = new AtomicInteger(1);
    this.cmg = "audio_mix_thread#";
    this.cme = new ThreadGroup("AUDIO_MIX_THREAD_POOL_GROUP");
    AppMethodBeat.o(137074);
  }

  public final Thread newThread(Runnable paramRunnable)
  {
    AppMethodBeat.i(137075);
    paramRunnable = new Thread(this.cme, paramRunnable, "audio_mix_thread#" + this.cmf.getAndIncrement(), 0L);
    if (paramRunnable.isDaemon())
      paramRunnable.setDaemon(false);
    if (paramRunnable.getPriority() != 5)
      paramRunnable.setPriority(5);
    AppMethodBeat.o(137075);
    return paramRunnable;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.mix.d.g
 * JD-Core Version:    0.6.2
 */