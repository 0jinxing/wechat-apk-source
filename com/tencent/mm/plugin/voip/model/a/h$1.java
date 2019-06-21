package com.tencent.mm.plugin.voip.model.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.voip.a.a;
import com.tencent.mm.plugin.voip.model.k;
import com.tencent.mm.plugin.voip.model.v2protocal;
import com.tencent.mm.protocal.protobuf.cok;
import com.tencent.mm.protocal.protobuf.cpw;

final class h$1
  implements f
{
  h$1(h paramh)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(4719);
    a.Logi("MicroMsg.Voip.Redirect", "Redirect response:" + paramInt1 + " errCode:" + paramInt2 + " status:" + this.sTO.sPK.mStatus);
    if (paramInt2 != 0)
    {
      a.Loge("MicroMsg.Voip.Redirect", " redirect response with error code:".concat(String.valueOf(paramInt2)));
      AppMethodBeat.o(4719);
    }
    while (true)
    {
      return;
      paramm = (cpw)this.sTO.cKx();
      a.Logi("MicroMsg.Voip.Redirect", "room " + paramm.wem + " member " + paramm.wPb + " key " + paramm.wen + " relay addr cnt " + paramm.xnR + " RedirectThreshold " + paramm.xnW + " RedirectDecision " + paramm.xnX);
      cok localcok1 = new cok();
      cok localcok2 = new cok();
      paramString = new cok();
      localcok1.xlZ = paramm.xnR;
      localcok1.xma = paramm.xnS;
      localcok2.xlZ = paramm.xnT;
      localcok2.xma = paramm.xnU;
      paramString.xlZ = paramm.xnV;
      paramString.xma = paramm.xmC;
      this.sTO.sPK.sPp.a(localcok1, localcok2, paramString, paramm.xnW, paramm.xnX);
      AppMethodBeat.o(4719);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.a.h.1
 * JD-Core Version:    0.6.2
 */