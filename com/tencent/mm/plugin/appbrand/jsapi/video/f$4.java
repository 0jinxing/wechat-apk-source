package com.tencent.mm.plugin.appbrand.jsapi.video;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.jsapi.f.b;
import com.tencent.mm.plugin.appbrand.jsapi.f.c;
import com.tencent.mm.plugin.appbrand.jsapi.f.d;

final class f$4
  implements f.c
{
  f$4(f paramf, AppBrandVideoView paramAppBrandVideoView, e parame, f.d paramd, f.b paramb)
  {
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(126552);
    this.iam.aEX();
    this.hCK.b(this.hLv);
    this.hCK.b(this.hLu);
    this.hCK.b(this);
    AppMethodBeat.o(126552);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.video.f.4
 * JD-Core Version:    0.6.2
 */