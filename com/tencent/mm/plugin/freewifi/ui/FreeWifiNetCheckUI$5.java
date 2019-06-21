package com.tencent.mm.plugin.freewifi.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.plugin.freewifi.d.h;
import com.tencent.mm.plugin.freewifi.k;
import com.tencent.mm.plugin.freewifi.k.a;
import com.tencent.mm.plugin.freewifi.k.b;
import com.tencent.mm.protocal.protobuf.acq;
import com.tencent.mm.sdk.platformtools.ab;

final class FreeWifiNetCheckUI$5
  implements f
{
  FreeWifiNetCheckUI$5(FreeWifiNetCheckUI paramFreeWifiNetCheckUI, String paramString1, String paramString2, String paramString3)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(21038);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramm = ((h)paramm).bzh();
      if (paramm != null)
      {
        paramString = this.mzM.getIntent();
        paramString.putExtra("free_wifi_appid", paramm.vEn);
        paramString.putExtra("free_wifi_head_img_url", paramm.mZW);
        paramString.putExtra("free_wifi_welcome_msg", paramm.wkr);
        paramString.putExtra("free_wifi_welcome_sub_title", paramm.wkt);
        paramString.putExtra("free_wifi_privacy_url", paramm.wks);
        paramString.putExtra("free_wifi_app_nickname", paramm.jCH);
        paramString.putExtra("ConstantsFreeWifi.FREE_WIFI_PC_ENCRYPTED_SHOPID", this.mzN);
        paramString.putExtra("ConstantsFreeWifi.FREE_WIFI_PC_TICKET", this.mzO);
        paramString.setClass(this.mzM, FreeWifiPcUI.class);
        this.mzM.finish();
        this.mzM.startActivity(paramString);
      }
    }
    while (true)
    {
      paramString = k.byo();
      paramString.muc = this.mzN;
      paramString.mud = this.hxh;
      paramString.kBq = this.mzO;
      paramString.muf = k.b.muL.muQ;
      paramString.mug = k.b.muL.name;
      paramString.result = paramInt2;
      paramString.byq().byp();
      ab.i("MicroMsg.FreeWifi.FreeWifiNetCheckUI", "sessionKey=%s, step=%d, method=handlePcRequest, desc=NetSceneGetPcFrontPage returns.errcode=%d", new Object[] { com.tencent.mm.plugin.freewifi.m.V(this.mzM.getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.W(this.mzM.getIntent())), Integer.valueOf(paramInt2) });
      AppMethodBeat.o(21038);
      return;
      if ((com.tencent.mm.plugin.freewifi.m.eh(paramInt1, paramInt2)) && (!com.tencent.mm.plugin.freewifi.m.isEmpty(paramString)))
        FreeWifiNetCheckUI.a(this.mzM, paramString + "(" + com.tencent.mm.plugin.freewifi.m.a(com.tencent.mm.plugin.freewifi.m.X(FreeWifiNetCheckUI.b(this.mzM)), k.b.muL, paramInt2) + ")", "");
      else
        FreeWifiNetCheckUI.a(this.mzM, this.mzM.getString(2131300044), this.mzM.getString(2131300045));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.FreeWifiNetCheckUI.5
 * JD-Core Version:    0.6.2
 */