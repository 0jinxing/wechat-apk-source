package com.tencent.mm.plugin.setting.ui.setting;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.a.d;

final class UnfamiliarContactDetailUI$8
  implements View.OnClickListener
{
  UnfamiliarContactDetailUI$8(UnfamiliarContactDetailUI paramUnfamiliarContactDetailUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(127644);
    paramView = new d(this.qpX, 1, false);
    paramView.rBl = new UnfamiliarContactDetailUI.8.1(this);
    paramView.rBm = new UnfamiliarContactDetailUI.8.2(this);
    paramView.cpD();
    AppMethodBeat.o(127644);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI.8
 * JD-Core Version:    0.6.2
 */