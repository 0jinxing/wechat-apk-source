package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$1
  implements ViewTreeObserver.OnPreDrawListener
{
  b$1(b paramb, View paramView)
  {
  }

  public final boolean onPreDraw()
  {
    AppMethodBeat.i(8573);
    this.uCK.getViewTreeObserver().removeOnPreDrawListener(this);
    RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)this.uCK.getLayoutParams();
    this.uCL.uCm = (localLayoutParams.leftMargin - this.uCL.oIe);
    AppMethodBeat.o(8573);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.b.1
 * JD-Core Version:    0.6.2
 */