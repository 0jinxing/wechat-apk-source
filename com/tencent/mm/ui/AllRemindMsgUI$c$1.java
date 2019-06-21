package com.tencent.mm.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class AllRemindMsgUI$c$1
  implements View.OnClickListener
{
  AllRemindMsgUI$c$1(AllRemindMsgUI.c paramc, AllRemindMsgUI paramAllRemindMsgUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(29121);
    paramView = (AllRemindMsgUI.d)paramView.getTag();
    ab.i("MicroMsg.emoji.AllRemindMsgUI", "[onClick] :%s", new Object[] { paramView });
    AllRemindMsgUI.c.a(this.yeC.yex, paramView.username, paramView.cvx);
    AppMethodBeat.o(29121);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.AllRemindMsgUI.c.1
 * JD-Core Version:    0.6.2
 */