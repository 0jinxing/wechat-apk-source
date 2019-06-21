package com.tencent.mm.plugin.voip.model.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.voip.a.a;
import com.tencent.mm.plugin.voip.model.k;
import com.tencent.mm.plugin.voip.model.v2protocal;
import com.tencent.mm.protocal.protobuf.cpk;

final class d$1
  implements f
{
  d$1(d paramd)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(4705);
    a.Logi("MicroMsg.Voip.DoubleLinkSwitch", "double link switch response:" + paramInt1 + " errCode:" + paramInt2 + " status:" + this.sTK.sPK.mStatus);
    if (paramInt2 != 0)
    {
      a.Loge("MicroMsg.Voip.DoubleLinkSwitch", " double link switch  response with error code:".concat(String.valueOf(paramInt2)));
      AppMethodBeat.o(4705);
    }
    while (true)
    {
      return;
      paramString = (cpk)this.sTK.cKx();
      this.sTK.sPK.sPc = paramString.wIr;
      if (this.sTK.sPK.sPc != 0)
        break;
      AppMethodBeat.o(4705);
    }
    if (this.sTK.sPK.sPp.doubleLinkSwitch(paramString.xmS) == 0)
    {
      if (1 != paramString.xmS)
        break label319;
      paramm = this.sTK.sPK.sPp;
      paramm.sUW += 1;
    }
    while (true)
    {
      a.Logi("MicroMsg.Voip.DoubleLinkSwitch", "zhengxue[DOUBLELINK]room " + paramString.wem + " member " + paramString.wPb + " key " + paramString.wen + "report flag " + paramString.wIr + "switch to link type " + paramString.xmS + "doubleLinkSwitchReportStatus " + this.sTK.sPK.sPc + "mDoubleLinkSwitchSucToDirectCnt" + this.sTK.sPK.sPp.sUW + "mDoubleLinkSwitchSucToRelayCnt" + this.sTK.sPK.sPp.sUX);
      AppMethodBeat.o(4705);
      break;
      label319: if (2 == paramString.xmS)
      {
        paramm = this.sTK.sPK.sPp;
        paramm.sUX += 1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.a.d.1
 * JD-Core Version:    0.6.2
 */