package com.tencent.mm.plugin.emoji.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class BaseEmojiStoreUI$1
  implements DialogInterface.OnClickListener
{
  BaseEmojiStoreUI$1(BaseEmojiStoreUI paramBaseEmojiStoreUI, String paramString1, String paramString2, String paramString3)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(53213);
    this.kYA.j(this.kUJ, this.kYy, this.kYz, null);
    this.kYA.bkZ();
    ab.i("MicroMsg.emoji.BaseEmojiStoreUI", "Retry doScene ExchangeEmotionPackNetScene productId:%s", new Object[] { this.kUJ });
    BaseEmojiStoreUI.a(this.kYA, this.kUJ);
    AppMethodBeat.o(53213);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI.1
 * JD-Core Version:    0.6.2
 */