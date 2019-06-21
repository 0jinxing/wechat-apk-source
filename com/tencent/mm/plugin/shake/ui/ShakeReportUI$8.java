package com.tencent.mm.plugin.shake.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ShakeReportUI$8
  implements View.OnClickListener
{
  ShakeReportUI$8(ShakeReportUI paramShakeReportUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(24785);
    paramView = new Intent(this.qwj, ShakeSayHiListUI.class);
    paramView.putExtra("IntentSayHiType", 1);
    this.qwj.startActivity(paramView);
    AppMethodBeat.o(24785);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.ui.ShakeReportUI.8
 * JD-Core Version:    0.6.2
 */