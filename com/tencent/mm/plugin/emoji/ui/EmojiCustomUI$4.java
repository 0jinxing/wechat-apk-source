package com.tencent.mm.plugin.emoji.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;

final class EmojiCustomUI$4
  implements MenuItem.OnMenuItemClickListener
{
  EmojiCustomUI$4(EmojiCustomUI paramEmojiCustomUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(53303);
    EmojiCustomUI.a(this.kZL, EmojiCustomUI.c.kZX);
    h.pYm.e(11596, new Object[] { Integer.valueOf(1) });
    AppMethodBeat.o(53303);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.EmojiCustomUI.4
 * JD-Core Version:    0.6.2
 */