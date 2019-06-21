package com.tencent.mm.plugin.backup.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ai;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

final class c$c$1
  implements Runnable
{
  c$c$1(c.c paramc)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(17191);
    while (true)
    {
      Object localObject1;
      if (!this.jso.jrL.jrD)
        localObject1 = null;
      try
      {
        Object localObject2 = this.jso.jsk.poll(500L, TimeUnit.MILLISECONDS);
        localObject1 = localObject2;
        label40: ab.d("MicroMsg.BackupPackAndSend.TagQueueSucker", "TagQueue(%d)startNext obj:%s", new Object[] { Integer.valueOf(this.jso.jsk.size()), localObject1 });
        if (localObject1 == null)
          continue;
        if (localObject1 == this.jso.jsl)
        {
          this.jso.jsl.open();
          AppMethodBeat.o(17191);
          return;
        }
        c.b localb = (c.b)localObject1;
        localb.hkm = true;
        localObject2 = new StringBuilder("MicroMsg.BackupPackAndSend.tag");
        if (localb.hkm)
        {
          localObject1 = "S.";
          label133: localb.TAG = ((String)localObject1 + localb.jre + "." + localb.bCu);
          label164: if (!this.jso.jrL.jrD)
            localObject1 = null;
        }
        try
        {
          localObject2 = (Runnable)localb.jrP.poll(500L, TimeUnit.MILLISECONDS);
          localObject1 = localObject2;
          label198: if (localObject1 == null)
            break label164;
          long l1 = bo.anU();
          ((Runnable)localObject1).run();
          int i = localb.jrP.size();
          long l2 = this.jso.jrQ.jrM.get();
          int j;
          if (l2 >= 8388608L)
          {
            j = 1;
            label249: if (l2 < 16777216L)
              break label371;
          }
          label371: for (int k = 1; ; k = 0)
          {
            ab.d("MicroMsg.BackupPackAndSend.TagQueueSucker", "workerQueue poll q:%d mem:%s rt:%d [%s,%s,%s]", new Object[] { Integer.valueOf(i), String.format("[%s,%s,%s]", new Object[] { Long.valueOf(l2), Integer.valueOf(j), Integer.valueOf(k) }), Long.valueOf(bo.gb(l1)), localObject1, localb, this.jso.jsm });
            if (localb.hkm)
              break label164;
            System.gc();
            break;
            localObject1 = "W.";
            break label133;
            j = 0;
            break label249;
          }
          AppMethodBeat.o(17191);
        }
        catch (Exception localException1)
        {
          break label198;
        }
      }
      catch (Exception localException2)
      {
        break label40;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.c.c.c.1
 * JD-Core Version:    0.6.2
 */