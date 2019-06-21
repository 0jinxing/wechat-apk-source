package com.tencent.mm.plugin.emoji.ui;

import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.storage.emotion.EmojiInfo;

final class CustomSmileyPreviewUI$1
  implements Runnable
{
  CustomSmileyPreviewUI$1(CustomSmileyPreviewUI paramCustomSmileyPreviewUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(53220);
    if (CustomSmileyPreviewUI.a(this.kYV) != null)
      CustomSmileyPreviewUI.a(this.kYV).setText(((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().Jh(CustomSmileyPreviewUI.b(this.kYV).Aq()));
    AppMethodBeat.o(53220);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.CustomSmileyPreviewUI.1
 * JD-Core Version:    0.6.2
 */