package com.tencent.mm.plugin.qqmail.ui;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ComposeUI$20
  implements View.OnClickListener
{
  ComposeUI$20(ComposeUI paramComposeUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(68203);
    paramView = new Intent(this.pwY, MailAddrListUI.class);
    paramView.putExtra("INIT_SELECTED_ADDRS_INTENT_EXTRA", this.pwY.pwf.a(false, null));
    paramView.putExtra("MMActivity.OverrideExitAnimation", 2131034227);
    paramView.putExtra("MMActivity.OverrideEnterAnimation", 2131034180);
    this.pwY.startActivityForResult(paramView, 0);
    this.pwY.overridePendingTransition(2131034229, 2131034181);
    AppMethodBeat.o(68203);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.ComposeUI.20
 * JD-Core Version:    0.6.2
 */