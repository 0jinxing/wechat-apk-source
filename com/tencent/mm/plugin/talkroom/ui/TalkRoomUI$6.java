package com.tencent.mm.plugin.talkroom.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ay.a;

final class TalkRoomUI$6
  implements ay.a
{
  TalkRoomUI$6(TalkRoomUI paramTalkRoomUI)
  {
  }

  public final void EA()
  {
    AppMethodBeat.i(25911);
    TalkRoomUI.o(this.szE).stopTimer();
    TalkRoomUI.a(this.szE);
    AppMethodBeat.o(25911);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.talkroom.ui.TalkRoomUI.6
 * JD-Core Version:    0.6.2
 */