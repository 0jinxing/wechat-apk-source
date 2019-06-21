package com.tencent.mm.modelvideo;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bi;
import java.util.Iterator;
import java.util.LinkedList;

final class i$3
  implements Runnable
{
  i$3(i parami, f paramf)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(50717);
    long l = this.fWd.cvx;
    synchronized (this.fWc.fVS)
    {
      Iterator localIterator = this.fWc.fVS.iterator();
      while (localIterator.hasNext())
      {
        bi localbi = (bi)localIterator.next();
        if ((localbi != null) && (localbi.field_msgId == l))
        {
          ab.i("MicroMsg.PreloadVideoService", "%d find msg[%d], remove now", new Object[] { Integer.valueOf(this.fWc.hashCode()), Long.valueOf(l) });
          localIterator.remove();
        }
      }
    }
    this.fWc.cW(true);
    if (this.fWc.fWa != null)
      this.fWc.fWa.fVC = null;
    this.fWc.fWa = null;
    i.a(this.fWc);
    this.fWc.ald();
    AppMethodBeat.o(50717);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvideo.i.3
 * JD-Core Version:    0.6.2
 */