package com.tencent.mm.plugin.sns.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SnsCommentDetailUI$18
  implements MenuItem.OnMenuItemClickListener
{
  SnsCommentDetailUI$18(SnsCommentDetailUI paramSnsCommentDetailUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(38797);
    if (SnsCommentDetailUI.c(this.rqN) != null)
      SnsCommentDetailUI.c(this.rqN).lj(false);
    this.rqN.finish();
    AppMethodBeat.o(38797);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.18
 * JD-Core Version:    0.6.2
 */