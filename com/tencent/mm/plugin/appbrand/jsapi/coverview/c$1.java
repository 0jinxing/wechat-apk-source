package com.tencent.mm.plugin.appbrand.jsapi.coverview;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.v.b;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import java.util.HashMap;
import java.util.Map;

final class c$1
  implements View.OnClickListener
{
  c$1(c paramc, v.b paramb, e parame)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(126293);
    if (!this.hAt.nX("clickable"))
      AppMethodBeat.o(126293);
    while (true)
    {
      return;
      paramView = new c.a((byte)0);
      HashMap localHashMap = new HashMap();
      localHashMap.put("data", this.hAt.getString("data", ""));
      paramView.t(localHashMap);
      paramView.j(this.hCK);
      if ("webview".equals(this.hAt.getString("sendTo", null)))
      {
        this.hCK.a(paramView);
        AppMethodBeat.o(126293);
      }
      else
      {
        this.hCK.b(paramView);
        AppMethodBeat.o(126293);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.coverview.c.1
 * JD-Core Version:    0.6.2
 */