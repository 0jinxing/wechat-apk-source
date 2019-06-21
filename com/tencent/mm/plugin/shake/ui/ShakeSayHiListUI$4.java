package com.tencent.mm.plugin.shake.ui;

import android.view.View;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MMSlideDelView.c;

final class ShakeSayHiListUI$4
  implements MMSlideDelView.c
{
  ShakeSayHiListUI$4(ShakeSayHiListUI paramShakeSayHiListUI)
  {
  }

  public final int cZ(View paramView)
  {
    AppMethodBeat.i(24877);
    int i = ShakeSayHiListUI.d(this.qwt).getPositionForView(paramView);
    AppMethodBeat.o(24877);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.ui.ShakeSayHiListUI.4
 * JD-Core Version:    0.6.2
 */