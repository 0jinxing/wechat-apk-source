package com.tencent.mm.plugin.emoji.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.emotion.EmojiInfo;

final class d$1
  implements Runnable
{
  d$1(d paramd, EmojiInfo paramEmojiInfo)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(52849);
    if ((this.kTI != null) && (!this.kTI.duP()))
    {
      ab.i("MicroMsg.emoji.EmojiFileCheckerMgr", "chatting emoji broken. try to recover:%s", new Object[] { this.kTI.Aq() });
      d.a(this.kTI, true);
    }
    AppMethodBeat.o(52849);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.e.d.1
 * JD-Core Version:    0.6.2
 */