package com.tencent.mm.plugin.appbrand.jsapi;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.co;
import com.tencent.mm.g.b.a.co.a;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.plugin.appbrand.report.model.j;
import com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime;
import com.tencent.mm.plugin.appbrand.report.quality.a;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run", "com/tencent/mm/plugin/appbrand/jsapi/JsApiGetMenuButtonBoundingClientRectWithReport$invoke$1$1"})
final class ak$a
  implements Runnable
{
  ak$a(long paramLong1, aj.a parama, String paramString, ak paramak, q paramq, long paramLong2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(134640);
    co localco = new co();
    Object localObject = a.DG(this.hxa.getAppId());
    if (localObject == null)
    {
      AppMethodBeat.o(134640);
      return;
    }
    localco.hu(((QualitySessionRuntime)localObject).appId);
    localco.a(co.a.ho(((QualitySessionRuntime)localObject).iCZ));
    localco.ev(((QualitySessionRuntime)localObject).apptype);
    localco.ew(this.hwW);
    localco.ex(((QualitySessionRuntime)localObject).scene);
    localObject = this.hwX;
    long l;
    if (localObject == null)
      l = 0L;
    while (true)
    {
      localco.ey(l);
      localco.hv(j.DE(this.hwY));
      localco.ajK();
      AppMethodBeat.o(134640);
      break;
      switch (al.eQZ[localObject.ordinal()])
      {
      default:
        break;
      case 1:
        l = 1L;
        break;
      case 2:
        l = 2L;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.ak.a
 * JD-Core Version:    0.6.2
 */