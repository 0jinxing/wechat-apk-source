package com.tencent.mm.plugin.collect.ui;

import android.content.Intent;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.ui.o.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class CollectMainUI$16
  implements o.a
{
  CollectMainUI$16(CollectMainUI paramCollectMainUI)
  {
  }

  public final void df(View paramView)
  {
    AppMethodBeat.i(41271);
    paramView = new Intent();
    paramView.setClass(this.kHl.mController.ylL, CollectCreateQRCodeUI.class);
    paramView.putExtra("key_currency_unit", this.kHl.kGF);
    this.kHl.startActivityForResult(paramView, 4096);
    AppMethodBeat.o(41271);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.ui.CollectMainUI.16
 * JD-Core Version:    0.6.2
 */