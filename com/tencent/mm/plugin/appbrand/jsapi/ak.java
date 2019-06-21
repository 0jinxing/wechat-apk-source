package com.tencent.mm.plugin.appbrand.jsapi;

import a.f.b.j;
import a.l;
import android.util.Pair;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.sdk.g.a.e;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.bo;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/jsapi/JsApiGetMenuButtonBoundingClientRectWithReport;", "Lcom/tencent/mm/plugin/appbrand/jsapi/JsApiGetMenuButtonBoundingClientRect;", "()V", "invoke", "", "env", "Lcom/tencent/mm/plugin/appbrand/AppBrandService;", "data", "Lorg/json/JSONObject;", "component1", "L", "R", "Landroid/util/Pair;", "(Landroid/util/Pair;)Ljava/lang/Object;", "component2", "plugin-appbrand-integration_release"})
public final class ak extends aj
{
  public final String c(q paramq)
  {
    AppMethodBeat.i(134641);
    long l1 = bo.yz();
    Pair localPair = super.d(paramq);
    j.p(localPair, "receiver$0");
    String str = (String)localPair.first;
    j.p(localPair, "receiver$0");
    aj.a locala = (aj.a)localPair.second;
    if (paramq != null)
    {
      long l2 = bo.yz();
      d.xDG.execute((Runnable)new ak.a(l2 - l1, locala, str, this, paramq, l1));
    }
    paramq = localPair.first;
    j.o(paramq, "super.invokeImpl(env, da…       }\n\n        }.first");
    paramq = (String)paramq;
    AppMethodBeat.o(134641);
    return paramq;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.ak
 * JD-Core Version:    0.6.2
 */