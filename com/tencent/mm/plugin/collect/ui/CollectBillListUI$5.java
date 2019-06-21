package com.tencent.mm.plugin.collect.ui;

import android.app.Dialog;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class CollectBillListUI$5
  implements View.OnClickListener
{
  CollectBillListUI$5(CollectBillListUI paramCollectBillListUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(41189);
    CollectBillListUI.d(this.kFH).dismiss();
    AppMethodBeat.o(41189);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.ui.CollectBillListUI.5
 * JD-Core Version:    0.6.2
 */