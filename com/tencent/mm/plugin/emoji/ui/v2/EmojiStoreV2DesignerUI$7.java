package com.tencent.mm.plugin.emoji.ui.v2;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;

final class EmojiStoreV2DesignerUI$7
  implements DialogInterface.OnCancelListener
{
  EmojiStoreV2DesignerUI$7(EmojiStoreV2DesignerUI paramEmojiStoreV2DesignerUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(53585);
    if (EmojiStoreV2DesignerUI.p(this.ldL) != null)
      g.RO().eJo.c(EmojiStoreV2DesignerUI.p(this.ldL));
    AppMethodBeat.o(53585);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI.7
 * JD-Core Version:    0.6.2
 */