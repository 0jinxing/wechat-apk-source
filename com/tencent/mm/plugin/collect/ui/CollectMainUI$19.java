package com.tencent.mm.plugin.collect.ui;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.tools.j;
import com.tencent.mm.ui.widget.a.d;

final class CollectMainUI$19
  implements View.OnLongClickListener
{
  CollectMainUI$19(CollectMainUI paramCollectMainUI)
  {
  }

  public final boolean onLongClick(View paramView)
  {
    AppMethodBeat.i(41278);
    if (CollectMainUI.b(this.kHl) == 0)
    {
      paramView = new j(this.kHl.mController.ylL);
      paramView.rBl = new CollectMainUI.19.1(this);
      paramView.rBm = new CollectMainUI.19.2(this);
      paramView.cuu();
    }
    while (true)
    {
      AppMethodBeat.o(41278);
      return true;
      paramView = new d(this.kHl.mController.ylL, 1, false);
      paramView.rBl = new CollectMainUI.19.3(this);
      paramView.rBm = new CollectMainUI.19.4(this);
      paramView.cpD();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.ui.CollectMainUI.19
 * JD-Core Version:    0.6.2
 */