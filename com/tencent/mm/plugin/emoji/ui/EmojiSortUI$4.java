package com.tencent.mm.plugin.emoji.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.emoji.a.e;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.ui.widget.sortlist.DragSortListView.h;

final class EmojiSortUI$4
  implements DragSortListView.h
{
  EmojiSortUI$4(EmojiSortUI paramEmojiSortUI)
  {
  }

  public final void dm(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(53411);
    EmojiGroupInfo localEmojiGroupInfo = (EmojiGroupInfo)EmojiSortUI.b(this.law).getItem(paramInt1);
    EmojiSortUI.b(this.law).remove(localEmojiGroupInfo);
    EmojiSortUI.b(this.law).insert(localEmojiGroupInfo, paramInt2);
    AppMethodBeat.o(53411);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.EmojiSortUI.4
 * JD-Core Version:    0.6.2
 */