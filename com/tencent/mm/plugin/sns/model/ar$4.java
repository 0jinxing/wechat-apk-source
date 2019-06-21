package com.tencent.mm.plugin.sns.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelvideo.f;
import com.tencent.mm.modelvideo.i;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;

final class ar$4
  implements Runnable
{
  ar$4(ar paramar, f paramf)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(36648);
    String str = this.fWd.cwT;
    synchronized (this.qNb.qMZ)
    {
      Iterator localIterator = this.qNb.qMZ.iterator();
      while (localIterator.hasNext())
      {
        n localn = (n)localIterator.next();
        if ((localn != null) && (bo.isEqual(str, localn.cqU())))
        {
          ab.i("MicroMsg.SnsVideoService", "%d find sns info[%s], remove now", new Object[] { Integer.valueOf(this.qNb.hashCode()), str });
          localIterator.remove();
        }
      }
    }
    o.aln().cW(false);
    if (this.qNb.fWa != null)
      this.qNb.fWa.fVC = null;
    this.qNb.fWa = null;
    this.qNb.cok();
    this.qNb.coj();
    AppMethodBeat.o(36648);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.ar.4
 * JD-Core Version:    0.6.2
 */