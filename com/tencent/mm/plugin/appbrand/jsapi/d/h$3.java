package com.tencent.mm.plugin.appbrand.jsapi.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.p;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.s.e;
import com.tencent.mm.plugin.appbrand.widget.input.c.c;
import com.tencent.mm.plugin.appbrand.widget.input.y;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;

final class h$3
  implements c
{
  h$3(h paramh, com.tencent.mm.plugin.appbrand.widget.input.i parami, String paramString, u paramu)
  {
  }

  public final void bh(String paramString, int paramInt)
  {
    AppMethodBeat.i(123547);
    int i = this.hKp.jdU;
    if (this.hKp.jdV == null)
    {
      ab.e("MicroMsg.JsApiShowKeyboard", "dispatchKBValue(%s), but get NULL inputWidget", new Object[] { this.val$appId });
      AppMethodBeat.o(123547);
    }
    while (true)
    {
      return;
      h.a locala = new h.a();
      HashMap localHashMap = new HashMap();
      localHashMap.put("value", e.Ei(paramString));
      localHashMap.put("data", h.ol(i));
      localHashMap.put("cursor", Integer.valueOf(paramInt));
      localHashMap.put("inputId", Integer.valueOf(i));
      localHashMap.put("keyCode", Integer.valueOf(this.hKp.jdV.getLastKeyPressed()));
      locala.a(this.hCx.getRuntime().xT(), this.hCx.hashCode()).s(localHashMap).aCj();
      AppMethodBeat.o(123547);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.d.h.3
 * JD-Core Version:    0.6.2
 */