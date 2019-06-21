package com.tencent.mm.plugin.card.model.a;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bsr;
import com.tencent.mm.protocal.protobuf.btd;
import com.tencent.mm.protocal.protobuf.wn;
import com.tencent.mm.protocal.protobuf.wo;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/card/model/v2/CgiDeleteCardInTicketList;", "Lcom/tencent/mm/plugin/card/model/v2/CommonCardCgi;", "Lcom/tencent/mm/protocal/protobuf/DeleteCardInTicketListResponse;", "cardId", "", "(Ljava/lang/String;)V", "Companion", "plugin-card_release"})
public final class d extends k<wo>
{
  private static String TAG;
  public static final d.a kff;

  static
  {
    AppMethodBeat.i(89159);
    kff = new d.a((byte)0);
    TAG = "MicroMsg.CgiDeleteCardInTicketList";
    AppMethodBeat.o(89159);
  }

  public d(String paramString)
  {
    AppMethodBeat.i(89158);
    wn localwn = new wn();
    wo localwo = new wo();
    localwn.vCb = paramString;
    a((bsr)localwn, (btd)localwo, 1739, "/cgi-bin/mmpay-bin/mktdeletecardinticketlist");
    ab.i(TAG, "cardid: %s", new Object[] { paramString });
    AppMethodBeat.o(89158);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.model.a.d
 * JD-Core Version:    0.6.2
 */