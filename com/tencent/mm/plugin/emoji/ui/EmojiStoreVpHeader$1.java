package com.tencent.mm.plugin.emoji.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.emoji.a.i;
import java.util.LinkedList;

final class EmojiStoreVpHeader$1
  implements Runnable
{
  EmojiStoreVpHeader$1(EmojiStoreVpHeader paramEmojiStoreVpHeader)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(53508);
    if ((EmojiStoreVpHeader.a(this.lbY) != null) && (EmojiStoreVpHeader.b(this.lbY) != null))
    {
      i locali = EmojiStoreVpHeader.a(this.lbY);
      LinkedList localLinkedList = EmojiStoreVpHeader.b(this.lbY);
      locali.kSD.clear();
      locali.kSD.addAll(localLinkedList);
      locali.notifyDataSetChanged();
    }
    AppMethodBeat.o(53508);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.EmojiStoreVpHeader.1
 * JD-Core Version:    0.6.2
 */