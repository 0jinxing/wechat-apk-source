package com.tencent.mm.plugin.appbrand.ui;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.game.preload.a.a;
import com.tencent.mm.plugin.appbrand.r.m;
import com.tencent.mm.sdk.platformtools.ab;

final class c$1
  implements a.a
{
  c$1(c paramc, long paramLong)
  {
  }

  public final void a(Bitmap paramBitmap, long paramLong)
  {
    AppMethodBeat.i(132934);
    ab.i("MicroMsg.AppBrandGameUILoadingSplash", "onLoadingImageLoaded");
    c.a(this.iGs);
    if (c.b(this.iGs) != null)
      m.runOnUiThread(new c.1.1(this, paramBitmap, paramLong));
    AppMethodBeat.o(132934);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.c.1
 * JD-Core Version:    0.6.2
 */