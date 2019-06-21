package com.tencent.mm.plugin.cloudvoip.cloudvoice.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.cloudvoip.cloudvoice.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

final class e$1$1
  implements Runnable
{
  e$1$1(e.1 param1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(135477);
    if (j.kzW.kAb == j.d.kBo)
    {
      ArrayList localArrayList = new ArrayList(5);
      Iterator localIterator = this.kzD.kzC.kzy.iterator();
      while (localIterator.hasNext())
      {
        ??? = (a)localIterator.next();
        j localj = j.kzW;
        boolean bool = j.a((a)???);
        ab.v("MicroMsg.OpenVoice.OpenVoiceMemberMgr", "hy: member %s is talking %b", new Object[] { ???, Boolean.valueOf(bool) });
        if (bool)
          localArrayList.add(???);
      }
      Collections.sort(localArrayList, new e.1.1.1(this));
      if (!e.a(this.kzD.kzC, localArrayList))
        synchronized (this.kzD.kzC.kzA)
        {
          localIterator = this.kzD.kzC.kzA.iterator();
          if (localIterator.hasNext())
            ((e.a)localIterator.next()).v(localArrayList);
        }
      this.kzD.kzC.kzz = localObject1;
      AppMethodBeat.o(135477);
    }
    while (true)
    {
      return;
      ab.w("MicroMsg.OpenVoice.OpenVoiceMemberMgr", "hy: not in room, ignore speaker change");
      AppMethodBeat.o(135477);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.cloudvoip.cloudvoice.c.e.1.1
 * JD-Core Version:    0.6.2
 */