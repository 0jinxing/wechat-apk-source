package com.tencent.mm.plugin.appbrand.jsapi;

import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.mm.plugin.appbrand.o;
import com.tencent.mm.plugin.appbrand.s;
import com.tencent.mm.sdk.platformtools.bo;
import java.net.URLDecoder;
import java.util.HashMap;

final class JsApiScanCode$1$1
  implements Runnable
{
  JsApiScanCode$1$1(JsApiScanCode.1 param1, JsApiScanCode.GetA8KeyTask paramGetA8KeyTask, HashMap paramHashMap)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(130555);
    this.hyI.aBW();
    if (this.hyI.actionCode == 26)
    {
      Uri localUri = Uri.parse(this.hyI.hyM);
      String str = localUri.getQueryParameter("username");
      if (this.hyK.hsj.getRuntime().atI().username.equals(str))
        this.hyJ.put("path", URLDecoder.decode(bo.nullAsNil(localUri.getQueryParameter("path"))));
    }
    this.hyK.hsj.M(this.hyK.eIl, this.hyK.hyH.j("ok", this.hyJ));
    AppMethodBeat.o(130555);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.JsApiScanCode.1.1
 * JD-Core Version:    0.6.2
 */