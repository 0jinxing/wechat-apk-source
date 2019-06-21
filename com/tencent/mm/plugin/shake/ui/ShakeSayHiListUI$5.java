package com.tencent.mm.plugin.shake.ui;

import android.view.View;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MMSlideDelView.g;

final class ShakeSayHiListUI$5
  implements MMSlideDelView.g
{
  ShakeSayHiListUI$5(ShakeSayHiListUI paramShakeSayHiListUI)
  {
  }

  public final void q(View paramView, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(24878);
    ShakeSayHiListUI.d(this.qwt).performItemClick(paramView, paramInt1, paramInt2);
    AppMethodBeat.o(24878);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.ui.ShakeSayHiListUI.5
 * JD-Core Version:    0.6.2
 */