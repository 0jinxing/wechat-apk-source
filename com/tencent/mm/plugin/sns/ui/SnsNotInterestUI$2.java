package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SnsNotInterestUI$2
  implements View.OnClickListener
{
  SnsNotInterestUI$2(SnsNotInterestUI paramSnsNotInterestUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(39124);
    SnsNotInterestUI.a(this.ruR).requestFocus();
    this.ruR.aqX();
    AppMethodBeat.o(39124);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsNotInterestUI.2
 * JD-Core Version:    0.6.2
 */