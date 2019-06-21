package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.app.ProgressDialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.model.aj;
import com.tencent.mm.plugin.webview.model.d.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;

final class g$96
  implements d.b
{
  g$96(g paramg, String paramString, i parami)
  {
  }

  public final void b(boolean paramBoolean, String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(9164);
    ab.i("MicroMsg.MsgHandler", "doUploadVoice, on cdn finish,  is success : %s, mediaid : %s, local id is : %s", new Object[] { Boolean.valueOf(paramBoolean), paramString2, paramString1 });
    if ((!bo.isNullOrNil(paramString1)) && (paramString1.equals(this.ukG)))
    {
      com.tencent.mm.plugin.webview.modeltools.g.cYE().a(this);
      if (g.m(this.uHd) != null)
      {
        g.m(this.uHd).dismiss();
        g.a(this.uHd, null);
      }
      if (!paramBoolean)
      {
        g.a(this.uHd, this.uqf, "uploadVoice:fail", null);
        AppMethodBeat.o(9164);
      }
    }
    while (true)
    {
      return;
      paramString1 = new HashMap();
      paramString1.put("serverId", paramString2);
      g.a(this.uHd, this.uqf, "uploadVoice:ok", paramString1);
      AppMethodBeat.o(9164);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.96
 * JD-Core Version:    0.6.2
 */