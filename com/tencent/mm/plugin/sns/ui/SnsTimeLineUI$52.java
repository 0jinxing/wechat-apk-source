package com.tencent.mm.plugin.sns.ui;

import android.os.SystemClock;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.sdk.platformtools.ak;

final class SnsTimeLineUI$52
  implements View.OnClickListener
{
  SnsTimeLineUI$52(SnsTimeLineUI paramSnsTimeLineUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(39526);
    if (SystemClock.elapsedRealtime() - SnsTimeLineUI.Q(this.rzs) < 300L)
      SnsTimeLineUI.K(this.rzs);
    SnsTimeLineUI.c(this.rzs, SystemClock.elapsedRealtime());
    af.bCo().removeCallbacks(SnsTimeLineUI.R(this.rzs));
    SnsTimeLineUI.R(this.rzs).run();
    AppMethodBeat.o(39526);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsTimeLineUI.52
 * JD-Core Version:    0.6.2
 */