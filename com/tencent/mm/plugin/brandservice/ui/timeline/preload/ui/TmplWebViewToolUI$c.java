package com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.brandservice.ui.timeline.preload.m;
import com.tencent.mm.plugin.webview.preload.TmplParams;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.f;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class TmplWebViewToolUI$c
  implements Runnable
{
  TmplWebViewToolUI$c(TmplWebViewToolUI paramTmplWebViewToolUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(15072);
    if (TmplWebViewToolUI.h(this.jVe))
      AppMethodBeat.o(15072);
    while (true)
    {
      return;
      ab.i(TmplWebViewToolUI.b(this.jVe), "forceUseOriWebViewUI() isA8KeyDone:" + TmplWebViewToolUI.p(this.jVe));
      if (!(TmplWebViewToolUI.q(this.jVe) instanceof a.a))
      {
        com.tencent.mm.plugin.webview.preload.a.gu(TmplWebViewToolUI.c(this.jVe).upQ, 137);
        TmplWebViewToolUI.a(this.jVe, (a)new a.a());
        if (TmplWebViewToolUI.p(this.jVe))
        {
          ab.i(TmplWebViewToolUI.b(this.jVe), "forceUseOriWebViewUI()");
          if (TmplWebViewToolUI.r(this.jVe) != null)
          {
            TmplWebViewToolUI.r(this.jVe).dcq();
            TmplWebViewToolUI.a(this.jVe, (a)new a.a());
          }
          String str = TmplWebViewToolUI.s(this.jVe);
          if (str != null);
          for (str = m.G(m.dh(m.dh(m.dh(str, "fasttmpl_flag"), "fasttmpl_type"), "fasttmpl_fullversion"), "forceh5", "1"); ; str = null)
          {
            if (TmplWebViewToolUI.t(this.jVe) == null)
              break label238;
            TmplWebViewToolUI.a(this.jVe).loadUrl(str, TmplWebViewToolUI.t(this.jVe));
            AppMethodBeat.o(15072);
            break;
          }
          label238: TmplWebViewToolUI.a(this.jVe).loadUrl(str);
        }
      }
      AppMethodBeat.o(15072);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.TmplWebViewToolUI.c
 * JD-Core Version:    0.6.2
 */