package com.tencent.mm.plugin.sns.lucky.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bz.a;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.LinkedList;
import java.util.Map;

public final class j
  implements bz.a
{
  public static String TAG = "MicroMsg.NewYearSnsTips2016NotifyLsn";

  public final void a(e.a parama)
  {
    AppMethodBeat.i(35888);
    ab.i(TAG, "receivemsg NewYearSnsTips2016NotifyLsn");
    b.kT(74);
    if ((parama == null) || (parama.eAB == null))
    {
      ab.e(TAG, "onPreAddMessage cmdAM is null");
      AppMethodBeat.o(35888);
      return;
    }
    i locali = new i();
    String str1 = aa.a(parama.eAB.vED);
    locali.jvt = new StringBuffer();
    Map localMap = br.z(str1, "sysmsg");
    locali.qHa.clear();
    if (localMap == null)
    {
      ab.i("MicroMsg.NewYearSnsTips", "errr for paser %s", new Object[] { str1 });
      b.kT(75);
    }
    while (true)
    {
      ab.i("MicroMsg.NewYearSnsTips", "dump NewYearSnsTips " + locali.jvt.toString());
      g.RQ();
      g.RP().Ry().set(ac.a.xMQ, str1);
      g.RQ();
      g.RP().Ry().dsb();
      AppMethodBeat.o(35888);
      break;
      int i = 0;
      label189: long l1;
      label260: long l2;
      label331: String str2;
      if (i == 0)
      {
        parama = "";
        l1 = bo.anl((String)localMap.get(String.format(".sysmsg.NewYearSNSTips2016.Tips%s.%s", new Object[] { parama, "BeginTime" })));
        locali.jvt.append("BeginTime:" + l1 + ";");
        if (i != 0)
          break label536;
        parama = "";
        l2 = bo.anl((String)localMap.get(String.format(".sysmsg.NewYearSNSTips2016.Tips%s.%s", new Object[] { parama, "EndTime" })));
        locali.jvt.append("EndTime:" + l2 + ";");
        if (i != 0)
          break label545;
        parama = "";
        str2 = bo.bc((String)localMap.get(String.format(".sysmsg.NewYearSNSTips2016.Tips%s.%s", new Object[] { parama, "ActionID" })), "");
        locali.jvt.append("ActionID:" + str2 + ";");
        if (bo.isNullOrNil(str2))
          break label563;
        if (i != 0)
          break label554;
      }
      label536: label545: label554: for (parama = ""; ; parama = String.valueOf(i))
      {
        parama = bo.bc((String)localMap.get(String.format(".sysmsg.NewYearSNSTips2016.Tips%s.%s", new Object[] { parama, "TipsMessage" })), "");
        locali.jvt.append("TipsMessage:" + parama + ";\n");
        h localh = new h();
        localh.qGX = str2;
        localh.fKn = l1;
        localh.jCF = l2;
        localh.qGY = parama;
        locali.qHa.add(localh);
        i++;
        break;
        parama = String.valueOf(i);
        break label189;
        parama = String.valueOf(i);
        break label260;
        parama = String.valueOf(i);
        break label331;
      }
      label563: if (locali.qHa.size() == 0)
        b.kT(76);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.lucky.a.j
 * JD-Core Version:    0.6.2
 */