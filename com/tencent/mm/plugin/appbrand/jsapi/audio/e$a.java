package com.tencent.mm.plugin.appbrand.jsapi.audio;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.t;
import com.tencent.mm.g.a.t.b;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.sdk.platformtools.ab;

final class e$a extends a
{
  public String appId = "";
  public String ckD = "";
  public boolean error = false;
  public int hwi;
  private m hwz;
  public c hxS;

  public e$a(m paramm, c paramc, int paramInt)
  {
    this.hwz = paramm;
    this.hxS = paramc;
    this.hwi = paramInt;
  }

  public final void Dp()
  {
    AppMethodBeat.i(137723);
    ab.i("MicroMsg.Audio.JsApiDestroyInstanceAudio", "runTask");
    String str = this.ckD;
    ab.i("MicroMsg.AudioPlayerHelper", "destroyAudio, audioId:%s", new Object[] { str });
    t localt = new t();
    localt.csI.action = 5;
    localt.csI.ckD = str;
    com.tencent.mm.plugin.music.b.a.a(localt);
    this.error = localt.csJ.csN;
    wM();
    AppMethodBeat.o(137723);
  }

  public final void wM()
  {
    AppMethodBeat.i(137724);
    super.wM();
    ab.i("MicroMsg.Audio.JsApiDestroyInstanceAudio", "callback");
    if (this.hxS == null)
    {
      ab.e("MicroMsg.Audio.JsApiDestroyInstanceAudio", "server is null");
      AppMethodBeat.o(137724);
    }
    while (true)
    {
      return;
      if (this.error)
      {
        this.hxS.M(this.hwi, this.hwz.j("fail", null));
        AppMethodBeat.o(137724);
      }
      else
      {
        this.hxS.M(this.hwi, this.hwz.j("ok", null));
        AppMethodBeat.o(137724);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.audio.e.a
 * JD-Core Version:    0.6.2
 */