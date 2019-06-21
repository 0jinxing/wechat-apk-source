package com.tencent.mm.plugin.freewifi.e;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.j;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiFrontPageUI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

public final class f extends e
  implements a
{
  private String gDC;

  public f(FreeWifiFrontPageUI paramFreeWifiFrontPageUI)
  {
    super(paramFreeWifiFrontPageUI);
    AppMethodBeat.i(20810);
    this.gDC = this.intent.getStringExtra("free_wifi_passowrd");
    ab.i("MicroMsg.FreeWifi.ProtocolFour", "sessionKey=%s, step=%d, desc=Data retrieved. password=%s", new Object[] { m.V(this.intent), Integer.valueOf(m.W(this.intent)), this.gDC });
    AppMethodBeat.o(20810);
  }

  public final void connect()
  {
    AppMethodBeat.i(20811);
    com.tencent.mm.plugin.freewifi.c localc = new com.tencent.mm.plugin.freewifi.c(this.ssid, this.mwF, this.gDC);
    j.byU();
    j.byZ().byI().post(new f.1(this, localc));
    AppMethodBeat.o(20811);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.e.f
 * JD-Core Version:    0.6.2
 */