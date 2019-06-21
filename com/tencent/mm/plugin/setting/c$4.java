package com.tencent.mm.plugin.setting;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bz.a;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.protocal.d;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.x.a;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

final class c$4
  implements bz.a
{
  c$4(c paramc)
  {
  }

  public final void a(e.a parama)
  {
    AppMethodBeat.i(126828);
    parama = aa.a(parama.eAB.vED);
    if ((parama == null) || (parama.length() == 0))
    {
      ab.e("MicroMsg.SubCoreSetting", "onReceiveMsg, crowdtest msgContent is null");
      AppMethodBeat.o(126828);
    }
    while (true)
    {
      return;
      parama = br.z(parama, "sysmsg");
      if (parama == null)
      {
        AppMethodBeat.o(126828);
        continue;
      }
      int i = bo.getInt((String)parama.get(".sysmsg.crowdtest.$clientversion"), 0);
      if (i <= d.vxo)
      {
        AppMethodBeat.o(126828);
        continue;
      }
      long l1 = 0L;
      try
      {
        String str = (String)parama.get(".sysmsg.crowdtest.apply.$expire");
        Object localObject = new java/text/SimpleDateFormat;
        ((SimpleDateFormat)localObject).<init>("yyyy-MM-dd");
        long l2 = ((SimpleDateFormat)localObject).parse(str).getTime();
        l1 = l2;
        label132: if (l1 < System.currentTimeMillis())
        {
          c.ciq();
          AppMethodBeat.o(126828);
          continue;
        }
        str = (String)parama.get(".sysmsg.crowdtest.apply.link");
        localObject = (String)parama.get(".sysmsg.crowdtest.feedback.link");
        g.RP().Ry().set(ac.a.xRE, Integer.valueOf(i));
        g.RP().Ry().set(ac.a.xRF, Long.valueOf(l1));
        g.RP().Ry().set(ac.a.xRG, str);
        g.RP().Ry().set(ac.a.xRH, localObject);
        i = bo.getInt((String)parama.get(".sysmsg.crowdtest.apply.reddotlevel"), 0);
        parama = com.tencent.mm.x.c.PK();
        if (i > 0);
        for (boolean bool = true; ; bool = false)
        {
          parama.y(262157, bool);
          if (i < 3)
            com.tencent.mm.x.c.PK().bZ(262157, 266261);
          if (i < 2)
            com.tencent.mm.x.c.PK().bZ(262157, 266262);
          AppMethodBeat.o(126828);
          break;
        }
      }
      catch (Exception localException)
      {
        break label132;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.c.4
 * JD-Core Version:    0.6.2
 */