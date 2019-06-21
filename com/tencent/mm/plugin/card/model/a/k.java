package com.tencent.mm.plugin.card.model.a;

import a.f.b.j;
import a.l;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.protocal.protobuf.bsr;
import com.tencent.mm.protocal.protobuf.btd;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/card/model/v2/CommonCardCgi;", "_Resp", "Lcom/tencent/mm/protocal/protobuf/ResponseProtoBuf;", "Lcom/tencent/mm/modelbase/Cgi;", "()V", "setRR", "", "request", "Lcom/tencent/mm/protocal/protobuf/RequestProtoBuf;", "response", "funcId", "", "uri", "", "plugin-card_release"})
public abstract class k<_Resp extends btd> extends com.tencent.mm.ai.a<_Resp>
{
  public final void a(bsr parambsr, btd parambtd, int paramInt, String paramString)
  {
    j.p(parambsr, "request");
    j.p(parambtd, "response");
    j.p(paramString, "uri");
    b.a locala = new b.a();
    locala.a((com.tencent.mm.bt.a)parambsr);
    locala.b((com.tencent.mm.bt.a)parambtd);
    locala.kU(paramInt);
    locala.qq(paramString);
    locala.kV(0);
    locala.kW(0);
    a(locala.acD());
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.model.a.k
 * JD-Core Version:    0.6.2
 */