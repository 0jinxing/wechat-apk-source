package com.tencent.mm.plugin.emoji.ui.v2;

import android.os.Message;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

final class EmojiStoreV2RewardDetailUI$1 extends ak
{
  EmojiStoreV2RewardDetailUI$1(EmojiStoreV2RewardDetailUI paramEmojiStoreV2RewardDetailUI)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(53669);
    switch (paramMessage.what)
    {
    default:
    case 1001:
    case 1002:
    }
    while (true)
    {
      AppMethodBeat.o(53669);
      while (true)
      {
        return;
        if (EmojiStoreV2RewardDetailUI.a(this.leh) == null)
          break;
        EmojiStoreV2RewardDetailUI.a(this.leh).setVisibility(8);
        AppMethodBeat.o(53669);
      }
      if (EmojiStoreV2RewardDetailUI.a(this.leh) != null)
        EmojiStoreV2RewardDetailUI.a(this.leh).setVisibility(0);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2RewardDetailUI.1
 * JD-Core Version:    0.6.2
 */