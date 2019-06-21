package com.tencent.mm.plugin.card.model.a;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bsr;
import com.tencent.mm.protocal.protobuf.btd;
import com.tencent.mm.protocal.protobuf.wl;
import com.tencent.mm.protocal.protobuf.wm;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/card/model/v2/CgiDeleteCardInInvalidList;", "Lcom/tencent/mm/plugin/card/model/v2/CommonCardCgi;", "Lcom/tencent/mm/protocal/protobuf/DeleteCardInInvalidListResponse;", "cardId", "", "(Ljava/lang/String;)V", "Companion", "plugin-card_release"})
public final class c extends k<wm>
{
  private static String TAG;
  public static final c.a kfe;

  static
  {
    AppMethodBeat.i(89157);
    kfe = new c.a((byte)0);
    TAG = "MicroMsg.CgiDeleteCardInInvalidList";
    AppMethodBeat.o(89157);
  }

  public c(String paramString)
  {
    AppMethodBeat.i(89156);
    wl localwl = new wl();
    wm localwm = new wm();
    localwl.vCb = paramString;
    a((bsr)localwl, (btd)localwm, 2707, "/cgi-bin/mmpay-bin/mktdeletecardininvalidlist");
    ab.i(TAG, "cardid: %s", new Object[] { paramString });
    AppMethodBeat.o(89156);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.model.a.c
 * JD-Core Version:    0.6.2
 */