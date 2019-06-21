package com.tencent.mm.plugin.account.bind.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.account.a.a;
import com.tencent.mm.pluginsdk.n;

final class BindMContactVerifyUI$4
  implements View.OnClickListener
{
  BindMContactVerifyUI$4(BindMContactVerifyUI paramBindMContactVerifyUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(13482);
    this.grP.aqX();
    paramView = new Intent();
    Bundle localBundle = new Bundle();
    localBundle.putString("bindmcontact_mobile", BindMContactVerifyUI.c(this.grP));
    localBundle.putInt("voice_verify_type", 4);
    paramView.putExtras(localBundle);
    a.gkE.f(this.grP, paramView);
    AppMethodBeat.o(13482);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.BindMContactVerifyUI.4
 * JD-Core Version:    0.6.2
 */