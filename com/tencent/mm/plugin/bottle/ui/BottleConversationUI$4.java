package com.tencent.mm.plugin.bottle.ui;

import android.view.View;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MMSlideDelView.g;

final class BottleConversationUI$4
  implements MMSlideDelView.g
{
  BottleConversationUI$4(BottleConversationUI paramBottleConversationUI)
  {
  }

  public final void q(View paramView, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(18559);
    BottleConversationUI.c(this.jKb).performItemClick(paramView, paramInt1, paramInt2);
    AppMethodBeat.o(18559);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.bottle.ui.BottleConversationUI.4
 * JD-Core Version:    0.6.2
 */