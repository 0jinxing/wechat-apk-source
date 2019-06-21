package com.tencent.mm.modelvoiceaddr;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.sdk.platformtools.ab;

final class g$2$1
  implements Runnable
{
  g$2$1(g.2 param2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(116706);
    ab.i("MicroMsg.SceneVoiceInputAddr", "run NetSceneNewVoiceInput mWroteBytesCnt %s time %s", new Object[] { Integer.valueOf(g.h(this.gbm.gbk)), Long.valueOf(System.currentTimeMillis()) });
    if ((g.i(this.gbm.gbk)) || (g.k(this.gbm.gbk) == null) || (g.h(this.gbm.gbk) == 0))
    {
      ab.w("MicroMsg.SceneVoiceInputAddr", "WorkerThread too busy can not do work");
      AppMethodBeat.o(116706);
    }
    while (true)
    {
      return;
      com.tencent.mm.kernel.g.Rg().a(235, this.gbm.gbk);
      if ((!((c)g.k(this.gbm.gbk)).amo()) || (!com.tencent.mm.kernel.g.Rg().a(g.k(this.gbm.gbk), 0)))
        this.gbm.gbk.cG(13, 131);
      AppMethodBeat.o(116706);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoiceaddr.g.2.1
 * JD-Core Version:    0.6.2
 */