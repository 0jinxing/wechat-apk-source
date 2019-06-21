package com.tencent.mm.plugin.appbrand.jsapi.contact;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.appbrand.service.d.a;
import com.tencent.mm.sdk.platformtools.ab;

final class JsApiChattingTask$1
  implements d.a
{
  JsApiChattingTask$1(JsApiChattingTask paramJsApiChattingTask)
  {
  }

  public final void d(WxaAttributes paramWxaAttributes)
  {
    AppMethodBeat.i(130982);
    if (paramWxaAttributes == null)
      ab.w("MicroMsg.JsApiChattingTask", "info is null, err");
    JsApiChattingTask.a(this.hIh);
    AppMethodBeat.o(130982);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.contact.JsApiChattingTask.1
 * JD-Core Version:    0.6.2
 */