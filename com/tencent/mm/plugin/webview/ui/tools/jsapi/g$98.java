package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.app.ProgressDialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.model.aj;
import com.tencent.mm.plugin.webview.model.d.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;

final class g$98
  implements d.b
{
  g$98(g paramg, String paramString, i parami)
  {
  }

  public final void b(boolean paramBoolean, String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(9166);
    ab.i("MicroMsg.MsgHandler", "doDownloadVoice, on cdn finish, is success : %b, local id : %s, media id is : %s", new Object[] { Boolean.valueOf(paramBoolean), paramString1, paramString2 });
    if ((!bo.isNullOrNil(paramString2)) && (paramString2.equals(this.uHW)))
    {
      com.tencent.mm.plugin.webview.modeltools.g.cYE().a(this);
      if (g.m(this.uHd) != null)
      {
        g.m(this.uHd).dismiss();
        g.a(this.uHd, null);
      }
      if (!paramBoolean)
      {
        g.a(this.uHd, this.uqf, "downloadVoice:fail", null);
        AppMethodBeat.o(9166);
      }
    }
    while (true)
    {
      return;
      paramString2 = new HashMap();
      paramString2.put("localId", paramString1);
      g.a(this.uHd, this.uqf, "downloadVoice:ok", paramString2);
      AppMethodBeat.o(9166);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.98
 * JD-Core Version:    0.6.2
 */