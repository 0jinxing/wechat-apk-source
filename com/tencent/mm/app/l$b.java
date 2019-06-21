package com.tencent.mm.app;

import android.app.ActivityManager;
import android.app.ActivityManager.ProcessErrorStateInfo;
import android.content.Context;
import android.os.ConditionVariable;
import android.os.Process;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

final class l$b
  implements Runnable
{
  private l$b(l paraml)
  {
  }

  private static ActivityManager.ProcessErrorStateInfo Bv()
  {
    Object localObject = ((ActivityManager)ah.getContext().getSystemService("activity")).getProcessesInErrorState();
    if (localObject == null)
      localObject = null;
    while (true)
    {
      return localObject;
      Iterator localIterator = ((List)localObject).iterator();
      while (true)
        if (localIterator.hasNext())
        {
          localObject = (ActivityManager.ProcessErrorStateInfo)localIterator.next();
          if ((((ActivityManager.ProcessErrorStateInfo)localObject).uid == Process.myUid()) && (((ActivityManager.ProcessErrorStateInfo)localObject).condition == 2))
            break;
        }
      localObject = null;
    }
  }

  public final void run()
  {
    long l = System.currentTimeMillis();
    ab.i("MicroMsg.MMCrashReporter", "ANR Parser started.");
    ??? = null;
    while (true)
    {
      if (this.ceP.ceH.block(10000L))
        this.ceP.ceH.close();
      try
      {
        Thread.sleep(500L);
        label45: Object localObject2 = Bv();
        ??? = localObject2;
        if (localObject2 == null)
          continue;
        ??? = localObject2;
        localObject2 = ???;
        if (??? == null)
        {
          ??? = Bv();
          localObject2 = ???;
          if (??? == null)
          {
            ab.w("MicroMsg.MMCrashReporter", "ANR process not found, exit thread.");
            this.ceP.ceN = null;
            return;
          }
        }
        ab.i("MicroMsg.MMCrashReporter", "Got ANR process: " + ((ActivityManager.ProcessErrorStateInfo)localObject2).processName + " @ " + ((ActivityManager.ProcessErrorStateInfo)localObject2).pid);
        while (true)
        {
          Object localObject4;
          synchronized (this.ceP.ceE)
          {
            localObject4 = new java/util/ArrayList;
            ((ArrayList)localObject4).<init>(this.ceP.ceE.size());
            int i = this.ceP.ceG.lastIndexOf('.');
            String str;
            if (i != -1)
            {
              str = ((ActivityManager.ProcessErrorStateInfo)localObject2).processName;
              StringBuilder localStringBuilder = new java/lang/StringBuilder;
              localStringBuilder.<init>();
              str = this.ceP.ceG.substring(0, i) + '_' + str + this.ceP.ceG.substring(i);
              if (this.ceP.ceE.remove(str))
                ((ArrayList)localObject4).add(str);
            }
            if (this.ceP.ceE.remove(this.ceP.ceG))
              ((ArrayList)localObject4).add(this.ceP.ceG);
            ((ArrayList)localObject4).addAll(this.ceP.ceE);
            ??? = ((ArrayList)localObject4).iterator();
            if (((Iterator)???).hasNext())
            {
              localObject4 = (String)((Iterator)???).next();
              localObject4 = this.ceP.ceF + '/' + (String)localObject4;
              str = l.a((String)localObject4, ((ActivityManager.ProcessErrorStateInfo)localObject2).pid, l, (ActivityManager.ProcessErrorStateInfo)localObject2);
              if (str != null)
              {
                ab.i("MicroMsg.MMCrashReporter", "Parse ANR trace '%s': OK.", new Object[] { localObject4 });
                this.ceP.s(str, ((ActivityManager.ProcessErrorStateInfo)localObject2).pid);
              }
            }
            else
            {
              ab.i("MicroMsg.MMCrashReporter", "ANR Parser ended.");
              this.ceP.ceN = null;
            }
          }
          ab.i("MicroMsg.MMCrashReporter", "Parse ANR trace '%s': Not found.", new Object[] { localObject4 });
        }
      }
      catch (Exception localException)
      {
        break label45;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.l.b
 * JD-Core Version:    0.6.2
 */