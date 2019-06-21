package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aa.h;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.r.g;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Map;

public class t extends p
{
  private static final int CTRL_INDEX = 494;
  private static final String NAME = "onViewDidResize";

  public final void a(u paramu, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, Map<String, Object> paramMap)
  {
    AppMethodBeat.i(101940);
    HashMap localHashMap1 = new HashMap(1);
    localHashMap1.put("windowWidth", Integer.valueOf(g.pZ(paramInt2)));
    localHashMap1.put("windowHeight", Integer.valueOf(g.pZ(paramInt3)));
    localHashMap1.put("screenWidth", Integer.valueOf(g.pZ(paramInt4)));
    localHashMap1.put("screenHeight", Integer.valueOf(g.pZ(paramInt5)));
    HashMap localHashMap2 = new HashMap();
    localHashMap2.put("size", localHashMap1);
    localHashMap2.put("changedWebviewIds", new int[] { paramInt1 });
    if (paramInt6 == 2)
      localHashMap2.put("deviceOrientation", "landscape");
    while (true)
    {
      localHashMap2.put("pageOrientation", new HashMap(paramMap));
      paramMap = h.j(localHashMap2).toString();
      ab.i("MicroMsg.AppBrandOnViewDidResize", "dispatch with page(%s:%s) data(%s)", new Object[] { paramu.getAppId(), paramu.getURL(), paramMap });
      AL(paramMap).a(paramu, paramu.hashCode()).aCj();
      AL(paramMap).a(paramu.xT(), paramu.hashCode()).aCj();
      AppMethodBeat.o(101940);
      return;
      if (paramInt6 == 1)
        localHashMap2.put("deviceOrientation", "portrait");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.t
 * JD-Core Version:    0.6.2
 */