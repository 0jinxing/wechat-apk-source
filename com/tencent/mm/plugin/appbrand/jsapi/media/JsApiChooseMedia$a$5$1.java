package com.tencent.mm.plugin.appbrand.jsapi.media;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;

final class JsApiChooseMedia$a$5$1
  implements Runnable
{
  JsApiChooseMedia$a$5$1(JsApiChooseMedia.a.5 param5, ArrayList paramArrayList1, ArrayList paramArrayList2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(131172);
    ab.i("MicroMsg.JsApiChooseMedia", "handle image from album is ok");
    JsApiChooseMedia.a.e(this.hPw.hPt).bFZ = -1;
    JsApiChooseMedia.a.e(this.hPw.hPt).type = "image";
    JsApiChooseMedia.a.e(this.hPw.hPt).hPo = JsApiChooseMedia.a.c(this.hPu, this.hPv);
    JsApiChooseMedia.a.f(this.hPw.hPt, JsApiChooseMedia.a.e(this.hPw.hPt));
    AppMethodBeat.o(131172);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia.a.5.1
 * JD-Core Version:    0.6.2
 */