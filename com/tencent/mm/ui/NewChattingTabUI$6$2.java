package com.tencent.mm.ui;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.tools.TestTimeForChatting;
import com.tencent.mm.ui.tools.TestTimeForChatting.a;
import com.tencent.mm.ui.widget.SwipeBackLayout;

final class NewChattingTabUI$6$2
  implements TestTimeForChatting.a
{
  NewChattingTabUI$6$2(NewChattingTabUI.6 param6)
  {
  }

  public final void dyY()
  {
    AppMethodBeat.i(29801);
    ab.i("MicroMsg.LauncherUI.NewChattingTabUI", "[onDrawed]");
    this.ypx.start = System.currentTimeMillis();
    if (NewChattingTabUI.c(this.ypx.ypr).getSwipeBackLayout() != null)
    {
      NewChattingTabUI.c(this.ypx.ypr).getSwipeBackLayout().setNeedChangeWindowBackground(false);
      NewChattingTabUI.c(this.ypx.ypr).getSwipeBackLayout().startAnimation(NewChattingTabUI.s(this.ypx.ypr));
    }
    while (true)
    {
      NewChattingTabUI.d(this.ypx.ypr).setOndispatchDraw(null);
      AppMethodBeat.o(29801);
      return;
      NewChattingTabUI.c(this.ypx.ypr).getView().startAnimation(NewChattingTabUI.s(this.ypx.ypr));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.NewChattingTabUI.6.2
 * JD-Core Version:    0.6.2
 */