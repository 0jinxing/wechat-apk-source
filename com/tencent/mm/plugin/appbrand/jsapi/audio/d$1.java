package com.tencent.mm.plugin.appbrand.jsapi.audio;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.g.c;
import com.tencent.mm.plugin.appbrand.g.d;
import com.tencent.mm.plugin.appbrand.media.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Vector;

final class d$1 extends g.c
{
  d$1(d paramd, String paramString)
  {
  }

  public final void a(g.d paramd)
  {
    AppMethodBeat.i(137717);
    ab.i("MicroMsg.Audio.JsApiCreateAudioInstance", "onPause, appId:%s", new Object[] { this.val$appId });
    a.ao(this.val$appId, false);
    paramd = new d.a();
    paramd.bJt = 1;
    paramd.appId = this.val$appId;
    paramd.aCr();
    AppMethodBeat.o(137717);
  }

  public final void onCreate()
  {
    AppMethodBeat.i(137715);
    a.ao(this.val$appId, true);
    AppMethodBeat.o(137715);
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(137718);
    ab.i("MicroMsg.Audio.JsApiCreateAudioInstance", "onDestroy, appId:%s", new Object[] { this.val$appId });
    d.a locala = new d.a();
    locala.bJt = 2;
    locala.appId = this.val$appId;
    locala.aCs();
    g.b(this.val$appId, this);
    d.aCu().remove(this.val$appId);
    AppMethodBeat.o(137718);
  }

  public final void onResume()
  {
    AppMethodBeat.i(137716);
    a.ao(this.val$appId, true);
    AppMethodBeat.o(137716);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.audio.d.1
 * JD-Core Version:    0.6.2
 */