package com.tencent.mm.plugin.appbrand.jsapi.audio;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.ah;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.sdk.platformtools.ab;

public final class JsApiOperateBackgroundAudio$a extends ah
{
  private static final int CTRL_INDEX = 162;
  private static final String NAME = "onBackgroundAudioNext";
  private static final a hAq;

  static
  {
    AppMethodBeat.i(137749);
    hAq = new a();
    AppMethodBeat.o(137749);
  }

  static void k(c paramc)
  {
    try
    {
      AppMethodBeat.i(137748);
      ab.i("MicroMsg.Music.JsApiOperateBackgroundAudio", "onBackgroundAudioNext");
      hAq.j(paramc).aCj();
      AppMethodBeat.o(137748);
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
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateBackgroundAudio.a
 * JD-Core Version:    0.6.2
 */