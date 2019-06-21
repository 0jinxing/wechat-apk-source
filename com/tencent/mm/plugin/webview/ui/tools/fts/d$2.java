package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class d$2
  implements ViewTreeObserver.OnPreDrawListener
{
  d$2(d paramd, View paramView)
  {
  }

  public final boolean onPreDraw()
  {
    AppMethodBeat.i(8599);
    this.uCM.getViewTreeObserver().removeOnPreDrawListener(this);
    this.uCO.uCl = 0;
    AppMethodBeat.o(8599);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.d.2
 * JD-Core Version:    0.6.2
 */