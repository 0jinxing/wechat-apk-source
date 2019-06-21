package com.tencent.mm.app;

import android.os.Debug;
import android.os.Handler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.p;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;

final class a$c
  implements Runnable
{
  int cdR;
  private final Runnable cdS;

  a$c()
  {
    AppMethodBeat.i(15357);
    this.cdR = 0;
    this.cdS = new a.c.1(this);
    AppMethodBeat.o(15357);
  }

  public final void run()
  {
    AppMethodBeat.i(15358);
    h.pYm.a(510L, 0L, 1L, true);
    Thread localThread = Thread.currentThread();
    ab.i("MicroMsg.ANRWatchDog.summeranr", "summeranr ANRWatchDog run thread[%s]", new Object[] { localThread });
    int i = -1;
    int j;
    while (true)
      if (!localThread.isInterrupted())
      {
        j = this.cdR;
        a.AP().post(this.cdS);
        try
        {
          Thread.sleep(a.AN());
          if (this.cdR == j)
            if ((!a.access$900()) && (Debug.isDebuggerConnected()))
            {
              if (this.cdR != i)
                ab.w("MicroMsg.ANRWatchDog.summeranr", "summeranr An ANR was detected but ignored because the debugger is connected (you can prevent this with setIgnoreDebugger(true))");
              i = this.cdR;
            }
        }
        catch (InterruptedException localInterruptedException1)
        {
          a.AQ().a(localInterruptedException1);
          ab.i("MicroMsg.ANRWatchDog.summeranr", "summeranr ANRWatchDog run thread sleep and interrupted[%b]", new Object[] { Boolean.valueOf(localThread.isInterrupted()) });
          AppMethodBeat.o(15358);
        }
      }
    while (true)
    {
      while (true)
      {
        return;
        a.AP().removeCallbacks(this.cdS);
        ab.i("MicroMsg.ANRWatchDog.summeranr", "summeranr ANRWatchDog run thread detect anr CpuUsage[%d, %d, %d]", new Object[] { Long.valueOf(a.AR().LI()), Long.valueOf(a.AR().LJ()), Long.valueOf(a.AR().LH()) });
        try
        {
          Thread.sleep(1000L);
          ab.i("MicroMsg.ANRWatchDog.summeranr", "summeranr ANRWatchDog run thread detect anr new sThreadNamePrefix[%s],lastTick tick[%d, %d], current[%d]", new Object[] { a.access$1100(), Integer.valueOf(j), Integer.valueOf(this.cdR), Long.valueOf(System.currentTimeMillis()) });
          if (a.access$1100() != null)
          {
            a.a locala1 = a.a.j(a.access$1100(), a.AS());
            h.pYm.a(510L, 1L, 1L, true);
            switch (a.AT())
            {
            default:
              if (a.AU() > 0)
                h.pYm.a(510L, 7L, 1L, true);
              a.AV().c(locala1);
              a.AW();
              if (a.AU() >= 10)
                a.AX();
              l = a.gh(a.AU()) * 5 * 60 * 1000L;
              this.cdR = 0;
              ab.i("MicroMsg.ANRWatchDog.summeranr", "summeranr ANRWatchDog run thread set next detect sFibIndex[%d], sleepTime[%d], lastTick, tick[%d, %d]", new Object[] { Integer.valueOf(a.AU()), Long.valueOf(l), Integer.valueOf(0), Integer.valueOf(this.cdR) });
            case 1:
            case 2:
            case 4:
            case 8:
            case 16:
            case 32:
            }
          }
        }
        catch (InterruptedException localInterruptedException2)
        {
          try
          {
            while (true)
            {
              long l;
              Thread.sleep(l);
              ab.i("MicroMsg.ANRWatchDog.summeranr", "summeranr ANRWatchDog run thread set next detect sFibIndex[%d], sleepTime[%d], lastTick, tick[%d, %d] wakeup", new Object[] { Integer.valueOf(a.AU()), Long.valueOf(l), Integer.valueOf(0), Integer.valueOf(this.cdR) });
              break;
              localInterruptedException2 = localInterruptedException2;
              ab.i("MicroMsg.ANRWatchDog.summeranr", "summeranr ANRWatchDog run thread detect anr wait for GetCpuUsage interrupted[%b]", new Object[] { Boolean.valueOf(localThread.isInterrupted()) });
              continue;
              a.a locala2 = a.a.AY();
              continue;
              h.pYm.a(510L, 2L, 1L, true);
              continue;
              h.pYm.a(510L, 3L, 1L, true);
              continue;
              h.pYm.a(510L, 4L, 1L, true);
              continue;
              h.pYm.a(510L, 5L, 1L, true);
              continue;
              h.pYm.a(510L, 6L, 1L, true);
            }
            h.pYm.a(510L, 13L, 1L, true);
          }
          catch (InterruptedException localInterruptedException3)
          {
            a.AQ().a(localInterruptedException3);
            ab.i("MicroMsg.ANRWatchDog.summeranr", "summeranr ANRWatchDog run thread sleep and interrupted when wait for next detect[%b]", new Object[] { Boolean.valueOf(localThread.isInterrupted()) });
            AppMethodBeat.o(15358);
          }
        }
      }
      continue;
      ab.i("MicroMsg.ANRWatchDog.summeranr", "summeranr ANRWatchDog run thread isInterrupted[%b]", new Object[] { Boolean.valueOf(localThread.isInterrupted()) });
      AppMethodBeat.o(15358);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.a.c
 * JD-Core Version:    0.6.2
 */