package com.tencent.mm.plugin.webview.luggage.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.model.app.ak.a;
import com.tencent.mm.sdk.platformtools.ab;

final class aa$1$1$1
  implements ak.a
{
  aa$1$1$1(aa.1.1 param1)
  {
  }

  public final void r(boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(6326);
    ab.i("MicroMsg.JsApiLaunchApplication", "onLaunchAppCallback(launchRet : %s, launchSuccess : %s)", new Object[] { Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2) });
    if (paramBoolean1)
    {
      this.uki.ukh.kOx.d(null, null);
      AppMethodBeat.o(6326);
    }
    while (true)
    {
      return;
      this.uki.ukh.kOx.d("fail", null);
      AppMethodBeat.o(6326);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.aa.1.1.1
 * JD-Core Version:    0.6.2
 */