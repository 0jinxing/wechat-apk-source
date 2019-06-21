package com.tencent.mm.plugin.freewifi.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.freewifi.d.a;
import com.tencent.mm.plugin.freewifi.model.d;
import com.tencent.mm.protocal.protobuf.gj;
import com.tencent.mm.sdk.platformtools.ab;

final class FreewifiWeChatNoAuthStateUI$1
  implements f
{
  FreewifiWeChatNoAuthStateUI$1(FreewifiWeChatNoAuthStateUI paramFreewifiWeChatNoAuthStateUI)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(21116);
    aw.Rg().b(640, this);
    ab.i("MicroMsg.FreeWifi.FreewifiWeChatNoAuthStateUI", "onSceneEnd, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      ab.i("MicroMsg.FreeWifi.FreewifiWeChatNoAuthStateUI", "check ap ok");
      paramString = ((a)paramm).bzj();
      if (paramString != null)
      {
        ab.i("MicroMsg.FreeWifi.FreewifiWeChatNoAuthStateUI", "backPageInfo appid: %s, nickName: %s, userName: %s, finishActionCode: %d, finishUrl: %s, signature: %s", new Object[] { paramString.vEn, paramString.jCH, paramString.jBB, Integer.valueOf(paramString.vID), paramString.vIE, paramString.guQ });
        this.mAv.csB = paramString.vEn;
        this.mAv.mwH = paramString.jCH;
        this.mAv.cBb = paramString.jBB;
        this.mAv.mzZ = paramString.vID;
        this.mAv.mAa = paramString.vIE;
        this.mAv.signature = paramString.guQ;
        this.mAv.mAb = paramString.vIF;
      }
      d.a(this.mAv.ssid, 2, this.mAv.getIntent());
      AppMethodBeat.o(21116);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.FreeWifi.FreewifiWeChatNoAuthStateUI", "check ap failed ： rssi is :  %d, mac : %s, ssid is : %s", new Object[] { Integer.valueOf(FreewifiWeChatNoAuthStateUI.a(this.mAv)), FreewifiWeChatNoAuthStateUI.b(this.mAv), FreewifiWeChatNoAuthStateUI.c(this.mAv) });
      d.a(this.mAv.ssid, -2014, this.mAv.getIntent());
      d.MF(FreewifiWeChatNoAuthStateUI.c(this.mAv));
      AppMethodBeat.o(21116);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.FreewifiWeChatNoAuthStateUI.1
 * JD-Core Version:    0.6.2
 */