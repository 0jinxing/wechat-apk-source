package com.tencent.mm.plugin.collect.ui;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.ui.o.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class CollectMainUI$15
  implements o.a
{
  CollectMainUI$15(CollectMainUI paramCollectMainUI)
  {
  }

  public final void df(View paramView)
  {
    AppMethodBeat.i(41270);
    if (CollectMainUI.b(this.kHl) == 1)
    {
      CollectMainUI.c(this.kHl);
      com.tencent.mm.ui.base.h.a(this.kHl.mController.ylL, this.kHl.getString(2131298393), "", this.kHl.getString(2131298392), this.kHl.getString(2131296868), true, new CollectMainUI.15.1(this), new CollectMainUI.15.2(this));
    }
    while (true)
    {
      com.tencent.mm.plugin.report.service.h.pYm.e(13944, new Object[] { Integer.valueOf(5) });
      AppMethodBeat.o(41270);
      return;
      CollectMainUI.e(this.kHl);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.ui.CollectMainUI.15
 * JD-Core Version:    0.6.2
 */