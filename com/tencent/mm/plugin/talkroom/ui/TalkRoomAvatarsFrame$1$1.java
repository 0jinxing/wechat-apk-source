package com.tencent.mm.plugin.talkroom.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class TalkRoomAvatarsFrame$1$1
  implements Runnable
{
  TalkRoomAvatarsFrame$1$1(TalkRoomAvatarsFrame.1 param1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(25890);
    TalkRoomAvatarsFrame.b(this.szm.szl).notifyDataSetChanged();
    AppMethodBeat.o(25890);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.talkroom.ui.TalkRoomAvatarsFrame.1.1
 * JD-Core Version:    0.6.2
 */