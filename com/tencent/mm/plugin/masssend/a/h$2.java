package com.tencent.mm.plugin.masssend.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.model.bz.a;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class h$2
  implements bz.a
{
  h$2(h paramh)
  {
  }

  public final void a(e.a parama)
  {
    AppMethodBeat.i(22744);
    parama = aa.a(parama.eAB.vED);
    ab.i("MicroMsg.SubCoreMassSend", "MassSendTopConfXml:".concat(String.valueOf(parama)));
    h.bNF().Qt(parama);
    h.bNF().bNA();
    h.bNF();
    c.je(bo.anU());
    AppMethodBeat.o(22744);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.masssend.a.h.2
 * JD-Core Version:    0.6.2
 */