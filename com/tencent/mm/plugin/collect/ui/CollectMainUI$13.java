package com.tencent.mm.plugin.collect.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.a.d;
import java.util.List;

final class CollectMainUI$13
  implements View.OnClickListener
{
  CollectMainUI$13(CollectMainUI paramCollectMainUI, List paramList)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(41267);
    paramView = new d(this.kHl.mController.ylL, 1, false);
    paramView.rBl = new CollectMainUI.13.1(this);
    paramView.rBm = new CollectMainUI.13.2(this);
    paramView.cpD();
    AppMethodBeat.o(41267);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.ui.CollectMainUI.13
 * JD-Core Version:    0.6.2
 */