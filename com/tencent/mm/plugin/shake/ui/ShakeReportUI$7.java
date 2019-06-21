package com.tencent.mm.plugin.shake.ui;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;

final class ShakeReportUI$7
  implements View.OnClickListener
{
  ShakeReportUI$7(ShakeReportUI paramShakeReportUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(24784);
    if (!ShakeReportUI.u(this.qwj))
      AppMethodBeat.o(24784);
    while (true)
    {
      return;
      ShakeReportUI.b(this.qwj, false);
      ShakeReportUI.c(this.qwj, true);
      ShakeReportUI.d(this.qwj, false);
      AppCompatActivity localAppCompatActivity = this.qwj.mController.ylL;
      String str = this.qwj.getString(2131303422);
      paramView = new ShakeReportUI.7.1(this);
      ShakeReportUI.7.2 local2 = new ShakeReportUI.7.2(this);
      h.a(localAppCompatActivity, null, new String[] { str }, "", paramView, local2);
      AppMethodBeat.o(24784);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.ui.ShakeReportUI.7
 * JD-Core Version:    0.6.2
 */