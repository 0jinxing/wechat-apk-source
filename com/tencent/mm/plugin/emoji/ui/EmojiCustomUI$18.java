package com.tencent.mm.plugin.emoji.ui;

import android.os.Message;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.emoji.sync.EmojiSyncManager;
import com.tencent.mm.emoji.sync.EmojiSyncManager.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.at;

final class EmojiCustomUI$18 extends ak
{
  EmojiCustomUI$18(EmojiCustomUI paramEmojiCustomUI)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(53318);
    switch (paramMessage.what)
    {
    default:
      ab.e("MicroMsg.emoji.EmojiCustomUI", "unknow Msg");
      AppMethodBeat.o(53318);
    case 1001:
    case 1002:
    case 1003:
    case 1004:
    }
    while (true)
    {
      return;
      EmojiCustomUI.h(this.kZL);
      AppMethodBeat.o(53318);
      continue;
      if (at.isWifi(this.kZL))
        break;
      if (EmojiCustomUI.c(this.kZL).ezs == EmojiSyncManager.b.ezC)
      {
        EmojiCustomUI.a(this.kZL, true);
        AppMethodBeat.o(53318);
      }
      else
      {
        EmojiCustomUI.a(this.kZL, false);
        AppMethodBeat.o(53318);
        continue;
        EmojiCustomUI.i(this.kZL).setVisibility(8);
        EmojiCustomUI.f(this.kZL).notifyDataSetChanged();
        AppMethodBeat.o(53318);
        continue;
        if (EmojiCustomUI.f(this.kZL) != null)
        {
          EmojiCustomUI.f(this.kZL).bly();
          EmojiCustomUI.f(this.kZL).notifyDataSetChanged();
        }
        EmojiCustomUI.blw();
        AppMethodBeat.o(53318);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.EmojiCustomUI.18
 * JD-Core Version:    0.6.2
 */