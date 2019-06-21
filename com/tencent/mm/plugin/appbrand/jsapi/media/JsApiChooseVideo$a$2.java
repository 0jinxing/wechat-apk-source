package com.tencent.mm.plugin.appbrand.jsapi.media;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;

final class JsApiChooseVideo$a$2
  implements Runnable
{
  JsApiChooseVideo$a$2(JsApiChooseVideo.a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(131283);
    if (new File(JsApiChooseVideo.a.b(this.hPV)).exists())
    {
      JsApiChooseVideo.a.a(this.hPV).bFZ = -1;
      JsApiChooseVideo.a.a(this.hPV).hPS = JsApiChooseVideo.a.a(this.hPV, JsApiChooseVideo.a.b(this.hPV), JsApiChooseVideo.a.c(this.hPV).hPR);
      JsApiChooseVideo.a.b(this.hPV, JsApiChooseVideo.a.a(this.hPV));
      AppMethodBeat.o(131283);
    }
    while (true)
    {
      return;
      JsApiChooseVideo.a.a(this.hPV).bFZ = -2;
      JsApiChooseVideo.a.c(this.hPV, JsApiChooseVideo.a.a(this.hPV));
      AppMethodBeat.o(131283);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseVideo.a.2
 * JD-Core Version:    0.6.2
 */