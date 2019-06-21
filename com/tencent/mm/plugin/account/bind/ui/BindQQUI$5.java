package com.tencent.mm.plugin.account.bind.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMWizardActivity;

final class BindQQUI$5
  implements View.OnClickListener
{
  BindQQUI$5(BindQQUI paramBindQQUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(13548);
    MMWizardActivity.J(this.gsw, new Intent(this.gsw, VerifyQQUI.class));
    AppMethodBeat.o(13548);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.BindQQUI.5
 * JD-Core Version:    0.6.2
 */