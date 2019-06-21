package com.tencent.mm.plugin.emoji.ui.v2;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.storage.emotion.EmojiInfo;

final class EmojiStoreV2SingleProductDialogUI$2
  implements DialogInterface.OnClickListener
{
  EmojiStoreV2SingleProductDialogUI$2(EmojiStoreV2SingleProductDialogUI paramEmojiStoreV2SingleProductDialogUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(53731);
    EmojiStoreV2SingleProductDialogUI.f(this.leZ);
    if (EmojiStoreV2SingleProductDialogUI.b(this.leZ) != null)
      h.pYm.e(12787, new Object[] { Integer.valueOf(EmojiStoreV2SingleProductDialogUI.c(this.leZ)), Integer.valueOf(1), EmojiStoreV2SingleProductDialogUI.b(this.leZ).field_md5, Long.valueOf(EmojiStoreV2SingleProductDialogUI.d(this.leZ)), EmojiStoreV2SingleProductDialogUI.b(this.leZ).field_designerID, EmojiStoreV2SingleProductDialogUI.b(this.leZ).field_groupId, Integer.valueOf(EmojiStoreV2SingleProductDialogUI.e(this.leZ)) });
    AppMethodBeat.o(53731);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductDialogUI.2
 * JD-Core Version:    0.6.2
 */