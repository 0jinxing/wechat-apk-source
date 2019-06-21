package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.ui.applet.q.a;
import com.tencent.mm.ui.base.h;

final class g$132
  implements q.a
{
  g$132(g paramg, f paramf, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8)
  {
  }

  public final void a(boolean paramBoolean, String paramString, int paramInt)
  {
    AppMethodBeat.i(9209);
    if (paramBoolean)
    {
      g.a(this.uHd, this.uHq, this.hxh, this.cgl, this.fEJ, this.uHr, this.uHs, paramString, this.uHt);
      if (this.uIy)
        d.f(g.i(this.uHd), ".ui.chatting.ChattingUI", new Intent().putExtra("Chat_User", this.cgl));
    }
    label191: 
    while (true)
    {
      this.uHd.gB(1, 1);
      g.a(this.uHd, g.j(this.uHd), this.uIz, null);
      AppMethodBeat.o(9209);
      while (true)
      {
        return;
        if (g.i(this.uHd) == null)
          break label191;
        h.bQ(g.i(this.uHd), g.i(this.uHd).getResources().getString(2131297050));
        break;
        this.uHd.gB(1, 3);
        g.a(this.uHd, g.j(this.uHd), this.uIA, null);
        AppMethodBeat.o(9209);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.132
 * JD-Core Version:    0.6.2
 */