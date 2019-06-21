package com.tencent.mm.plugin.appbrand.jsapi.audio;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.t;
import com.tencent.mm.g.a.t.a;
import com.tencent.mm.sdk.platformtools.ab;

final class d$a extends a
{
  public String appId = "";
  public int bJt = 0;
  public String ckD = "";
  public String hAa = "";

  public final void Dp()
  {
    AppMethodBeat.i(137719);
    ab.i("MicroMsg.Audio.JsApiCreateAudioInstance", "runTask flag:%d", new Object[] { Integer.valueOf(this.bJt) });
    this.hAa = "";
    Object localObject;
    String str;
    if (this.bJt == 0)
    {
      localObject = this.appId;
      str = this.ckD;
      ab.i("MicroMsg.AudioPlayerHelper", "createAudioPlayer, appId:%s, audioId:%s", new Object[] { localObject, str });
      t localt = new t();
      localt.csI.action = 10;
      localt.csI.appId = ((String)localObject);
      localt.csI.ckD = str;
      com.tencent.mm.plugin.music.b.a.a(localt);
      this.ckD = localt.csI.ckD;
      ab.i("MicroMsg.Audio.JsApiCreateAudioInstance", "player audioId:%s", new Object[] { this.ckD });
      if (TextUtils.isEmpty(this.ckD))
        this.hAa = "fail to create audio instance";
    }
    while (true)
    {
      wM();
      AppMethodBeat.o(137719);
      return;
      if (this.bJt == 1)
      {
        ab.i("MicroMsg.Audio.JsApiCreateAudioInstance", "pauseAllAudioPlayer");
        str = this.appId;
        ab.i("MicroMsg.AudioPlayerHelper", "pauseAllAudioPlayer appId:%s", new Object[] { str });
        localObject = new t();
        ((t)localObject).csI.action = 12;
        ((t)localObject).csI.appId = str;
        com.tencent.mm.plugin.music.b.a.a((t)localObject);
      }
      else if (this.bJt == 2)
      {
        ab.i("MicroMsg.Audio.JsApiCreateAudioInstance", "stopAllAudioPlayer");
        str = this.appId;
        ab.i("MicroMsg.AudioPlayerHelper", "destroyAllAudioPlayer appId:%s", new Object[] { str });
        localObject = new t();
        ((t)localObject).csI.action = 9;
        ((t)localObject).csI.appId = str;
        com.tencent.mm.plugin.music.b.a.a((t)localObject);
        com.tencent.mm.plugin.appbrand.media.a.a.Cs(this.appId);
      }
    }
  }

  public final void wM()
  {
    AppMethodBeat.i(137720);
    super.wM();
    if (this.bJt == 0)
      if (!TextUtils.isEmpty(this.ckD))
      {
        ab.i("MicroMsg.Audio.JsApiCreateAudioInstance", "create player ok");
        AppMethodBeat.o(137720);
      }
    while (true)
    {
      return;
      ab.e("MicroMsg.Audio.JsApiCreateAudioInstance", "create player failed");
      AppMethodBeat.o(137720);
      continue;
      if (this.bJt != 1)
        ab.e("MicroMsg.Audio.JsApiCreateAudioInstance", "destroy audio instance end");
      AppMethodBeat.o(137720);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.audio.d.a
 * JD-Core Version:    0.6.2
 */