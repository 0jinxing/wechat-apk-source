package com.tencent.mm.plugin.appbrand.jsapi.video;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.g.d;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.jsapi.f.b;
import com.tencent.mm.sdk.platformtools.ab;

final class f$3
  implements f.b
{
  f$3(f paramf, e parame, AppBrandVideoView paramAppBrandVideoView)
  {
  }

  public final void wW()
  {
    AppMethodBeat.i(126551);
    g.d locald = g.wV(this.hCK.getAppId());
    ab.i("MicroMsg.JsApiInsertVideoPlayer", "VideoPlayer enter background, pause type:%s", new Object[] { locald.name() });
    if (locald == g.d.gNs)
    {
      this.iam.ow(2);
      AppMethodBeat.o(126551);
    }
    while (true)
    {
      return;
      if (locald == g.d.gNo)
      {
        this.iam.ow(1);
        AppMethodBeat.o(126551);
      }
      else
      {
        this.iam.ow(3);
        AppMethodBeat.o(126551);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.video.f.3
 * JD-Core Version:    0.6.2
 */