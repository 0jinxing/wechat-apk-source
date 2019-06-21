package com.tencent.mm.plugin.talkroom.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.talkroom.model.b;
import com.tencent.mm.plugin.talkroom.model.g;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.sdk.platformtools.bo;

final class TalkRoomUI$10
  implements ap.a
{
  TalkRoomUI$10(TalkRoomUI paramTalkRoomUI)
  {
  }

  public final boolean BI()
  {
    int i = 15;
    boolean bool1 = false;
    boolean bool2 = false;
    AppMethodBeat.i(25914);
    int j;
    if (TalkRoomUI.b(this.szE) == 3)
    {
      j = b.cEh().akx();
      if (j > 15)
        break label186;
      if (!TalkRoomUI.e(this.szE))
        break label180;
      j = i;
      label52: TalkRoomUI.f(this.szE);
      i = j;
      if (TalkRoomUI.g(this.szE) >= 5)
      {
        TalkRoomUI localTalkRoomUI = this.szE;
        if (!TalkRoomUI.e(this.szE))
          bool2 = true;
        TalkRoomUI.a(localTalkRoomUI, bool2);
        TalkRoomUI.h(this.szE);
      }
    }
    label180: label186: for (i = j; ; i = j)
    {
      TalkRoomUI.d(this.szE);
      TalkRoomUI.i(this.szE).setValue(i);
      AppMethodBeat.o(25914);
      for (bool2 = true; ; bool2 = bool1)
      {
        return bool2;
        if (!bo.isNullOrNil(TalkRoomUI.c(this.szE)))
          break;
        TalkRoomUI.d(this.szE);
        AppMethodBeat.o(25914);
      }
      j = b.cEh().aky();
      break;
      j = 0;
      break label52;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.talkroom.ui.TalkRoomUI.10
 * JD-Core Version:    0.6.2
 */