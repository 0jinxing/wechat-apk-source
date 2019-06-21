package com.tencent.mm.plugin.appbrand.jsapi.live;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.page.ac;
import com.tencent.mm.plugin.appbrand.page.an;

final class a$5
  implements AppBrandLivePlayerView.a
{
  a$5(a parama, e parame, int paramInt, an paraman)
  {
  }

  public final void aDF()
  {
    AppMethodBeat.i(96075);
    this.hCK.aBf().pC(this.hCN);
    AppMethodBeat.o(96075);
  }

  public final boolean isFullScreen()
  {
    AppMethodBeat.i(96076);
    boolean bool = this.hCK.aBf().pB(this.hCN);
    AppMethodBeat.o(96076);
    return bool;
  }

  public final void on(int paramInt)
  {
    AppMethodBeat.i(96074);
    this.hCK.aBf().a(this.hCN, this.hLt, paramInt);
    AppMethodBeat.o(96074);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.live.a.5
 * JD-Core Version:    0.6.2
 */