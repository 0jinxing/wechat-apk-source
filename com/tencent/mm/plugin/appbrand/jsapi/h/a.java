package com.tencent.mm.plugin.appbrand.jsapi.h;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.j.a.b;
import com.tencent.mm.plugin.appbrand.j.a.d;
import com.tencent.mm.plugin.appbrand.jsapi.h;
import com.tencent.mm.plugin.appbrand.jsapi.i.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONObject;

public final class a extends b
{
  public static final int CTRL_INDEX = 467;
  public static final String NAME = "createLoadSubPackageTask";
  String hRm = "";
  String hvr = "";
  long mTotalSize = -1L;

  private void q(com.tencent.mm.plugin.appbrand.jsapi.c paramc)
  {
    AppMethodBeat.i(114381);
    a.a.a(paramc, this.hvr, "fail", this.hRm);
    AppMethodBeat.o(114381);
  }

  public final String OA()
  {
    return "loadTaskId";
  }

  public final void a(final com.tencent.mm.plugin.appbrand.jsapi.c paramc, JSONObject paramJSONObject, String paramString)
  {
    AppMethodBeat.i(114380);
    paramc = (h)paramc;
    this.hRm = paramJSONObject.optString("moduleName");
    if (bo.isNullOrNil(this.hRm))
    {
      ab.e("MicroMsg.JsApiCreateLoadSubPackageTask", "hy: null or nil moduleName");
      q(paramc);
      AppMethodBeat.o(114380);
    }
    while (true)
    {
      return;
      paramJSONObject = paramc.getRuntime();
      if ((paramJSONObject == null) || (paramJSONObject.mFinished))
      {
        ab.e("MicroMsg.JsApiCreateLoadSubPackageTask", "hy: runtime is not in valid state!");
        q(paramc);
        AppMethodBeat.o(114380);
      }
      else
      {
        paramJSONObject = paramJSONObject.gNO;
        if (paramJSONObject == null)
        {
          ab.e("MicroMsg.JsApiCreateLoadSubPackageTask", "hy: modularizingHelper null!");
          q(paramc);
          AppMethodBeat.o(114380);
        }
        else if (!paramJSONObject.aIy())
        {
          ab.w("MicroMsg.JsApiCreateLoadSubPackageTask", "hy: not support modularizing but still called JsApiCreateLoadSubPackageTask");
          q(paramc);
          AppMethodBeat.o(114380);
        }
        else
        {
          paramJSONObject.a(this.hRm, false, new a.b()
          {
            public final void a(a.d paramAnonymousd)
            {
              AppMethodBeat.i(114374);
              ab.i("MicroMsg.JsApiCreateLoadSubPackageTask", "hy: loadResult: %s", new Object[] { paramAnonymousd.toString() });
              switch (a.3.hRo[paramAnonymousd.ordinal()])
              {
              default:
              case 1:
              case 2:
              case 3:
              }
              while (true)
              {
                AppMethodBeat.o(114374);
                while (true)
                {
                  return;
                  a.a.a(paramc, a.this.hvr, "success", a.this.hRm);
                  AppMethodBeat.o(114374);
                  continue;
                  a.a.a(paramc, a.this.hvr, "fail", a.this.hRm);
                  AppMethodBeat.o(114374);
                }
                ab.w("MicroMsg.JsApiCreateLoadSubPackageTask", "hy: should not happen cancel!!");
                a.a.a(paramc, a.this.hvr, "fail", a.this.hRm);
              }
            }
          }
          , new a.2(this, paramc));
          AppMethodBeat.o(114380);
        }
      }
    }
  }

  public final String aBA()
  {
    AppMethodBeat.i(114379);
    if (bo.isNullOrNil(this.hvr))
    {
      localObject = new StringBuilder();
      com.tencent.mm.plugin.appbrand.l.c.aIB();
      this.hvr = com.tencent.mm.plugin.appbrand.l.c.aIA();
    }
    Object localObject = this.hvr;
    AppMethodBeat.o(114379);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.h.a
 * JD-Core Version:    0.6.2
 */