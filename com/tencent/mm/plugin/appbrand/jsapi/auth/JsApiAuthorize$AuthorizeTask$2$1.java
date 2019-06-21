package com.tencent.mm.plugin.appbrand.jsapi.auth;

import com.tencent.luggage.g.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.b.h.d;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.List;

final class JsApiAuthorize$AuthorizeTask$2$1
  implements h.d
{
  JsApiAuthorize$AuthorizeTask$2$1(JsApiAuthorize.AuthorizeTask.2 param2)
  {
  }

  public final void a(int paramInt, ArrayList<String> paramArrayList)
  {
    AppMethodBeat.i(130833);
    if (c.C(paramArrayList).size() > 0)
    {
      paramArrayList = (String)paramArrayList.get(0);
      switch (paramInt)
      {
      default:
      case 1:
      case 2:
      case 3:
      }
    }
    while (true)
    {
      AppMethodBeat.o(130833);
      while (true)
      {
        return;
        paramArrayList = "";
        break;
        ArrayList localArrayList = new ArrayList();
        localArrayList.add(paramArrayList);
        JsApiAuthorize.AuthorizeTask.a(this.hCj.hCg, 1, localArrayList);
        ab.i("MicroMsg.JsApiAuthorize", "click PositiveButton");
        AppMethodBeat.o(130833);
        continue;
        localArrayList = new ArrayList();
        localArrayList.add(paramArrayList);
        JsApiAuthorize.AuthorizeTask.a(this.hCj.hCg, 2, localArrayList);
        ab.i("MicroMsg.JsApiAuthorize", "click NegativeButton");
        AppMethodBeat.o(130833);
      }
      JsApiAuthorize.AuthorizeTask.f(this.hCj.hCg);
      ab.i("MicroMsg.JsApiAuthorize", "user cancel");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize.AuthorizeTask.2.1
 * JD-Core Version:    0.6.2
 */