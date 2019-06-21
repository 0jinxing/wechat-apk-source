package com.tencent.mm.plugin.emoji.ui.fts;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;
import java.util.List;

final class FTSEmojiDetailPageUI$12
  implements n.c
{
  FTSEmojiDetailPageUI$12(FTSEmojiDetailPageUI paramFTSEmojiDetailPageUI, List paramList1, List paramList2)
  {
  }

  public final void a(l paraml)
  {
    AppMethodBeat.i(53550);
    paraml.setHeaderTitle("");
    for (int i = 0; i < this.lcO.size(); i++)
      paraml.e(((Integer)this.lcO.get(i)).intValue(), (CharSequence)this.lcP.get(i));
    AppMethodBeat.o(53550);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.fts.FTSEmojiDetailPageUI.12
 * JD-Core Version:    0.6.2
 */