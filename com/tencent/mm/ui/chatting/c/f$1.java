package com.tencent.mm.ui.chatting.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.chatting.d.a;

final class f$1
  implements k.a
{
  f$1(f paramf)
  {
  }

  public final void a(String paramString, m paramm)
  {
    AppMethodBeat.i(31276);
    ab.d("MicroMsg.ChattingUI.ChattingBackgroundComponent", "onBGChange event:%s", new Object[] { paramString });
    if ((paramString != null) && ((paramString.equals(this.yOH.cgL.getTalkerUserName())) || (paramString.equals("*"))))
      this.yOH.cZH();
    AppMethodBeat.o(31276);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.f.1
 * JD-Core Version:    0.6.2
 */