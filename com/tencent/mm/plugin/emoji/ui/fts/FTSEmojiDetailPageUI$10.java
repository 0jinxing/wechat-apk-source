package com.tencent.mm.plugin.emoji.ui.fts;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.emoji.model.d.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.storage.emotion.EmojiInfo;

final class FTSEmojiDetailPageUI$10
  implements d.a
{
  FTSEmojiDetailPageUI$10(FTSEmojiDetailPageUI paramFTSEmojiDetailPageUI)
  {
  }

  public final void a(boolean paramBoolean, EmojiInfo paramEmojiInfo)
  {
    AppMethodBeat.i(53547);
    if ((paramEmojiInfo != null) && (paramBoolean) && (FTSEmojiDetailPageUI.a(this.lcK) != null) && (FTSEmojiDetailPageUI.a(this.lcK).Aq().equals(paramEmojiInfo.Aq())))
    {
      ab.i("MicroMsg.FTS.FTSEmojiDetailPageUI", "emojiServiceCallback onDownload %s", new Object[] { FTSEmojiDetailPageUI.a(this.lcK).Aq() });
      al.d(new FTSEmojiDetailPageUI.10.1(this));
      AppMethodBeat.o(53547);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.FTS.FTSEmojiDetailPageUI", "somethings error.");
      AppMethodBeat.o(53547);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.fts.FTSEmojiDetailPageUI.10
 * JD-Core Version:    0.6.2
 */