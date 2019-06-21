package com.tencent.mm.plugin.appbrand.luggage.export.functionalpage;

import a.l;
import a.v;
import android.os.Parcelable;
import android.util.SparseArray;
import com.tencent.luggage.sdk.launching.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aa.i;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.mm.plugin.appbrand.s;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/luggage/export/functionalpage/FunctionalAPIInvokeManager;", "", "runtime", "Lcom/tencent/mm/plugin/appbrand/luggage/export/functionalpage/FunctionalRuntime;", "(Lcom/tencent/mm/plugin/appbrand/luggage/export/functionalpage/FunctionalRuntime;)V", "callbackContextMap", "Landroid/util/SparseArray;", "Lcom/tencent/mm/plugin/appbrand/luggage/export/functionalpage/CallbackContext;", "callbackIdGenerator", "", "getRuntime", "()Lcom/tencent/mm/plugin/appbrand/luggage/export/functionalpage/FunctionalRuntime;", "navigateBack", "", "transitiveData", "", "invokeResult", "onCallback", "component", "Lcom/tencent/mm/plugin/appbrand/luggage/export/functionalpage/IFunctionalComponent;", "callbackId", "data", "performInvoke", "invokeData", "plugin-appbrand-integration_release"})
public final class c
{
  int iko;
  final SparseArray<a> ikp;
  final j ikq;

  public c(j paramj)
  {
    AppMethodBeat.i(134734);
    this.ikq = paramj;
    this.ikp = new SparseArray();
    AppMethodBeat.o(134734);
  }

  public final void a(m paramm, int paramInt, String paramString)
  {
    AppMethodBeat.i(134732);
    a.f.b.j.p(paramm, "component");
    a.f.b.j.p(paramString, "data");
    paramm = (a)this.ikp.get(paramInt, null);
    if ((paramm instanceof n))
    {
      this.ikp.remove(paramInt);
      cy(((n)paramm).hgU, paramString);
      AppMethodBeat.o(134732);
    }
    while (true)
    {
      return;
      if ((paramm instanceof o))
      {
        this.ikp.remove(paramInt);
        this.ikq.finish();
      }
      AppMethodBeat.o(134732);
    }
  }

  final void cy(String paramString1, String paramString2)
  {
    AppMethodBeat.i(134733);
    Object localObject = this.ikq.atI().bQm;
    if (localObject != null)
    {
      if (localObject == null)
      {
        paramString1 = new v("null cannot be cast to non-null type com.tencent.luggage.sdk.launching.OnWXAppResultListener<com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.ByRuntimeQrcodeResult>");
        AppMethodBeat.o(134733);
        throw paramString1;
      }
      ((b)localObject).a((Parcelable)new ByRuntimeQrcodeResult(paramString2, paramString1));
      this.ikq.finish();
      AppMethodBeat.o(134733);
    }
    while (true)
    {
      return;
      this.iko += 1;
      int i = this.iko;
      i locali = new i();
      localObject = new i();
      ((i)localObject).g("data", paramString2);
      ((i)localObject).g("transitiveData", paramString1);
      locali.g("extraData", localObject);
      paramString1 = locali.toString();
      a.f.b.j.o(paramString1, "JSONObject().apply {\n   …   )\n        }.toString()");
      this.ikp.put(i, o.ikE);
      this.ikq.atK().n("navigateBackApplication", paramString1, i);
      AppMethodBeat.o(134733);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.c
 * JD-Core Version:    0.6.2
 */