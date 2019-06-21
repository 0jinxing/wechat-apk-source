package com.tencent.mm.plugin.game.luggage;

import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.tencent.luggage.d.e;
import com.tencent.luggage.d.f;
import com.tencent.luggage.d.f.a;
import com.tencent.luggage.d.j;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.luggage.d.b;
import com.tencent.mm.ui.MMActivity;

final class LuggageGameWebViewUI$2
  implements Runnable
{
  LuggageGameWebViewUI$2(LuggageGameWebViewUI paramLuggageGameWebViewUI, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(135810);
    if ((this.mTM.isFinishing()) || (this.mTM.uiu))
      AppMethodBeat.o(135810);
    while (true)
    {
      return;
      b localb = LuggageGameWebViewUI.c(this.mTM);
      String str = this.ghI;
      Bundle localBundle = this.mTM.getIntent().getExtras();
      e locale = localb.bPn.j(str, localBundle);
      localb.bPj.addView(locale.getContentView(), 0);
      localb.bPk.add(locale);
      locale.g(str, localBundle);
      locale.wT();
      localb.xc();
      AppMethodBeat.o(135810);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.luggage.LuggageGameWebViewUI.2
 * JD-Core Version:    0.6.2
 */