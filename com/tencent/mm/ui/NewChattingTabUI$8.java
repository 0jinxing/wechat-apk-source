package com.tencent.mm.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.ui.tools.TestTimeForChatting;

final class NewChattingTabUI$8
  implements Runnable
{
  NewChattingTabUI$8(NewChattingTabUI paramNewChattingTabUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(29805);
    long l = System.currentTimeMillis();
    aw.RS().doM();
    al.Ma(0);
    NewChattingTabUI.g(this.ypr).onSwipe(1.0F);
    if (NewChattingTabUI.d(this.ypr) != null)
      NewChattingTabUI.d(this.ypr).dJZ();
    NewChattingTabUI.y(this.ypr).onEnterEnd();
    NewChattingTabUI.x(this.ypr);
    ab.i("MicroMsg.LauncherUI.NewChattingTabUI", "doJobOnChattingAnimEnd cost:%s", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
    AppMethodBeat.o(29805);
  }

  public final String toString()
  {
    AppMethodBeat.i(29806);
    String str = super.toString() + "|chattingView_onAnimationEnd";
    AppMethodBeat.o(29806);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.NewChattingTabUI.8
 * JD-Core Version:    0.6.2
 */