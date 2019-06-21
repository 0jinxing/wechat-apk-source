package com.tencent.mm.ui;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.OnLayoutChangedLinearLayout.a;
import com.tencent.mm.ui.tools.TestTimeForChatting;

final class NewChattingTabUI$6
  implements OnLayoutChangedLinearLayout.a
{
  long start = 0L;

  NewChattingTabUI$6(NewChattingTabUI paramNewChattingTabUI)
  {
  }

  public final void dyX()
  {
    AppMethodBeat.i(29802);
    if (NewChattingTabUI.s(this.ypr) == null)
    {
      NewChattingTabUI.a(this.ypr, AnimationUtils.loadAnimation(NewChattingTabUI.g(this.ypr), MMFragmentActivity.a.ync));
      NewChattingTabUI.s(this.ypr).setAnimationListener(new NewChattingTabUI.6.1(this));
    }
    if (NewChattingTabUI.v(this.ypr))
    {
      NewChattingTabUI.d(this.ypr).setOndispatchDraw(new NewChattingTabUI.6.2(this));
      NewChattingTabUI.w(this.ypr);
    }
    while (true)
    {
      NewChattingTabUI.p(this.ypr).yAx = null;
      ab.i("MicroMsg.LauncherUI.NewChattingTabUI", "klem CHATTING ONLAYOUT ");
      AppMethodBeat.o(29802);
      return;
      NewChattingTabUI.t(this.ypr);
      NewChattingTabUI.u(this.ypr);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.NewChattingTabUI.6
 * JD-Core Version:    0.6.2
 */