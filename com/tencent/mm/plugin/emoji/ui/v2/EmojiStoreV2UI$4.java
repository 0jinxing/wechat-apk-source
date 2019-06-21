package com.tencent.mm.plugin.emoji.ui.v2;

import android.os.MessageQueue.IdleHandler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cj.c;
import com.tencent.mm.sdk.platformtools.ab;

final class EmojiStoreV2UI$4
  implements MessageQueue.IdleHandler
{
  EmojiStoreV2UI$4(EmojiStoreV2UI paramEmojiStoreV2UI)
  {
  }

  public final boolean queueIdle()
  {
    AppMethodBeat.i(53819);
    ab.i("MicroMsg.emoji.EmojiStoreV2UI", "now try to activity the tools process");
    c.aNX();
    AppMethodBeat.o(53819);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2UI.4
 * JD-Core Version:    0.6.2
 */