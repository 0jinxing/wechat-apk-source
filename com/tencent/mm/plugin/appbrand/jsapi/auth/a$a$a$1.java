package com.tencent.mm.plugin.appbrand.jsapi.auth;

import a.l;
import a.y;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.b.b;
import com.tencent.mm.plugin.appbrand.b.c.a;
import com.tencent.mm.plugin.appbrand.i;
import java.util.HashMap;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "appId", "", "kotlin.jvm.PlatformType", "state", "Lcom/tencent/mm/plugin/appbrand/appstate/AppRunningState;", "onRunningStateChanged", "com/tencent/mm/plugin/appbrand/jsapi/auth/AppBrandAuthJSAPIConcurrentQueue$Companion$obtainByRuntime$1$1$1$1", "com/tencent/mm/plugin/appbrand/jsapi/auth/AppBrandAuthJSAPIConcurrentQueue$Companion$obtainByRuntime$1$1$$special$$inlined$apply$lambda$1"})
final class a$a$a$1
  implements c.a
{
  a$a$a$1(a.a.a parama)
  {
  }

  public final void a(String arg1, b paramb)
  {
    AppMethodBeat.i(134645);
    if (paramb == b.gWw)
      a.aCA();
    while (true)
    {
      synchronized (a.aCz())
      {
        a.aCA();
        paramb = (a)a.aCz().remove(this.hBz.hBy.getAppId());
        if (paramb != null)
        {
          a.b(paramb);
          paramb = y.AUy;
        }
        AppMethodBeat.o(134645);
        return;
      }
      AppMethodBeat.o(134645);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.auth.a.a.a.1
 * JD-Core Version:    0.6.2
 */