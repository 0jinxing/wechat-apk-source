package com.tencent.mm.plugin.freewifi.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.freewifi.model.d;
import com.tencent.mm.plugin.freewifi.model.j;
import com.tencent.mm.sdk.platformtools.ab;

final class FreeWifiActivateAuthStateUI$2$1
  implements f
{
  FreeWifiActivateAuthStateUI$2$1(FreeWifiActivateAuthStateUI.2 param2)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(20890);
    ab.i("MicroMsg.FreeWifi.FreeWifiActivateAuthStateUI", "errType : %d, errCode : %d, errMsg : %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.mxO.mxN.mxY = false;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = ((com.tencent.mm.plugin.freewifi.d.a)paramm).bze();
      ab.i("MicroMsg.FreeWifi.FreeWifiActivateAuthStateUI", "authUrl : %s", new Object[] { paramString });
      j.bzb().a(this.mxO.mxN.ssid, paramString, this.mxO.mxN.getIntent());
      AppMethodBeat.o(20890);
    }
    while (true)
    {
      return;
      if (paramInt2 == -2014)
      {
        d.a(this.mxO.mxN.ssid, -2014, this.mxO.mxN.getIntent());
        AppMethodBeat.o(20890);
      }
      else
      {
        d.a(this.mxO.mxN.ssid, 3, this.mxO.mxN.getIntent());
        AppMethodBeat.o(20890);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.FreeWifiActivateAuthStateUI.2.1
 * JD-Core Version:    0.6.2
 */