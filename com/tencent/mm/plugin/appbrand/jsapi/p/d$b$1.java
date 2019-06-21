package com.tencent.mm.plugin.appbrand.jsapi.p;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.s.j.a;
import java.util.HashMap;
import java.util.Map;

final class d$b$1
  implements j.a
{
  d$b$1(d.b paramb, c paramc)
  {
  }

  public final boolean j(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(126376);
    float[] arrayOfFloat = (float[])paramArrayOfObject[0];
    paramArrayOfObject = new HashMap();
    paramArrayOfObject.put("alpha", Float.valueOf(arrayOfFloat[0]));
    paramArrayOfObject.put("beta", Float.valueOf(arrayOfFloat[1]));
    paramArrayOfObject.put("gamma", Float.valueOf(arrayOfFloat[2]));
    this.hVH.hVG.t(paramArrayOfObject);
    boolean bool = k.a.hWd.a(this.hVH.hVG, this.hxc);
    AppMethodBeat.o(126376);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.p.d.b.1
 * JD-Core Version:    0.6.2
 */