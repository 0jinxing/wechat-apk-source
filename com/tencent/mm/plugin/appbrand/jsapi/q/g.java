package com.tencent.mm.plugin.appbrand.jsapi.q;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.u;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class g<C extends c> extends u<C>
{
  public static final int CTRL_INDEX = 40;
  public static final String NAME = "getSystemInfo";

  public final String b(C paramC, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(126415);
    paramC = j("ok", d(paramC));
    AppMethodBeat.o(126415);
    return paramC;
  }

  protected Map<String, Object> d(C paramC)
  {
    AppMethodBeat.i(126416);
    HashMap localHashMap = new HashMap();
    localHashMap.put("brand", Build.BRAND);
    localHashMap.put("model", Build.MODEL);
    localHashMap.put("system", "Android " + Build.VERSION.RELEASE);
    paramC = paramC.getContext().getResources().getDisplayMetrics();
    localHashMap.put("pixelRatio", Float.valueOf(paramC.density));
    localHashMap.put("screenWidth", Integer.valueOf(com.tencent.mm.plugin.appbrand.r.g.pZ(paramC.widthPixels)));
    localHashMap.put("screenHeight", Integer.valueOf(com.tencent.mm.plugin.appbrand.r.g.pZ(paramC.heightPixels)));
    AppMethodBeat.o(126416);
    return localHashMap;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.q.g
 * JD-Core Version:    0.6.2
 */