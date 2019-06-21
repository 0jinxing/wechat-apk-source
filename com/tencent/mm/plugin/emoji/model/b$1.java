package com.tencent.mm.plugin.emoji.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.emoji.e.h;
import com.tencent.mm.pluginsdk.a.d;
import com.tencent.mm.storage.aq;
import com.tencent.mm.storage.at;

final class b$1
  implements com.tencent.mm.plugin.emoji.b.b
{
  b$1(b paramb)
  {
  }

  public final aq getEmojiDescMgr()
  {
    AppMethodBeat.i(52996);
    aq localaq = j.getEmojiDescMgr();
    AppMethodBeat.o(52996);
    return localaq;
  }

  public final d getEmojiMgr()
  {
    AppMethodBeat.i(52994);
    h localh = j.bki();
    AppMethodBeat.o(52994);
    return localh;
  }

  public final at getEmojiStorageMgr()
  {
    AppMethodBeat.i(52995);
    at localat = j.getEmojiStorageMgr();
    AppMethodBeat.o(52995);
    return localat;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.model.b.1
 * JD-Core Version:    0.6.2
 */