package com.tencent.mm.plugin.zero;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.api.bucket.c;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.by;
import com.tencent.mm.modelmulti.o;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Queue;

public final class b
  implements c, com.tencent.mm.plugin.zero.b.b
{
  private by uZM;
  private o uZN;

  public final o ahW()
  {
    AppMethodBeat.i(58743);
    g.RQ();
    g.RN().QU();
    if (this.uZN == null)
      this.uZN = new o();
    o localo = this.uZN;
    AppMethodBeat.o(58743);
    return localo;
  }

  public final by dgK()
  {
    AppMethodBeat.i(58744);
    g.RQ();
    g.RN().QU();
    if (this.uZM == null)
      this.uZM = new by(new b.1(this));
    by localby = this.uZM;
    AppMethodBeat.o(58744);
    return localby;
  }

  public final void onAccountInitialized(e.c paramc)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(58745);
    if (this.uZN != null)
    {
      o localo = this.uZN;
      ab.i("MicroMsg.SyncService", "clear synclist:%s notify:%s running:%s", new Object[] { Integer.valueOf(localo.fJg.size()), Integer.valueOf(localo.fJh.size()), localo.fJj });
      localo.fJg.clear();
      localo.fJh.clear();
    }
    if (this.uZM != null)
      this.uZM.aax();
    AppMethodBeat.o(58745);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.zero.b
 * JD-Core Version:    0.6.2
 */