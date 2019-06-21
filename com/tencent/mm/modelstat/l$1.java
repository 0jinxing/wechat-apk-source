package com.tencent.mm.modelstat;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac;
import java.io.File;

final class l$1
  implements Runnable
{
  l$1(l paraml, long paramLong)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(78743);
    long l = bo.anU();
    ab.i("MicroMsg.NetStatMsgExtension", "clearfile %s [%s]", new Object[] { Long.valueOf(l.b(new File(g.RP().cachePath), this.fTC)), g.RP().cachePath });
    ab.i("MicroMsg.NetStatMsgExtension", "clearfile %s [%s]", new Object[] { Long.valueOf(l.b(new File(g.RP().eJL), this.fTC)), g.RP().eJL });
    ab.i("MicroMsg.NetStatMsgExtension", "clearfile %s [%s]", new Object[] { Long.valueOf(l.b(new File(g.RP().eJL), this.fTC)), g.RP().eJL });
    ab.i("MicroMsg.NetStatMsgExtension", "clearfile %s [%s]", new Object[] { Long.valueOf(l.b(new File(g.RP().eJM), this.fTC)), g.RP().eJM });
    ab.i("MicroMsg.NetStatMsgExtension", "clearfile %s [%s]", new Object[] { Long.valueOf(l.b(new File(ac.eSj), this.fTC)), ac.eSj });
    ab.i("MicroMsg.NetStatMsgExtension", "clearfile finish %s", new Object[] { Long.valueOf(bo.anU() - l) });
    AppMethodBeat.o(78743);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelstat.l.1
 * JD-Core Version:    0.6.2
 */