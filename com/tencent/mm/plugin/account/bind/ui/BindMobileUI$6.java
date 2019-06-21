package com.tencent.mm.plugin.account.bind.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.account.a.a;
import com.tencent.mm.pluginsdk.n;

final class BindMobileUI$6
  implements View.OnClickListener
{
  BindMobileUI$6(BindMobileUI paramBindMobileUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(13514);
    paramView = new Intent();
    paramView.putExtra("country_name", BindMobileUI.f(this.gsp));
    paramView.putExtra("couttry_code", BindMobileUI.g(this.gsp));
    a.gkE.b(paramView, this.gsp);
    AppMethodBeat.o(13514);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.BindMobileUI.6
 * JD-Core Version:    0.6.2
 */