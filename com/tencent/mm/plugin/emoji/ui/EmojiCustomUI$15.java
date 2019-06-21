package com.tencent.mm.plugin.emoji.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.emoji.sync.EmojiSyncManager.b;
import com.tencent.mm.emoji.sync.c;
import com.tencent.mm.sdk.platformtools.ak;

final class EmojiCustomUI$15
  implements c
{
  EmojiCustomUI$15(EmojiCustomUI paramEmojiCustomUI)
  {
  }

  public final void Pi()
  {
    AppMethodBeat.i(53313);
    if (EmojiCustomUI.g(this.kZL) != null)
      EmojiCustomUI.g(this.kZL).sendEmptyMessage(1002);
    AppMethodBeat.o(53313);
  }

  public final void a(EmojiSyncManager.b paramb)
  {
    AppMethodBeat.i(53314);
    EmojiCustomUI.a(this.kZL, paramb);
    if (EmojiCustomUI.g(this.kZL) != null)
      EmojiCustomUI.g(this.kZL).sendEmptyMessage(1001);
    AppMethodBeat.o(53314);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.EmojiCustomUI.15
 * JD-Core Version:    0.6.2
 */