package com.tencent.mm.plugin.appbrand.jsapi.audio;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class JsApiOperateMusicPlayer$OperateMusicPlayer$4
  implements Runnable
{
  JsApiOperateMusicPlayer$OperateMusicPlayer$4(JsApiOperateMusicPlayer.OperateMusicPlayer paramOperateMusicPlayer)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(130722);
    ab.i("MicroMsg.JsApiOperateMusicPlayer", "seek ok");
    this.hAH.action = -1;
    this.hAH.error = false;
    this.hAH.errorMsg = "";
    JsApiOperateMusicPlayer.OperateMusicPlayer.f(this.hAH);
    AppMethodBeat.o(130722);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateMusicPlayer.OperateMusicPlayer.4
 * JD-Core Version:    0.6.2
 */