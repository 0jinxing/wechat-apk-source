package com.tencent.mm.plugin.card.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.model.bz.a;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

final class am$6
  implements bz.a
{
  am$6(am paramam)
  {
  }

  public final void a(e.a parama)
  {
    AppMethodBeat.i(87939);
    String str = aa.a(parama.eAB.vED);
    if ((str == null) || (str.length() == 0))
    {
      ab.e("MicroMsg.SubCoreCard.CardMsgListener", "onReceiveMsg, msgContent is null");
      AppMethodBeat.o(87939);
    }
    while (true)
    {
      return;
      am.a(this.keX).post(new am.6.1(this, str, parama));
      AppMethodBeat.o(87939);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.model.am.6
 * JD-Core Version:    0.6.2
 */