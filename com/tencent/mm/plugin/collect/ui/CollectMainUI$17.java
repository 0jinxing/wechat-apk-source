package com.tencent.mm.plugin.collect.ui;

import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.ui.o.a;

final class CollectMainUI$17
  implements o.a
{
  CollectMainUI$17(CollectMainUI paramCollectMainUI)
  {
  }

  public final void df(View paramView)
  {
    AppMethodBeat.i(41272);
    this.kHl.kGL = false;
    this.kHl.bhs();
    CollectMainUI.g(this.kHl).setText(CollectMainUI.f(this.kHl));
    CollectMainUI.h(this.kHl);
    AppMethodBeat.o(41272);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.ui.CollectMainUI.17
 * JD-Core Version:    0.6.2
 */