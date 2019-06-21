package com.tencent.mm.plugin.webview.luggage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.WebViewKeyboardLinearLayout;
import com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewInputFooter;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.KeyboardLinearLayout.a;

final class d$6
  implements KeyboardLinearLayout.a
{
  d$6(d paramd)
  {
  }

  public final void sD(int paramInt)
  {
    AppMethodBeat.i(6013);
    ab.i("MicroMsg.LuggageMMWebPage", "onKeyBoardStateChange, state = ".concat(String.valueOf(paramInt)));
    if (!d.e(this.uiy))
    {
      ab.i("MicroMsg.LuggageMMWebPage", "background ignored");
      AppMethodBeat.o(6013);
    }
    while (true)
    {
      return;
      d.a(this.uiy, d.c(this.uiy), paramInt);
      if (paramInt == -3)
      {
        if ((d.b(this.uiy) != null) && (d.b(this.uiy).getVisibility() == 0))
          d.b(this.uiy).dda();
        d.a(this.uiy, d.c(this.uiy).getKeyBoardHeight());
        AppMethodBeat.o(6013);
      }
      else
      {
        d.a(this.uiy, 0);
        AppMethodBeat.o(6013);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.d.6
 * JD-Core Version:    0.6.2
 */