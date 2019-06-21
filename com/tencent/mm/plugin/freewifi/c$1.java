package com.tencent.mm.plugin.freewifi;

import android.app.Activity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class c$1
  implements c.a
{
  public c$1(c paramc, c.a parama)
  {
  }

  public final void onFail(int paramInt)
  {
    AppMethodBeat.i(20565);
    ab.i("MicroMsg.FreeWifi.ConnectSsidPasswordHelper", "sessionKey=%s, step=%d, desc=Connect ssid failed. errorcode=%d", new Object[] { m.V(this.mtJ.activity.getIntent()), Integer.valueOf(m.W(this.mtJ.activity.getIntent())), Integer.valueOf(paramInt) });
    this.mtI.onFail(paramInt);
    AppMethodBeat.o(20565);
  }

  public final void onSuccess()
  {
    AppMethodBeat.i(20564);
    ab.i("MicroMsg.FreeWifi.ConnectSsidPasswordHelper", "sessionKey=%s, step=%d, desc=Connect ssid succeeded. ", new Object[] { m.V(this.mtJ.activity.getIntent()), Integer.valueOf(m.W(this.mtJ.activity.getIntent())) });
    this.mtI.onSuccess();
    AppMethodBeat.o(20564);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.c.1
 * JD-Core Version:    0.6.2
 */