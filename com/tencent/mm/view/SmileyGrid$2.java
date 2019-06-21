package com.tencent.mm.view;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.ui.widget.a.e.c;

final class SmileyGrid$2
  implements e.c
{
  SmileyGrid$2(SmileyGrid paramSmileyGrid, EmojiInfo paramEmojiInfo)
  {
  }

  public final void d(boolean paramBoolean, String paramString)
  {
    AppMethodBeat.i(62899);
    if ((paramBoolean) && (!bo.isNullOrNil(this.oeD.Aq())))
      ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().Jr(this.oeD.Aq());
    AppMethodBeat.o(62899);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.view.SmileyGrid.2
 * JD-Core Version:    0.6.2
 */