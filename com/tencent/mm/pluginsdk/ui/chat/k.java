package com.tencent.mm.pluginsdk.ui.chat;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.api.t;
import com.tencent.mm.api.t.a;
import com.tencent.mm.storage.emotion.EmojiInfo;

public final class k extends t
  implements j
{
  public final void A(EmojiInfo paramEmojiInfo)
  {
    AppMethodBeat.i(62452);
    this.ccZ.a(paramEmojiInfo);
    AppMethodBeat.o(62452);
  }

  public final void B(EmojiInfo paramEmojiInfo)
  {
    AppMethodBeat.i(62453);
    this.ccZ.a(paramEmojiInfo);
    AppMethodBeat.o(62453);
  }

  public final boolean bOe()
  {
    return true;
  }

  public final boolean bOf()
  {
    return true;
  }

  public final void bOg()
  {
    AppMethodBeat.i(62454);
    this.ccZ.onHide();
    AppMethodBeat.o(62454);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.k
 * JD-Core Version:    0.6.2
 */