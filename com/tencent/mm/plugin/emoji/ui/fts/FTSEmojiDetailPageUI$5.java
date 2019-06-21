package com.tencent.mm.plugin.emoji.ui.fts;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.storage.emotion.EmojiInfo;

final class FTSEmojiDetailPageUI$5
  implements View.OnClickListener
{
  FTSEmojiDetailPageUI$5(FTSEmojiDetailPageUI paramFTSEmojiDetailPageUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(53539);
    FTSEmojiDetailPageUI.a(this.lcK, FTSEmojiDetailPageUI.a(this.lcK).Aq(), FTSEmojiDetailPageUI.a(this.lcK).field_designerID, FTSEmojiDetailPageUI.a(this.lcK).field_thumbUrl, FTSEmojiDetailPageUI.a(this.lcK).field_activityid);
    AppMethodBeat.o(53539);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.fts.FTSEmojiDetailPageUI.5
 * JD-Core Version:    0.6.2
 */