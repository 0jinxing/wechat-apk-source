package com.tencent.mm.plugin.backup.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.backup.f.h.a;
import com.tencent.mm.plugin.backup.i.u;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Vector;
import java.util.concurrent.LinkedBlockingQueue;

final class c$b$3$1$1
  implements Runnable
{
  c$b$3$1$1(c.b.3.1 param1, LinkedList paramLinkedList)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(17180);
    int i = 0;
    if ((this.jsf != null) && (i < this.jsf.size()))
    {
      Long localLong = (Long)this.jsf.get(i);
      h.a locala = (h.a)this.jsg.jse.jsa.jrV.get(localLong);
      String str1 = this.jsg.jse.jsa.TAG;
      int j = this.jsf.size();
      String str2;
      if (locala == null)
      {
        str2 = "null";
        label91: if (locala != null)
          break label213;
      }
      label213: for (String str3 = "null"; ; str3 = locala.jvy.path)
      {
        ab.i(str1, "backupBigDataFiles svrIdIndex:%d(%d), svrId:%d media:%s item:%s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), localLong, str2, str3 });
        if (locala != null)
        {
          this.jsg.jse.jsa.jrT.add(locala.jvy.cHr);
          this.jsg.jse.jsa.m(locala.jvy.cHr, locala.jvy.path, true);
        }
        i++;
        break;
        str2 = locala.jvy.cHr;
        break label91;
      }
    }
    this.jsg.jse.jsa.jrP.offer(this.jsg.jse.jsa.jrZ);
    AppMethodBeat.o(17180);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.c.c.b.3.1.1
 * JD-Core Version:    0.6.2
 */