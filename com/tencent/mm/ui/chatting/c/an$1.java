package com.tencent.mm.ui.chatting.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class an$1
  implements k.a
{
  an$1(an paraman)
  {
  }

  public final void a(String paramString, m paramm)
  {
    AppMethodBeat.i(31748);
    ab.v("MicroMsg.ChattingUI.TrackRoomComponent", "roommember watcher notify ".concat(String.valueOf(paramString)));
    if (!bo.isNullOrNil(paramString))
      an.a(this.ySD);
    AppMethodBeat.o(31748);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.an.1
 * JD-Core Version:    0.6.2
 */