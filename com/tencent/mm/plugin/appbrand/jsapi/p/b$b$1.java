package com.tencent.mm.plugin.appbrand.jsapi.p;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.s.j.a;
import java.util.HashMap;
import java.util.Map;

final class b$b$1
  implements j.a
{
  b$b$1(b.b paramb, c paramc)
  {
  }

  public final boolean j(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(126370);
    paramArrayOfObject = (float[])paramArrayOfObject[0];
    HashMap localHashMap = new HashMap();
    localHashMap.put("x", Float.valueOf(-paramArrayOfObject[0] / 10.0F));
    localHashMap.put("y", Float.valueOf(-paramArrayOfObject[1] / 10.0F));
    localHashMap.put("z", Float.valueOf(-paramArrayOfObject[2] / 10.0F));
    this.hVw.hVv.t(localHashMap);
    boolean bool = k.a.hWd.a(this.hVw.hVv, this.hxc);
    AppMethodBeat.o(126370);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.p.b.b.1
 * JD-Core Version:    0.6.2
 */