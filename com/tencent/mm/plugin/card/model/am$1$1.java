package com.tencent.mm.plugin.card.model;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.hi;
import com.tencent.mm.g.a.hi.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.card.d.l;
import com.tencent.mm.plugin.card.sharecard.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

final class am$1$1
  implements Runnable
{
  am$1$1(am.1 param1, hi paramhi)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(87930);
    if (!g.RK())
      AppMethodBeat.o(87930);
    boolean bool1;
    boolean bool2;
    boolean bool3;
    while (true)
    {
      return;
      bool1 = this.keY.cCe.cCf;
      ab.i("MicroMsg.SubCoreCard.cardGetCountListener", "GetCardCountEvent isForceGet is ".concat(String.valueOf(bool1)));
      bool2 = l.beC();
      bool3 = l.beE();
      if ((!bool2) || (!bool3))
        break;
      ab.i("MicroMsg.SubCoreCard.cardGetCountListener", "card entrance and share card entrance is open");
      AppMethodBeat.o(87930);
    }
    if (bool1)
      g.RO().eJo.a(new y(), 0);
    label254: 
    while (true)
    {
      if (bool3)
      {
        localObject = (Long)g.RP().Ry().get(ac.a.xKs, Long.valueOf(0L));
        if ((localObject != null) && (((Long)localObject).longValue() == 0L))
          am.bbd().bbr();
      }
      if ((bool2) && (TextUtils.isEmpty((String)g.RP().Ry().get(ac.a.xKi, null))))
      {
        am.baV();
        com.tencent.mm.plugin.card.b.b.sO(1);
      }
      AppMethodBeat.o(87930);
      break;
      Object localObject = (Integer)g.RP().Ry().get(282882, null);
      if (localObject != null);
      for (int i = ((Integer)localObject).intValue(); ; i = 0)
      {
        if ((int)(System.currentTimeMillis() / 1000L) - i < 7200)
          break label254;
        g.RO().eJo.a(new y(), 0);
        break;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.model.am.1.1
 * JD-Core Version:    0.6.2
 */