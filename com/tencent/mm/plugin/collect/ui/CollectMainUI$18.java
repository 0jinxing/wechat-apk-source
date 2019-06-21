package com.tencent.mm.plugin.collect.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.ui.o;

final class CollectMainUI$18
  implements View.OnClickListener
{
  CollectMainUI$18(CollectMainUI paramCollectMainUI, o paramo1, o paramo2)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(41273);
    if (CollectMainUI.g(this.kHl).getText().toString().equals(CollectMainUI.i(this.kHl)))
    {
      this.kHt.onClick(paramView);
      AppMethodBeat.o(41273);
    }
    while (true)
    {
      return;
      this.kHu.onClick(paramView);
      AppMethodBeat.o(41273);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.ui.CollectMainUI.18
 * JD-Core Version:    0.6.2
 */