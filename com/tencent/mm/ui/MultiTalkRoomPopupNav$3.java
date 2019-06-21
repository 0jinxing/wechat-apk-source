package com.tencent.mm.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bg.f;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.multitalk.model.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;

final class MultiTalkRoomPopupNav$3
  implements View.OnClickListener
{
  MultiTalkRoomPopupNav$3(MultiTalkRoomPopupNav paramMultiTalkRoomPopupNav, String paramString)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(29771);
    ab.i("MicroMsg.MultiTalkRoomPopupNav", "click cancel button..");
    int i;
    if (MultiTalkRoomPopupNav.d(this.yoY) == MultiTalkRoomPopupNav.b.ypa)
    {
      ab.i("MicroMsg.MultiTalkRoomPopupNav", "reject multiTalk!");
      boolean bool = ((a)g.K(a.class)).Sd(this.oGO);
      ((a)g.K(a.class)).Se(this.oGO);
      paramView = h.pYm;
      if (bool)
      {
        i = 0;
        paramView.e(13945, new Object[] { Integer.valueOf(3), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(i), MultiTalkRoomPopupNav.b(this.yoY), Integer.valueOf(MultiTalkRoomPopupNav.c(this.yoY).field_roomId), Long.valueOf(MultiTalkRoomPopupNav.c(this.yoY).field_roomKey) });
      }
    }
    while (true)
    {
      MultiTalkRoomPopupNav.e(this.yoY).close();
      MultiTalkRoomPopupNav.f(this.yoY).setVisibility(0);
      MultiTalkRoomPopupNav.g(this.yoY).setVisibility(0);
      MultiTalkRoomPopupNav.h(this.yoY).setVisibility(8);
      AppMethodBeat.o(29771);
      return;
      i = 1;
      break;
      h.pYm.e(13945, new Object[] { Integer.valueOf(2), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), MultiTalkRoomPopupNav.b(this.yoY), Integer.valueOf(MultiTalkRoomPopupNav.c(this.yoY).field_roomId), Long.valueOf(MultiTalkRoomPopupNav.c(this.yoY).field_roomKey) });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.MultiTalkRoomPopupNav.3
 * JD-Core Version:    0.6.2
 */