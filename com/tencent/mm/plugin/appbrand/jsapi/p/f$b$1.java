package com.tencent.mm.plugin.appbrand.jsapi.p;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.s.j.a;
import java.util.HashMap;
import java.util.Map;

final class f$b$1
  implements j.a
{
  f$b$1(f.b paramb, c paramc)
  {
  }

  public final boolean j(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(126383);
    float[] arrayOfFloat = (float[])paramArrayOfObject[0];
    paramArrayOfObject = new HashMap();
    paramArrayOfObject.put("x", Float.valueOf(arrayOfFloat[0]));
    paramArrayOfObject.put("y", Float.valueOf(arrayOfFloat[1]));
    paramArrayOfObject.put("z", Float.valueOf(arrayOfFloat[2]));
    this.hVQ.hVP.t(paramArrayOfObject);
    boolean bool = k.a.hWd.a(this.hVQ.hVP, this.hxc);
    AppMethodBeat.o(126383);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.p.f.b.1
 * JD-Core Version:    0.6.2
 */