package com.tencent.mm.ui;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bh.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

final class MultiTalkRoomPopupNav$1
  implements View.OnClickListener
{
  MultiTalkRoomPopupNav$1(MultiTalkRoomPopupNav paramMultiTalkRoomPopupNav)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(29769);
    if ((d.fUu != null) && (((com.tencent.mm.plugin.multitalk.model.a)g.K(com.tencent.mm.plugin.multitalk.model.a.class)).bJ(this.yoY.getContext())))
    {
      ab.d("MicroMsg.MultiTalkRoomPopupNav", "is voip talking");
      AppMethodBeat.o(29769);
    }
    while (true)
    {
      return;
      if ((d.fUu != null) && (d.fUu.akL()))
      {
        Toast.makeText(ah.getContext(), ah.getContext().getString(2131300614), 0).show();
        ab.d("MicroMsg.MultiTalkRoomPopupNav", "is show loation");
        AppMethodBeat.o(29769);
      }
      else
      {
        MultiTalkRoomPopupNav.a(this.yoY);
        AppMethodBeat.o(29769);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.MultiTalkRoomPopupNav.1
 * JD-Core Version:    0.6.2
 */