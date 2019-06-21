package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.luggage.g.d;
import com.tencent.luggage.sdk.customize.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appcache.ax;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.c;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.f;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.List;
import org.json.JSONObject;

public final class l extends j<k>
{
  public static final String[] fjY;

  static
  {
    AppMethodBeat.i(102104);
    fjY = new String[] { j.a(k.gSs, "DevPkgLaunchExtInfo") };
    AppMethodBeat.o(102104);
  }

  public l(com.tencent.mm.sdk.e.e parame)
  {
    super(parame, k.gSs, "DevPkgLaunchExtInfo", k.diI);
  }

  public final String bn(String paramString, int paramInt)
  {
    AppMethodBeat.i(102103);
    if (bo.isNullOrNil(paramString))
    {
      paramString = "";
      AppMethodBeat.o(102103);
    }
    while (true)
    {
      return paramString;
      k localk = new k();
      localk.field_appId = paramString;
      localk.field_versionType = paramInt;
      if (super.b(localk, k.gSr))
      {
        paramString = localk.field_extJson;
        AppMethodBeat.o(102103);
      }
      else
      {
        paramString = "";
        AppMethodBeat.o(102103);
      }
    }
  }

  public final boolean n(String paramString1, int paramInt, String paramString2)
  {
    AppMethodBeat.i(102102);
    boolean bool;
    if (bo.isNullOrNil(paramString1))
      bool = false;
    while (true)
    {
      d.i("MicroMsg.AppBrand.DevPkgLaunchExtInfoStorage", "appId:%s,versionType:%s,extInfo:%s", new Object[] { paramString1, Integer.valueOf(paramInt), paramString2 });
      if (bool);
      try
      {
        localObject1 = new org/json/JSONObject;
        ((JSONObject)localObject1).<init>(paramString2);
        localObject1 = WxaAttributes.f.zA(((JSONObject)localObject1).optString("module_list"));
        if (!bo.ek((List)localObject1))
          ((b)com.tencent.luggage.a.e.B(b.class)).xF().a(paramString1, paramInt, -1, (List)localObject1);
      }
      catch (Exception localException2)
      {
        try
        {
          localObject1 = new org/json/JSONObject;
          ((JSONObject)localObject1).<init>(paramString2);
          localObject1 = WxaAttributes.c.zy(((JSONObject)localObject1).optString("wxacode_lib_info_list"));
          if (!bo.ek((List)localObject1))
            ((b)com.tencent.luggage.a.e.B(b.class)).xF().az((List)localObject1);
        }
        catch (Exception localException2)
        {
          try
          {
            while (true)
            {
              Object localObject1 = new org/json/JSONObject;
              ((JSONObject)localObject1).<init>(paramString2);
              paramString2 = ((JSONObject)localObject1).optString("without_lib_md5");
              if (!bo.isNullOrNil(paramString2))
                ((b)com.tencent.luggage.a.e.B(b.class)).xF().b(paramString1, "__WITHOUT_CODELIB__", 0, paramInt, paramString2, 12);
              AppMethodBeat.o(102102);
              return bool;
              localObject1 = new k();
              ((k)localObject1).field_appId = paramString1;
              ((k)localObject1).field_versionType = paramInt;
              if (super.b((c)localObject1, k.gSr))
              {
                ((k)localObject1).field_extJson = bo.bc(paramString2, "{}");
                bool = super.c((c)localObject1, new String[0]);
                break;
              }
              ((k)localObject1).field_extJson = bo.bc(paramString2, "{}");
              bool = super.b((c)localObject1);
              break;
              localException1 = localException1;
              Object localObject2 = null;
            }
            localException2 = localException2;
            Object localObject3 = null;
          }
          catch (Exception paramString2)
          {
            while (true)
              paramString2 = null;
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.l
 * JD-Core Version:    0.6.2
 */