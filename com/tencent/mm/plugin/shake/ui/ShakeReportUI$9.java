package com.tencent.mm.plugin.shake.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ShakeReportUI$9
  implements View.OnClickListener
{
  ShakeReportUI$9(ShakeReportUI paramShakeReportUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(24786);
    paramView = new Intent(this.qwj, ShakeMsgListUI.class);
    paramView.putExtra("shake_msg_from", 1);
    paramView.putExtra("shake_msg_list_title", this.qwj.getString(2131303484));
    this.qwj.startActivity(paramView);
    AppMethodBeat.o(24786);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.ui.ShakeReportUI.9
 * JD-Core Version:    0.6.2
 */