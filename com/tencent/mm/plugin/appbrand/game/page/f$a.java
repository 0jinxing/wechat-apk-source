package com.tencent.mm.plugin.appbrand.game.page;

import com.tencent.magicbrush.MBRuntime.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class f$a extends MBRuntime.a
{
  private f$a(f paramf)
  {
  }

  public final void onFirstFrameRendered()
  {
    AppMethodBeat.i(130246);
    ab.i("AppBrandGame.WAGamePageView", "MagicBrush.onFirstFrameRendered");
    this.hsW.onReady();
    AppMethodBeat.o(130246);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.page.f.a
 * JD-Core Version:    0.6.2
 */