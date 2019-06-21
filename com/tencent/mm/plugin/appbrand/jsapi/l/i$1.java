package com.tencent.mm.plugin.appbrand.jsapi.l;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.s;
import java.util.HashMap;
import java.util.Map;

final class i$1
  implements b.b
{
  i$1(i parami, s params, int paramInt)
  {
  }

  public final void h(boolean paramBoolean, String paramString)
  {
    AppMethodBeat.i(131423);
    if (paramBoolean)
    {
      HashMap localHashMap = new HashMap(1);
      localHashMap.put("token", paramString);
      this.hsj.M(this.eIl, this.hTV.j("ok", localHashMap));
      AppMethodBeat.o(131423);
    }
    while (true)
    {
      return;
      this.hsj.M(this.eIl, this.hTV.j("fail", null));
      AppMethodBeat.o(131423);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.l.i.1
 * JD-Core Version:    0.6.2
 */