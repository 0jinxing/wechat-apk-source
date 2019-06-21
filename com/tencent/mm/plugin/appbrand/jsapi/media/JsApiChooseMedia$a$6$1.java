package com.tencent.mm.plugin.appbrand.jsapi.media;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;

final class JsApiChooseMedia$a$6$1
  implements Runnable
{
  JsApiChooseMedia$a$6$1(JsApiChooseMedia.a.6 param6, ArrayList paramArrayList1, ArrayList paramArrayList2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(131174);
    ab.i("MicroMsg.JsApiChooseMedia", "handle image from album is ok");
    JsApiChooseMedia.a.e(this.hPy.hPt).bFZ = -1;
    JsApiChooseMedia.a.e(this.hPy.hPt).type = "image";
    JsApiChooseMedia.a.e(this.hPy.hPt).hPo = JsApiChooseMedia.a.c(this.hPu, this.hPx);
    JsApiChooseMedia.a.g(this.hPy.hPt, JsApiChooseMedia.a.e(this.hPy.hPt));
    AppMethodBeat.o(131174);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia.a.6.1
 * JD-Core Version:    0.6.2
 */