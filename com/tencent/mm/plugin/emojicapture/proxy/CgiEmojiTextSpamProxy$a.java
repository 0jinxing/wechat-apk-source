package com.tencent.mm.plugin.emojicapture.proxy;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ci.f;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class CgiEmojiTextSpamProxy$a
  implements Runnable
{
  CgiEmojiTextSpamProxy$a(CgiEmojiTextSpamProxy paramCgiEmojiTextSpamProxy, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(2799);
    new com.tencent.mm.plugin.emojicapture.a.a(this.lkF).acy().g((com.tencent.mm.vending.c.a)new CgiEmojiTextSpamProxy.a.1(this));
    AppMethodBeat.o(2799);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.proxy.CgiEmojiTextSpamProxy.a
 * JD-Core Version:    0.6.2
 */