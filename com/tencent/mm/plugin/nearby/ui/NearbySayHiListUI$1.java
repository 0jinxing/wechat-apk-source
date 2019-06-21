package com.tencent.mm.plugin.nearby.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class NearbySayHiListUI$1
  implements View.OnClickListener
{
  NearbySayHiListUI$1(NearbySayHiListUI paramNearbySayHiListUI, View paramView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(55493);
    NearbySayHiListUI.a(this.oQP, NearbySayHiListUI.a(this.oQP) + 8);
    ab.d("MicroMsg.SayHiListUI", "dkfooter more btn:" + NearbySayHiListUI.a(this.oQP));
    paramView = NearbySayHiListUI.b(this.oQP);
    int i = NearbySayHiListUI.a(this.oQP);
    paramView.bIf();
    paramView.limit = i;
    paramView.KC();
    if (NearbySayHiListUI.c(this.oQP) <= NearbySayHiListUI.a(this.oQP))
    {
      NearbySayHiListUI.d(this.oQP).removeFooterView(this.oQO);
      ab.d("MicroMsg.SayHiListUI", "dkfooter REMOVE more btn: " + NearbySayHiListUI.a(this.oQP));
    }
    AppMethodBeat.o(55493);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI.1
 * JD-Core Version:    0.6.2
 */