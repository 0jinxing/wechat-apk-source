package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.app.ProgressDialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.fq;
import com.tencent.mm.g.a.fq.b;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;

final class g$101$2
  implements Runnable
{
  g$101$2(g.101 param101, fq paramfq)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(9170);
    if (this.uIl.czC.bcU)
    {
      if (g.m(this.uIk.uHd) != null)
      {
        g.m(this.uIk.uHd).dismiss();
        g.a(this.uIk.uHd, null);
      }
      if (bo.isNullOrNil(this.uIl.czC.content))
      {
        g.a(this.uIk.uHd, this.uIk.uqf, "translateVoice:fail", null);
        AppMethodBeat.o(9170);
      }
    }
    while (true)
    {
      return;
      HashMap localHashMap = new HashMap();
      localHashMap.put("translateResult", this.uIl.czC.content);
      g.a(this.uIk.uHd, this.uIk.uqf, "translateVoice:ok", localHashMap);
      AppMethodBeat.o(9170);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.101.2
 * JD-Core Version:    0.6.2
 */