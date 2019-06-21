package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SnsNotifyBanner$2
  implements View.OnClickListener
{
  SnsNotifyBanner$2(SnsNotifyBanner paramSnsNotifyBanner)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(39137);
    if (SnsNotifyBanner.a(this.ruW) == null)
    {
      AppMethodBeat.o(39137);
      return;
    }
    if (this.ruW.ruU > 0)
    {
      this.ruW.ruU = 0;
      SnsNotifyBanner.a(this.ruW);
    }
    while (true)
    {
      this.ruW.setVisibility(8);
      AppMethodBeat.o(39137);
      break;
      SnsNotifyBanner.a(this.ruW);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsNotifyBanner.2
 * JD-Core Version:    0.6.2
 */