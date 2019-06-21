package com.tencent.mm.plugin.appbrand.jsapi.coverview;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.v.b;
import java.util.HashMap;
import java.util.Map;

final class e$1
  implements View.OnClickListener
{
  e$1(e parame, v.b paramb, com.tencent.mm.plugin.appbrand.jsapi.e parame1)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(126303);
    if (!this.hAt.nX("clickable"))
      AppMethodBeat.o(126303);
    while (true)
    {
      return;
      e.a locala = new e.a((byte)0);
      paramView = new HashMap();
      paramView.put("data", this.hAt.getString("data", ""));
      locala.t(paramView);
      if ("webview".equals(this.hAt.getString("sendTo", null)))
      {
        this.hCK.a(locala);
        AppMethodBeat.o(126303);
      }
      else
      {
        this.hCK.b(locala);
        AppMethodBeat.o(126303);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.coverview.e.1
 * JD-Core Version:    0.6.2
 */