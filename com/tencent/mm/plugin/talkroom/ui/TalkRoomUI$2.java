package com.tencent.mm.plugin.talkroom.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.i;

final class TalkRoomUI$2
  implements View.OnClickListener
{
  TalkRoomUI$2(TalkRoomUI paramTalkRoomUI, i parami)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(25908);
    this.szF.dismiss();
    AppMethodBeat.o(25908);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.talkroom.ui.TalkRoomUI.2
 * JD-Core Version:    0.6.2
 */