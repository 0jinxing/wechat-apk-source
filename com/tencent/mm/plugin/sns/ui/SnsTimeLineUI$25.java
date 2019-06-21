package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView.a;
import com.tencent.mm.ui.widget.QFadeImageView;

final class SnsTimeLineUI$25
  implements SnsStoryHeaderView.a
{
  SnsTimeLineUI$25(SnsTimeLineUI paramSnsTimeLineUI)
  {
  }

  public final void cun()
  {
    AppMethodBeat.i(39493);
    SnsTimeLineUI.a locala = SnsTimeLineUI.h(this.rzs);
    if (SnsTimeLineUI.r(locala.rzs).getVisibility() == 0)
    {
      locala.init();
      SnsTimeLineUI.r(locala.rzs).clearAnimation();
      SnsTimeLineUI.r(locala.rzs).startAnimation(locala);
      locala.kK(locala.DELAY_TIME + 100);
      locala.rzW = false;
    }
    AppMethodBeat.o(39493);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsTimeLineUI.25
 * JD-Core Version:    0.6.2
 */