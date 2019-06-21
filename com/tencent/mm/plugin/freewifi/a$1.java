package com.tencent.mm.plugin.freewifi;

import android.app.Activity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class a$1
  implements a.a
{
  a$1(a parama, a.a parama1)
  {
  }

  public final void onFail(int paramInt)
  {
    AppMethodBeat.i(20555);
    ab.i("MicroMsg.FreeWifi.ConnectNetworkHelper", "sessionKey=%s, step=%d, desc=Connect ssid failed. errorcode=%d", new Object[] { m.V(this.mtF.activity.getIntent()), Integer.valueOf(m.W(this.mtF.activity.getIntent())), Integer.valueOf(paramInt) });
    this.mtE.onFail(paramInt);
    AppMethodBeat.o(20555);
  }

  public final void onSuccess()
  {
    AppMethodBeat.i(20554);
    ab.i("MicroMsg.FreeWifi.ConnectNetworkHelper", "sessionKey=%s, step=%d, desc=Connect ssid succeeded. ", new Object[] { m.V(this.mtF.activity.getIntent()), Integer.valueOf(m.W(this.mtF.activity.getIntent())) });
    this.mtE.onSuccess();
    AppMethodBeat.o(20554);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.a.1
 * JD-Core Version:    0.6.2
 */