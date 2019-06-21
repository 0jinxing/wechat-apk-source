package com.tencent.mm.plugin.emoji.ui.v2;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;

final class EmojiStoreV2RewardUI$8
  implements DialogInterface.OnCancelListener
{
  EmojiStoreV2RewardUI$8(EmojiStoreV2RewardUI paramEmojiStoreV2RewardUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(53702);
    g.RO().eJo.c(EmojiStoreV2RewardUI.m(this.leK));
    AppMethodBeat.o(53702);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2RewardUI.8
 * JD-Core Version:    0.6.2
 */