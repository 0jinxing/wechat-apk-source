package com.tencent.mm.view;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.ui.widget.a.e.c;

final class SmileyGrid$6
  implements e.c
{
  SmileyGrid$6(SmileyGrid paramSmileyGrid, EmojiInfo paramEmojiInfo)
  {
  }

  public final void d(boolean paramBoolean, String paramString)
  {
    AppMethodBeat.i(62903);
    if ((paramBoolean) && (!bo.isNullOrNil(this.oeD.Aq())))
      ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().Jr(this.oeD.Aq());
    AppMethodBeat.o(62903);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.view.SmileyGrid.6
 * JD-Core Version:    0.6.2
 */