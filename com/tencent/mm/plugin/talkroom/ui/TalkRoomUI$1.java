package com.tencent.mm.plugin.talkroom.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;

final class TalkRoomUI$1
  implements ap.a
{
  TalkRoomUI$1(TalkRoomUI paramTalkRoomUI)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(25907);
    ab.i("MicroMsg.TalkRoomUI", "seizeMicTimer reach");
    TalkRoomUI.a(this.szE);
    AppMethodBeat.o(25907);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.talkroom.ui.TalkRoomUI.1
 * JD-Core Version:    0.6.2
 */