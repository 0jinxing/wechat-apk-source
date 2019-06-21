package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.app.ProgressDialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.model.aj;
import com.tencent.mm.plugin.webview.model.d.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Map;

final class g$86
  implements d.b
{
  g$86(g paramg, String paramString1, String paramString2, i parami)
  {
  }

  public final void b(boolean paramBoolean, String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(9150);
    ab.i("MicroMsg.MsgHandler", this.ioH + ", on cdn finish,  is success : %s, mediaId : %s, local id is : %s, mediaUrl : %s", new Object[] { Boolean.valueOf(paramBoolean), paramString2, paramString1, paramString3 });
    if ((bo.isNullOrNil(paramString1)) || (!paramString1.equals(this.ukG)))
      AppMethodBeat.o(9150);
    while (true)
    {
      return;
      g.E(this.uHd).remove(this.ukG);
      com.tencent.mm.plugin.webview.modeltools.g.cYE().a(this);
      if (g.m(this.uHd) != null)
      {
        g.m(this.uHd).dismiss();
        g.a(this.uHd, null);
      }
      g.F(this.uHd);
      if (!paramBoolean)
      {
        g.a(this.uHd, this.uqf, this.ioH + ":fail", null);
        AppMethodBeat.o(9150);
      }
      else
      {
        paramString1 = new HashMap();
        paramString1.put("serverId", paramString2);
        paramString1.put("mediaUrl", paramString3);
        g.a(this.uHd, this.uqf, this.ioH + ":ok", paramString1);
        AppMethodBeat.o(9150);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.86
 * JD-Core Version:    0.6.2
 */