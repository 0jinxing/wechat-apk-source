package com.tencent.mm.plugin.sns.ui;

import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class SnsSightPlayerUI$9$2
  implements Runnable
{
  SnsSightPlayerUI$9$2(SnsSightPlayerUI.9 param9)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(39259);
    if (SnsSightPlayerUI.k(this.rwX.rwT).getVisibility() != 0)
    {
      SnsSightPlayerUI.k(this.rwX.rwT).setVisibility(0);
      SnsSightPlayerUI.k(this.rwX.rwT).startAnimation(AnimationUtils.loadAnimation(this.rwX.rwT.mController.ylL, 2131034180));
    }
    AppMethodBeat.o(39259);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI.9.2
 * JD-Core Version:    0.6.2
 */