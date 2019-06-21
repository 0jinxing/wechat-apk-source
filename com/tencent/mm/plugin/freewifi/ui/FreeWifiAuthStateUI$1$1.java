package com.tencent.mm.plugin.freewifi.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.freewifi.model.d;
import com.tencent.mm.plugin.freewifi.model.j;
import com.tencent.mm.protocal.protobuf.gj;
import com.tencent.mm.sdk.platformtools.ab;

final class FreeWifiAuthStateUI$1$1
  implements f
{
  FreeWifiAuthStateUI$1$1(FreeWifiAuthStateUI.1 param1)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(20908);
    ab.i("MicroMsg.FreeWifi.FreeWifiAuthStateUI", "errType : %d, errCode : %d, errMsg : %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.myh.myg.mxY = false;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramm = (com.tencent.mm.plugin.freewifi.d.a)paramm;
      paramString = paramm.bze();
      ab.i("MicroMsg.FreeWifi.FreeWifiAuthStateUI", "authUrl : %s", new Object[] { paramString });
      paramm = paramm.bzj();
      if (paramm != null)
      {
        ab.i("MicroMsg.FreeWifi.FreeWifiAuthStateUI", "backPageInfo appid: %s, nickName: %s, userName: %s, finishActionCode: %d, finishUrl: %s, signature: %s", new Object[] { paramm.vEn, paramm.jCH, paramm.jBB, Integer.valueOf(paramm.vID), paramm.vIE, paramm.guQ });
        this.myh.myg.csB = paramm.vEn;
        this.myh.myg.mwH = paramm.jCH;
        this.myh.myg.cBb = paramm.jBB;
        this.myh.myg.mzZ = paramm.vID;
        this.myh.myg.mAa = paramm.vIE;
        this.myh.myg.signature = paramm.guQ;
        this.myh.myg.mAb = paramm.vIF;
      }
      j.bzb().a(this.myh.myg.ssid, paramString, this.myh.myg.getIntent());
      AppMethodBeat.o(20908);
    }
    while (true)
    {
      return;
      if (paramInt2 == -2014)
      {
        d.a(this.myh.myg.ssid, -2014, this.myh.myg.getIntent());
        AppMethodBeat.o(20908);
      }
      else
      {
        d.a(this.myh.myg.ssid, 3, this.myh.myg.getIntent());
        AppMethodBeat.o(20908);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.FreeWifiAuthStateUI.1.1
 * JD-Core Version:    0.6.2
 */