package com.tencent.mm.ui.chatting.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.chatting.d.a;

final class r$1
  implements Runnable
{
  r$1(r paramr)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(31440);
    long l = System.currentTimeMillis();
    r.a(this.yQd, ((j)g.K(j.class)).bOr().Rb(this.yQd.cgL.getTalkerUserName()));
    if (r.a(this.yQd) == null)
      AppMethodBeat.o(31440);
    while (true)
    {
      return;
      ab.i("MicroMsg.GetChatroomComponent", "[onChattingInit] cost:%sms talker:%s createTime:%s", new Object[] { Long.valueOf(System.currentTimeMillis() - l), this.yQd.cgL.getTalkerUserName(), Long.valueOf(r.a(this.yQd).field_createTime) });
      AppMethodBeat.o(31440);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.r.1
 * JD-Core Version:    0.6.2
 */