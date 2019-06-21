package com.tencent.mm.plugin.sns.ui;

import android.content.res.Resources;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.x;

final class SnsUserUI$15
  implements Runnable
{
  SnsUserUI$15(SnsUserUI paramSnsUserUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(39806);
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
    localLayoutParams.topMargin = (x.al(this.rDa) + this.rDa.getResources().getDimensionPixelSize(2131427494));
    SnsUserUI.k(this.rDa).setLayoutParams(localLayoutParams);
    AppMethodBeat.o(39806);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsUserUI.15
 * JD-Core Version:    0.6.2
 */