package com.tencent.mm.plugin.webview.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.ui.base.h;

final class e$1
  implements ap.a
{
  e$1(e parame)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(7414);
    if (this.urR.urQ.isFinishing())
    {
      ab.w("MicroMsg.OAuthSession", "onTimerExpired, context is finishing");
      AppMethodBeat.o(7414);
    }
    while (true)
    {
      return false;
      e locale = this.urR;
      OAuthUI localOAuthUI = this.urR.urQ;
      this.urR.urQ.getString(2131297061);
      locale.mzU = h.b(localOAuthUI, this.urR.urQ.getString(2131297086), true, new e.1.1(this));
      AppMethodBeat.o(7414);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.e.1
 * JD-Core Version:    0.6.2
 */