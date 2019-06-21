package com.tencent.mm.plugin.appbrand.jsapi;

import android.os.Build.VERSION;
import com.tencent.luggage.sdk.config.AppBrandSysConfigLU;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.appcache.o;
import com.tencent.mm.plugin.appbrand.d;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Map;

public class an extends u<d>
{
  private static final int CTRL_INDEX = 97;
  private static final String NAME = "getPublicLibVersion";

  protected Map<String, Object> a(d paramd)
  {
    boolean bool1 = true;
    AppMethodBeat.i(101942);
    HashMap localHashMap = new HashMap();
    AppBrandSysConfigLU localAppBrandSysConfigLU = (AppBrandSysConfigLU)paramd.aa(AppBrandSysConfigLU.class);
    if (localAppBrandSysConfigLU.hhd.gVt != 0)
    {
      bool2 = true;
      localHashMap.put("appDebug", Boolean.valueOf(bool2));
      localHashMap.put("appMd5", bo.nullAsNil(localAppBrandSysConfigLU.hhd.cvZ));
      localHashMap.put("appVersion", Integer.valueOf(localAppBrandSysConfigLU.hhd.gVu));
      paramd = paramd.asG();
      if (paramd != null)
      {
        paramd = paramd.avm();
        if (paramd.gVt == 0)
          break label205;
      }
    }
    label205: for (boolean bool2 = bool1; ; bool2 = false)
    {
      localHashMap.put("libDebug", Boolean.valueOf(bool2));
      localHashMap.put("libMd5", bo.nullAsNil(paramd.cvZ));
      localHashMap.put("libVersion", Integer.valueOf(paramd.gVu));
      localHashMap.put("system", "android");
      localHashMap.put("systemVersion", Integer.valueOf(Build.VERSION.SDK_INT));
      AppMethodBeat.o(101942);
      return localHashMap;
      bool2 = false;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.an
 * JD-Core Version:    0.6.2
 */