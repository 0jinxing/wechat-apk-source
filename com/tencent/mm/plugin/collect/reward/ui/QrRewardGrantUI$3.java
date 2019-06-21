package com.tencent.mm.plugin.collect.reward.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RadioButton;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class QrRewardGrantUI$3
  implements View.OnClickListener
{
  QrRewardGrantUI$3(QrRewardGrantUI paramQrRewardGrantUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(41065);
    boolean bool = QrRewardGrantUI.c(this.kEd).isChecked();
    paramView = QrRewardGrantUI.c(this.kEd);
    if (!bool);
    for (bool = true; ; bool = false)
    {
      paramView.setChecked(bool);
      AppMethodBeat.o(41065);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.reward.ui.QrRewardGrantUI.3
 * JD-Core Version:    0.6.2
 */