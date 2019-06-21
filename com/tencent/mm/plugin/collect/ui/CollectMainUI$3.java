package com.tencent.mm.plugin.collect.ui;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class CollectMainUI$3
  implements Runnable
{
  CollectMainUI$3(CollectMainUI paramCollectMainUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(41254);
    int i = a.fromDPToPix(this.kHl.mController.ylL, 37);
    ViewGroup.LayoutParams localLayoutParams = CollectMainUI.k(this.kHl).getLayoutParams();
    if (localLayoutParams != null)
    {
      localLayoutParams.height = i;
      CollectMainUI.k(this.kHl).setLayoutParams(localLayoutParams);
      CollectMainUI.k(this.kHl).requestLayout();
    }
    AppMethodBeat.o(41254);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.ui.CollectMainUI.3
 * JD-Core Version:    0.6.2
 */