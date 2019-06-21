package com.tencent.mm.plugin.appbrand.jsapi.video;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.page.ac;
import com.tencent.mm.plugin.appbrand.page.an;

final class f$5
  implements AppBrandVideoView.a
{
  f$5(f paramf, e parame, int paramInt, an paraman)
  {
  }

  public final void aDF()
  {
    AppMethodBeat.i(126554);
    this.hCK.aBf().pC(this.hCN);
    AppMethodBeat.o(126554);
  }

  public final boolean isFullScreen()
  {
    AppMethodBeat.i(126555);
    boolean bool = this.hCK.aBf().pB(this.hCN);
    AppMethodBeat.o(126555);
    return bool;
  }

  public final void on(int paramInt)
  {
    AppMethodBeat.i(126553);
    this.hCK.aBf().a(this.hCN, this.hLt, paramInt);
    AppMethodBeat.o(126553);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.video.f.5
 * JD-Core Version:    0.6.2
 */