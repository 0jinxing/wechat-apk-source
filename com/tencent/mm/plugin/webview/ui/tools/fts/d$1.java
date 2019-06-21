package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class d$1
  implements ViewTreeObserver.OnPreDrawListener
{
  d$1(d paramd, View paramView)
  {
  }

  public final boolean onPreDraw()
  {
    AppMethodBeat.i(8598);
    this.uCK.getViewTreeObserver().removeOnPreDrawListener(this);
    RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)this.uCK.getLayoutParams();
    this.uCO.uCm = (localLayoutParams.leftMargin - this.uCO.oIe);
    AppMethodBeat.o(8598);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.d.1
 * JD-Core Version:    0.6.2
 */