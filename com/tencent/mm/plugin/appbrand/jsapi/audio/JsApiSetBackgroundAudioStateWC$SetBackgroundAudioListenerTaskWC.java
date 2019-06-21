package com.tencent.mm.plugin.appbrand.jsapi.audio;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.v.b;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.ui.banner.AppBrandStickyBannerLogic.a;
import com.tencent.mm.plugin.appbrand.ui.banner.f;

public class JsApiSetBackgroundAudioStateWC$SetBackgroundAudioListenerTaskWC extends JsApiSetBackgroundAudioState.SetBackgroundAudioListenerTask
{
  public v.b hAx;
  public f hAy;

  public JsApiSetBackgroundAudioStateWC$SetBackgroundAudioListenerTaskWC(a parama, c paramc, int paramInt)
  {
    super(parama, paramc, paramInt);
  }

  protected final void oa(int paramInt)
  {
    AppMethodBeat.i(130763);
    switch (paramInt)
    {
    case 5:
    case 6:
    case 9:
    default:
      AppMethodBeat.o(130763);
    case 0:
    case 1:
    case 2:
    case 3:
    case 4:
    case 7:
    case 10:
    case 8:
    case 11:
    case 12:
    case 13:
    case 14:
    }
    while (true)
    {
      return;
      this.hAx.j("setBackgroundAudioState#isPlaying", Boolean.TRUE);
      AppBrandStickyBannerLogic.a.d(this.hAy);
      AppMethodBeat.o(130763);
      continue;
      this.hAx.j("setBackgroundAudioState#isPlaying", Boolean.FALSE);
      AppBrandStickyBannerLogic.a.c(this.hAy);
      AppMethodBeat.o(130763);
      continue;
      AppMethodBeat.o(130763);
      continue;
      AppMethodBeat.o(130763);
      continue;
      AppMethodBeat.o(130763);
      continue;
      AppMethodBeat.o(130763);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioStateWC.SetBackgroundAudioListenerTaskWC
 * JD-Core Version:    0.6.2
 */