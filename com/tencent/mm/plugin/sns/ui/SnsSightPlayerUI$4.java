package com.tencent.mm.plugin.sns.ui;

import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.tools.e.b;

final class SnsSightPlayerUI$4
  implements e.b
{
  SnsSightPlayerUI$4(SnsSightPlayerUI paramSnsSightPlayerUI)
  {
  }

  public final void onAnimationEnd()
  {
    AppMethodBeat.i(39252);
    new ak().post(new SnsSightPlayerUI.4.1(this));
    AppMethodBeat.o(39252);
  }

  public final void onAnimationStart()
  {
    AppMethodBeat.i(39251);
    if (SnsSightPlayerUI.q(this.rwT) != null)
      SnsSightPlayerUI.q(this.rwT).setVisibility(8);
    AppMethodBeat.o(39251);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI.4
 * JD-Core Version:    0.6.2
 */