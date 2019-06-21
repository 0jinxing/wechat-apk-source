package com.tencent.mm.plugin.account.bind.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.account.a.a;
import com.tencent.mm.pluginsdk.n;

final class BindMContactUI$5
  implements View.OnClickListener
{
  BindMContactUI$5(BindMContactUI paramBindMContactUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(13465);
    paramView = new Intent();
    paramView.putExtra("country_name", BindMContactUI.h(this.grK));
    paramView.putExtra("couttry_code", BindMContactUI.c(this.grK));
    a.gkE.b(paramView, this.grK);
    AppMethodBeat.o(13465);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.BindMContactUI.5
 * JD-Core Version:    0.6.2
 */