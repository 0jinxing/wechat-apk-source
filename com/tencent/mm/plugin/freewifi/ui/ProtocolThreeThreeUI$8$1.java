package com.tencent.mm.plugin.freewifi.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.model.d;
import com.tencent.mm.protocal.protobuf.gj;
import com.tencent.mm.sdk.platformtools.ab;

final class ProtocolThreeThreeUI$8$1
  implements com.tencent.mm.ai.f
{
  ProtocolThreeThreeUI$8$1(ProtocolThreeThreeUI.8 param8)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(21157);
    ab.i("MicroMsg.FreeWifi.Protocol33UI", "sessionKey=%s, step=%d, method=FreeWifiConnector.getA8Key.callback, desc=net request [apauth.getBackPageFor33] returns. errType=%d, errCode=%d, errMsg=%s", new Object[] { com.tencent.mm.plugin.freewifi.m.V(this.mAC.mAA.getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.W(this.mAC.mAA.getIntent())), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = ((com.tencent.mm.plugin.freewifi.d.f)paramm).bzj();
      if (paramString != null)
      {
        ab.i("MicroMsg.FreeWifi.Protocol33UI", "backPageInfo appid: %s, nickName: %s, userName: %s, finishActionCode: %d, finishUrl: %s, signature: %s", new Object[] { paramString.vEn, paramString.jCH, paramString.jBB, Integer.valueOf(paramString.vID), paramString.vIE, paramString.guQ });
        this.mAC.mAA.mwH = paramString.jCH;
        this.mAC.mAA.cBb = paramString.jBB;
        this.mAC.mAA.mzZ = paramString.vID;
        this.mAC.mAA.mAa = paramString.vIE;
        this.mAC.mAA.signature = paramString.guQ;
        this.mAC.mAA.mAb = paramString.vIF;
        ab.i("MicroMsg.FreeWifi.Protocol33UI", "sessionKey=%s, step=%d, method=FreeWifiConnector.getBackPageInfoAfterConnectSuccess, desc=net request [apauth.getBackPageFor33] gets response. backpageinfo:  appid: %s, appNickName: %s, appUserName: %s, finishActionCode: %s, finishUrl: %s, signature: %s, qingHuaiPageUrl: %s", new Object[] { com.tencent.mm.plugin.freewifi.m.V(this.mAC.mAA.getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.W(this.mAC.mAA.getIntent())), this.mAC.mAA.appId, this.mAC.mAA.mwH, this.mAC.mAA.cBb, Integer.valueOf(this.mAC.mAA.mzZ), this.mAC.mAA.mAa, this.mAC.mAA.signature, this.mAC.mAA.mAb });
      }
      d.a(this.mAC.mAA.ssid, 2, this.mAC.mAA.getIntent());
      ab.i("MicroMsg.FreeWifi.Protocol33UI", "sessionKey=%s, step=%d, method=Protocol33UI.initModel, desc=it changes the connect state of the model to CONNECT_STATE_CONNECT_SUCCESS. state=%d", new Object[] { com.tencent.mm.plugin.freewifi.m.V(this.mAC.mAA.getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.W(this.mAC.mAA.getIntent())), Integer.valueOf(2) });
      AppMethodBeat.o(21157);
    }
    while (true)
    {
      return;
      if (paramInt2 == -30032)
      {
        paramString = new Intent();
        paramString.putExtra("free_wifi_error_ui_error_msg", this.mAC.mAA.getString(2131300043));
        paramString.setClass(this.mAC.mAA, FreeWifiErrorUI.class);
        this.mAC.mAA.finish();
        this.mAC.mAA.startActivity(paramString);
        AppMethodBeat.o(21157);
      }
      else
      {
        d.a(this.mAC.mAA.ssid, 3, this.mAC.mAA.getIntent());
        ab.i("MicroMsg.FreeWifi.Protocol33UI", "sessionKey=%s, step=%d, desc=NetSceneGetBackPageFor33 returns unkown errcode. errCode=%d", new Object[] { com.tencent.mm.plugin.freewifi.m.V(this.mAC.mAA.getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.W(this.mAC.mAA.getIntent())), Integer.valueOf(paramInt2) });
        AppMethodBeat.o(21157);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.ProtocolThreeThreeUI.8.1
 * JD-Core Version:    0.6.2
 */