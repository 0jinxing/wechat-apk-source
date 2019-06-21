package com.tencent.mm.plugin.nearby.ui;

import android.view.View;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MMSlideDelView.c;

final class NearbySayHiListUI$7
  implements MMSlideDelView.c
{
  NearbySayHiListUI$7(NearbySayHiListUI paramNearbySayHiListUI)
  {
  }

  public final int cZ(View paramView)
  {
    AppMethodBeat.i(55501);
    int i = NearbySayHiListUI.d(this.oQP).getPositionForView(paramView);
    AppMethodBeat.o(55501);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI.7
 * JD-Core Version:    0.6.2
 */