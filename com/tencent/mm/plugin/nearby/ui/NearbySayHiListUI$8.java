package com.tencent.mm.plugin.nearby.ui;

import android.view.View;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MMSlideDelView.g;

final class NearbySayHiListUI$8
  implements MMSlideDelView.g
{
  NearbySayHiListUI$8(NearbySayHiListUI paramNearbySayHiListUI)
  {
  }

  public final void q(View paramView, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(55502);
    NearbySayHiListUI.d(this.oQP).performItemClick(paramView, paramInt1, paramInt2);
    AppMethodBeat.o(55502);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI.8
 * JD-Core Version:    0.6.2
 */