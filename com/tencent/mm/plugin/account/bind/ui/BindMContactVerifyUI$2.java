package com.tencent.mm.plugin.account.bind.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;

final class BindMContactVerifyUI$2
  implements View.OnClickListener
{
  BindMContactVerifyUI$2(BindMContactVerifyUI paramBindMContactVerifyUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(13480);
    paramView = BindMContactVerifyUI.a(this.grP).getText().toString().trim();
    if (bo.isNullOrNil(paramView))
    {
      h.g(this.grP, 2131297590, 2131297061);
      AppMethodBeat.o(13480);
    }
    while (true)
    {
      return;
      this.grP.aqX();
      BindMContactVerifyUI.a(this.grP, paramView);
      AppMethodBeat.o(13480);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.BindMContactVerifyUI.2
 * JD-Core Version:    0.6.2
 */