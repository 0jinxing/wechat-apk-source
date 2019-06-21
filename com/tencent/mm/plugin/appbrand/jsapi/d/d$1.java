package com.tencent.mm.plugin.appbrand.jsapi.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.v;
import com.tencent.mm.model.v.b;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.p;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.r.g;
import com.tencent.mm.plugin.appbrand.widget.input.i;
import com.tencent.mm.plugin.appbrand.widget.input.i.c;
import java.lang.ref.WeakReference;
import java.util.HashMap;

final class d$1
  implements i.c
{
  d$1(d paramd, i parami)
  {
  }

  public final void db(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(123528);
    int i = this.hKp.jdU;
    Object localObject = v.Zp().nU("AppBrandJsInput@".concat(String.valueOf(i)));
    if (localObject == null)
    {
      localObject = null;
      if ((localObject != null) && (((u)localObject).isRunning()))
        break label94;
      AppMethodBeat.o(123528);
    }
    while (true)
    {
      return;
      localObject = (WeakReference)((v.b)localObject).get("webview_reference", null);
      if (localObject == null)
      {
        localObject = null;
        break;
      }
      localObject = (u)((WeakReference)localObject).get();
      break;
      label94: d.a locala = new d.a((byte)0);
      HashMap localHashMap = new HashMap();
      localHashMap.put("height", Integer.valueOf(g.qa(paramInt2)));
      localHashMap.put("lineCount", Integer.valueOf(paramInt1));
      localHashMap.put("inputId", Integer.valueOf(i));
      locala.i((c)localObject).s(localHashMap).aCj();
      AppMethodBeat.o(123528);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.d.d.1
 * JD-Core Version:    0.6.2
 */