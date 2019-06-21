package com.tencent.mm.ui.chatting.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.c;

final class a$3
  implements h.a
{
  a$3(a parama)
  {
  }

  public final void a(h paramh, h.c paramc)
  {
    AppMethodBeat.i(31097);
    if ((paramh == null) || (paramc == null))
      AppMethodBeat.o(31097);
    while (true)
    {
      return;
      if ((paramc.talker == null) || (a.a(this.yNz).getTalkerUserName() == null))
      {
        AppMethodBeat.o(31097);
      }
      else
      {
        if (paramc.talker.equals(a.a(this.yNz).getTalkerUserName()))
          this.yNz.dCT();
        AppMethodBeat.o(31097);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.a.a.3
 * JD-Core Version:    0.6.2
 */