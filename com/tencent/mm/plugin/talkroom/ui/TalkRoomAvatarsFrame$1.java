package com.tencent.mm.plugin.talkroom.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.ui.base.MMHorList.a;

final class TalkRoomAvatarsFrame$1
  implements MMHorList.a
{
  TalkRoomAvatarsFrame$1(TalkRoomAvatarsFrame paramTalkRoomAvatarsFrame)
  {
  }

  public final void aQe()
  {
    AppMethodBeat.i(25893);
    TalkRoomAvatarsFrame.c(this.szl).post(new TalkRoomAvatarsFrame.1.1(this));
    AppMethodBeat.o(25893);
  }

  public final void cEF()
  {
    AppMethodBeat.i(25891);
    TalkRoomAvatarsFrame.a(this.szl).stopTimer();
    AppMethodBeat.o(25891);
  }

  public final void cEG()
  {
    AppMethodBeat.i(25892);
    TalkRoomAvatarsFrame.a(this.szl).ae(2000L, 2000L);
    AppMethodBeat.o(25892);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.talkroom.ui.TalkRoomAvatarsFrame.1
 * JD-Core Version:    0.6.2
 */