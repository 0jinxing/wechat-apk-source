package com.tencent.mm.audio.mix.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.mix.h.b;
import java.util.LinkedList;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class h
{
  private static h cmh;
  private ThreadPoolExecutor cmi;
  private PriorityBlockingQueue<Runnable> cmj;
  private LinkedList<i> cmk;
  private int cml;
  private Object lock;

  private h()
  {
    AppMethodBeat.i(137077);
    this.lock = new Object();
    this.cmj = new PriorityBlockingQueue(33);
    this.cmk = new LinkedList();
    int j = Runtime.getRuntime().availableProcessors();
    b.i("MicroMsg.Mix.AudioThreadPool", "getNormalCorePoolSize cpuCount:%d", new Object[] { Integer.valueOf(j) });
    j = j * 2 + 2;
    if (j > 32)
      i = 32;
    while (true)
    {
      this.cml = i;
      this.cmi = new ThreadPoolExecutor(i, 32, 120L, TimeUnit.SECONDS, this.cmj, new g());
      this.cmi.setMaximumPoolSize(32);
      b.i("MicroMsg.Mix.AudioThreadPool", "new AudioThreadPool poolSize:%d", new Object[] { Integer.valueOf(i) });
      AppMethodBeat.o(137077);
      return;
      if (j >= 8)
        i = j;
    }
  }

  public static h DQ()
  {
    AppMethodBeat.i(137076);
    if (cmh == null);
    try
    {
      if (cmh == null)
      {
        localh = new com/tencent/mm/audio/mix/d/h;
        localh.<init>();
        cmh = localh;
      }
      h localh = cmh;
      AppMethodBeat.o(137076);
      return localh;
    }
    finally
    {
      AppMethodBeat.o(137076);
    }
  }

  public static void a(i parami)
  {
    AppMethodBeat.i(137079);
    h localh = DQ();
    synchronized (localh.lock)
    {
      parami.reset();
      localh.cmk.add(parami);
      int i = localh.cml;
      if (localh.cmk.size() > i)
        localh.setCorePoolSize(i + 2);
      localh.cmi.execute(parami);
      AppMethodBeat.o(137079);
      return;
    }
  }

  public static void b(i parami)
  {
    AppMethodBeat.i(137080);
    h localh = DQ();
    synchronized (localh.lock)
    {
      localh.cmk.remove(parami);
      if (localh.cmk.size() <= 4)
      {
        localh.cml = 4;
        localh.setCorePoolSize(localh.cml);
      }
      localh.cmi.remove(parami);
      AppMethodBeat.o(137080);
      return;
    }
  }

  private void setCorePoolSize(int paramInt)
  {
    AppMethodBeat.i(137078);
    if (paramInt > 32)
      this.cml = 32;
    while (true)
    {
      b.i("MicroMsg.Mix.AudioThreadPool", "setCorePoolSize poolSize:%d", new Object[] { Integer.valueOf(paramInt) });
      this.cmi.setCorePoolSize(paramInt);
      AppMethodBeat.o(137078);
      return;
      if (paramInt < 4)
        this.cml = 4;
      else
        this.cml = paramInt;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.mix.d.h
 * JD-Core Version:    0.6.2
 */