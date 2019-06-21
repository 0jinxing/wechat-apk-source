package com.tencent.mm.ui.conversation;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MMSlideDelView.c;

final class MainUI$5
  implements MMSlideDelView.c
{
  MainUI$5(MainUI paramMainUI)
  {
  }

  public final int cZ(View paramView)
  {
    AppMethodBeat.i(34498);
    int i = MainUI.c(this.zvg).getPositionForView(paramView);
    AppMethodBeat.o(34498);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.MainUI.5
 * JD-Core Version:    0.6.2
 */