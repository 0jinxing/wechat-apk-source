package com.tencent.mm.ui.conversation;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MMSlideDelView.g;

final class MainUI$6
  implements MMSlideDelView.g
{
  MainUI$6(MainUI paramMainUI)
  {
  }

  public final void q(View paramView, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(34499);
    MainUI.c(this.zvg).performItemClick(paramView, paramInt1, paramInt2);
    AppMethodBeat.o(34499);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.MainUI.6
 * JD-Core Version:    0.6.2
 */