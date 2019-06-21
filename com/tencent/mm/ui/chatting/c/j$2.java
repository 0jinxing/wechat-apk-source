package com.tencent.mm.ui.chatting.c;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.d.a;

final class j$2
  implements View.OnClickListener
{
  j$2(j paramj)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(31308);
    paramView = (com.tencent.mm.ui.chatting.c.b.h)this.yOP.cgL.aF(com.tencent.mm.ui.chatting.c.b.h.class);
    if (paramView.cdf() == 0)
    {
      ab.w("MicroMsg.ChattingMoreBtnBarHelper", "ignore click del btn, selected items count is 0");
      AppMethodBeat.o(31308);
    }
    while (true)
    {
      return;
      Activity localActivity = this.yOP.cgL.yTx.getContext();
      com.tencent.mm.ui.base.h.a(localActivity, localActivity.getString(2131298414), "", localActivity.getString(2131298868), localActivity.getString(2131296868), new j.2.1(this, localActivity, paramView), null, 2131689665);
      AppMethodBeat.o(31308);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.j.2
 * JD-Core Version:    0.6.2
 */