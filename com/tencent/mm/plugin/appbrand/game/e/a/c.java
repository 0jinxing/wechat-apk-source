package com.tencent.mm.plugin.appbrand.game.e.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.p;
import com.tencent.mm.plugin.appbrand.q;
import java.util.HashMap;
import java.util.Map;

final class c extends p
{
  static final int CTRL_INDEX = 78;
  static final String NAME = "onKeyboardInput";

  final void a(String paramString, q paramq)
  {
    AppMethodBeat.i(130202);
    HashMap localHashMap = new HashMap(2);
    localHashMap.put("errMsg", "ok");
    localHashMap.put("value", paramString);
    s(localHashMap).i(paramq).aCj();
    AppMethodBeat.o(130202);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.e.a.c
 * JD-Core Version:    0.6.2
 */