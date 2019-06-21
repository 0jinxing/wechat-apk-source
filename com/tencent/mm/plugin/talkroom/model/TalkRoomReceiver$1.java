package com.tencent.mm.plugin.talkroom.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.af.b;
import com.tencent.mm.sdk.platformtools.ah;

final class TalkRoomReceiver$1
  implements af.b
{
  public final void cancel()
  {
    AppMethodBeat.i(25789);
    TalkRoomReceiver.bq(ah.getContext());
    AppMethodBeat.o(25789);
  }

  public final void prepare()
  {
    AppMethodBeat.i(25788);
    TalkRoomReceiver.bp(ah.getContext());
    AppMethodBeat.o(25788);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.talkroom.model.TalkRoomReceiver.1
 * JD-Core Version:    0.6.2
 */