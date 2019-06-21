package com.tencent.mm.plugin.sns.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.tools.e;

final class SnsSightPlayerUI$3
  implements ViewTreeObserver.OnPreDrawListener
{
  SnsSightPlayerUI$3(SnsSightPlayerUI paramSnsSightPlayerUI)
  {
  }

  public final boolean onPreDraw()
  {
    AppMethodBeat.i(39249);
    this.rwT.qzb.getViewTreeObserver().removeOnPreDrawListener(this);
    this.rwT.jYE.a(this.rwT.qzb, SnsSightPlayerUI.t(this.rwT), null);
    AppMethodBeat.o(39249);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI.3
 * JD-Core Version:    0.6.2
 */