package com.tencent.mm.model.d;

import android.os.HandlerThread;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ak.b;
import com.tencent.mm.sdk.platformtools.al;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

public final class a$1
  implements ak.b
{
  public a$1(a parama)
  {
  }

  public final void a(Message paramMessage, Runnable paramRunnable, Thread paramThread, long paramLong1, long paramLong2, float paramFloat)
  {
    AppMethodBeat.i(16372);
    if (paramThread == null)
      AppMethodBeat.o(16372);
    while (true)
    {
      return;
      long l = paramThread.getId();
      Object localObject1 = null;
      Object localObject2;
      if (paramLong1 > a.a(this.fph))
        if (paramMessage != null)
          localObject2 = "|HMonitor dispatch|msg = " + paramMessage + "|handler = " + paramMessage.getTarget() + "|threadName = " + paramThread.getName() + "|threadId = " + paramThread.getId() + "|priority = " + paramThread.getPriority() + "|usedTime = " + paramLong1 + "|cpuTime = " + paramLong2;
      while (true)
      {
        if (aw.RS().oAl.getLooper() != null)
          break label346;
        ab.w("MicroMsg.HandlerTraceManager", "worker thread's looper is dead");
        AppMethodBeat.o(16372);
        break;
        localObject2 = localObject1;
        if (paramRunnable != null)
        {
          localObject2 = "|HMonitor run task|" + ak.dump(paramRunnable, true);
          continue;
          localObject2 = localObject1;
          if (paramLong1 > a.b(this.fph))
          {
            localObject2 = localObject1;
            if (l == a.access$200())
              if (paramMessage != null)
              {
                localObject2 = "|HMonitor dispatch|msg = " + paramMessage + "|handler = " + paramMessage.getTarget() + "|threadName = " + paramThread.getName() + "|threadId = " + paramThread.getId() + "|priority = " + paramThread.getPriority() + "|usedTime = " + paramLong1 + "|cpuTime = " + paramLong2;
              }
              else
              {
                localObject2 = localObject1;
                if (paramRunnable != null)
                  localObject2 = "|HMonitor run task|" + ak.dump(paramRunnable, true);
              }
          }
        }
      }
      label346: if ((paramRunnable != null) && (paramLong1 > a.c(this.fph)) && (l == a.d(this.fph)))
      {
        paramMessage = new a.a();
        paramMessage.fpi = paramLong1;
        paramMessage.info = ak.dump(paramRunnable, false);
        if (a.e(this.fph).size() >= a.f(this.fph))
          a.e(this.fph).pop();
        a.e(this.fph).add(paramMessage);
      }
      int i;
      if ((paramRunnable != null) && (l == a.d(this.fph)) && (paramFloat > 0.0F) && (paramFloat <= 100.0F))
      {
        if (paramFloat >= 30.0F)
          break label607;
        paramMessage = a.g(this.fph);
        i = (int)(paramFloat / 2.0F);
        paramMessage[i] = Long.valueOf(paramMessage[i].longValue() + 1L);
      }
      while (System.currentTimeMillis() - a.h(this.fph) > a.i(this.fph))
      {
        a.a(this.fph, System.currentTimeMillis());
        for (i = 0; i < 18; i++)
          if (a.g(this.fph)[i].longValue() > 0L)
            h.pYm.a(230L, i, a.g(this.fph)[i].longValue(), false);
        label607: if (paramFloat < 40.0F)
        {
          paramMessage = a.g(this.fph);
          paramMessage[15] = Long.valueOf(paramMessage[15].longValue() + 1L);
        }
        else if (paramFloat < 50.0F)
        {
          paramMessage = a.g(this.fph);
          paramMessage[16] = Long.valueOf(paramMessage[16].longValue() + 1L);
        }
        else
        {
          paramMessage = a.g(this.fph);
          paramMessage[17] = Long.valueOf(paramMessage[17].longValue() + 1L);
        }
      }
      if (localObject2 == null)
      {
        AppMethodBeat.o(16372);
      }
      else
      {
        if (!b.foreground)
          ab.i("MicroMsg.HandlerTraceManager", (String)localObject2);
        if (!a.j(this.fph))
        {
          a.a(this.fph, a.abo().format(new Date()) + (String)localObject2 + "\n");
          AppMethodBeat.o(16372);
        }
        else
        {
          AppMethodBeat.o(16372);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.d.a.1
 * JD-Core Version:    0.6.2
 */