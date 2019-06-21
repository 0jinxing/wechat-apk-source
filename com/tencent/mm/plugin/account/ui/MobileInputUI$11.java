package com.tencent.mm.plugin.account.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.account.a.a;
import com.tencent.mm.pluginsdk.n;

final class MobileInputUI$11
  implements View.OnClickListener
{
  MobileInputUI$11(MobileInputUI paramMobileInputUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(125171);
    paramView = new Intent();
    paramView.putExtra("country_name", this.gDZ.fHE);
    paramView.putExtra("couttry_code", this.gDZ.countryCode);
    paramView.putExtra("iso_code", this.gDZ.gBE);
    a.gkE.b(paramView, this.gDZ);
    AppMethodBeat.o(125171);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.MobileInputUI.11
 * JD-Core Version:    0.6.2
 */