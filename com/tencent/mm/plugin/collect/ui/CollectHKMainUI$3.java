package com.tencent.mm.plugin.collect.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.collect.model.m;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.ui.e;

final class CollectHKMainUI$3
  implements View.OnClickListener
{
  CollectHKMainUI$3(CollectHKMainUI paramCollectHKMainUI, m paramm)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(41245);
    if (!bo.isNullOrNil(this.kGf.kCy))
      e.n(this.kGh.mController.ylL, this.kGf.kCy, true);
    AppMethodBeat.o(41245);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.ui.CollectHKMainUI.3
 * JD-Core Version:    0.6.2
 */