package com.tencent.mm.plugin.appbrand.jsapi.media;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.media.g.c.b;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.concurrent.CountDownLatch;

final class JsApiChooseMultiMedia$a$5
  implements c.b
{
  JsApiChooseMultiMedia$a$5(CountDownLatch paramCountDownLatch)
  {
  }

  public final void lW(String paramString)
  {
    AppMethodBeat.i(131234);
    ab.d("MicroMsg.JsApiChooseMultiMedia", "remux onFinish.");
    this.val$latch.countDown();
    AppMethodBeat.o(131234);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia.a.5
 * JD-Core Version:    0.6.2
 */