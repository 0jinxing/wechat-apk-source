package com.tencent.mm.plugin.emoji.ui.v2;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class EmojiStoreV2DesignerUI$3
  implements DialogInterface.OnClickListener
{
  EmojiStoreV2DesignerUI$3(EmojiStoreV2DesignerUI paramEmojiStoreV2DesignerUI, String paramString1, String paramString2, String paramString3)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(53582);
    this.ldL.M(this.kUJ, this.kYy, this.kYz);
    this.ldL.bkZ();
    ab.i("MicroMsg.emoji.EmojiStoreV2DesignerUI", "Retry doScene ExchangeEmotionPackNetScene productId:%s", new Object[] { this.kUJ });
    EmojiStoreV2DesignerUI.a(this.ldL, this.kUJ);
    AppMethodBeat.o(53582);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI.3
 * JD-Core Version:    0.6.2
 */