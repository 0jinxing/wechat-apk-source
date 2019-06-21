package com.tencent.mm.plugin.appbrand.jsapi.audio;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.t;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONObject;

public final class m extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 481;
  public static final String NAME = "setInnerAudioOption";

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(137794);
    boolean bool = paramJSONObject.optBoolean("mixWithOther", true);
    paramJSONObject = new com.tencent.mm.ag.a();
    paramJSONObject.fqI = bool;
    ab.i("MicroMsg.AudioPlayerHelper", "setAudioContextOption, mixWithOther:%b", new Object[] { Boolean.valueOf(paramJSONObject.fqI) });
    t localt = new t();
    localt.csI.action = 19;
    localt.csI.csM = paramJSONObject;
    com.tencent.mm.plugin.music.b.a.a(localt);
    paramc.M(paramInt, j("ok", null));
    AppMethodBeat.o(137794);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.audio.m
 * JD-Core Version:    0.6.2
 */