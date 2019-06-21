package com.tencent.mm.plugin.webview.ui.tools.game.menu;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class e$1
  implements View.OnClickListener
{
  e$1(e parame)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(8835);
    if (this.uEY.isShowing())
      this.uEY.cancel();
    AppMethodBeat.o(8835);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.game.menu.e.1
 * JD-Core Version:    0.6.2
 */