package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aa.h;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.appcache.j.a;
import com.tencent.mm.plugin.appbrand.appcache.r;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.a;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.c;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.e;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.List;
import org.json.JSONObject;

public class ai extends af<WxaPkgWrappingInfo>
  implements m
{
  public static volatile boolean iiB = false;
  private m iiC;

  ai(String paramString1, int paramInt1, String paramString2, int paramInt2, WxaAttributes paramWxaAttributes)
  {
    AppMethodBeat.i(131982);
    this.iiC = null;
    WxaAttributes.e locale = paramWxaAttributes.ayL();
    int i;
    Object localObject1;
    Object localObject3;
    List localList1;
    int j;
    if (j.a.np(paramInt1))
      if ((locale.hio) || ((iiB) && (!bo.ek(locale.hin))))
      {
        i = 1;
        localObject1 = locale.hin;
        localObject3 = locale.hip;
        localList1 = locale.hil;
        j = locale.him;
        if ((!paramWxaAttributes.ayJ().xy()) || (!r.avH()) || (localList1 == null) || (localList1.size() <= 0))
          break label337;
        if ((i == 0) || (bo.ek((List)localObject1)) || (!r.avF()))
          break label301;
        ab.i("MicroMsg.AppBrand.PrepareStepCheckAppPkgWrapper", "LaunchCheckPkgSplitCodeLibModuleHandler");
        this.iiC = new ai.1(this, paramString1, paramInt1, locale.axy, (List)localObject1);
        AppMethodBeat.o(131982);
      }
    while (true)
    {
      List localList2;
      while (true)
      {
        return;
        i = 0;
        break;
        localObject1 = ((l)f.E(l.class)).bn(paramString1, paramInt1);
        try
        {
          localObject1 = h.lw((String)localObject1);
          if (localObject1 == null)
          {
            i = 0;
            localObject1 = null;
            localObject3 = null;
            localList1 = null;
            j = 0;
          }
        }
        catch (Exception localException)
        {
          while (true)
            localObject2 = null;
          localList2 = WxaAttributes.f.zA(((JSONObject)localObject2).optString("module_list"));
          localList1 = WxaAttributes.c.zy(((JSONObject)localObject2).optString("wxacode_lib_info_list"));
          if (bo.ek(localList2))
            break label288;
        }
      }
      i = 1;
      label263: if (i != 0);
      for (Object localObject2 = ((JSONObject)localObject2).optString("entrance_module"); ; localObject2 = "")
      {
        localObject3 = localObject2;
        localObject2 = localList2;
        break;
        label288: i = 0;
        break label263;
      }
      label301: ab.i("MicroMsg.AppBrand.PrepareStepCheckAppPkgWrapper", "LaunchCheckPkgSplitCodeLibHandler");
      this.iiC = new ai.2(this, paramString1, paramInt1, locale.axy, localList1);
      AppMethodBeat.o(131982);
      continue;
      label337: if ((i != 0) && (!bo.ek((List)localObject2)) && (r.avF()))
      {
        ab.i("MicroMsg.AppBrand.PrepareStepCheckAppPkgWrapper", "LaunchCheckPkgModularizingHandler");
        this.iiC = new ai.3(this, paramString1, paramInt1, paramString2, paramInt2, locale.axy, j, (String)localObject3, (List)localObject2);
        AppMethodBeat.o(131982);
      }
      else
      {
        ab.i("MicroMsg.AppBrand.PrepareStepCheckAppPkgWrapper", "LaunchCheckPkgIntegratedHandler");
        this.iiC = new ai.4(this, paramString1, paramInt1, locale.axy, paramInt2, locale);
        AppMethodBeat.o(131982);
      }
    }
  }

  public void aHe()
  {
  }

  public void aHj()
  {
  }

  public final WxaPkgWrappingInfo azZ()
  {
    AppMethodBeat.i(131983);
    WxaPkgWrappingInfo localWxaPkgWrappingInfo = (WxaPkgWrappingInfo)this.iiC.call();
    AppMethodBeat.o(131983);
    return localWxaPkgWrappingInfo;
  }

  final String getTag()
  {
    return "MicroMsg.AppBrand.PrepareStepCheckAppPkgWrapper";
  }

  public void onDownloadProgress(int paramInt)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.ai
 * JD-Core Version:    0.6.2
 */