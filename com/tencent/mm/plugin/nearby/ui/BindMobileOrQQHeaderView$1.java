package com.tencent.mm.plugin.nearby.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.a.c;
import com.tencent.mm.model.a.f;
import com.tencent.mm.model.a.g;
import com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI;
import com.tencent.mm.ui.MMWizardActivity;

final class BindMobileOrQQHeaderView$1
  implements View.OnClickListener
{
  BindMobileOrQQHeaderView$1(BindMobileOrQQHeaderView paramBindMobileOrQQHeaderView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(55400);
    paramView = new Intent();
    paramView.setClass(this.oPL.getContext(), BindMContactIntroUI.class);
    paramView.putExtra("key_upload_scene", 7);
    MMWizardActivity.J(this.oPL.getContext(), paramView);
    if (g.aaK().oP("3") != null)
    {
      g.aaK().oP("3").result = "1";
      f.oU("3");
    }
    AppMethodBeat.o(55400);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearby.ui.BindMobileOrQQHeaderView.1
 * JD-Core Version:    0.6.2
 */