package com.tencent.mm.plugin.card.model.a;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.akv;
import com.tencent.mm.protocal.protobuf.akw;
import com.tencent.mm.protocal.protobuf.bsr;
import com.tencent.mm.protocal.protobuf.btd;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/card/model/v2/CgiGetMktTicketHomePage;", "Lcom/tencent/mm/plugin/card/model/v2/CommonCardCgi;", "Lcom/tencent/mm/protocal/protobuf/GetMktTicketHomePageResponse;", "offset", "", "reqNum", "lat", "", "lon", "(IIDD)V", "Companion", "plugin-card_release"})
public final class j extends k<akw>
{
  private static String TAG;
  public static final j.a kfn;

  static
  {
    AppMethodBeat.i(89174);
    kfn = new j.a((byte)0);
    TAG = "MicroMsg.CgiGetMktTicketHomePage";
    AppMethodBeat.o(89174);
  }

  public j(int paramInt1, int paramInt2, double paramDouble1, double paramDouble2)
  {
    AppMethodBeat.i(89173);
    akv localakv = new akv();
    akw localakw = new akw();
    localakv.offset = paramInt1;
    localakv.vKW = paramInt2;
    localakv.latitude = paramDouble1;
    localakv.longitude = paramDouble2;
    a((bsr)localakv, (btd)localakw, 2940, "/cgi-bin/mmpay-bin/mktgetmkttickethomepage");
    ab.i(TAG, "offset: %s, reqnum: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    AppMethodBeat.o(89173);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.model.a.j
 * JD-Core Version:    0.6.2
 */