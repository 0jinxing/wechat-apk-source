package com.tencent.mm.plugin.emoji.ui.v2;

import android.content.res.Resources;
import android.widget.Button;
import android.widget.ProgressBar;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.emoji.view.EmojiStatusView;
import com.tencent.mm.emoji.view.EmojiStatusView.b;

final class EmojiStoreV2SingleProductDialogUI$5
  implements EmojiStatusView.b
{
  EmojiStoreV2SingleProductDialogUI$5(EmojiStoreV2SingleProductDialogUI paramEmojiStoreV2SingleProductDialogUI)
  {
  }

  public final void jm(int paramInt)
  {
    AppMethodBeat.i(53734);
    if (paramInt == 1)
    {
      EmojiStoreV2SingleProductDialogUI.h(this.leZ).setVisibility(0);
      EmojiStoreV2SingleProductDialogUI.i(this.leZ).setVisibility(8);
      EmojiStoreV2SingleProductDialogUI.j(this.leZ);
      EmojiStoreV2SingleProductDialogUI.k(this.leZ).setEnabled(true);
      EmojiStoreV2SingleProductDialogUI.k(this.leZ).setTextColor(this.leZ.getResources().getColor(2131689776));
    }
    AppMethodBeat.o(53734);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductDialogUI.5
 * JD-Core Version:    0.6.2
 */