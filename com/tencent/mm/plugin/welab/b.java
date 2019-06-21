package com.tencent.mm.plugin.welab;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.model.bz.a;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.List;

public final class b
  implements bz.a
{
  public final void a(e.a parama)
  {
    AppMethodBeat.i(80536);
    if ((parama == null) || (parama.eAB == null) || (parama.eAB.vED == null))
    {
      ab.i("MicroMsg.WelabNewMsgLsn", "recv null msg");
      AppMethodBeat.o(80536);
      return;
    }
    parama = aa.a(parama.eAB.vED);
    ab.i("MicroMsg.WelabNewMsgLsn", "recv addMsg ".concat(String.valueOf(parama)));
    parama = f.agK(parama);
    if ((parama != null) && (parama.isValid()))
    {
      if (parama.field_status != 1)
        break label126;
      a.ddj().uLQ.a(parama, new String[] { "expId" });
    }
    while (true)
    {
      d.t(parama.field_LabsAppId, 6, false);
      AppMethodBeat.o(80536);
      break;
      label126: a.ddj().uLQ.c(parama);
      com.tencent.mm.plugin.welab.e.b.ddC().f(parama);
      parama.ddv();
      ArrayList localArrayList = new ArrayList();
      localArrayList.add(parama);
      a.ddj();
      a.ed(localArrayList);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.welab.b
 * JD-Core Version:    0.6.2
 */