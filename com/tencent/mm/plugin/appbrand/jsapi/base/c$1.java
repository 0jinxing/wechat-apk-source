package com.tencent.mm.plugin.appbrand.jsapi.base;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.page.ac;
import com.tencent.mm.plugin.appbrand.page.ac.b;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONException;
import org.json.JSONObject;

final class c$1
  implements Runnable
{
  c$1(c paramc, e parame, com.tencent.mm.plugin.appbrand.jsapi.c paramc1, int paramInt, JSONObject paramJSONObject)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(91047);
    if (this.hCQ == null)
    {
      ab.w("MicroMsg.BaseUpdateViewJsApi", "page view has been release.");
      this.hyd.M(this.eIl, this.hCR.j("fail:page is null", null));
      AppMethodBeat.o(91047);
    }
    while (true)
    {
      return;
      int i;
      try
      {
        i = this.hCR.r(this.hsm);
        View localView = this.hCQ.aBf().q(i);
        if (localView != null)
          break label159;
        ab.w("MicroMsg.BaseUpdateViewJsApi", "get view by viewId(%s) return null.", new Object[] { Integer.valueOf(i) });
        this.hyd.M(this.eIl, this.hCR.j("fail:got 'null' when get view by the given viewId", null));
        AppMethodBeat.o(91047);
      }
      catch (JSONException localJSONException1)
      {
        this.hyd.M(this.eIl, this.hCR.j("fail:view id do not exist", null));
        AppMethodBeat.o(91047);
      }
      continue;
      label159: c.a(this.hCR, this.hCQ, i, this.hsm);
      try
      {
        Object localObject1 = c.s(this.hsm);
        int j = c.t(this.hsm);
        Boolean localBoolean = c.u(this.hsm);
        Object localObject2 = c.v(this.hsm);
        bool1 = this.hCQ.aBf().a(i, (float[])localObject1, j, localBoolean, (Boolean)localObject2);
        localObject2 = this.hCQ.aBf().py(i);
        if (localObject2 == null);
        for (j = 0; ; j = ((ac.b)localObject2).iuN)
        {
          ab.i("MicroMsg.BaseUpdateViewJsApi", "update view(parentId : %s, viewId : %d), ret : %b", new Object[] { Integer.valueOf(j), Integer.valueOf(i), Integer.valueOf(localJSONException1.hashCode()), Boolean.valueOf(bool1) });
          boolean bool2 = this.hCR.aCE();
          bool3 = bool1;
          if (bool1)
          {
            if (!bool2)
              break label427;
            bool3 = this.hCR.b(this.hCQ, i, localJSONException1, this.hsm, new g(this.hyd, this.eIl));
          }
          if (!bool2)
          {
            localObject1 = this.hyd;
            j = this.eIl;
            localObject2 = this.hCR;
            if (!bool3)
              break label449;
            str = "ok";
            ((com.tencent.mm.plugin.appbrand.jsapi.c)localObject1).M(j, ((m)localObject2).j(str, null));
          }
          AppMethodBeat.o(91047);
          break;
        }
      }
      catch (JSONException localJSONException2)
      {
        while (true)
        {
          boolean bool1 = true;
          continue;
          label427: boolean bool3 = this.hCR.c(this.hCQ, i, str, this.hsm);
          continue;
          label449: String str = "fail";
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.base.c.1
 * JD-Core Version:    0.6.2
 */