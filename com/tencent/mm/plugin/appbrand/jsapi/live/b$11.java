package com.tencent.mm.plugin.appbrand.jsapi.live;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.s.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;

final class b$11
  implements b.a
{
  b$11(b paramb, AppBrandLivePusherView paramAppBrandLivePusherView, String paramString)
  {
  }

  public final void AN(String paramString)
  {
    AppMethodBeat.i(96102);
    if (!bo.isNullOrNil(paramString))
    {
      ab.i("MicroMsg.JsApiInsertLivePusher", "convertBackgroundImageToLocalPath, localPath:%s", new Object[] { paramString });
      Bundle localBundle = new Bundle();
      localBundle.putString("backgroundImage", paramString);
      this.hLx.y(localBundle);
      AppMethodBeat.o(96102);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.JsApiInsertLivePusher", "convertBackgroundImageToLocalPath, load background image fail");
      paramString = new HashMap();
      paramString.put("url", this.val$url);
      this.hLx.a(10004, "load background image fail", paramString);
      AppMethodBeat.o(96102);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.live.b.11
 * JD-Core Version:    0.6.2
 */