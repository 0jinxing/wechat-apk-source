package com.tencent.mm.sdk.platformtools;

import android.os.Debug;
import android.os.Handler;
import android.os.Process;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class aq
  implements Runnable
{
  private static final String xzM;
  private static final String xzN;
  long cmn;
  final String eOn;
  long endTime;
  long fpi;
  final Handler handler;
  int priority;
  boolean started;
  final Thread thread;
  String threadName;
  long waitTime;
  final Object xxu;
  public final Runnable xzE;
  long xzF;
  final a xzG;
  long xzH;
  long xzI;
  long xzJ;
  long xzK;
  float xzL;

  static
  {
    AppMethodBeat.i(52169);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("taskName = %s");
    localStringBuilder.append("|token = %s");
    localStringBuilder.append("|handler = %s");
    localStringBuilder.append("|threadName = %s");
    localStringBuilder.append("|threadId = %d");
    localStringBuilder.append("|priority = %d");
    localStringBuilder.append("|addTime = %d");
    localStringBuilder.append("|delayTime = %d");
    localStringBuilder.append("|usedTime = %d");
    localStringBuilder.append("|cpuTime = %d");
    localStringBuilder.append("|started = %b");
    xzM = localStringBuilder.toString();
    localStringBuilder = new StringBuilder();
    localStringBuilder.append("taskName = %s");
    localStringBuilder.append(" | addTime = %s");
    localStringBuilder.append(" | endTime = %s");
    localStringBuilder.append(" | usedTime = %d");
    localStringBuilder.append(" | cpuTime = %d");
    localStringBuilder.append(" | threadCpuTime = %d");
    localStringBuilder.append(" | totalCpuTime = %d");
    localStringBuilder.append(" | threadCpuRate = %.1f");
    xzN = localStringBuilder.toString();
    AppMethodBeat.o(52169);
  }

  aq(Thread paramThread, Handler paramHandler, Runnable paramRunnable, Object paramObject, a parama)
  {
    AppMethodBeat.i(52166);
    this.started = false;
    this.xzL = -1.0F;
    this.thread = paramThread;
    if (paramThread != null)
    {
      this.threadName = paramThread.getName();
      this.xzF = paramThread.getId();
      this.priority = paramThread.getPriority();
    }
    this.handler = paramHandler;
    this.xzE = paramRunnable;
    paramHandler = paramRunnable.getClass().getName();
    paramRunnable = paramRunnable.toString();
    paramThread = paramHandler;
    if (!bo.isNullOrNil(paramRunnable))
    {
      int i = paramRunnable.indexOf('|');
      paramThread = paramHandler;
      if (i > 0)
        paramThread = paramHandler + "_" + paramRunnable.substring(i + 1);
    }
    this.eOn = paramThread;
    this.xxu = paramObject;
    this.xzG = parama;
    this.cmn = System.currentTimeMillis();
    AppMethodBeat.o(52166);
  }

  public final String dump(boolean paramBoolean)
  {
    AppMethodBeat.i(52168);
    String str;
    if (paramBoolean)
    {
      str = String.format(xzM, new Object[] { this.eOn, this.xxu, this.handler, this.threadName, Long.valueOf(this.xzF), Integer.valueOf(this.priority), Long.valueOf(this.cmn), Long.valueOf(this.xzH), Long.valueOf(this.fpi), Long.valueOf(this.xzI), Boolean.valueOf(this.started) });
      AppMethodBeat.o(52168);
    }
    while (true)
    {
      return str;
      str = String.format(xzN, new Object[] { this.eOn, new SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(new Date(this.cmn)), new SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(new Date(this.endTime)), Long.valueOf(this.fpi), Long.valueOf(this.xzI), Long.valueOf(this.xzJ), Long.valueOf(this.xzK), Float.valueOf(this.xzL) });
      AppMethodBeat.o(52168);
    }
  }

  public final void run()
  {
    AppMethodBeat.i(52167);
    int i = Process.myTid();
    new StringBuilder("/proc/self/task/").append(i).append("/stat");
    this.fpi = System.currentTimeMillis();
    this.xzI = Debug.threadCpuTimeNanos();
    this.waitTime = (this.fpi - this.cmn - this.xzH);
    this.xzJ = -1L;
    this.xzK = -1L;
    this.started = true;
    this.xzE.run();
    this.xzJ = (-1L - this.xzJ);
    this.xzK = (-1L - this.xzK);
    this.endTime = System.currentTimeMillis();
    this.fpi = (this.endTime - this.fpi);
    this.xzI = ((Debug.threadCpuTimeNanos() - this.xzI) / 1000000L);
    if (this.xzK != 0L)
      this.xzL = ((float)(100L * this.xzJ) / (float)this.xzK);
    if (this.xzG != null)
    {
      this.xzG.a(this.xzE, this);
      this.xzG.a(this, this.thread, this.fpi, this.xzI, this.waitTime, this.xzL);
    }
    AppMethodBeat.o(52167);
  }

  public static abstract interface a
  {
    public abstract void a(Runnable paramRunnable, aq paramaq);

    public abstract void a(Runnable paramRunnable, Thread paramThread, long paramLong1, long paramLong2, long paramLong3, float paramFloat);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.aq
 * JD-Core Version:    0.6.2
 */