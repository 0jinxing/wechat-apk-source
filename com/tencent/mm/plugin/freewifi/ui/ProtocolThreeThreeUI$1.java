package com.tencent.mm.plugin.freewifi.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.sdk.platformtools.bo;

final class ProtocolThreeThreeUI$1
  implements ap.a
{
  ProtocolThreeThreeUI$1(ProtocolThreeThreeUI paramProtocolThreeThreeUI)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(21148);
    if (!bo.isNullOrNil(this.mAA.ssid))
    {
      ProtocolThreeThreeUI.a(this.mAA, this.mAA.bzz());
      if (ProtocolThreeThreeUI.a(this.mAA) != 2)
      {
        ab.i("MicroMsg.FreeWifi.Protocol33UI", "sessionKey=%s, step=%d, method=Protocol33UI.connectTimeoutHandler, desc=wifi connecttimeout. state=%s", new Object[] { m.V(this.mAA.getIntent()), Integer.valueOf(m.W(this.mAA.getIntent())), d.vR(ProtocolThreeThreeUI.a(this.mAA)) });
        d.a(this.mAA.ssid, 3, this.mAA.getIntent());
      }
    }
    AppMethodBeat.o(21148);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.ProtocolThreeThreeUI.1
 * JD-Core Version:    0.6.2
 */