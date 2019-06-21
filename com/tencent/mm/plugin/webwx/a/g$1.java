package com.tencent.mm.plugin.webwx.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.g.a.pt;
import com.tencent.mm.model.bz.a;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import java.util.Map;

final class g$1
  implements bz.a
{
  g$1(g paramg)
  {
  }

  public final void a(e.a parama)
  {
    AppMethodBeat.i(26508);
    String str = (String)br.z(aa.a(parama.eAB.vED), "sysmsg").get(".sysmsg.pushloginurl.url");
    if (bo.isNullOrNil(str))
      ab.e("MicroMsg.SubCoreWebWX.pushloginurl", "pushloginurl is null");
    pt localpt = new pt();
    localpt.cLX.cLY = str;
    localpt.cLX.type = 1;
    a.xxA.m(localpt);
    parama.eAB.vEH = null;
    AppMethodBeat.o(26508);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webwx.a.g.1
 * JD-Core Version:    0.6.2
 */