package com.tencent.mm.plugin.emoji.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.h.c;

final class EmojiPaidUI$2
  implements h.c
{
  EmojiPaidUI$2(EmojiPaidUI paramEmojiPaidUI)
  {
  }

  public final void iE(int paramInt)
  {
    AppMethodBeat.i(53390);
    switch (paramInt)
    {
    default:
    case 0:
    }
    while (true)
    {
      AppMethodBeat.o(53390);
      return;
      Intent localIntent = new Intent();
      localIntent.putExtra("key_action_type", 200002);
      d.b(this.lan, "wallet_index", ".ui.WalletIapUI", localIntent, 2001);
      ab.i("MicroMsg.emoji.EmojiPaidUI", "[showMenuDialog] startActivityForResult ui.WalletIapUI");
      this.lan.aoW();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.EmojiPaidUI.2
 * JD-Core Version:    0.6.2
 */