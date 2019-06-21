package com.tencent.mm.plugin.appbrand.report.model;

import android.content.ComponentName;
import android.content.Intent;
import android.util.Pair;
import com.tencent.luggage.sdk.b.b;
import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.q;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI;
import com.tencent.mm.plugin.appbrand.n;
import com.tencent.mm.plugin.appbrand.o;
import com.tencent.mm.plugin.appbrand.page.r;
import com.tencent.mm.plugin.appbrand.page.w;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONObject;

public final class e
{
  public static void a(o paramo, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(132606);
    try
    {
      b(paramo, paramJSONObject);
      paramJSONObject.put("referpagepath", a.d(paramo.atI().hgF));
      paramJSONObject.put("clickTimestamp", paramo.atI().startTime);
      AppMethodBeat.o(132606);
      return;
    }
    catch (Exception paramo)
    {
      while (true)
      {
        ab.e("MicroMsg.AppBrandPageVisitStatisticsHelper", "fillWxConfigLaunchInfo ex = %s", new Object[] { paramo });
        AppMethodBeat.o(132606);
      }
    }
  }

  public static void b(o paramo, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(132607);
    paramJSONObject.put("scene", paramo.ya().bQn.scene);
    paramJSONObject.put("scene_note", paramo.ya().bQn.cst);
    paramJSONObject.put("sessionId", paramo.atI().xz());
    paramJSONObject.put("usedState", paramo.ya().bQn.iAo);
    paramJSONObject.put("prescene", paramo.ya().bQn.cOq);
    paramJSONObject.put("prescene_note", paramo.ya().bQn.cOr);
    AppMethodBeat.o(132607);
  }

  public static Pair<Integer, String> l(w paramw)
  {
    int i = 7;
    AppMethodBeat.i(132608);
    Intent localIntent;
    switch (1.gWZ[com.tencent.mm.plugin.appbrand.g.wV(paramw.getAppId()).ordinal()])
    {
    default:
      localIntent = m(paramw).aHY();
      if (localIntent != null)
        if (localIntent.getComponent() == null)
        {
          paramw = "";
          ab.e("MicroMsg.AppBrandPageVisitStatisticsHelper", "onBackground, intent %s, get null cmp name", new Object[] { localIntent });
          if ((!paramw.contains("WebViewUI")) && (!paramw.contains("WebviewMpUI")))
            break label248;
          i = 10;
          paramw = localIntent.getStringExtra(AppBrandProcessProxyUI.huY);
        }
      break;
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      paramw = Pair.create(Integer.valueOf(i), paramw);
      AppMethodBeat.o(132608);
      return paramw;
      if (paramw.ito.isLoading());
      for (i = 4; ; i = 3)
      {
        paramw = null;
        break;
      }
      if (paramw.ito.isLoading())
        i = 5;
      paramw = null;
      continue;
      i = 6;
      paramw = null;
      continue;
      i = 9;
      paramw = n.xa(paramw.getAppId()).gPg + ":" + q.encode(bo.nullAsNil(n.xa(paramw.getAppId()).gPh));
      continue;
      paramw = localIntent.getComponent().getClassName();
      break;
      label248: paramw = bo.bc(localIntent.getStringExtra(AppBrandProcessProxyUI.huZ), paramw);
      i = 8;
      continue;
      paramw = null;
    }
  }

  private static g m(w paramw)
  {
    AppMethodBeat.i(132609);
    paramw = paramw.getRuntime().atJ().getReporter();
    AppMethodBeat.o(132609);
    return paramw;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.report.model.e
 * JD-Core Version:    0.6.2
 */