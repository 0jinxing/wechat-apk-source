package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class c$2
  implements ViewTreeObserver.OnPreDrawListener
{
  c$2(c paramc, View paramView)
  {
  }

  public final boolean onPreDraw()
  {
    AppMethodBeat.i(8588);
    this.uCM.getViewTreeObserver().removeOnPreDrawListener(this);
    this.uCN.uCl = ((int)this.uCM.getX());
    AppMethodBeat.o(8588);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.c.2
 * JD-Core Version:    0.6.2
 */