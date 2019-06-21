package com.tencent.mm.plugin.appbrand.dynamic.d;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.model.v.b;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.z.b.b.a;
import java.util.HashMap;
import org.json.JSONObject;

public final class d extends com.tencent.mm.plugin.appbrand.dynamic.d.a.a
{
  public d(int paramInt)
  {
    super("getSystemInfo", paramInt);
  }

  public final void a(com.tencent.mm.z.c.a parama, JSONObject paramJSONObject, b.a<JSONObject> parama1)
  {
    AppMethodBeat.i(10830);
    paramJSONObject = parama.getContext();
    v.b localb = parama.Qy();
    parama = paramJSONObject.getResources().getDisplayMetrics();
    float f = parama.density;
    HashMap localHashMap = new HashMap();
    localHashMap.put("model", q.LS());
    localHashMap.put("pixelRatio", Float.valueOf(f));
    localHashMap.put("windowWidth", Integer.valueOf(com.tencent.mm.plugin.appbrand.r.g.qa(localb.getInt("__page_view_width", 0))));
    localHashMap.put("windowHeight", Integer.valueOf(com.tencent.mm.plugin.appbrand.r.g.qa(localb.getInt("__page_view_height", 0))));
    localHashMap.put("screenWidth", Integer.valueOf(com.tencent.mm.plugin.appbrand.r.g.qa(parama.widthPixels)));
    localHashMap.put("screenHeight", Integer.valueOf(com.tencent.mm.plugin.appbrand.r.g.qa(parama.heightPixels)));
    localHashMap.put("language", aa.gw(paramJSONObject));
    localHashMap.put("version", com.tencent.mm.sdk.platformtools.g.ar(null, com.tencent.mm.protocal.d.vxo));
    localHashMap.put("system", "Android " + Build.VERSION.RELEASE);
    parama1.au(a(true, "", localHashMap));
    AppMethodBeat.o(10830);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.d.d
 * JD-Core Version:    0.6.2
 */