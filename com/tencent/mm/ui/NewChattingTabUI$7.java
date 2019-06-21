package com.tencent.mm.ui;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.ui.tools.TestTimeForChatting;

final class NewChattingTabUI$7
  implements Animation.AnimationListener
{
  NewChattingTabUI$7(NewChattingTabUI paramNewChattingTabUI)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    AppMethodBeat.i(29804);
    NewChattingTabUI.a(this.ypr, false);
    NewChattingTabUI.d(this.ypr).setVisibility(8);
    aw.RS().doM();
    al.Ma(0);
    NewChattingTabUI.x(this.ypr);
    ab.i("MicroMsg.LauncherUI.NewChattingTabUI", "klem pop out onAnimationEnd");
    AppMethodBeat.o(29804);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
    AppMethodBeat.i(29803);
    NewChattingTabUI.a(this.ypr, true);
    aw.RS().doK();
    al.Ma(-8);
    this.ypr.G(true, 0);
    ab.i("MicroMsg.LauncherUI.NewChattingTabUI", "klem pop out onAnimationStart");
    AppMethodBeat.o(29803);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.NewChattingTabUI.7
 * JD-Core Version:    0.6.2
 */