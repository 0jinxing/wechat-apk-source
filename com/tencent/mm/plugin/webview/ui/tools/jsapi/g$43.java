package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.gdpr.b;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.sdk.platformtools.ab;

final class g$43
  implements b
{
  g$43(g paramg, i parami, JsapiPermissionWrapper paramJsapiPermissionWrapper)
  {
  }

  public final void kL(int paramInt)
  {
    AppMethodBeat.i(9096);
    if (paramInt == 0)
    {
      g.er(this.uHd, this.uqf);
      AppMethodBeat.o(9096);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.MsgHandler", "EU user failed");
      g.a(this.uHd, this.uqf, "add_contact:fail  EU user failed", null);
      AppMethodBeat.o(9096);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.43
 * JD-Core Version:    0.6.2
 */