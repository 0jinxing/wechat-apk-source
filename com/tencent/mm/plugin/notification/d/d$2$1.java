package com.tencent.mm.plugin.notification.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.qe;
import com.tencent.mm.g.a.qe.a;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.storage.bi;

final class d$2$1
  implements Runnable
{
  d$2$1(d.2 param2, qe paramqe)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(23132);
    bi localbi = this.oWc.cMu.csG;
    if (d.TU(localbi.field_talker))
      this.oWd.oVZ.ci(localbi);
    AppMethodBeat.o(23132);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.notification.d.d.2.1
 * JD-Core Version:    0.6.2
 */