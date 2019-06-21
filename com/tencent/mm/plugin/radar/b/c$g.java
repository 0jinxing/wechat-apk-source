package com.tencent.mm.plugin.radar.b;

import a.f.b.j;
import a.k.m;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.model.bz.a;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.ad;
import java.util.Map;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/radar/model/RadarAddContact$msgListener$1", "Lcom/tencent/mm/model/SysCmdMsgExtension$ISysCmdMsgListener;", "NODE_ENCRYPT_USERNAME", "", "NODE_TYPE", "NODE_USERNAME", "onRecieveMsg", "", "addMsgInfo", "Lcom/tencent/mm/modelbase/IMessageExtension$AddMsgInfo;", "plugin-radar_release"})
public final class c$g
  implements bz.a
{
  private final String pBc = ".sysmsg.addcontact.type";
  private final String pBd = ".sysmsg.addcontact.username";
  private final String pBe = ".sysmsg.addcontact.encryptusername";

  public final void a(e.a parama)
  {
    AppMethodBeat.i(102877);
    j.p(parama, "addMsgInfo");
    Object localObject1 = aa.a(parama.eAB.vED);
    Object localObject2 = br.z((String)localObject1, "sysmsg");
    if (localObject2 == null)
      AppMethodBeat.o(102877);
    while (true)
    {
      return;
      if (j.j((String)((Map)localObject2).get(this.pBc), "1"))
      {
        parama = (String)((Map)localObject2).get(this.pBd);
        localObject2 = (String)((Map)localObject2).get(this.pBe);
        CharSequence localCharSequence = (CharSequence)parama;
        if ((localCharSequence == null) || (m.ar(localCharSequence)))
        {
          i = 1;
          label110: if (i == 0)
          {
            localCharSequence = (CharSequence)localObject2;
            if ((localCharSequence != null) && (!m.ar(localCharSequence)))
              break label172;
          }
        }
        label172: for (int i = 1; ; i = 0)
        {
          if (i == 0)
            break label178;
          ab.e(c.access$getTAG$cp(), "error! server return incorrect content! : %s", new Object[] { localObject1 });
          AppMethodBeat.o(102877);
          break;
          i = 0;
          break label110;
        }
        label178: localObject1 = new ad();
        ((ad)localObject1).setUsername(parama);
        ((ad)localObject1).iH((String)localObject2);
        c.c(this.pAV, (ad)localObject1);
        ab.d(c.access$getTAG$cp(), "receive contact added system message useranme %s, encypt %s", new Object[] { ((ad)localObject1).getUsername(), ((ad)localObject1).Hv() });
      }
      AppMethodBeat.o(102877);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.radar.b.c.g
 * JD-Core Version:    0.6.2
 */