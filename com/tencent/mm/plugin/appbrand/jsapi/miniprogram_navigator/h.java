package com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator;

import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.mm.plugin.appbrand.d;
import com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vending.c.a;
import com.tencent.mm.vending.g.f;
import org.json.JSONObject;

public class h
  implements c
{
  static final h hQV;

  static
  {
    AppMethodBeat.i(101993);
    hQV = new h();
    AppMethodBeat.o(101993);
  }

  public com.tencent.mm.vending.g.c<AppBrandInitConfigLU> a(d paramd, LaunchParcel paramLaunchParcel)
  {
    AppMethodBeat.i(101991);
    paramd = f.cU(null);
    AppMethodBeat.o(101991);
    return paramd;
  }

  public final void a(final d paramd, String paramString1, int paramInt, String paramString2, final c.a parama, JSONObject paramJSONObject1, JSONObject paramJSONObject2, final c.c paramc)
  {
    AppMethodBeat.i(101992);
    String str = paramd.getAppId();
    int i;
    Object localObject1;
    label68: Object localObject2;
    if (parama != null)
    {
      i = parama.cvp;
      ab.i("MicroMsg.MiniProgramNavigator", "navigateTo fromAppID(%s) targetAppID(%s) sourceType:%d", new Object[] { str, paramString1, Integer.valueOf(i) });
      str = "";
      if (!(paramd instanceof u))
        break label588;
      localObject1 = (u)paramd;
      if (localObject1 != null)
        str = ((u)localObject1).aBm();
      localObject2 = (com.tencent.luggage.sdk.b.b)paramd.getRuntime();
      localObject1 = paramd.getAppId() + ":" + ((com.tencent.luggage.sdk.b.b)localObject2).ya().xz() + ":" + (((com.tencent.luggage.sdk.b.b)localObject2).ya().bQe + 1000);
      AppBrandStatObject localAppBrandStatObject = ((com.tencent.luggage.sdk.b.b)localObject2).ya().bQn;
      localObject2 = new AppBrandStatObject();
      if ((parama == null) || (parama.scene == 0))
        break label600;
      i = parama.scene;
      label183: ((AppBrandStatObject)localObject2).scene = i;
      ((AppBrandStatObject)localObject2).cOo = localAppBrandStatObject.cOo;
      if ((parama == null) || (parama.scene == 0) || (bo.isNullOrNil(parama.cst)))
        break label608;
      localObject1 = String.format("%s:%s", new Object[] { localObject1, parama.cst });
      label248: ((AppBrandStatObject)localObject2).cst = ((String)localObject1);
      if (parama == null)
        break label611;
      i = parama.cOq;
      label267: ((AppBrandStatObject)localObject2).cOq = i;
      if (parama == null)
        break label617;
      localObject1 = parama.cOr;
      label286: ((AppBrandStatObject)localObject2).cOr = ((String)localObject1);
      if (parama == null)
        break label623;
      localObject1 = parama.hQF;
      label305: ((AppBrandStatObject)localObject2).hQF = ((String)localObject1);
      localObject1 = new AppBrandLaunchReferrer();
      ((AppBrandLaunchReferrer)localObject1).appId = paramd.getAppId();
      if (paramJSONObject1 != null)
        break label629;
      paramJSONObject1 = "{}";
      label339: ((AppBrandLaunchReferrer)localObject1).cFM = paramJSONObject1;
      if (paramJSONObject2 != null)
        break label639;
      paramJSONObject1 = "{}";
      label355: ((AppBrandLaunchReferrer)localObject1).hgR = paramJSONObject1;
      ((AppBrandLaunchReferrer)localObject1).hgQ = 1;
      ((AppBrandLaunchReferrer)localObject1).url = str;
      if (parama == null)
        break label649;
      i = parama.cvp;
      label387: ((AppBrandLaunchReferrer)localObject1).cvp = i;
      if (parama == null)
        break label655;
      paramJSONObject1 = parama.hgS;
      label406: ((AppBrandLaunchReferrer)localObject1).hgS = paramJSONObject1;
      if (parama == null)
        break label661;
    }
    label649: label655: label661: for (parama = parama.businessType; ; parama = null)
    {
      ((AppBrandLaunchReferrer)localObject1).businessType = parama;
      long l = bo.anU();
      parama = new LaunchParcel();
      parama.username = null;
      parama.appId = paramString1;
      parama.version = 0;
      parama.har = paramInt;
      parama.hgC = paramString2;
      parama.ijy = ((AppBrandStatObject)localObject2);
      parama.hgF = ((AppBrandLaunchReferrer)localObject1);
      parama.ijz = null;
      parama.ijA = l;
      f.dMn().f(new a()
      {
      }).f(new h.3(this, paramd, paramString1, paramString2, parama)).f(new a()
      {
      }).a(new h.1(this, paramc));
      AppMethodBeat.o(101992);
      return;
      i = 0;
      break;
      label588: localObject1 = ((q)paramd).getCurrentPageView();
      break label68;
      label600: i = 1037;
      break label183;
      label608: break label248;
      label611: i = 0;
      break label267;
      label617: localObject1 = null;
      break label286;
      label623: localObject1 = null;
      break label305;
      label629: paramJSONObject1 = paramJSONObject1.toString();
      break label339;
      label639: paramJSONObject1 = paramJSONObject2.toString();
      break label355;
      i = 0;
      break label387;
      paramJSONObject1 = null;
      break label406;
    }
  }

  public boolean a(d paramd, LaunchParcel paramLaunchParcel, c.b paramb)
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.h
 * JD-Core Version:    0.6.2
 */