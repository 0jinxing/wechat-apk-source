package com.tencent.mm.plugin.card.model.a;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bsr;
import com.tencent.mm.protocal.protobuf.btd;
import com.tencent.mm.protocal.protobuf.hq;
import com.tencent.mm.protocal.protobuf.hr;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/card/model/v2/CgiBatchDeleteCardInInvalid;", "Lcom/tencent/mm/plugin/card/model/v2/CommonCardCgi;", "Lcom/tencent/mm/protocal/protobuf/BatchDeleteCardInInvalidListResponse;", "cardIds", "", "", "(Ljava/util/List;)V", "Companion", "plugin-card_release"})
public final class b extends k<hr>
{
  private static String TAG;
  public static final b.a kfd;

  static
  {
    AppMethodBeat.i(89155);
    kfd = new b.a((byte)0);
    TAG = "MicroMsg.CgiBatchDeleteCardInInvalid";
    AppMethodBeat.o(89155);
  }

  public b(List<String> paramList)
  {
    AppMethodBeat.i(89154);
    hq localhq = new hq();
    hr localhr = new hr();
    localhq.vKi = new LinkedList((Collection)paramList);
    a((bsr)localhq, (btd)localhr, 2850, "/cgi-bin/mmpay-bin/mktbatchdeletecardininvalidlist");
    ab.i(TAG, "cardIds: %s", new Object[] { Integer.valueOf(paramList.size()) });
    AppMethodBeat.o(89154);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.model.a.b
 * JD-Core Version:    0.6.2
 */