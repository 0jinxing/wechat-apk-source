package com.tencent.mm.ui.chatting.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bh.d;
import com.tencent.mm.g.a.sz;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.TalkRoomPopupNav.a;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import java.util.List;

final class an$7
  implements TalkRoomPopupNav.a
{
  an$7(an paraman)
  {
  }

  public final void dAt()
  {
    AppMethodBeat.i(31753);
    if ((com.tencent.mm.r.a.bJ(this.ySD.cgL.yTx.getContext())) || (com.tencent.mm.r.a.bH(this.ySD.cgL.yTx.getContext())))
    {
      ab.d("MicroMsg.ChattingUI.TrackRoomComponent", "voip is running");
      AppMethodBeat.o(31753);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.ChattingUI.TrackRoomComponent", "Click banner : %d", new Object[] { Integer.valueOf(d.fUu.tP(this.ySD.cgL.sRl.field_username).size()) });
      if (d.fUu.tQ(this.ySD.cgL.sRl.field_username))
      {
        an.b(this.ySD);
        AppMethodBeat.o(31753);
      }
      else
      {
        this.ySD.qt(true);
        AppMethodBeat.o(31753);
      }
    }
  }

  public final void dAu()
  {
    AppMethodBeat.i(31754);
    sz localsz = new sz();
    localsz.cPf.cPi = true;
    com.tencent.mm.sdk.b.a.xxA.m(localsz);
    an.a(this.ySD, this.ySD.cgL.getTalkerUserName());
    AppMethodBeat.o(31754);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.an.7
 * JD-Core Version:    0.6.2
 */