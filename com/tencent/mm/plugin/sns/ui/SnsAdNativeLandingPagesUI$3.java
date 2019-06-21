package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class SnsAdNativeLandingPagesUI$3
  implements View.OnClickListener
{
  SnsAdNativeLandingPagesUI$3(SnsAdNativeLandingPagesUI paramSnsAdNativeLandingPagesUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(38625);
    if (this.roM.mController.ymc == 1)
      this.roM.aqX();
    this.roM.bcW();
    AppMethodBeat.o(38625);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.3
 * JD-Core Version:    0.6.2
 */