package com.tencent.mm.plugin.card.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;
import java.lang.ref.WeakReference;
import java.util.List;

final class g$1
  implements ap.a
{
  g$1(g paramg)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(87680);
    ab.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "onTimerExpired, do refresh code!");
    g localg = this.kbb;
    ab.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "onShowTimeExpired()");
    if (localg.kaD != null)
      for (int i = 0; i < localg.kaD.size(); i++)
      {
        Object localObject = (WeakReference)localg.kaD.get(i);
        if (localObject != null)
        {
          localObject = (g.a)((WeakReference)localObject).get();
          if (localObject != null)
            ((g.a)localObject).baA();
        }
      }
    AppMethodBeat.o(87680);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.b.g.1
 * JD-Core Version:    0.6.2
 */