package com.tencent.mm.plugin.emoji.ui.v2;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class EmojiStoreV2SingleProductUI$6$1
  implements Runnable
{
  EmojiStoreV2SingleProductUI$6$1(EmojiStoreV2SingleProductUI.6 param6)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(53749);
    EmojiStoreV2SingleProductUI.c(this.lfD.lfC).notifyDataSetInvalidated();
    AppMethodBeat.o(53749);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductUI.6.1
 * JD-Core Version:    0.6.2
 */