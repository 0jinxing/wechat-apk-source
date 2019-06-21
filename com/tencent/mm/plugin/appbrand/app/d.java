package com.tencent.mm.plugin.appbrand.app;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aa.i;
import com.tencent.mm.plugin.appbrand.appcache.WxaCommLibRuntimeReader;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.appcache.v;
import com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.mm.plugin.appbrand.config.j.a;
import com.tencent.mm.plugin.appbrand.config.r;
import com.tencent.mm.plugin.appbrand.jsapi.h5_interact.SendDataToMiniProgramFromH5Event;
import com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.task.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.vending.g.e;
import java.util.List;

class d
  implements com.tencent.mm.plugin.appbrand.service.a
{
  public final int auH()
  {
    AppMethodBeat.i(129247);
    int i = WxaCommLibRuntimeReader.avQ().gVu;
    AppMethodBeat.o(129247);
    return i;
  }

  public void ax(List<String> paramList)
  {
    AppMethodBeat.i(129246);
    r.a(paramList, j.a.hho);
    AppMethodBeat.o(129246);
  }

  public void bq(final String paramString1, final String paramString2)
  {
    AppMethodBeat.i(129248);
    com.tencent.mm.ci.g.dOW().h(new com.tencent.mm.vending.c.a()
    {
      private Void asR()
      {
        AppMethodBeat.i(129241);
        com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.b.Cq(paramString1).acy();
        try
        {
          Object localObject1 = new com/tencent/mm/aa/i;
          ((i)localObject1).<init>(paramString2);
          Object localObject2 = new com/tencent/mm/aa/i;
          ((i)localObject2).<init>(((i)localObject1).optString("invokeData"));
          Object localObject3 = ((i)localObject2).optString("miniprogramAppID");
          if (TextUtils.isEmpty((CharSequence)localObject3))
          {
            ab.e("MicroMsg.AppBrand.ServiceForWebView", "privateOpenWeappFunctionalPage, invalid miniprogramAppId");
            com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.b.Cp(paramString1).acy();
            localObject3 = zXH;
            AppMethodBeat.o(129241);
          }
          while (true)
          {
            return localObject3;
            Object localObject4 = ((i)localObject2).optString("name");
            String str = ((i)localObject1).optString("runtimeAppid");
            localObject1 = new com/tencent/mm/plugin/appbrand/report/AppBrandStatObject;
            ((AppBrandStatObject)localObject1).<init>();
            ((AppBrandStatObject)localObject1).scene = 1111;
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>();
            ((AppBrandStatObject)localObject1).cst = (str + ":" + (String)localObject4);
            localObject4 = new com/tencent/mm/plugin/appbrand/config/AppBrandLaunchReferrer;
            ((AppBrandLaunchReferrer)localObject4).<init>();
            ((AppBrandLaunchReferrer)localObject4).hgQ = 7;
            ((AppBrandLaunchReferrer)localObject4).appId = null;
            ((AppBrandLaunchReferrer)localObject4).hgT = ((i)localObject2).toString();
            localObject2 = new com/tencent/mm/plugin/appbrand/launching/params/LaunchParcel;
            ((LaunchParcel)localObject2).<init>();
            ((LaunchParcel)localObject2).appId = ((String)localObject3);
            ((LaunchParcel)localObject2).hgC = "__wx__/open-api-redirecting-page";
            ((LaunchParcel)localObject2).ijy = ((AppBrandStatObject)localObject1);
            ((LaunchParcel)localObject2).hgF = ((AppBrandLaunchReferrer)localObject4);
            localObject3 = new com/tencent/mm/plugin/appbrand/app/d$2$1;
            ((d.2.1)localObject3).<init>(this);
            ((LaunchParcel)localObject2).ijB = ((com.tencent.luggage.sdk.launching.b)localObject3);
            com.tencent.mm.plugin.appbrand.launching.precondition.f.ijT.a(ah.getContext(), (LaunchParcel)localObject2);
            localObject3 = zXH;
            AppMethodBeat.o(129241);
          }
        }
        catch (Exception localException)
        {
          while (true)
          {
            ab.e("MicroMsg.AppBrand.ServiceForWebView", "privateOpenWeappFunctionalPage, parse failed e = %s, uuid = %s, json = %s", new Object[] { localException, paramString1, paramString2 });
            com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.b.Cp(paramString1).acy();
          }
        }
      }
    }).dMk();
    AppMethodBeat.o(129248);
  }

  public void i(String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(129245);
    SendDataToMiniProgramFromH5Event localSendDataToMiniProgramFromH5Event = new SendDataToMiniProgramFromH5Event();
    localSendDataToMiniProgramFromH5Event.hJW = paramString1;
    localSendDataToMiniProgramFromH5Event.data = paramString2;
    localSendDataToMiniProgramFromH5Event.hJX = paramInt;
    com.tencent.mm.plugin.appbrand.ipc.d.a(paramString1, localSendDataToMiniProgramFromH5Event);
    AppMethodBeat.o(129245);
  }

  public e<Integer> xk(String paramString)
  {
    AppMethodBeat.i(129243);
    paramString = com.tencent.mm.ci.g.dOW().b(new d.1(this, paramString));
    AppMethodBeat.o(129243);
    return paramString;
  }

  public void xl(String paramString)
  {
    AppMethodBeat.i(129244);
    v.avL();
    h.b(com.tencent.mm.plugin.appbrand.task.g.iFf);
    AppMethodBeat.o(129244);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.app.d
 * JD-Core Version:    0.6.2
 */