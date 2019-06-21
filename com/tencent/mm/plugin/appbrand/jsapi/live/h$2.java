package com.tencent.mm.plugin.appbrand.jsapi.live;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.s.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class h$2
  implements b.a
{
  h$2(h paramh, AppBrandLivePusherView paramAppBrandLivePusherView)
  {
  }

  public final void AN(String paramString)
  {
    AppMethodBeat.i(96124);
    if (!bo.isNullOrNil(paramString))
    {
      ab.i("MicroMsg.JsApiUpdateLivePusher", "convertWatermarkImageToLocalPath, localPath:%s", new Object[] { paramString });
      Bundle localBundle = new Bundle();
      localBundle.putString("watermarkImage", paramString);
      this.hLx.y(localBundle);
    }
    AppMethodBeat.o(96124);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.live.h.2
 * JD-Core Version:    0.6.2
 */