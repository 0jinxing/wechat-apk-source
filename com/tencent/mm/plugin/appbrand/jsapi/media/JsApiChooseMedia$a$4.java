package com.tencent.mm.plugin.appbrand.jsapi.media;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalVideoObject;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.File;

final class JsApiChooseMedia$a$4
  implements Runnable
{
  JsApiChooseMedia$a$4(JsApiChooseMedia.a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(131171);
    AppBrandLocalVideoObject localAppBrandLocalVideoObject;
    if (new File(JsApiChooseMedia.a.f(this.hPt)).exists())
    {
      ab.i("MicroMsg.JsApiChooseMedia", "take media local, the mVideoFilePath file exist, success");
      JsApiChooseMedia.a.e(this.hPt).bFZ = -1;
      JsApiChooseMedia.a.e(this.hPt).type = "video";
      localAppBrandLocalVideoObject = JsApiChooseMedia.a.a(this.hPt, JsApiChooseMedia.a.f(this.hPt));
      if (localAppBrandLocalVideoObject == null)
      {
        ab.e("MicroMsg.JsApiChooseMedia", "addVideoItem fail ,mVideoFilePath is %s", new Object[] { JsApiChooseMedia.a.f(this.hPt) });
        JsApiChooseMedia.a.e(this.hPt).bFZ = -2;
        JsApiChooseMedia.a.b(this.hPt, JsApiChooseMedia.a.e(this.hPt));
        AppMethodBeat.o(131171);
      }
    }
    while (true)
    {
      return;
      JsApiChooseMedia.a.b(this.hPt, JsApiChooseMedia.a.f(this.hPt));
      String str = JsApiChooseMedia.a.g(this.hPt);
      JsApiChooseMedia.a.e(this.hPt).hPo = JsApiChooseMedia.a.d(localAppBrandLocalVideoObject.czD, str, localAppBrandLocalVideoObject.duration, localAppBrandLocalVideoObject.height, localAppBrandLocalVideoObject.width, localAppBrandLocalVideoObject.size);
      JsApiChooseMedia.a.c(this.hPt, JsApiChooseMedia.a.e(this.hPt));
      AppMethodBeat.o(131171);
      continue;
      ab.e("MicroMsg.JsApiChooseMedia", "take media local, mVideoFilePath is %s, the file not exist, fail", new Object[] { JsApiChooseMedia.a.f(this.hPt) });
      JsApiChooseMedia.a.e(this.hPt).bFZ = -2;
      JsApiChooseMedia.a.d(this.hPt, JsApiChooseMedia.a.e(this.hPt));
      AppMethodBeat.o(131171);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia.a.4
 * JD-Core Version:    0.6.2
 */