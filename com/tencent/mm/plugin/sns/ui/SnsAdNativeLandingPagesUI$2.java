package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.a.d;

final class SnsAdNativeLandingPagesUI$2
  implements View.OnClickListener
{
  SnsAdNativeLandingPagesUI$2(SnsAdNativeLandingPagesUI paramSnsAdNativeLandingPagesUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(38624);
    paramView = new d(this.roM, 1, false);
    paramView.rBl = new SnsAdNativeLandingPagesUI.2.1(this);
    paramView.uEP = true;
    paramView.rBm = new SnsAdNativeLandingPagesUI.2.2(this);
    this.roM.aqX();
    paramView.cpD();
    AppMethodBeat.o(38624);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.2
 * JD-Core Version:    0.6.2
 */