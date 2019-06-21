package com.tencent.mm.plugin.freewifi.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.d.a;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.d;
import com.tencent.mm.plugin.freewifi.model.g.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class FreeWifiActivateAuthStateUI$2
  implements g.b
{
  FreeWifiActivateAuthStateUI$2(FreeWifiActivateAuthStateUI paramFreeWifiActivateAuthStateUI)
  {
  }

  public final void ci(String paramString, int paramInt)
  {
    AppMethodBeat.i(20891);
    String str = d.byK();
    ab.i("MicroMsg.FreeWifi.FreeWifiActivateAuthStateUI", "get ap auth data : %s, url : %s, mac : %s", new Object[] { paramString, this.mxN.jUg, str });
    if (!bo.isNullOrNil(paramString))
      new a(this.mxN.jUg, this.mxN.ssid, str, this.mxN.mxW, paramString, "", paramInt, m.V(this.mxN.getIntent())).c(new FreeWifiActivateAuthStateUI.2.1(this));
    AppMethodBeat.o(20891);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.FreeWifiActivateAuthStateUI.2
 * JD-Core Version:    0.6.2
 */