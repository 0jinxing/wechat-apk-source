package com.tencent.mm.plugin.appbrand.dynamic;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.f;
import com.tencent.mm.ipcinvoker.wx_extension.service.ToolsProcessIPCService;
import com.tencent.mm.modelappbrand.u;
import com.tencent.mm.plugin.appbrand.h.h;

final class c$3
  implements h
{
  c$3(c paramc)
  {
  }

  public final void C(String paramString1, String paramString2)
  {
    AppMethodBeat.i(10662);
    u.i("MicroMsg.DynamicPageViewIPCProxy", "js error msg %s, stackTrace %s", new Object[] { paramString1, paramString2 });
    paramString1 = new Bundle();
    paramString1.putString("widgetId", this.hlu.eIq);
    paramString1.putString("action", "onWidgetJsError");
    paramString1.putString("data", paramString2);
    paramString2 = i.azC().zV(this.hlu.eIq);
    if (paramString2 == null)
    {
      ToolsProcessIPCService.b(paramString1, c.b.class);
      AppMethodBeat.o(10662);
    }
    while (true)
    {
      return;
      f.a(paramString2, paramString1, c.b.class, null);
      AppMethodBeat.o(10662);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.c.3
 * JD-Core Version:    0.6.2
 */