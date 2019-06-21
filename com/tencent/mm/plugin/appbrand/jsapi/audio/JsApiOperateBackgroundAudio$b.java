package com.tencent.mm.plugin.appbrand.jsapi.audio;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.ah;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.sdk.platformtools.ab;

public final class JsApiOperateBackgroundAudio$b extends ah
{
  private static final int CTRL_INDEX = 162;
  private static final String NAME = "onBackgroundAudioPrev";
  private static final b hAr;

  static
  {
    AppMethodBeat.i(137751);
    hAr = new b();
    AppMethodBeat.o(137751);
  }

  static void k(c paramc)
  {
    try
    {
      AppMethodBeat.i(137750);
      ab.i("MicroMsg.Music.JsApiOperateBackgroundAudio", "onBackgroundAudioPrev");
      hAr.j(paramc).aCj();
      AppMethodBeat.o(137750);
      return;
    }
    finally
    {
      paramc = finally;
    }
    throw paramc;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateBackgroundAudio.b
 * JD-Core Version:    0.6.2
 */