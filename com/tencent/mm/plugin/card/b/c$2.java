package com.tencent.mm.plugin.card.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;
import java.lang.ref.WeakReference;
import java.util.List;

final class c$2
  implements ap.a
{
  c$2(c paramc)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(87638);
    ab.i("MicroMsg.CardCodeMgr", "onTimerExpired, do refresh code one minute");
    c localc = this.kaO;
    ab.i("MicroMsg.CardCodeMgr", "onCodeChange()");
    if (localc.kaD != null)
      for (int i = 0; i < localc.kaD.size(); i++)
      {
        Object localObject = (WeakReference)localc.kaD.get(i);
        if (localObject != null)
        {
          localObject = (c.a)((WeakReference)localObject).get();
          if (localObject != null)
            ((c.a)localObject).bap();
        }
      }
    this.kaO.ban();
    AppMethodBeat.o(87638);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.b.c.2
 * JD-Core Version:    0.6.2
 */