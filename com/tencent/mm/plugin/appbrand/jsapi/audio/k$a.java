package com.tencent.mm.plugin.appbrand.jsapi.audio;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.ah;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class k$a extends a
{
  public int action;
  public String appId;
  private com.tencent.mm.sdk.b.c hAX;
  public String hAz;
  public int hwi;
  private m hwz;
  public com.tencent.mm.plugin.appbrand.jsapi.c hxS;

  public k$a(m paramm, com.tencent.mm.plugin.appbrand.jsapi.c paramc, int paramInt)
  {
    AppMethodBeat.i(137763);
    this.appId = "";
    this.hAX = new k.a.1(this);
    this.hwz = paramm;
    this.hxS = paramc;
    this.hwi = paramInt;
    AppMethodBeat.o(137763);
  }

  public final void Dp()
  {
    AppMethodBeat.i(137764);
    ab.d("MicroMsg.Audio.JsApiSetAudioState", "AudioListenerTask, runTask");
    com.tencent.mm.plugin.appbrand.media.a.a.Cs(this.appId);
    com.tencent.mm.plugin.appbrand.media.a.a.a(this.appId, this.hAX);
    AppMethodBeat.o(137764);
  }

  public final void wM()
  {
    AppMethodBeat.i(137765);
    if (this.hxS == null)
    {
      ab.e("MicroMsg.Audio.JsApiSetAudioState", "server is null");
      AppMethodBeat.o(137765);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.Audio.JsApiSetAudioState", "AudioListenerTask action:%d, retJson:%s", new Object[] { Integer.valueOf(this.action), this.hAz });
      if (bo.isNullOrNil(this.hAz))
      {
        ab.e("MicroMsg.Audio.JsApiSetAudioState", "jsonResult is null, err");
        AppMethodBeat.o(137765);
      }
      else
      {
        new k.b().j(this.hxS).AM(this.hAz).aCj();
        AppMethodBeat.o(137765);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.audio.k.a
 * JD-Core Version:    0.6.2
 */