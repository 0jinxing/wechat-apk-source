package com.tencent.mm.plugin.talkroom.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.h;

final class TalkRoomUI$11
  implements View.OnClickListener
{
  TalkRoomUI$11(TalkRoomUI paramTalkRoomUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(25916);
    h.a(this.szE, this.szE.getString(2131304001), this.szE.getString(2131304000), new TalkRoomUI.11.1(this), null);
    AppMethodBeat.o(25916);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.talkroom.ui.TalkRoomUI.11
 * JD-Core Version:    0.6.2
 */