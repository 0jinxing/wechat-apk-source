package com.tencent.mm.plugin.appbrand.jsapi.audio;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.a;

public class JsApiSetBackgroundAudioStateWC$SetBackgroundAudioStateTaskWC extends JsApiSetBackgroundAudioState.SetBackgroundAudioStateTask
{
  public JsApiSetBackgroundAudioStateWC$SetBackgroundAudioStateTaskWC(a parama, com.tencent.mm.plugin.appbrand.jsapi.c paramc, int paramInt)
  {
    super(parama, paramc, paramInt);
  }

  public final String AP(String paramString)
  {
    AppMethodBeat.i(130764);
    paramString = com.tencent.mm.plugin.i.c.XW() + paramString.hashCode();
    AppMethodBeat.o(130764);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioStateWC.SetBackgroundAudioStateTaskWC
 * JD-Core Version:    0.6.2
 */