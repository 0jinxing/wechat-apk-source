package com.tencent.mm.plugin.appbrand.game.e.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.p;
import com.tencent.mm.plugin.appbrand.q;
import java.util.HashMap;
import java.util.Map;

final class b extends p
{
  static final int CTRL_INDEX = -2;
  static final String NAME = "onKeyboardConfirm";

  final void a(String paramString, q paramq)
  {
    AppMethodBeat.i(130201);
    HashMap localHashMap = new HashMap(2);
    localHashMap.put("errMsg", "ok");
    localHashMap.put("value", paramString);
    s(localHashMap).i(paramq).aCj();
    AppMethodBeat.o(130201);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.e.a.b
 * JD-Core Version:    0.6.2
 */