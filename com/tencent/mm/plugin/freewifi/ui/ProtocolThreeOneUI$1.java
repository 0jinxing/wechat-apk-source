package com.tencent.mm.plugin.freewifi.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.sdk.platformtools.bo;

final class ProtocolThreeOneUI$1
  implements ap.a
{
  ProtocolThreeOneUI$1(ProtocolThreeOneUI paramProtocolThreeOneUI)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(21121);
    if (!bo.isNullOrNil(this.mAx.ssid))
    {
      ProtocolThreeOneUI.a(this.mAx, this.mAx.bzz());
      if (ProtocolThreeOneUI.a(this.mAx) != 2)
      {
        ProtocolThreeOneUI.b(this.mAx);
        ab.i("MicroMsg.FreeWifi.Protocol31UI", "sessionKey=%s, step=%d, method=Protocol31UI.connectTimeoutHandler, desc=wifi connecttimeout. state=%s", new Object[] { m.V(this.mAx.getIntent()), Integer.valueOf(m.W(this.mAx.getIntent())), d.vR(ProtocolThreeOneUI.a(this.mAx)) });
        d.a(this.mAx.ssid, 3, this.mAx.getIntent());
        ProtocolThreeOneUI.a(this.mAx, 31, "AUTH_TIMEOUT");
      }
    }
    AppMethodBeat.o(21121);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.ProtocolThreeOneUI.1
 * JD-Core Version:    0.6.2
 */