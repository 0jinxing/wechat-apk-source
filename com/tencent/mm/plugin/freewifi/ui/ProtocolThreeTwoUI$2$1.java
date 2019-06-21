package com.tencent.mm.plugin.freewifi.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.plugin.freewifi.d.a;
import com.tencent.mm.plugin.freewifi.model.d;
import com.tencent.mm.protocal.protobuf.gj;
import com.tencent.mm.sdk.platformtools.ab;

final class ProtocolThreeTwoUI$2$1
  implements f
{
  ProtocolThreeTwoUI$2$1(ProtocolThreeTwoUI.2 param2)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(21173);
    ab.i("MicroMsg.FreeWifi.Protocol32UI", "sessionKey=%s, step=%d, method=FreeWifiConnector.getA8Key.callback, desc=net request [apauth.getBackPage] returns. errType=%d, errCode=%d, errMsg=%s", new Object[] { com.tencent.mm.plugin.freewifi.m.V(this.mAE.mAD.getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.W(this.mAE.mAD.getIntent())), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((paramInt1 == 0) && (paramInt2 == 0))
      if (!(paramm instanceof a))
        AppMethodBeat.o(21173);
    while (true)
    {
      return;
      paramString = ((a)paramm).bzj();
      if (paramString != null)
      {
        ab.i("MicroMsg.FreeWifi.Protocol32UI", "backPageInfo appid: %s, nickName: %s, userName: %s, finishActionCode: %d, finishUrl: %s, signature: %s", new Object[] { paramString.vEn, paramString.jCH, paramString.jBB, Integer.valueOf(paramString.vID), paramString.vIE, paramString.guQ });
        this.mAE.mAD.csB = paramString.vEn;
        this.mAE.mAD.mwH = paramString.jCH;
        this.mAE.mAD.cBb = paramString.jBB;
        this.mAE.mAD.mzZ = paramString.vID;
        this.mAE.mAD.mAa = paramString.vIE;
        this.mAE.mAD.signature = paramString.guQ;
        this.mAE.mAD.mAb = paramString.vIF;
        ab.i("MicroMsg.FreeWifi.Protocol32UI", "sessionKey=%s, step=%d, method=FreeWifiConnector.getBackPageInfoAfterConnectSuccess, desc=net request [apauth.getBackPage] gets response. backpageinfo:  appid: %s, appNickName: %s, appUserName: %s, finishActionCode: %s, finishUrl: %s, signature: %s, qingHuaiPageUrl: %s", new Object[] { com.tencent.mm.plugin.freewifi.m.V(this.mAE.mAD.getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.W(this.mAE.mAD.getIntent())), this.mAE.mAD.csB, this.mAE.mAD.mwH, this.mAE.mAD.cBb, Integer.valueOf(this.mAE.mAD.mzZ), this.mAE.mAD.mAa, this.mAE.mAD.signature, this.mAE.mAD.mAb });
      }
      d.a(this.mAE.mAD.ssid, 2, this.mAE.mAD.getIntent());
      ab.i("MicroMsg.FreeWifi.Protocol32UI", "sessionKey=%s, step=%d, method=Protocol32UI.initModel, desc=it changes the connect state of the model to CONNECT_STATE_CONNECT_SUCCESS. state=%d", new Object[] { com.tencent.mm.plugin.freewifi.m.V(this.mAE.mAD.getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.W(this.mAE.mAD.getIntent())), Integer.valueOf(2) });
      AppMethodBeat.o(21173);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.ProtocolThreeTwoUI.2.1
 * JD-Core Version:    0.6.2
 */