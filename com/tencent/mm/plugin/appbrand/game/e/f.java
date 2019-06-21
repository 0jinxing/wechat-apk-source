package com.tencent.mm.plugin.appbrand.game.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.af;
import com.tencent.mm.plugin.appbrand.jsapi.ar;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.jsapi.o.g;
import com.tencent.mm.plugin.appbrand.jsapi.q;
import com.tencent.mm.plugin.appbrand.jsapi.video.h;
import com.tencent.mm.plugin.appbrand.jsapi.video.i;
import com.tencent.mm.plugin.appbrand.jsapi.video.j;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class f
{
  private static final String[] hsp = { "scrollWebviewTo", "showNavigationBar", "hideNavigationBar", "showNavigationBarLoading", "hideNavigationBarLoading" };

  public static Map<String, m> aAK()
  {
    AppMethodBeat.i(130200);
    Map localMap = q.aCh();
    localMap.putAll(q.aCi());
    Object localObject = new HashSet();
    ((Collection)localObject).add(new com.tencent.mm.plugin.appbrand.game.e.a.e());
    ((Collection)localObject).add(new com.tencent.mm.plugin.appbrand.game.e.a.f());
    ((Collection)localObject).add(new com.tencent.mm.plugin.appbrand.game.e.a.d());
    ((Collection)localObject).add(new ar());
    ((Collection)localObject).add(new com.tencent.mm.plugin.appbrand.jsapi.o.f());
    ((Collection)localObject).add(new com.tencent.mm.plugin.appbrand.jsapi.o.e());
    ((Collection)localObject).add(new g());
    ((Collection)localObject).add(new com.tencent.mm.plugin.appbrand.jsapi.video.f());
    ((Collection)localObject).add(new j());
    ((Collection)localObject).add(new i());
    ((Collection)localObject).add(new h());
    ((Collection)localObject).add(new b());
    ((Collection)localObject).add(new com.tencent.mm.plugin.appbrand.jsapi.h.a());
    ((Collection)localObject).add(new c());
    ((Collection)localObject).add(new d());
    ((Collection)localObject).add(new e());
    ((Collection)localObject).add(new com.tencent.mm.plugin.appbrand.jsapi.appdownload.c());
    ((Collection)localObject).add(new a());
    ((Collection)localObject).add(new com.tencent.mm.plugin.appbrand.jsapi.i.f(com.tencent.mm.plugin.appbrand.jsapi.i.f.hRB, af.auz()));
    localObject = ((Set)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      m localm = (m)((Iterator)localObject).next();
      if ((localm != null) && (!bo.isNullOrNil(localm.getName())))
        localMap.put(localm.getName(), localm);
    }
    localObject = hsp;
    int i = localObject.length;
    for (int j = 0; j < i; j++)
      localMap.remove(localObject[j]);
    AppMethodBeat.o(130200);
    return localMap;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.e.f
 * JD-Core Version:    0.6.2
 */