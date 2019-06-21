package com.tencent.mm.plugin.account.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.account.a.a;
import com.tencent.mm.pluginsdk.n;

final class RegByMobileRegAIOUI$6
  implements View.OnClickListener
{
  RegByMobileRegAIOUI$6(RegByMobileRegAIOUI paramRegByMobileRegAIOUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(125345);
    paramView = new Intent();
    paramView.putExtra("country_name", RegByMobileRegAIOUI.l(this.gGd));
    paramView.putExtra("couttry_code", RegByMobileRegAIOUI.d(this.gGd));
    a.gkE.b(paramView, this.gGd);
    AppMethodBeat.o(125345);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI.6
 * JD-Core Version:    0.6.2
 */