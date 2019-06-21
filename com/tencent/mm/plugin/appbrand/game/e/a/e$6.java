package com.tencent.mm.plugin.appbrand.game.e.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.game.widget.input.WAGamePanelInputEditText;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.p;
import com.tencent.mm.plugin.appbrand.s;
import com.tencent.mm.plugin.appbrand.widget.input.w.e;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Map;

final class e$6
  implements w.e
{
  e$6(e parame, WAGamePanelInputEditText paramWAGamePanelInputEditText, s params, com.tencent.mm.plugin.appbrand.game.widget.input.a parama, float paramFloat, int paramInt)
  {
  }

  public final void nS(int paramInt)
  {
    AppMethodBeat.i(130210);
    Object localObject;
    if (2 == paramInt)
    {
      a locala = this.hsz.hss;
      String str = this.hsA.getEditableText().toString();
      localObject = this.hsj;
      HashMap localHashMap = new HashMap(2);
      localHashMap.put("errMsg", "ok");
      localHashMap.put("value", str);
      locala.s(localHashMap).i((c)localObject).aCj();
      AppMethodBeat.o(130210);
    }
    while (true)
    {
      return;
      paramInt = this.hsB.getHeight();
      ab.i("MicroMsg.WAGameJsApiShowKeyboard", "onVisibilityChanged inputPanelHeight(%d),density(%f).", new Object[] { Integer.valueOf(paramInt), Float.valueOf(this.hsC) });
      localObject = new HashMap(1);
      ((Map)localObject).put("height", Float.valueOf(paramInt / this.hsC));
      this.hsj.M(this.eIl, this.hsz.j("ok", (Map)localObject));
      AppMethodBeat.o(130210);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.e.a.e.6
 * JD-Core Version:    0.6.2
 */