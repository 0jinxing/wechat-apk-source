package com.tencent.mm.plugin.freewifi.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.d.a;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.d;
import com.tencent.mm.plugin.freewifi.model.g.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class FreeWifiAuthStateUI$1
  implements g.b
{
  FreeWifiAuthStateUI$1(FreeWifiAuthStateUI paramFreeWifiAuthStateUI)
  {
  }

  public final void ci(String paramString, int paramInt)
  {
    AppMethodBeat.i(20909);
    String str = d.byK();
    ab.i("MicroMsg.FreeWifi.FreeWifiAuthStateUI", "get ap auth data : %s, url : %s, mac : %s", new Object[] { paramString, this.myg.jUg, str });
    if (!bo.isNullOrNil(paramString))
      new a(this.myg.jUg, this.myg.ssid, str, this.myg.mxW, paramString, "", paramInt, m.V(this.myg.getIntent())).c(new FreeWifiAuthStateUI.1.1(this));
    AppMethodBeat.o(20909);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.FreeWifiAuthStateUI.1
 * JD-Core Version:    0.6.2
 */