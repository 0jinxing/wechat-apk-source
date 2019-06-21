package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.emoji.model.EmojiLogic;
import com.tencent.mm.vfs.e;
import com.tencent.mm.vfs.j;

final class g$127
  implements Runnable
{
  g$127(g paramg, com.tencent.mm.vfs.b paramb, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(9204);
    String str1 = e.atg(j.w(this.uIw.mUri));
    String str2 = EmojiLogic.L(com.tencent.mm.plugin.emoji.h.b.Yb(), "", str1);
    if (!e.ct(str2))
      e.y(j.w(this.uIw.dMD()), str2);
    g.a(this.uHd, str1, this.uIv);
    AppMethodBeat.o(9204);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.127
 * JD-Core Version:    0.6.2
 */