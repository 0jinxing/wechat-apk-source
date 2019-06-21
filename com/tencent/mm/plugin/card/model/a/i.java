package com.tencent.mm.plugin.card.model.a;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.akt;
import com.tencent.mm.protocal.protobuf.aku;
import com.tencent.mm.protocal.protobuf.bsr;
import com.tencent.mm.protocal.protobuf.btd;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/card/model/v2/CgiGetMktInvalidTicketHomePage;", "Lcom/tencent/mm/plugin/card/model/v2/CommonCardCgi;", "Lcom/tencent/mm/protocal/protobuf/GetMktInvalidTicketHomePageResponse;", "offset", "", "reqNum", "lat", "", "lon", "(IIDD)V", "Companion", "plugin-card_release"})
public final class i extends k<aku>
{
  private static final String TAG = "MicroMsg.CgiGetMktInvalidTicketHomePage";
  public static final i.a kfm;

  static
  {
    AppMethodBeat.i(89172);
    kfm = new i.a((byte)0);
    TAG = "MicroMsg.CgiGetMktInvalidTicketHomePage";
    AppMethodBeat.o(89172);
  }

  public i(int paramInt1, int paramInt2, double paramDouble1, double paramDouble2)
  {
    AppMethodBeat.i(89171);
    akt localakt = new akt();
    aku localaku = new aku();
    localakt.offset = paramInt1;
    localakt.vKW = paramInt2;
    localakt.latitude = paramDouble1;
    localakt.longitude = paramDouble2;
    a((bsr)localakt, (btd)localaku, 2979, "/cgi-bin/mmpay-bin/mktgetmktinvalidtickethomepage");
    ab.i(TAG, "offset: %s, reqnum: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    AppMethodBeat.o(89171);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.model.a.i
 * JD-Core Version:    0.6.2
 */