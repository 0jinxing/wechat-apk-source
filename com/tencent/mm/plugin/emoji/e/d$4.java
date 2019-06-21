package com.tencent.mm.plugin.emoji.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.ui.widget.a.e.c;

final class d$4
  implements e.c
{
  d$4(d paramd, EmojiInfo paramEmojiInfo)
  {
  }

  public final void d(boolean paramBoolean, String paramString)
  {
    AppMethodBeat.i(52851);
    d.b(this.kTJ, this.kTI);
    this.kTJ.kTH = true;
    ab.i("MicroMsg.emoji.EmojiFileCheckerMgr", "smiley pannel emotion broken. try to recover in mobile netword:%s", new Object[] { this.kTI.field_groupId });
    AppMethodBeat.o(52851);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.e.d.4
 * JD-Core Version:    0.6.2
 */