package com.tencent.mm.plugin.appbrand.launching;

import android.util.Pair;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.cf;
import com.tencent.mm.g.b.a.cf.b;
import com.tencent.mm.g.b.a.cf.c;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.e;
import com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.report.quality.QualitySession;
import com.tencent.mm.plugin.appbrand.report.quality.g;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONObject;

public final class e extends d
{
  private ak ifQ = null;
  private final String ifR;

  public e(LaunchParcel paramLaunchParcel, String paramString, d.a parama)
  {
    super(paramLaunchParcel, parama);
    this.ifR = paramString;
  }

  protected final Pair<WxaAttributes, Boolean> aHc()
  {
    AppMethodBeat.i(131730);
    Object localObject1 = new Pair(null, Boolean.FALSE);
    try
    {
      ak localak = new com/tencent/mm/plugin/appbrand/launching/ak;
      Object localObject2 = this.username;
      String str = this.appId;
      int i = this.har;
      int j = this.gVu;
      if (this.ifO == null);
      for (int k = 0; ; k = this.ifO.scene)
      {
        localak.<init>((String)localObject2, str, i, j, k, this.hgC);
        this.ifQ = localak;
        localObject2 = (Pair)localak.aHy();
        localObject1 = localObject2;
        AppMethodBeat.o(131730);
        return localObject1;
      }
    }
    catch (Exception localException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.AppBrandPreLaunchProcessWC", localException, "get attr ", new Object[0]);
    }
  }

  protected final boolean e(WxaAttributes paramWxaAttributes)
  {
    boolean bool = true;
    AppMethodBeat.i(131731);
    String str = paramWxaAttributes.field_appId;
    if (new ad(str).aHv())
      AppMethodBeat.o(131731);
    while (true)
    {
      return bool;
      if ((2 == this.har) && (!al.an(str, com.tencent.mm.plugin.appbrand.task.h.DS(str))))
      {
        AppMethodBeat.o(131731);
      }
      else if ((this.har == 0) && (!al.a(paramWxaAttributes, this.ifP)))
      {
        AppMethodBeat.o(131731);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(131731);
      }
    }
  }

  public final void run()
  {
    AppMethodBeat.i(131729);
    Object localObject1 = aHc();
    Object localObject2 = (WxaAttributes)((Pair)localObject1).first;
    if (localObject2 == null)
    {
      ab.i("MicroMsg.AppBrandPreLaunchProcessWC", "onGetWxaAttr null return");
      onError();
      AppMethodBeat.o(131729);
    }
    while (true)
    {
      return;
      if (!e((WxaAttributes)localObject2))
        break;
      onError();
      AppMethodBeat.o(131729);
    }
    AppBrandInitConfigWC localAppBrandInitConfigWC = com.tencent.mm.plugin.appbrand.config.f.ayD().b((WxaAttributes)localObject2);
    localAppBrandInitConfigWC.gVs = this.har;
    this.appId = localAppBrandInitConfigWC.appId;
    localAppBrandInitConfigWC.hgN = new QualitySession(this.ifR, localAppBrandInitConfigWC, this.ifO);
    if (((Boolean)((Pair)localObject1).second).booleanValue())
    {
      localAppBrandInitConfigWC.hgO = true;
      localObject1 = g.a(localAppBrandInitConfigWC.hgN);
      ((cf)localObject1).dfE = cf.c.dfN;
      localObject1 = ((cf)localObject1).ec(this.ifQ.iil).ed(this.ifQ.iim).ea(this.ifQ.iin);
      ((cf)localObject1).dfF = cf.b.dfK;
      ((cf)localObject1).cXm = g.getNetworkType();
      ((cf)localObject1).ajK();
      label188: if (this.har != 0)
        break label305;
      localAppBrandInitConfigWC.hfh = ((WxaAttributes)localObject2).ayL().hij;
      localAppBrandInitConfigWC.bQk = ((WxaAttributes)localObject2).ayL().bQk;
      localObject2 = ((WxaAttributes)localObject2).ayL().hik;
      if (localObject2 != null)
      {
        localAppBrandInitConfigWC.hgL = ((JSONObject)localObject2).optString("url");
        localAppBrandInitConfigWC.hgM = ((JSONObject)localObject2).optString("progressbar_color");
      }
    }
    while (true)
    {
      localAppBrandInitConfigWC.bQg = Cf(localAppBrandInitConfigWC.bQk);
      if (this.ifO == null)
        this.ifO = new AppBrandStatObject();
      a(localAppBrandInitConfigWC, this.ifO);
      AppMethodBeat.o(131729);
      break;
      localAppBrandInitConfigWC.hgO = false;
      break label188;
      label305: localAppBrandInitConfigWC.extInfo = ((l)com.tencent.mm.plugin.appbrand.app.f.E(l.class)).bn(this.appId, this.har);
      try
      {
        localObject2 = com.tencent.mm.aa.h.lw(localAppBrandInitConfigWC.extInfo);
        localAppBrandInitConfigWC.hfh = ((JSONObject)localObject2).optString("device_orientation");
        localAppBrandInitConfigWC.bQk = ((JSONObject)localObject2).optString("client_js_ext_info");
        localAppBrandInitConfigWC.bQf = ((JSONObject)localObject2).optBoolean("open_remote", false);
        localObject2 = ((JSONObject)localObject2).optJSONObject("loading_image_info");
        if (localObject2 != null)
        {
          localAppBrandInitConfigWC.hgL = ((JSONObject)localObject2).optString("url");
          localAppBrandInitConfigWC.hgM = ((JSONObject)localObject2).optString("progressbar_color");
        }
      }
      catch (Exception localException)
      {
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.e
 * JD-Core Version:    0.6.2
 */