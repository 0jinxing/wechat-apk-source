package com.tencent.mm.plugin.talkroom.ui;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

final class TalkRoomUI$15
  implements View.OnTouchListener
{
  TalkRoomUI$15(TalkRoomUI paramTalkRoomUI, TalkRoomUI.a parama)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(25922);
    paramView = this.szI;
    int i = paramMotionEvent.getAction();
    if (i == 0)
    {
      paramView.hke = paramMotionEvent.getX();
      paramView.hkf = paramMotionEvent.getY();
      paramView.szJ = bo.yz();
      AppMethodBeat.o(25922);
    }
    while (true)
    {
      return bool;
      if ((i == 1) || (i == 3))
      {
        float f1 = Math.abs(paramMotionEvent.getX() - paramView.hke);
        float f2 = paramView.hkf - paramMotionEvent.getY();
        if ((f2 >= 100.0F) && (f2 / f1 > 2.0F) && (f2 / (float)bo.az(paramView.szJ) > 0.6F))
        {
          paramView.cEL();
          AppMethodBeat.o(25922);
        }
      }
      else
      {
        bool = false;
        AppMethodBeat.o(25922);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.talkroom.ui.TalkRoomUI.15
 * JD-Core Version:    0.6.2
 */