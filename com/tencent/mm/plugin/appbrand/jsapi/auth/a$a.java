package com.tencent.mm.plugin.appbrand.jsapi.auth;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.i;
import java.util.HashMap;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/jsapi/auth/AppBrandAuthJSAPIConcurrentQueue$Companion;", "", "()V", "DUMMY_IMPL", "Lcom/tencent/mm/plugin/appbrand/jsapi/auth/AppBrandAuthJSAPIExecutorService;", "TAG", "", "gAppIdToQueueMap", "Ljava/util/HashMap;", "Lcom/tencent/mm/plugin/appbrand/jsapi/auth/AppBrandAuthJSAPIConcurrentQueue;", "Lkotlin/collections/HashMap;", "obtainByRuntime", "runtime", "Lcom/tencent/mm/plugin/appbrand/AppBrandRuntime;", "plugin-appbrand-integration_release"})
final class a$a
{
  public static b u(i parami)
  {
    AppMethodBeat.i(134647);
    if (parami == null)
    {
      parami = a.aCy();
      AppMethodBeat.o(134647);
    }
    while (true)
    {
      return parami;
      synchronized (a.aCz())
      {
        a.aCA();
        Object localObject = (a)a.aCz().get(parami.getAppId());
        if (localObject != null)
        {
          parami = (b)localObject;
          AppMethodBeat.o(134647);
          continue;
        }
        localObject = new com/tencent/mm/plugin/appbrand/jsapi/auth/a$a$a;
        ((a.a.a)localObject).<init>(parami);
        parami = (b)((a.f.a.a)localObject).invoke();
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.auth.a.a
 * JD-Core Version:    0.6.2
 */