package com.tencent.mm.plugin.webview.ui.tools.bag;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

final class n$2
  implements e
{
  n$2(n paramn)
  {
  }

  public final void dbb()
  {
    AppMethodBeat.i(8251);
    ab.i("MicroMsg.WebViewUIBagHelper", "bag transformation onAnimationCancel do default");
    n.c(this.uzN);
    n.a(this.uzN).mu(true);
    al.n(new n.2.1(this), 500L);
    AppMethodBeat.o(8251);
  }

  public final void onAnimationEnd()
  {
    AppMethodBeat.i(8250);
    ab.i("MicroMsg.WebViewUIBagHelper", "bag transformation onAnimationEnd");
    n.c(this.uzN);
    n.a(this.uzN).mu(false);
    n.b(this.uzN, 1);
    AppMethodBeat.o(8250);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.bag.n.2
 * JD-Core Version:    0.6.2
 */