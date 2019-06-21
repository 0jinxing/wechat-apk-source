package com.tencent.mm.plugin.emoji.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.emoji.a.e;
import com.tencent.mm.ui.widget.sortlist.DragSortListView.l;

final class EmojiSortUI$5
  implements DragSortListView.l
{
  EmojiSortUI$5(EmojiSortUI paramEmojiSortUI)
  {
  }

  public final void remove(int paramInt)
  {
    AppMethodBeat.i(53412);
    EmojiSortUI.b(this.law).remove(EmojiSortUI.b(this.law).getItem(paramInt));
    AppMethodBeat.o(53412);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.EmojiSortUI.5
 * JD-Core Version:    0.6.2
 */