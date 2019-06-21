package com.tencent.mm.plugin.card.model.a;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bsr;
import com.tencent.mm.protocal.protobuf.btd;
import com.tencent.mm.protocal.protobuf.wr;
import com.tencent.mm.protocal.protobuf.ws;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/card/model/v2/CgiDeleteMchInList;", "Lcom/tencent/mm/plugin/card/model/v2/CommonCardCgi;", "Lcom/tencent/mm/protocal/protobuf/DeleteMchInListResponse;", "marchantId", "", "(Ljava/lang/String;)V", "Companion", "plugin-card_release"})
public final class e extends k<ws>
{
  private static final String TAG = "MicroMsg.CgiDeleteMchInList";
  public static final a kfg;

  static
  {
    AppMethodBeat.i(89161);
    kfg = new a((byte)0);
    TAG = "MicroMsg.CgiDeleteMchInList";
    AppMethodBeat.o(89161);
  }

  public e(String paramString)
  {
    AppMethodBeat.i(89160);
    wr localwr = new wr();
    ws localws = new ws();
    localwr.vSR = paramString;
    a((bsr)localwr, (btd)localws, 1768, "/cgi-bin/mmpay-bin/mktdeletemchinlist");
    ab.i(TAG, "delete mch: %s", new Object[] { paramString });
    AppMethodBeat.o(89160);
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/card/model/v2/CgiDeleteMchInList$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "plugin-card_release"})
  public static final class a
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.model.a.e
 * JD-Core Version:    0.6.2
 */