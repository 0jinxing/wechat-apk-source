package com.tencent.mm.plugin.card.model.a;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.agp;
import com.tencent.mm.protocal.protobuf.agq;
import com.tencent.mm.protocal.protobuf.bsr;
import com.tencent.mm.protocal.protobuf.btd;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/card/model/v2/CgiGetCardPkgMchInfo;", "Lcom/tencent/mm/plugin/card/model/v2/CommonCardCgi;", "Lcom/tencent/mm/protocal/protobuf/GetCardPkgMchInfoResponse;", "marchantId", "", "lastReceiveTime", "", "latitude", "", "longitude", "sortRule", "", "(Ljava/lang/String;JDDI)V", "Companion", "plugin-card_release"})
public final class g extends k<agq>
{
  private static final String TAG = "MicroMsg.CgiGetCardPkgMchInfo";
  public static final g.a kfj;

  static
  {
    AppMethodBeat.i(89168);
    kfj = new g.a((byte)0);
    TAG = "MicroMsg.CgiGetCardPkgMchInfo";
    AppMethodBeat.o(89168);
  }

  public g(String paramString, long paramLong, double paramDouble1, double paramDouble2, int paramInt)
  {
    AppMethodBeat.i(89167);
    agp localagp = new agp();
    agq localagq = new agq();
    localagp.vSR = paramString;
    localagp.vTi = paramLong;
    localagp.latitude = paramDouble1;
    localagp.longitude = paramDouble2;
    localagp.wnj = paramInt;
    a((bsr)localagp, (btd)localagq, 2769, "/cgi-bin/mmpay-bin/mktgetcardpkgmchinfo");
    ab.i(TAG, "marchantid: %s, lastReceiveTime: %s, lat: %s, long: %s", new Object[] { paramString, Long.valueOf(paramLong), Double.valueOf(paramDouble1), Double.valueOf(paramDouble2) });
    AppMethodBeat.o(89167);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.model.a.g
 * JD-Core Version:    0.6.2
 */