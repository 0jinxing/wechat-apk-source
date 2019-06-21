package com.tencent.mm.plugin.emoji.ui.v2;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.a.c;

final class EmojiStoreV2SingleProductDialogUI$3
  implements View.OnClickListener
{
  EmojiStoreV2SingleProductDialogUI$3(EmojiStoreV2SingleProductDialogUI paramEmojiStoreV2SingleProductDialogUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(53732);
    EmojiStoreV2SingleProductDialogUI.g(this.leZ).setOnDismissListener(null);
    EmojiStoreV2SingleProductDialogUI.g(this.leZ).dismiss();
    this.leZ.setResult(0);
    this.leZ.finish();
    this.leZ.overridePendingTransition(2131034216, 2131034221);
    AppMethodBeat.o(53732);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductDialogUI.3
 * JD-Core Version:    0.6.2
 */