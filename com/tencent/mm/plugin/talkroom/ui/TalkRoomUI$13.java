package com.tencent.mm.plugin.talkroom.ui;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageButton;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.talkroom.model.b;
import com.tencent.mm.plugin.talkroom.model.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.ay.a;
import com.tencent.mm.sdk.platformtools.bo;

final class TalkRoomUI$13
  implements View.OnTouchListener
{
  TalkRoomUI$13(TalkRoomUI paramTalkRoomUI)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(25920);
    switch (paramMotionEvent.getAction())
    {
    default:
    case 0:
    case 2:
    case 1:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(25920);
      return false;
      TalkRoomUI.b(this.szE, TalkRoomUI.a(this.szE, paramMotionEvent));
      if (TalkRoomUI.k(this.szE))
      {
        TalkRoomUI.l(this.szE).setImageResource(2130840402);
        ay.a(ah.getContext(), 2131304021, new ay.a()
        {
          public final void EA()
          {
            AppMethodBeat.i(25918);
            ab.i("MicroMsg.TalkRoomUI", "play press sound end");
            AppMethodBeat.o(25918);
          }
        });
        TalkRoomUI.a(this.szE, 1);
        TalkRoomUI.d(this.szE);
        ab.i("MicroMsg.TalkRoomUI", "micBtn pressed down");
        TalkRoomUI.a(this.szE, bo.yz());
        b.cEh().akz();
        TalkRoomUI.m(this.szE);
        continue;
        if ((TalkRoomUI.k(this.szE)) && (!TalkRoomUI.a(this.szE, paramMotionEvent)) && (TalkRoomUI.k(this.szE)))
        {
          TalkRoomUI.b(this.szE, false);
          if (TalkRoomUI.b(this.szE) == 5)
          {
            ab.i("MicroMsg.TalkRoomUI", "cancel during seize-success prepare time");
            TalkRoomUI.n(this.szE).stopTimer();
            TalkRoomUI.o(this.szE).stopTimer();
          }
          TalkRoomUI.l(this.szE).setImageResource(2130840401);
          TalkRoomUI.a(this.szE, 0);
          TalkRoomUI.d(this.szE);
          TalkRoomUI.p(this.szE).stopTimer();
          b.cEh().akA();
          ay.a(ah.getContext(), 2131304024, new TalkRoomUI.13.2(this));
          TalkRoomUI.m(this.szE);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.talkroom.ui.TalkRoomUI.13
 * JD-Core Version:    0.6.2
 */