package com.tencent.mm.plugin.sns.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SnsCommentUI$3
  implements MenuItem.OnMenuItemClickListener
{
  SnsCommentUI$3(SnsCommentUI paramSnsCommentUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(38918);
    this.rrL.aqX();
    this.rrL.finish();
    AppMethodBeat.o(38918);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsCommentUI.3
 * JD-Core Version:    0.6.2
 */