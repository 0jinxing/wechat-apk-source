package com.tencent.mm.plugin.sns.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.m.b;
import com.tencent.mm.ui.tools.b.c;

final class SnsCommentUI$2
  implements MenuItem.OnMenuItemClickListener
{
  SnsCommentUI$2(SnsCommentUI paramSnsCommentUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(38917);
    if (SnsCommentUI.a(this.rrL) == 0)
      b.MX();
    if (SnsCommentUI.a(this.rrL) == 2);
    for (int i = 200; ; i = b.MW())
    {
      paramMenuItem = c.d(SnsCommentUI.b(this.rrL)).PM(i);
      paramMenuItem.zIx = true;
      paramMenuItem.a(new SnsCommentUI.2.1(this));
      AppMethodBeat.o(38917);
      return false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsCommentUI.2
 * JD-Core Version:    0.6.2
 */