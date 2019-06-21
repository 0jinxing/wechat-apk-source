package com.tencent.mm.plugin.sns.lucky.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bz.a;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.Map;

public final class d
  implements bz.a
{
  public final void a(e.a parama)
  {
    AppMethodBeat.i(35880);
    ab.i("MicroMsg.NewYearSNSAmountLevelCtrl2016NotifyLsn", "receivemsg NewYearSNSAmountLevelCtrl2016NotifyLsn");
    b.kT(67);
    if ((parama == null) || (parama.eAB == null))
    {
      ab.e("MicroMsg.NewYearSNSAmountLevelCtrl2016NotifyLsn", "onPreAddMessage cmdAM is null");
      AppMethodBeat.o(35880);
      return;
    }
    e locale = new e();
    parama = aa.a(parama.eAB.vED);
    locale.jvt = new StringBuffer();
    Map localMap = br.z(parama, "sysmsg");
    locale.level = 0;
    if (localMap == null)
    {
      ab.i("MicroMsg.NewYearSnsAmountLevel", "errr for paser %s", new Object[] { parama });
      b.kT(68);
    }
    while (true)
    {
      ab.i("MicroMsg.NewYearSnsAmountLevel", "dump NewYearSnsAmountLevel " + locale.jvt.toString());
      g.RQ();
      g.RP().Ry().set(ac.a.xNb, parama);
      g.RQ();
      g.RP().Ry().dsb();
      AppMethodBeat.o(35880);
      break;
      locale.level = bo.ank((String)localMap.get(".sysmsg.NewYearSNSAmountLevelCtrl2016.Level"));
      ab.i("MicroMsg.NewYearSnsAmountLevel", "get level %d", new Object[] { Integer.valueOf(locale.level) });
      if (locale.level == 0)
        b.kT(69);
      else if (locale.level == 1)
        b.kT(70);
      else if (locale.level == 2)
        b.kT(71);
      else if (locale.level == 3)
        b.kT(72);
      else if (locale.level == 4)
        b.kT(73);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.lucky.a.d
 * JD-Core Version:    0.6.2
 */