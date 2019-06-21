package com.tencent.mm.plugin.card.model.a;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.agh;
import com.tencent.mm.protocal.protobuf.agi;
import com.tencent.mm.protocal.protobuf.bsr;
import com.tencent.mm.protocal.protobuf.btd;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/card/model/v2/CgiGetCardEntranceStyle;", "Lcom/tencent/mm/plugin/card/model/v2/CommonCardCgi;", "Lcom/tencent/mm/protocal/protobuf/GetCardEntranceStyleResponse;", "()V", "Companion", "plugin-card_release"})
public final class f extends k<agi>
{
  private static final String TAG = "MicroMsg.CgiGetCardEntranceStyle";
  public static final f.a kfh;

  static
  {
    AppMethodBeat.i(89166);
    kfh = new f.a((byte)0);
    TAG = "MicroMsg.CgiGetCardEntranceStyle";
    AppMethodBeat.o(89166);
  }

  public f()
  {
    AppMethodBeat.i(89165);
    agh localagh = new agh();
    agi localagi = new agi();
    a((bsr)localagh, (btd)localagi, 2793, "/cgi-bin/mmpay-bin/mktgetcardentrancestyle");
    ab.i(TAG, "do get card entrance style");
    AppMethodBeat.o(89165);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.model.a.f
 * JD-Core Version:    0.6.2
 */