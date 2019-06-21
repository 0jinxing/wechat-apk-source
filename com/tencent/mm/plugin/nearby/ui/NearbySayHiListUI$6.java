package com.tencent.mm.plugin.nearby.ui;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.nearby.a.c;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class NearbySayHiListUI$6
  implements View.OnClickListener
{
  NearbySayHiListUI$6(NearbySayHiListUI paramNearbySayHiListUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(55500);
    NearbySayHiListUI.a(this.oQP, new c(2, 0.0F, 0.0F, 0, 0, "", ""));
    g.Rg().a(NearbySayHiListUI.f(this.oQP), 0);
    paramView = this.oQP;
    AppCompatActivity localAppCompatActivity = this.oQP.mController.ylL;
    this.oQP.getString(2131297061);
    NearbySayHiListUI.a(paramView, com.tencent.mm.ui.base.h.b(localAppCompatActivity, this.oQP.getString(2131301618), true, new NearbySayHiListUI.6.1(this)));
    com.tencent.mm.plugin.report.service.h.pYm.X(11429, "0");
    AppMethodBeat.o(55500);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI.6
 * JD-Core Version:    0.6.2
 */