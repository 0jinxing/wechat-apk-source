package com.tencent.mm.ui.base;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class TalkRoomPopupNav$1
  implements View.OnClickListener
{
  TalkRoomPopupNav$1(TalkRoomPopupNav paramTalkRoomPopupNav)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(30006);
    if (TalkRoomPopupNav.a(this.yAR) != null)
      TalkRoomPopupNav.a(this.yAR).dAt();
    AppMethodBeat.o(30006);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.TalkRoomPopupNav.1
 * JD-Core Version:    0.6.2
 */